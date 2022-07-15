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
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AdmissionMedication2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Admission Medication2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication2#validateAdmissionMedication2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication2#getConsolMedicationActivity2s() <em>Get Consol Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication2#validateAdmissionMedicationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication2#validateAdmissionMedicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication2#validateAdmissionMedicationMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Medication Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdmissionMedication2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdmissionMedication2TemplateId() {
		OperationsTestCase<AdmissionMedication2> validateAdmissionMedication2TemplateIdTestCase = new OperationsTestCase<AdmissionMedication2>(
			"validateAdmissionMedication2TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ADMISSION_MEDICATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionMedication2 target) {

			}

			@Override
			protected void updateToPass(AdmissionMedication2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionMedication2Operations.validateAdmissionMedication2TemplateId(
					(AdmissionMedication2) objectToTest, diagnostician, map);
			}

		};

		validateAdmissionMedication2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolMedicationActivity2s() {

		AdmissionMedication2 target = objectFactory.create();
		target.getConsolMedicationActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdmissionMedicationCodeP() {
		OperationsTestCase<AdmissionMedication2> validateAdmissionMedicationCodePTestCase = new OperationsTestCase<AdmissionMedication2>(
			"validateAdmissionMedicationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ADMISSION_MEDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionMedication2 target) {

			}

			@Override
			protected void updateToPass(AdmissionMedication2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionMedication2Operations.validateAdmissionMedicationCodeP(
					(AdmissionMedication2) objectToTest, diagnostician, map);
			}

		};

		validateAdmissionMedicationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdmissionMedicationCode() {
		OperationsTestCase<AdmissionMedication2> validateAdmissionMedicationCodeTestCase = new OperationsTestCase<AdmissionMedication2>(
			"validateAdmissionMedicationCode",
			operationsForOCL.getOCLValue("VALIDATE_ADMISSION_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionMedication2 target) {

			}

			@Override
			protected void updateToPass(AdmissionMedication2 target) {
				target.init();

			}

			@Override
			protected void setDependency(AdmissionMedication2 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionMedication2Operations.validateAdmissionMedicationCode(
					(AdmissionMedication2) objectToTest, diagnostician, map);
			}

		};

		validateAdmissionMedicationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdmissionMedicationMedicationActivity() {
		OperationsTestCase<AdmissionMedication2> validateAdmissionMedicationMedicationActivityTestCase = new OperationsTestCase<AdmissionMedication2>(
			"validateAdmissionMedicationMedicationActivity", operationsForOCL.getOCLValue(
				"VALIDATE_ADMISSION_MEDICATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionMedication2 target) {

			}

			@Override
			protected void updateToPass(AdmissionMedication2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionMedication2Operations.validateAdmissionMedicationMedicationActivity(
					(AdmissionMedication2) objectToTest, diagnostician, map);
			}

		};

		validateAdmissionMedicationMedicationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdmissionMedication2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<AdmissionMedication2> {
		@Override
		public AdmissionMedication2 create() {
			return ConsolFactory.eINSTANCE.createAdmissionMedication2();
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
	private static class ConstructorTestClass extends AdmissionMedication2Operations {
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

} // AdmissionMedication2Operations
