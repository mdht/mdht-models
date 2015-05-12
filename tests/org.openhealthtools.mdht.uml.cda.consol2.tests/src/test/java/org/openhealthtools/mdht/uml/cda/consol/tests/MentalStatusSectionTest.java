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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionAssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionMentalStatusOrganizer2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Mental Status Organizer2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#validateMentalStatusSectionMentalStatusObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Section Mental Status Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#getAssessmentScaleObservations() <em>Get Assessment Scale Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#getMentalStatusOrganizer2s() <em>Get Mental Status Organizer2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection#getMentalStatusObservation2s() <em>Get Mental Status Observation2s</em>}</li>
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
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusSectionCode() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionCodeTestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCE("10190-7", LOINC_ID));
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
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusSectionCodeP() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionCodePTestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {
				target.init();
				target.setCode(null);
			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCE());

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
	public void testValidateMentalStatusSectionMentalStatusOrganizer2() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionMentalStatusOrganizer2TestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionMentalStatusOrganizer2",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_SECTION_MENTAL_STATUS_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.addOrganizer(ConsolFactory.eINSTANCE.createMentalStatusOrganizer2().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusSectionOperations.validateMentalStatusSectionMentalStatusOrganizer2(
					(MentalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusSectionMentalStatusOrganizer2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusSectionMentalStatusObservation2() {
		OperationsTestCase<MentalStatusSection> validateMentalStatusSectionMentalStatusObservation2TestCase = new OperationsTestCase<MentalStatusSection>(
			"validateMentalStatusSectionMentalStatusObservation2",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_SECTION_MENTAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(MentalStatusSection target) {
				target.addObservation(ConsolFactory.eINSTANCE.createMentalStatusObservation2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusSectionOperations.validateMentalStatusSectionMentalStatusObservation2(
					(MentalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusSectionMentalStatusObservation2TestCase.doValidationTest();
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
	public void testGetMentalStatusOrganizer2s() {

		MentalStatusSection target = objectFactory.create();
		target.getMentalStatusOrganizer2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMentalStatusObservation2s() {

		MentalStatusSection target = objectFactory.create();
		target.getMentalStatusObservation2s();

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
