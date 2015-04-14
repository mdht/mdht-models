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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.MentalStatusSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mental Status Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionCaregiverCharacteristics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Caregiver Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionAssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionCognitiveAbilitiesObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Cognitive Abilities Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionMentalStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Mental Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionCognitiveStatusOrganizer2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Cognitive Status Organizer2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionCognitiveStatusObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Cognitive Status Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionNonMedicinalSupplyActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Non Medicinal Supply Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#getCaregiverCharacteristicss() <em>Get Caregiver Characteristicss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#getAssessmentScaleObservations() <em>Get Assessment Scale Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#getCognitiveAbilitiesObservations() <em>Get Cognitive Abilities Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#getMentalStatusObservations() <em>Get Mental Status Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#getCognitiveStatusOrganizer2s() <em>Get Cognitive Status Organizer2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#getCognitiveStatusObservation2s() <em>Get Cognitive Status Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#getNonMedicinalSupplyActivity2s() <em>Get Non Medicinal Supply Activity2s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MentalStatusSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusSectionTemplateId() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionTemplateIdTestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {

			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusSectionOperations.validateMentalStatusSectionTemplateId(
					(MentalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusSectionCode() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionCodeTestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {

			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusSectionOperations.validateMentalStatusSectionCode(
					(MentalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusSectionCodeP() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionCodePTestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {

			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusSectionOperations.validateMentalStatusSectionCodeP(
					(MentalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusSectionTitle() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionTitleTestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {

			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusSectionOperations.validateMentalStatusSectionTitle(
					(MentalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusSectionText() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionTextTestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionText",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {

			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusSectionOperations.validateMentalStatusSectionText(
					(MentalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusSectionCaregiverCharacteristics() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionCaregiverCharacteristicsTestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionCaregiverCharacteristics",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_SECTION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.addObservation(ConsolFactory.eINSTANCE.createCaregiverCharacteristics());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusSectionOperations.validateMentalStatusSectionCaregiverCharacteristics(
					(MentalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusSectionCaregiverCharacteristicsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusSectionAssessmentScaleObservation() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionAssessmentScaleObservationTestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionAssessmentScaleObservation",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_SECTION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.addObservation(ConsolFactory.eINSTANCE.createAssessmentScaleObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusSectionOperations.validateMentalStatusSectionAssessmentScaleObservation(
					(MentalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusSectionAssessmentScaleObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusSectionCognitiveAbilitiesObservation() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionCognitiveAbilitiesObservationTestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionCognitiveAbilitiesObservation",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_SECTION_COGNITIVE_ABILITIES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.addObservation(ConsolFactory.eINSTANCE.createCognitiveAbilitiesObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusSectionOperations.validateMentalStatusSectionCognitiveAbilitiesObservation(
					(MentalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusSectionCognitiveAbilitiesObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusSectionMentalStatusObservation() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionMentalStatusObservationTestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionMentalStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_SECTION_MENTAL_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.addObservation(ConsolFactory.eINSTANCE.createMentalStatusObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusSectionOperations.validateMentalStatusSectionMentalStatusObservation(
					(MentalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusSectionMentalStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusSectionCognitiveStatusOrganizer2() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionCognitiveStatusOrganizer2TestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionCognitiveStatusOrganizer2",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_SECTION_COGNITIVE_STATUS_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {

			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.init();
				target.addOrganizer(ConsolFactory.eINSTANCE.createMentalStatusOrganizer2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusSectionOperations.validateMentalStatusSectionCognitiveStatusOrganizer2(
					(MentalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusSectionCognitiveStatusOrganizer2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusSectionCognitiveStatusObservation2() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionCognitiveStatusObservation2TestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionCognitiveStatusObservation2",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_SECTION_COGNITIVE_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {

			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createMentalStatusObservation2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusSectionOperations.validateMentalStatusSectionCognitiveStatusObservation2(
					(MentalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusSectionCognitiveStatusObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusSectionNonMedicinalSupplyActivity2() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionNonMedicinalSupplyActivity2TestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionNonMedicinalSupplyActivity2",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {

			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.init();
				target.addSupply(ConsolFactory.eINSTANCE.createNonMedicinalSupplyActivity2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusSectionOperations.validateMentalStatusSectionNonMedicinalSupplyActivity2(
					(MentalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusSectionNonMedicinalSupplyActivity2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCaregiverCharacteristicss() {

		MentalStatusSection target = objectFactory.create();
		target.getCaregiverCharacteristicss();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentScaleObservations() {

		MentalStatusSection target = objectFactory.create();
		target.getAssessmentScaleObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCognitiveAbilitiesObservations() {

		MentalStatusSection target = objectFactory.create();
		target.getCognitiveAbilitiesObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMentalStatusObservations() {

		MentalStatusSection target = objectFactory.create();
		target.getMentalStatusObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCognitiveStatusOrganizer2s() {

		MentalStatusSection target = objectFactory.create();
		target.getCognitiveStatusOrganizer2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCognitiveStatusObservation2s() {

		MentalStatusSection target = objectFactory.create();
		target.getCognitiveStatusObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNonMedicinalSupplyActivity2s() {

		MentalStatusSection target = objectFactory.create();
		target.getNonMedicinalSupplyActivity2s();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MentalStatusSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MentalStatusSection> {
		@Override
		public MentalStatusSection create() {
			return ConsolFactory.eINSTANCE.createMentalStatusSection();
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
	private static class ConstructorTestClass extends MentalStatusSectionOperations {
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

} // MentalStatusSectionOperations
