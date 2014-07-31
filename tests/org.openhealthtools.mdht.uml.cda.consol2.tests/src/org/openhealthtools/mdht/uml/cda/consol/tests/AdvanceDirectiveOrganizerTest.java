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
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectiveOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveOrganizer#validateAdvanceDirectiveOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveOrganizer#validateAdvanceDirectiveOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveOrganizer#validateAdvanceDirectiveOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveOrganizer#validateAdvanceDirectiveOrganizerId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Organizer Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveOrganizer#validateAdvanceDirectiveOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveOrganizer#validateAdvanceDirectiveOrganizerCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Organizer Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveOrganizer#validateAdvanceDirectiveOrganizerStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Organizer Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveOrganizer#validateAdvanceDirectiveOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Organizer Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveOrganizer#validateAdvanceDirectiveOrganizerAdvanceDirectiveObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Organizer Advance Directive Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveOrganizer#getAdvanceDirectiveObservations() <em>Get Advance Directive Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectiveOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveOrganizerTemplateId() {
		OperationsTestCase<AdvanceDirectiveOrganizer> validateAdvanceDirectiveOrganizerTemplateIdTestCase = new OperationsTestCase<AdvanceDirectiveOrganizer>(
			"validateAdvanceDirectiveOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveOrganizer target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveOrganizerOperations.validateAdvanceDirectiveOrganizerTemplateId(
					(AdvanceDirectiveOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveOrganizerClassCode() {
		OperationsTestCase<AdvanceDirectiveOrganizer> validateAdvanceDirectiveOrganizerClassCodeTestCase = new OperationsTestCase<AdvanceDirectiveOrganizer>(
			"validateAdvanceDirectiveOrganizerClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveOrganizer target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveOrganizerOperations.validateAdvanceDirectiveOrganizerClassCode(
					(AdvanceDirectiveOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveOrganizerClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveOrganizerMoodCode() {
		OperationsTestCase<AdvanceDirectiveOrganizer> validateAdvanceDirectiveOrganizerMoodCodeTestCase = new OperationsTestCase<AdvanceDirectiveOrganizer>(
			"validateAdvanceDirectiveOrganizerMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveOrganizer target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveOrganizerOperations.validateAdvanceDirectiveOrganizerMoodCode(
					(AdvanceDirectiveOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveOrganizerMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveOrganizerId() {
		OperationsTestCase<AdvanceDirectiveOrganizer> validateAdvanceDirectiveOrganizerIdTestCase = new OperationsTestCase<AdvanceDirectiveOrganizer>(
			"validateAdvanceDirectiveOrganizerId",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveOrganizer target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveOrganizer target) {
				target.init();
				II iiID = DatatypesFactory.eINSTANCE.createII();
				II iiID2 = DatatypesFactory.eINSTANCE.createII();
				iiID2.setRoot("123456789");
				target.getIds().add(iiID);
				target.getIds().add(iiID2);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveOrganizerOperations.validateAdvanceDirectiveOrganizerId(
					(AdvanceDirectiveOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveOrganizerIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveOrganizerCode() {
		OperationsTestCase<AdvanceDirectiveOrganizer> validateAdvanceDirectiveOrganizerCodeTestCase = new OperationsTestCase<AdvanceDirectiveOrganizer>(
			"validateAdvanceDirectiveOrganizerCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveOrganizer target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveOrganizerOperations.validateAdvanceDirectiveOrganizerCode(
					(AdvanceDirectiveOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveOrganizerCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveOrganizerCodeP() {
		OperationsTestCase<AdvanceDirectiveOrganizer> validateAdvanceDirectiveOrganizerCodePTestCase = new OperationsTestCase<AdvanceDirectiveOrganizer>(
			"validateAdvanceDirectiveOrganizerCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveOrganizer target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveOrganizerOperations.validateAdvanceDirectiveOrganizerCodeP(
					(AdvanceDirectiveOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveOrganizerCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveOrganizerStatusCodeP() {
		OperationsTestCase<AdvanceDirectiveOrganizer> validateAdvanceDirectiveOrganizerStatusCodePTestCase = new OperationsTestCase<AdvanceDirectiveOrganizer>(
			"validateAdvanceDirectiveOrganizerStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveOrganizer target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveOrganizerOperations.validateAdvanceDirectiveOrganizerStatusCodeP(
					(AdvanceDirectiveOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveOrganizerStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveOrganizerStatusCode() {
		OperationsTestCase<AdvanceDirectiveOrganizer> validateAdvanceDirectiveOrganizerStatusCodeTestCase = new OperationsTestCase<AdvanceDirectiveOrganizer>(
			"validateAdvanceDirectiveOrganizerStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveOrganizer target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveOrganizer target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(AdvanceDirectiveOrganizer target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveOrganizerStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveOrganizerOperations.validateAdvanceDirectiveOrganizerStatusCode(
					(AdvanceDirectiveOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveOrganizerStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* Note: AdvanceDirectiveObservation will need to be changed to the v2 version and this test will need to be removed.
	* Otherwise, the test code should be the same.
	*/
	@Test
	public void testValidateAdvanceDirectiveOrganizerAdvanceDirectiveObservation() {
		OperationsTestCase<AdvanceDirectiveOrganizer> validateAdvanceDirectiveOrganizerAdvanceDirectiveObservationTestCase = new OperationsTestCase<AdvanceDirectiveOrganizer>(
			"validateAdvanceDirectiveOrganizerAdvanceDirectiveObservation",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_ORGANIZER_ADVANCE_DIRECTIVE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveOrganizer target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveOrganizer target) {
				target.init();
				AdvanceDirectiveObservation ado = ConsolFactory.eINSTANCE.createAdvanceDirectiveObservation();
				target.addObservation(ado);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveOrganizerOperations.validateAdvanceDirectiveOrganizerAdvanceDirectiveObservation(
					(AdvanceDirectiveOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveOrganizerAdvanceDirectiveObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdvanceDirectiveObservations() {

		AdvanceDirectiveOrganizer target = objectFactory.create();
		target.getAdvanceDirectiveObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdvanceDirectiveOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AdvanceDirectiveOrganizer> {
		public AdvanceDirectiveOrganizer create() {
			return ConsolFactory.eINSTANCE.createAdvanceDirectiveOrganizer();
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
	private static class ConstructorTestClass extends AdvanceDirectiveOrganizerOperations {
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

} // AdvanceDirectiveOrganizerOperations
