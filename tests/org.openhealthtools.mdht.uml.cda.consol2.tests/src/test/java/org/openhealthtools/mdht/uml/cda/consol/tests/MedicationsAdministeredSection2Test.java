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
import org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationsAdministeredSection2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medications Administered Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection2#validateMedicationsAdministeredSection2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Administered Section2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection2#getConsolMedicationActivity2s() <em>Get Consol Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection2#validateMedicationsAdministeredSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Administered Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection2#validateMedicationsAdministeredSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Administered Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection2#validateMedicationsAdministeredSectionMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Administered Section Medication Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationsAdministeredSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationsAdministeredSection2TemplateId() {
		OperationsTestCase<MedicationsAdministeredSection2> validateMedicationsAdministeredSection2TemplateIdTestCase = new OperationsTestCase<MedicationsAdministeredSection2>(
			"validateMedicationsAdministeredSection2TemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATIONS_ADMINISTERED_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsAdministeredSection2 target) {

			}

			@Override
			protected void updateToPass(MedicationsAdministeredSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsAdministeredSection2Operations.validateMedicationsAdministeredSection2TemplateId(
					(MedicationsAdministeredSection2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsAdministeredSection2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolMedicationActivity2s() {

		MedicationsAdministeredSection2 target = objectFactory.create();
		target.getConsolMedicationActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsAdministeredSectionCodeP() {
		OperationsTestCase<MedicationsAdministeredSection2> validateMedicationsAdministeredSectionCodePTestCase = new OperationsTestCase<MedicationsAdministeredSection2>(
			"validateMedicationsAdministeredSectionCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATIONS_ADMINISTERED_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsAdministeredSection2 target) {

			}

			@Override
			protected void updateToPass(MedicationsAdministeredSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsAdministeredSection2Operations.validateMedicationsAdministeredSectionCodeP(
					(MedicationsAdministeredSection2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsAdministeredSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsAdministeredSectionCode() {
		OperationsTestCase<MedicationsAdministeredSection2> validateMedicationsAdministeredSectionCodeTestCase = new OperationsTestCase<MedicationsAdministeredSection2>(
			"validateMedicationsAdministeredSectionCode", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATIONS_ADMINISTERED_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsAdministeredSection2 target) {

			}

			@Override
			protected void updateToPass(MedicationsAdministeredSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(MedicationsAdministeredSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsAdministeredSection2Operations.validateMedicationsAdministeredSectionCode(
					(MedicationsAdministeredSection2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsAdministeredSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationsAdministeredSectionMedicationActivity() {
		OperationsTestCase<MedicationsAdministeredSection2> validateMedicationsAdministeredSectionMedicationActivityTestCase = new OperationsTestCase<MedicationsAdministeredSection2>(
			"validateMedicationsAdministeredSectionMedicationActivity",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsAdministeredSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationsAdministeredSection2 target) {
				target.addSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsAdministeredSection2Operations.validateMedicationsAdministeredSectionMedicationActivity(
					(MedicationsAdministeredSection2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsAdministeredSectionMedicationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationsAdministeredSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationsAdministeredSection2> {
		@Override
		public MedicationsAdministeredSection2 create() {
			return ConsolFactory.eINSTANCE.createMedicationsAdministeredSection2();
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
	private static class ConstructorTestClass extends MedicationsAdministeredSection2Operations {
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

} // MedicationsAdministeredSection2Operations
