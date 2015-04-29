/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.CourseOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.CourseOfCareSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Course Of Care Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CourseOfCareSection#validateCourseOfCareSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Course Of Care Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CourseOfCareSection#validateCourseOfCareSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Course Of Care Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CourseOfCareSection#validateCourseOfCareSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Course Of Care Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CourseOfCareSection#validateCourseOfCareSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Course Of Care Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CourseOfCareSection#validateCourseOfCareSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Course Of Care Section Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CourseOfCareSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCourseOfCareSectionTemplateId() {
		OperationsTestCase<CourseOfCareSection> validateCourseOfCareSectionTemplateIdTestCase = new OperationsTestCase<CourseOfCareSection>(
			"validateCourseOfCareSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_COURSE_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CourseOfCareSection target) {

			}

			@Override
			protected void updateToPass(CourseOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CourseOfCareSectionOperations.validateCourseOfCareSectionTemplateId(
					(CourseOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validateCourseOfCareSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCourseOfCareSectionCode() {
		OperationsTestCase<CourseOfCareSection> validateCourseOfCareSectionCodeTestCase = new OperationsTestCase<CourseOfCareSection>(
			"validateCourseOfCareSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_COURSE_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CourseOfCareSection target) {

			}

			@Override
			protected void updateToPass(CourseOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CourseOfCareSectionOperations.validateCourseOfCareSectionCode(
					(CourseOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validateCourseOfCareSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCourseOfCareSectionCodeP() {
		OperationsTestCase<CourseOfCareSection> validateCourseOfCareSectionCodePTestCase = new OperationsTestCase<CourseOfCareSection>(
			"validateCourseOfCareSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_COURSE_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CourseOfCareSection target) {

			}

			@Override
			protected void updateToPass(CourseOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CourseOfCareSectionOperations.validateCourseOfCareSectionCodeP(
					(CourseOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validateCourseOfCareSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCourseOfCareSectionTitle() {
		OperationsTestCase<CourseOfCareSection> validateCourseOfCareSectionTitleTestCase = new OperationsTestCase<CourseOfCareSection>(
			"validateCourseOfCareSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_COURSE_OF_CARE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CourseOfCareSection target) {

			}

			@Override
			protected void updateToPass(CourseOfCareSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CourseOfCareSectionOperations.validateCourseOfCareSectionTitle(
					(CourseOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validateCourseOfCareSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCourseOfCareSectionText() {
		OperationsTestCase<CourseOfCareSection> validateCourseOfCareSectionTextTestCase = new OperationsTestCase<CourseOfCareSection>(
			"validateCourseOfCareSectionText",
			operationsForOCL.getOCLValue("VALIDATE_COURSE_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CourseOfCareSection target) {

			}

			@Override
			protected void updateToPass(CourseOfCareSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CourseOfCareSectionOperations.validateCourseOfCareSectionText(
					(CourseOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validateCourseOfCareSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CourseOfCareSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CourseOfCareSection> {
		public CourseOfCareSection create() {
			return ConsolFactory.eINSTANCE.createCourseOfCareSection();
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
	private static class ConstructorTestClass extends CourseOfCareSectionOperations {
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

} // CourseOfCareSectionOperations
