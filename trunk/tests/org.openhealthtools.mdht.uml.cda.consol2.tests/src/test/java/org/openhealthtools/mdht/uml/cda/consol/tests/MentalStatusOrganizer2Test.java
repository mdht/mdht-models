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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.operations.MentalStatusOrganizer2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mental Status Organizer2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusOrganizer2#validateMentalStatusOrganizer2CodeCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Organizer2 Code Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusOrganizer2#validateMentalStatusOrganizer2HasCodeOrEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Organizer2 Has Code Or Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusOrganizer2#validateMentalStatusOrganizer2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Organizer2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusOrganizer2#validateCognitiveStatusResultOrganizerMentalStatusObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Organizer Mental Status Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusOrganizer2#validateMentalStatusOrganizer2CDCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Organizer2 CD Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusOrganizer2#getConsolMentalStatusObservation2s() <em>Get Consol Mental Status Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusOrganizer2#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusOrganizer2#validateResultOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MentalStatusOrganizer2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusOrganizer2CodeCodeSystem() {
		OperationsTestCase<MentalStatusOrganizer2> validateMentalStatusOrganizer2CodeCodeSystemTestCase = new OperationsTestCase<MentalStatusOrganizer2>(
			"validateMentalStatusOrganizer2CodeCodeSystem",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_ORGANIZER2_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusOrganizer2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(MentalStatusOrganizer2 target) {
				target.getCode().setCodeSystem("2.16.840.1.113883.6.254");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusOrganizer2Operations.validateMentalStatusOrganizer2CodeCodeSystem(
					(MentalStatusOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusOrganizer2CodeCodeSystemTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusOrganizer2HasCodeOrEffectiveTime() {
		OperationsTestCase<MentalStatusOrganizer2> validateMentalStatusOrganizer2HasCodeOrEffectiveTimeTestCase = new OperationsTestCase<MentalStatusOrganizer2>(
			"validateMentalStatusOrganizer2HasCodeOrEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_ORGANIZER2_HAS_CODE_OR_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusOrganizer2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusOrganizer2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusOrganizer2Operations.validateMentalStatusOrganizer2HasCodeOrEffectiveTime(
					(MentalStatusOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusOrganizer2HasCodeOrEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusOrganizer2EffectiveTime() {
		OperationsTestCase<MentalStatusOrganizer2> validateMentalStatusOrganizer2EffectiveTimeTestCase = new OperationsTestCase<MentalStatusOrganizer2>(
			"validateMentalStatusOrganizer2EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_ORGANIZER2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusOrganizer2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusOrganizer2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusOrganizer2Operations.validateMentalStatusOrganizer2EffectiveTime(
					(MentalStatusOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusOrganizer2EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCognitiveStatusResultOrganizerMentalStatusObservation2() {
		OperationsTestCase<MentalStatusOrganizer2> validateCognitiveStatusResultOrganizerMentalStatusObservation2TestCase = new OperationsTestCase<MentalStatusOrganizer2>(
			"validateCognitiveStatusResultOrganizerMentalStatusObservation2",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_ORGANIZER_MENTAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusOrganizer2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusOrganizer2 target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createMentalStatusObservation2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusOrganizer2Operations.validateCognitiveStatusResultOrganizerMentalStatusObservation2(
					(MentalStatusOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultOrganizerMentalStatusObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusOrganizer2CDCode() {
		OperationsTestCase<MentalStatusOrganizer2> validateMentalStatusOrganizer2CDCodeTestCase = new OperationsTestCase<MentalStatusOrganizer2>(
			"validateMentalStatusOrganizer2CDCode",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_ORGANIZER2_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusOrganizer2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(MentalStatusOrganizer2 target) {
				target.getCode().setCode("mustExistOnly");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusOrganizer2Operations.validateMentalStatusOrganizer2CDCode(
					(MentalStatusOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusOrganizer2CDCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolMentalStatusObservation2s() {

		MentalStatusOrganizer2 target = objectFactory.create();
		target.getConsolMentalStatusObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultOrganizerTemplateId() {
		OperationsTestCase<MentalStatusOrganizer2> validateResultOrganizerTemplateIdTestCase = new OperationsTestCase<MentalStatusOrganizer2>(
			"validateResultOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusOrganizer2 target) {

			}

			@Override
			protected void updateToPass(MentalStatusOrganizer2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusOrganizer2Operations.validateResultOrganizerTemplateId(
					(MentalStatusOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultOrganizerCode() {
		OperationsTestCase<MentalStatusOrganizer2> validateResultOrganizerCodeTestCase = new OperationsTestCase<MentalStatusOrganizer2>(
			"validateResultOrganizerCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusOrganizer2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(MentalStatusOrganizer2 target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusOrganizer2Operations.validateResultOrganizerCode(
					(MentalStatusOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MentalStatusOrganizer2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<MentalStatusOrganizer2> {
		public MentalStatusOrganizer2 create() {
			return ConsolFactory.eINSTANCE.createMentalStatusOrganizer2();
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
	private static class ConstructorTestClass extends MentalStatusOrganizer2Operations {
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

} // MentalStatusOrganizer2Operations
