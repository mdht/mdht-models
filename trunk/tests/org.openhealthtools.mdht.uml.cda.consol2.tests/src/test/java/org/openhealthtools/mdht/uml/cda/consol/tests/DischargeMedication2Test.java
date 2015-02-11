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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.DischargeMedication2;
import org.openhealthtools.mdht.uml.cda.consol.operations.DischargeMedication2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Medication2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedication2#validateDischargeMedicationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medication Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedication2#validateDischargeMedication2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medication2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedication2#validateDischargeMedication2StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medication2 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedication2#validateDischargeMedicationMedicationActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medication Medication Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedication2#getConsolMedicationActivity2s() <em>Get Consol Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedication2#validateDischargeMedicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medication Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedication2#validateDischargeMedicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medication Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DischargeMedication2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeMedicationCodeP() {
		OperationsTestCase<DischargeMedication2> validateDischargeMedicationCodePTestCase = new OperationsTestCase<DischargeMedication2>(
			"validateDischargeMedicationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_MEDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeMedication2 target) {

			}

			@Override
			protected void updateToPass(DischargeMedication2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeMedication2Operations.validateDischargeMedicationCodeP(
					(DischargeMedication2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeMedicationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeMedication2StatusCode() {
		OperationsTestCase<DischargeMedication2> validateDischargeMedication2StatusCodeTestCase = new OperationsTestCase<DischargeMedication2>(
			"validateDischargeMedication2StatusCode",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_MEDICATION2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeMedication2 target) {

			}

			@Override
			protected void updateToPass(DischargeMedication2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeMedication2Operations.validateDischargeMedication2StatusCode(
					(DischargeMedication2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeMedication2StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeMedication2StatusCodeP() {
		OperationsTestCase<DischargeMedication2> validateDischargeMedication2StatusCodePTestCase = new OperationsTestCase<DischargeMedication2>(
			"validateDischargeMedication2StatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_MEDICATION2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeMedication2 target) {

			}

			@Override
			protected void updateToPass(DischargeMedication2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeMedication2Operations.validateDischargeMedication2StatusCodeP(
					(DischargeMedication2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeMedication2StatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeMedicationMedicationActivity2() {
		OperationsTestCase<DischargeMedication2> validateDischargeMedicationMedicationActivity2TestCase = new OperationsTestCase<DischargeMedication2>(
			"validateDischargeMedicationMedicationActivity2",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_MEDICATION_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeMedication2 target) {

			}

			@Override
			protected void updateToPass(DischargeMedication2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeMedication2Operations.validateDischargeMedicationMedicationActivity2(
					(DischargeMedication2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeMedicationMedicationActivity2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolMedicationActivity2s() {

		DischargeMedication2 target = objectFactory.create();
		target.getConsolMedicationActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeMedicationTemplateId() {
		OperationsTestCase<DischargeMedication2> validateDischargeMedicationTemplateIdTestCase = new OperationsTestCase<DischargeMedication2>(
			"validateDischargeMedicationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeMedication2 target) {

			}

			@Override
			protected void updateToPass(DischargeMedication2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeMedication2Operations.validateDischargeMedicationTemplateId(
					(DischargeMedication2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeMedicationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeMedicationCode() {
		OperationsTestCase<DischargeMedication2> validateDischargeMedicationCodeTestCase = new OperationsTestCase<DischargeMedication2>(
			"validateDischargeMedicationCode",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeMedication2 target) {

			}

			@Override
			protected void updateToPass(DischargeMedication2 target) {
				target.init();

			}

			@Override
			protected void setDependency(DischargeMedication2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeMedication2Operations.validateDischargeMedicationCode(
					(DischargeMedication2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeMedicationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DischargeMedication2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<DischargeMedication2> {
		@Override
		public DischargeMedication2 create() {
			return ConsolFactory.eINSTANCE.createDischargeMedication2();
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
	private static class ConstructorTestClass extends DischargeMedication2Operations {
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

} // DischargeMedication2Operations
