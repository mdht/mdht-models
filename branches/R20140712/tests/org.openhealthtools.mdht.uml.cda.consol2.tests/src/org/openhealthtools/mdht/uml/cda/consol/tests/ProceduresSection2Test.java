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
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProceduresSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedures Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSection2HasProcedureActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section2 Has Procedure Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSection2Title(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section2 Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSection2Text(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section2 Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#getConsolProcedureActivityObservation2s() <em>Get Consol Procedure Activity Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#getConsolProcedureActivityAct2s() <em>Get Consol Procedure Activity Act2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSectionEntriesOptionalProcedureActivityProcedure2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Procedure Activity Procedure2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSectionEntriesOptionalProcedureActivityObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Procedure Activity Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#validateProceduresSectionEntriesOptionalProcedureActivityAct2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Procedure Activity Act2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2#getConsolProcedureActivityProcedure2s() <em>Get Consol Procedure Activity Procedure2s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProceduresSection2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProceduresSection2HasProcedureActivity() {
		OperationsTestCase<ProceduresSection2> validateProceduresSection2HasProcedureActivityTestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSection2HasProcedureActivity",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION2_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {
				target.init();
			}

			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProceduresSection2 target) {
						target.init();
						target.addProcedure(ConsolFactory.eINSTANCE.createProcedureActivityProcedure2().init());
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProceduresSection2 target) {
						target.init();
						target.addObservation(ConsolFactory.eINSTANCE.createProcedureActivityObservation2().init());
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProceduresSection2 target) {
						target.init();
						target.addAct(ConsolFactory.eINSTANCE.createProcedureActivityAct2().init());
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProceduresSection2 target) {
						target.init();
						target.addProcedure(ConsolFactory.eINSTANCE.createProcedureActivityProcedure2().init());
						target.addObservation(ConsolFactory.eINSTANCE.createProcedureActivityObservation2().init());
						target.addAct(ConsolFactory.eINSTANCE.createProcedureActivityAct2().init());
					}
				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSection2HasProcedureActivity(
					(ProceduresSection2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSection2HasProcedureActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSection2Title() {
		OperationsTestCase<ProceduresSection2> validateProceduresSection2TitleTestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSection2Title",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSection2 target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSection2Title(
					(ProceduresSection2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSection2TitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProceduresSection2Text() {
		OperationsTestCase<ProceduresSection2> validateProceduresSection2TextTestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSection2Text",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSection2 target) {
				target.init();
				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSection2Text(
					(ProceduresSection2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSection2TextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolProcedureActivityObservation2s() {

		ProceduresSection2 target = objectFactory.create();
		target.getConsolProcedureActivityObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolProcedureActivityAct2s() {

		ProceduresSection2 target = objectFactory.create();
		target.getConsolProcedureActivityAct2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalTemplateId() {
		OperationsTestCase<ProceduresSection2> validateProceduresSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSectionEntriesOptionalTemplateId(
					(ProceduresSection2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalCodeP() {
		OperationsTestCase<ProceduresSection2> validateProceduresSectionEntriesOptionalCodePTestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSectionEntriesOptionalCodeP(
					(ProceduresSection2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalCode() {
		OperationsTestCase<ProceduresSection2> validateProceduresSectionEntriesOptionalCodeTestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {

			}

			@Override
			protected void updateToPass(ProceduresSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(ProceduresSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptionalCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSectionEntriesOptionalCode(
					(ProceduresSection2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalProcedureActivityProcedure2() {
		OperationsTestCase<ProceduresSection2> validateProceduresSectionEntriesOptionalProcedureActivityProcedure2TestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSectionEntriesOptionalProcedureActivityProcedure2",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProceduresSection2 target) {
				target.addProcedure(ConsolFactory.eINSTANCE.createProcedureActivityProcedure2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSectionEntriesOptionalProcedureActivityProcedure2(
					(ProceduresSection2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalProcedureActivityProcedure2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalProcedureActivityObservation2() {
		OperationsTestCase<ProceduresSection2> validateProceduresSectionEntriesOptionalProcedureActivityObservation2TestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSectionEntriesOptionalProcedureActivityObservation2",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProceduresSection2 target) {
				target.addObservation(ConsolFactory.eINSTANCE.createProcedureActivityObservation2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSectionEntriesOptionalProcedureActivityObservation2(
					(ProceduresSection2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalProcedureActivityObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalProcedureActivityAct2() {
		OperationsTestCase<ProceduresSection2> validateProceduresSectionEntriesOptionalProcedureActivityAct2TestCase = new OperationsTestCase<ProceduresSection2>(
			"validateProceduresSectionEntriesOptionalProcedureActivityAct2",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProceduresSection2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createProcedureActivityAct2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSection2Operations.validateProceduresSectionEntriesOptionalProcedureActivityAct2(
					(ProceduresSection2) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalProcedureActivityAct2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolProcedureActivityProcedure2s() {

		ProceduresSection2 target = objectFactory.create();
		target.getConsolProcedureActivityProcedure2s();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProceduresSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ProceduresSection2> {
		public ProceduresSection2 create() {
			return ConsolFactory.eINSTANCE.createProceduresSection2();
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
	private static class ConstructorTestClass extends ProceduresSection2Operations {
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

} // ProceduresSection2Operations
