/*******************************************************************************
 * Copyright (c) 2014 Sean Muir, Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) and Dan Brown (Audacious Inquiry) - initial API and implementation
 *     Dan Brown - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalFindingsOfSkinSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicalFindingsOfSkinSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physical Findings Of Skin Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalFindingsOfSkinSection#validatePhysicalFindingsOfSkinSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalFindingsOfSkinSection#validatePhysicalFindingsOfSkinSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalFindingsOfSkinSection#validatePhysicalFindingsOfSkinSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalFindingsOfSkinSection#validatePhysicalFindingsOfSkinSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalFindingsOfSkinSection#validatePhysicalFindingsOfSkinSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalFindingsOfSkinSection#validatePhysicalFindingsOfSkinSectionWoundObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Findings Of Skin Section Wound Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalFindingsOfSkinSection#getWoundObservations() <em>Get Wound Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PhysicalFindingsOfSkinSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalFindingsOfSkinSectionTemplateId() {
		OperationsTestCase<PhysicalFindingsOfSkinSection> validatePhysicalFindingsOfSkinSectionTemplateIdTestCase = new OperationsTestCase<PhysicalFindingsOfSkinSection>(
			"validatePhysicalFindingsOfSkinSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalFindingsOfSkinSection target) {

			}

			@Override
			protected void updateToPass(PhysicalFindingsOfSkinSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalFindingsOfSkinSectionOperations.validatePhysicalFindingsOfSkinSectionTemplateId(
					(PhysicalFindingsOfSkinSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalFindingsOfSkinSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalFindingsOfSkinSectionCode() {
		OperationsTestCase<PhysicalFindingsOfSkinSection> validatePhysicalFindingsOfSkinSectionCodeTestCase = new OperationsTestCase<PhysicalFindingsOfSkinSection>(
			"validatePhysicalFindingsOfSkinSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalFindingsOfSkinSection target) {

			}

			@Override
			protected void updateToPass(PhysicalFindingsOfSkinSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalFindingsOfSkinSectionOperations.validatePhysicalFindingsOfSkinSectionCode(
					(PhysicalFindingsOfSkinSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalFindingsOfSkinSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalFindingsOfSkinSectionCodeP() {
		OperationsTestCase<PhysicalFindingsOfSkinSection> validatePhysicalFindingsOfSkinSectionCodePTestCase = new OperationsTestCase<PhysicalFindingsOfSkinSection>(
			"validatePhysicalFindingsOfSkinSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalFindingsOfSkinSection target) {

			}

			@Override
			protected void updateToPass(PhysicalFindingsOfSkinSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalFindingsOfSkinSectionOperations.validatePhysicalFindingsOfSkinSectionCodeP(
					(PhysicalFindingsOfSkinSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalFindingsOfSkinSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalFindingsOfSkinSectionTitle() {
		OperationsTestCase<PhysicalFindingsOfSkinSection> validatePhysicalFindingsOfSkinSectionTitleTestCase = new OperationsTestCase<PhysicalFindingsOfSkinSection>(
			"validatePhysicalFindingsOfSkinSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalFindingsOfSkinSection target) {

			}

			@Override
			protected void updateToPass(PhysicalFindingsOfSkinSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalFindingsOfSkinSectionOperations.validatePhysicalFindingsOfSkinSectionTitle(
					(PhysicalFindingsOfSkinSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalFindingsOfSkinSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalFindingsOfSkinSectionText() {
		OperationsTestCase<PhysicalFindingsOfSkinSection> validatePhysicalFindingsOfSkinSectionTextTestCase = new OperationsTestCase<PhysicalFindingsOfSkinSection>(
			"validatePhysicalFindingsOfSkinSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalFindingsOfSkinSection target) {

			}

			@Override
			protected void updateToPass(PhysicalFindingsOfSkinSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalFindingsOfSkinSectionOperations.validatePhysicalFindingsOfSkinSectionText(
					(PhysicalFindingsOfSkinSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalFindingsOfSkinSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePhysicalFindingsOfSkinSectionWoundObservation() {
		OperationsTestCase<PhysicalFindingsOfSkinSection> validatePhysicalFindingsOfSkinSectionWoundObservationTestCase = new OperationsTestCase<PhysicalFindingsOfSkinSection>(
			"validatePhysicalFindingsOfSkinSectionWoundObservation",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_FINDINGS_OF_SKIN_SECTION_WOUND_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalFindingsOfSkinSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(PhysicalFindingsOfSkinSection target) {
				target.addObservation(ConsolFactory.eINSTANCE.createWoundObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalFindingsOfSkinSectionOperations.validatePhysicalFindingsOfSkinSectionWoundObservation(
					(PhysicalFindingsOfSkinSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalFindingsOfSkinSectionWoundObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetWoundObservations() {

		PhysicalFindingsOfSkinSection target = objectFactory.create();
		target.getWoundObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PhysicalFindingsOfSkinSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PhysicalFindingsOfSkinSection> {
		public PhysicalFindingsOfSkinSection create() {
			return ConsolFactory.eINSTANCE.createPhysicalFindingsOfSkinSection();
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
	private static class ConstructorTestClass extends PhysicalFindingsOfSkinSectionOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // PhysicalFindingsOfSkinSectionOperations
