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
import org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AnesthesiaSection2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Anesthesia Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2#getConsolProcedureActivityProcedure2s() <em>Get Consol Procedure Activity Procedure2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2#getConsolMedicationActivity2s() <em>Get Consol Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2#validateAnesthesiaSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2#validateAnesthesiaSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2#validateAnesthesiaSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2#validateAnesthesiaSectionProcedureActivityProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Procedure Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2#validateAnesthesiaSectionMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anesthesia Section Medication Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AnesthesiaSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolProcedureActivityProcedure2s() {

		AnesthesiaSection2 target = objectFactory.create();
		target.getConsolProcedureActivityProcedure2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolMedicationActivity2s() {

		AnesthesiaSection2 target = objectFactory.create();
		target.getConsolMedicationActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAnesthesiaSectionTemplateId() {
		OperationsTestCase<AnesthesiaSection2> validateAnesthesiaSectionTemplateIdTestCase = new OperationsTestCase<AnesthesiaSection2>(
			"validateAnesthesiaSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ANESTHESIA_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection2 target) {

			}

			@Override
			protected void updateToPass(AnesthesiaSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSection2Operations.validateAnesthesiaSectionTemplateId(
					(AnesthesiaSection2) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAnesthesiaSectionCodeP() {
		OperationsTestCase<AnesthesiaSection2> validateAnesthesiaSectionCodePTestCase = new OperationsTestCase<AnesthesiaSection2>(
			"validateAnesthesiaSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ANESTHESIA_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection2 target) {

			}

			@Override
			protected void updateToPass(AnesthesiaSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSection2Operations.validateAnesthesiaSectionCodeP(
					(AnesthesiaSection2) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAnesthesiaSectionCode() {
		OperationsTestCase<AnesthesiaSection2> validateAnesthesiaSectionCodeTestCase = new OperationsTestCase<AnesthesiaSection2>(
			"validateAnesthesiaSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_ANESTHESIA_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection2 target) {

			}

			@Override
			protected void updateToPass(AnesthesiaSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(AnesthesiaSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSection2Operations.validateAnesthesiaSectionCode(
					(AnesthesiaSection2) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAnesthesiaSectionProcedureActivityProcedure() {
		OperationsTestCase<AnesthesiaSection2> validateAnesthesiaSectionProcedureActivityProcedureTestCase = new OperationsTestCase<AnesthesiaSection2>(
			"validateAnesthesiaSectionProcedureActivityProcedure",
			operationsForOCL.getOCLValue(
				"VALIDATE_ANESTHESIA_SECTION_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(AnesthesiaSection2 target) {
				target.addProcedure(ConsolFactory.eINSTANCE.createProcedureActivityProcedure2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSection2Operations.validateAnesthesiaSectionProcedureActivityProcedure(
					(AnesthesiaSection2) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSectionProcedureActivityProcedureTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAnesthesiaSectionMedicationActivity() {
		OperationsTestCase<AnesthesiaSection2> validateAnesthesiaSectionMedicationActivityTestCase = new OperationsTestCase<AnesthesiaSection2>(
			"validateAnesthesiaSectionMedicationActivity", operationsForOCL.getOCLValue(
				"VALIDATE_ANESTHESIA_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AnesthesiaSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(AnesthesiaSection2 target) {
				target.addSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AnesthesiaSection2Operations.validateAnesthesiaSectionMedicationActivity(
					(AnesthesiaSection2) objectToTest, diagnostician, map);
			}

		};

		validateAnesthesiaSectionMedicationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AnesthesiaSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<AnesthesiaSection2> {
		@Override
		public AnesthesiaSection2 create() {
			return ConsolFactory.eINSTANCE.createAnesthesiaSection2();
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
	private static class ConstructorTestClass extends AnesthesiaSection2Operations {
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

} // AnesthesiaSection2Operations
