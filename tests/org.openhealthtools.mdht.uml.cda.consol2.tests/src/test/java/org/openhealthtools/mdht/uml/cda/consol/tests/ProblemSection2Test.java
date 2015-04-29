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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection2#validateProblemSection2NullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section2 Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection2#validateProblemSection2Title(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section2 Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection2#validateProblemSection2Text(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section2 Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection2#getConsolHealthStatusObservation2() <em>Get Consol Health Status Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection2#validateProblemSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection2#validateProblemSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection2#validateProblemSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection2#validateProblemSectionEntriesOptionalProblemConcernAct2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional Problem Concern Act2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection2#validateProblemSectionEntriesOptional2HealthStatusObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Section Entries Optional2 Health Status Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection2#getConsolProblemConcernAct2s() <em>Get Consol Problem Concern Act2s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProblemSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemSection2NullFlavor() {
		OperationsTestCase<ProblemSection2> validateProblemSection2NullFlavorTestCase = new OperationsTestCase<ProblemSection2>(
			"validateProblemSection2NullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSection2 target) {

			}

			@Override
			protected void updateToPass(ProblemSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSection2Operations.validateProblemSection2NullFlavor(
					(ProblemSection2) objectToTest, diagnostician, map);
			}

		};

		validateProblemSection2NullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemSection2Title() {
		OperationsTestCase<ProblemSection2> validateProblemSection2TitleTestCase = new OperationsTestCase<ProblemSection2>(
			"validateProblemSection2Title",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSection2 target) {

			}

			@Override
			protected void updateToPass(ProblemSection2 target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSection2Operations.validateProblemSection2Title(
					(ProblemSection2) objectToTest, diagnostician, map);
			}

		};

		validateProblemSection2TitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemSection2Text() {
		OperationsTestCase<ProblemSection2> validateProblemSection2TextTestCase = new OperationsTestCase<ProblemSection2>(
			"validateProblemSection2Text",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSection2 target) {

			}

			@Override
			protected void updateToPass(ProblemSection2 target) {
				target.init();
				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSection2Operations.validateProblemSection2Text(
					(ProblemSection2) objectToTest, diagnostician, map);
			}

		};

		validateProblemSection2TextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolHealthStatusObservation2() {

		ProblemSection2 target = objectFactory.create();
		target.getConsolHealthStatusObservation2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemSectionEntriesOptionalTemplateId() {
		OperationsTestCase<ProblemSection2> validateProblemSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<ProblemSection2>(
			"validateProblemSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSection2 target) {

			}

			@Override
			protected void updateToPass(ProblemSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSection2Operations.validateProblemSectionEntriesOptionalTemplateId(
					(ProblemSection2) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemSectionEntriesOptionalCodeP() {
		OperationsTestCase<ProblemSection2> validateProblemSectionEntriesOptionalCodePTestCase = new OperationsTestCase<ProblemSection2>(
			"validateProblemSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSection2 target) {

			}

			@Override
			protected void updateToPass(ProblemSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSection2Operations.validateProblemSectionEntriesOptionalCodeP(
					(ProblemSection2) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemSectionEntriesOptionalCode() {
		OperationsTestCase<ProblemSection2> validateProblemSectionEntriesOptionalCodeTestCase = new OperationsTestCase<ProblemSection2>(
			"validateProblemSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSection2 target) {

			}

			@Override
			protected void updateToPass(ProblemSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(ProblemSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptionalCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSection2Operations.validateProblemSectionEntriesOptionalCode(
					(ProblemSection2) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemSectionEntriesOptionalProblemConcernAct2() {
		OperationsTestCase<ProblemSection2> validateProblemSectionEntriesOptionalProblemConcernAct2TestCase = new OperationsTestCase<ProblemSection2>(
			"validateProblemSectionEntriesOptionalProblemConcernAct2",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL_PROBLEM_CONCERN_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSection2 target) {
				// target.init defaults to a nullFlavor of NI which allows a pass
			}

			@Override
			protected void updateToPass(ProblemSection2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createProblemConcernAct2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSection2Operations.validateProblemSectionEntriesOptionalProblemConcernAct2(
					(ProblemSection2) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionEntriesOptionalProblemConcernAct2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemSectionEntriesOptional2HealthStatusObservation2() {
		OperationsTestCase<ProblemSection2> validateProblemSectionEntriesOptional2HealthStatusObservation2TestCase = new OperationsTestCase<ProblemSection2>(
			"validateProblemSectionEntriesOptional2HealthStatusObservation2",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_SECTION_ENTRIES_OPTIONAL2_HEALTH_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemSection2 target) {
				// target.init defaults to a nullFlavor of NI which allows a pass
			}

			@Override
			protected void updateToPass(ProblemSection2 target) {
				target.addObservation(ConsolFactory.eINSTANCE.createHealthStatusObservation2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemSection2Operations.validateProblemSectionEntriesOptional2HealthStatusObservation2(
					(ProblemSection2) objectToTest, diagnostician, map);
			}

		};

		validateProblemSectionEntriesOptional2HealthStatusObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolProblemConcernAct2s() {

		ProblemSection2 target = objectFactory.create();
		target.getConsolProblemConcernAct2s();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProblemSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ProblemSection2> {
		@Override
		public ProblemSection2 create() {
			return ConsolFactory.eINSTANCE.createProblemSection2();
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
	private static class ConstructorTestClass extends ProblemSection2Operations {
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

} // ProblemSection2Operations
