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
import org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.HealthConcernsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Health Concerns Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionHealthConcernAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Health Concern Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionHealthStatusObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Health Status Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#getHealthConcernActs() <em>Get Health Concern Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#getHealthStatusObservation2() <em>Get Health Status Observation2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HealthConcernsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernsSectionTemplateId() {
		OperationsTestCase<HealthConcernsSection> validateHealthConcernsSectionTemplateIdTestCase = new OperationsTestCase<HealthConcernsSection>(
			"validateHealthConcernsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernsSection target) {

			}

			@Override
			protected void updateToPass(HealthConcernsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernsSectionOperations.validateHealthConcernsSectionTemplateId(
					(HealthConcernsSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernsSectionCode() {
		OperationsTestCase<HealthConcernsSection> validateHealthConcernsSectionCodeTestCase = new OperationsTestCase<HealthConcernsSection>(
			"validateHealthConcernsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernsSection target) {

			}

			@Override
			protected void updateToPass(HealthConcernsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernsSectionOperations.validateHealthConcernsSectionCode(
					(HealthConcernsSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernsSectionCodeP() {
		OperationsTestCase<HealthConcernsSection> validateHealthConcernsSectionCodePTestCase = new OperationsTestCase<HealthConcernsSection>(
			"validateHealthConcernsSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernsSection target) {

			}

			@Override
			protected void updateToPass(HealthConcernsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernsSectionOperations.validateHealthConcernsSectionCodeP(
					(HealthConcernsSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernsSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernsSectionTitle() {
		OperationsTestCase<HealthConcernsSection> validateHealthConcernsSectionTitleTestCase = new OperationsTestCase<HealthConcernsSection>(
			"validateHealthConcernsSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernsSection target) {

			}

			@Override
			protected void updateToPass(HealthConcernsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernsSectionOperations.validateHealthConcernsSectionTitle(
					(HealthConcernsSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernsSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthConcernsSectionText() {
		OperationsTestCase<HealthConcernsSection> validateHealthConcernsSectionTextTestCase = new OperationsTestCase<HealthConcernsSection>(
			"validateHealthConcernsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernsSection target) {

			}

			@Override
			protected void updateToPass(HealthConcernsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernsSectionOperations.validateHealthConcernsSectionText(
					(HealthConcernsSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernsSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthConcernsSectionHealthConcernAct() {
		OperationsTestCase<HealthConcernsSection> validateHealthConcernsSectionHealthConcernActTestCase = new OperationsTestCase<HealthConcernsSection>(
			"validateHealthConcernsSectionHealthConcernAct",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_CONCERN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernsSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(HealthConcernsSection target) {
				target.addAct(ConsolFactory.eINSTANCE.createHealthConcernAct().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernsSectionOperations.validateHealthConcernsSectionHealthConcernAct(
					(HealthConcernsSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernsSectionHealthConcernActTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHealthConcernsSectionHealthStatusObservation2() {
		OperationsTestCase<HealthConcernsSection> validateHealthConcernsSectionHealthStatusObservation2TestCase = new OperationsTestCase<HealthConcernsSection>(
			"validateHealthConcernsSectionHealthStatusObservation2",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernsSection target) {

			}

			@Override
			protected void updateToPass(HealthConcernsSection target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createHealthStatusObservation2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernsSectionOperations.validateHealthConcernsSectionHealthStatusObservation2(
					(HealthConcernsSection) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernsSectionHealthStatusObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHealthConcernActs() {

		HealthConcernsSection target = objectFactory.create();
		target.getHealthConcernActs();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHealthStatusObservation2() {

		HealthConcernsSection target = objectFactory.create();
		target.getHealthStatusObservation2();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HealthConcernsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HealthConcernsSection> {
		@Override
		public HealthConcernsSection create() {
			return ConsolFactory.eINSTANCE.createHealthConcernsSection();
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
	private static class ConstructorTestClass extends HealthConcernsSectionOperations {
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

} // HealthConcernsSectionOperations
