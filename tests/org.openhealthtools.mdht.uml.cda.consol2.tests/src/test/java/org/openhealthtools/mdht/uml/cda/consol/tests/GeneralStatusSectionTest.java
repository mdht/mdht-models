/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.StrucDocText;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ST;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralStatusSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>General Status Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection#validateGeneralStatusSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Status Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection#validateGeneralStatusSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Status Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection#validateGeneralStatusSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Status Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection#validateGeneralStatusSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Status Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection#validateGeneralStatusSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Status Section Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GeneralStatusSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralStatusSectionTemplateId() {
		OperationsTestCase<GeneralStatusSection> validateGeneralStatusSectionTemplateIdTestCase = new OperationsTestCase<GeneralStatusSection>(
			"validateGeneralStatusSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralStatusSection target) {

			}

			@Override
			protected void updateToPass(GeneralStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralStatusSectionOperations.validateGeneralStatusSectionTemplateId(
					(GeneralStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateGeneralStatusSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralStatusSectionCode() {
		OperationsTestCase<GeneralStatusSection> validateGeneralStatusSectionCodeTestCase = new OperationsTestCase<GeneralStatusSection>(
			"validateGeneralStatusSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralStatusSection target) {

			}

			@Override
			protected void updateToPass(GeneralStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralStatusSectionOperations.validateGeneralStatusSectionCode(
					(GeneralStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateGeneralStatusSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralStatusSectionCodeP() {
		OperationsTestCase<GeneralStatusSection> validateGeneralStatusSectionCodePTestCase = new OperationsTestCase<GeneralStatusSection>(
			"validateGeneralStatusSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_STATUS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralStatusSection target) {

			}

			@Override
			protected void updateToPass(GeneralStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralStatusSectionOperations.validateGeneralStatusSectionCodeP(
					(GeneralStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateGeneralStatusSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralStatusSectionTitle() {
		OperationsTestCase<GeneralStatusSection> validateGeneralStatusSectionTitleTestCase = new OperationsTestCase<GeneralStatusSection>(
			"validateGeneralStatusSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_STATUS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralStatusSection target) {

			}

			@Override
			protected void updateToPass(GeneralStatusSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralStatusSectionOperations.validateGeneralStatusSectionTitle(
					(GeneralStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateGeneralStatusSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralStatusSectionText() {
		OperationsTestCase<GeneralStatusSection> validateGeneralStatusSectionTextTestCase = new OperationsTestCase<GeneralStatusSection>(
			"validateGeneralStatusSectionText",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_STATUS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralStatusSection target) {

			}

			@Override
			protected void updateToPass(GeneralStatusSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralStatusSectionOperations.validateGeneralStatusSectionText(
					(GeneralStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateGeneralStatusSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GeneralStatusSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<GeneralStatusSection> {
		@Override
		public GeneralStatusSection create() {
			return ConsolFactory.eINSTANCE.createGeneralStatusSection();
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
	private static class ConstructorTestClass extends GeneralStatusSectionOperations {
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

} // GeneralStatusSectionOperations
