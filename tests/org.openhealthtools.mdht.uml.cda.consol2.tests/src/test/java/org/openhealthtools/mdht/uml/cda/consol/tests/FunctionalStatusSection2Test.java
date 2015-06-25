/*******************************************************************************
 * Copyright (c) 2014, 2015 Dan Brown and others.
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
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.FunctionalStatusSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Functional Status Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSection2SelfCareActivities(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Self Care Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSection2SensoryAndSpeechStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Sensory And Speech Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#getConsolFunctionalStatusOrganizer2s() <em>Get Consol Functional Status Organizer2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#getConsolFunctionalStatusObservation2s() <em>Get Consol Functional Status Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#getConsolCognitiveStatusResultOrganizers() <em>Get Consol Cognitive Status Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#getConsolCognitiveStatusResultObservations() <em>Get Consol Cognitive Status Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#getConsolNonMedicinalSupplyActivity2s() <em>Get Consol Non Medicinal Supply Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#getConsolNumberOfPressureUlcersObservations() <em>Get Consol Number Of Pressure Ulcers Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#getConsolHighestPressureUlcerStages() <em>Get Consol Highest Pressure Ulcer Stages</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#getSelfCareActivitiess() <em>Get Self Care Activitiess</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#getSensoryAndSpeechStatuss() <em>Get Sensory And Speech Statuss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSectionFunctionalStatusResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Functional Status Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSectionFunctionalStatusResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Functional Status Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSectionNonMedicinalSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Non Medicinal Supply Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FunctionalStatusSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusSectionCodeP() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSectionCodePTestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSectionCodeP(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFunctionalStatusSection2SelfCareActivities() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSection2SelfCareActivitiesTestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSection2SelfCareActivities",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION2_SELF_CARE_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.addObservation(ConsolFactory.eINSTANCE.createSelfCareActivities().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSection2SelfCareActivities(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSection2SelfCareActivitiesTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFunctionalStatusSection2SensoryAndSpeechStatus() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSection2SensoryAndSpeechStatusTestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSection2SensoryAndSpeechStatus",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION2_SENSORY_AND_SPEECH_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.addObservation(ConsolFactory.eINSTANCE.createSensoryStatus().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSection2SensoryAndSpeechStatus(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSection2SensoryAndSpeechStatusTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolFunctionalStatusOrganizer2s() {

		FunctionalStatusSection2 target = objectFactory.create();
		target.getConsolFunctionalStatusOrganizer2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolFunctionalStatusObservation2s() {

		FunctionalStatusSection2 target = objectFactory.create();
		target.getConsolFunctionalStatusObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolCognitiveStatusResultOrganizers() {

		FunctionalStatusSection2 target = objectFactory.create();
		target.getConsolCognitiveStatusResultOrganizers();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolCognitiveStatusResultObservations() {

		FunctionalStatusSection2 target = objectFactory.create();
		target.getConsolCognitiveStatusResultObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolNonMedicinalSupplyActivity2s() {

		FunctionalStatusSection2 target = objectFactory.create();
		target.getConsolNonMedicinalSupplyActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolNumberOfPressureUlcersObservations() {

		FunctionalStatusSection2 target = objectFactory.create();
		target.getConsolNumberOfPressureUlcersObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolHighestPressureUlcerStages() {

		FunctionalStatusSection2 target = objectFactory.create();
		target.getConsolHighestPressureUlcerStages();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSelfCareActivitiess() {

		FunctionalStatusSection2 target = objectFactory.create();
		target.getSelfCareActivitiess();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSensoryAndSpeechStatuss() {

		FunctionalStatusSection2 target = objectFactory.create();
		target.getSensoryAndSpeechStatuss();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusSectionTemplateId() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSectionTemplateIdTestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSectionTemplateId(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusSectionCode() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSectionCodeTestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(FunctionalStatusSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSectionCode(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFunctionalStatusSectionFunctionalStatusResultOrganizer() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSectionFunctionalStatusResultOrganizerTestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSectionFunctionalStatusResultOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.addOrganizer(ConsolFactory.eINSTANCE.createFunctionalStatusOrganizer2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSectionFunctionalStatusResultOrganizer(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionFunctionalStatusResultOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFunctionalStatusSectionFunctionalStatusResultObservation() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSectionFunctionalStatusResultObservationTestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSectionFunctionalStatusResultObservation",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.addObservation(ConsolFactory.eINSTANCE.createFunctionalStatusObservation2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSectionFunctionalStatusResultObservation(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionFunctionalStatusResultObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFunctionalStatusSectionNonMedicinalSupplyActivity() {
		OperationsTestCase<FunctionalStatusSection2> validateFunctionalStatusSectionNonMedicinalSupplyActivityTestCase = new OperationsTestCase<FunctionalStatusSection2>(
			"validateFunctionalStatusSectionNonMedicinalSupplyActivity",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection2 target) {
				target.init();
				target.addSupply(ConsolFactory.eINSTANCE.createNonMedicinalSupplyActivity2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSection2Operations.validateFunctionalStatusSectionNonMedicinalSupplyActivity(
					(FunctionalStatusSection2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionNonMedicinalSupplyActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FunctionalStatusSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<FunctionalStatusSection2> {
		@Override
		public FunctionalStatusSection2 create() {
			return ConsolFactory.eINSTANCE.createFunctionalStatusSection2();
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
	private static class ConstructorTestClass extends FunctionalStatusSection2Operations {
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

} // FunctionalStatusSection2Operations
