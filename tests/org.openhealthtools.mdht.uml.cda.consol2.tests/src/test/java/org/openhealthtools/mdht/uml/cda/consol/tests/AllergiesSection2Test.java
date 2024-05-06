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
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.StrucDocText;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ST;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergiesSection2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergies Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2#validateAllergiesSection2NullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section2 Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2#validateAllergiesSection2Title(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section2 Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2#validateAllergiesSection2Text(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section2 Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2#validateAllergiesSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2#validateAllergiesSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2#validateAllergiesSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2#validateAllergiesSectionEntriesOptionalAllergyProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Allergy Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2#getConsolAllergyConcernAct2s() <em>Get Consol Allergy Concern Act2s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AllergiesSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesSection2NullFlavor() {
		OperationsTestCase<AllergiesSection2> validateAllergiesSection2NullFlavorTestCase = new OperationsTestCase<AllergiesSection2>(
			"validateAllergiesSection2NullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSection2 target) {

			}

			@Override
			protected void updateToPass(AllergiesSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSection2Operations.validateAllergiesSection2NullFlavor(
					(AllergiesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSection2NullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesSection2Title() {
		OperationsTestCase<AllergiesSection2> validateAllergiesSection2TitleTestCase = new OperationsTestCase<AllergiesSection2>(
			"validateAllergiesSection2Title",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSection2 target) {

			}

			@Override
			protected void updateToPass(AllergiesSection2 target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSection2Operations.validateAllergiesSection2Title(
					(AllergiesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSection2TitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergiesSection2Text() {
		OperationsTestCase<AllergiesSection2> validateAllergiesSection2TextTestCase = new OperationsTestCase<AllergiesSection2>(
			"validateAllergiesSection2Text",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSection2 target) {

			}

			@Override
			protected void updateToPass(AllergiesSection2 target) {
				target.init();
				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSection2Operations.validateAllergiesSection2Text(
					(AllergiesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSection2TextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAllergiesSectionEntriesOptionalTemplateId() {
		OperationsTestCase<AllergiesSection2> validateAllergiesSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<AllergiesSection2>(
			"validateAllergiesSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSection2 target) {

			}

			@Override
			protected void updateToPass(AllergiesSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSection2Operations.validateAllergiesSectionEntriesOptionalTemplateId(
					(AllergiesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesSectionEntriesOptionalCodeP() {
		OperationsTestCase<AllergiesSection2> validateAllergiesSectionEntriesOptionalCodePTestCase = new OperationsTestCase<AllergiesSection2>(
			"validateAllergiesSectionEntriesOptionalCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSection2 target) {

			}

			@Override
			protected void updateToPass(AllergiesSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSection2Operations.validateAllergiesSectionEntriesOptionalCodeP(
					(AllergiesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesSectionEntriesOptionalCode() {
		OperationsTestCase<AllergiesSection2> validateAllergiesSectionEntriesOptionalCodeTestCase = new OperationsTestCase<AllergiesSection2>(
			"validateAllergiesSectionEntriesOptionalCode", operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSection2 target) {

			}

			@Override
			protected void updateToPass(AllergiesSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(AllergiesSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptionalCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSection2Operations.validateAllergiesSectionEntriesOptionalCode(
					(AllergiesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergiesSectionEntriesOptionalAllergyProblemAct() {
		OperationsTestCase<AllergiesSection2> validateAllergiesSectionEntriesOptionalAllergyProblemActTestCase = new OperationsTestCase<AllergiesSection2>(
			"validateAllergiesSectionEntriesOptionalAllergyProblemAct",
			operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSection2 target) {
				// target.init defaults to a nullFlavor of NI which allows a pass
			}

			@Override
			protected void updateToPass(AllergiesSection2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createAllergyConcernAct2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSection2Operations.validateAllergiesSectionEntriesOptionalAllergyProblemAct(
					(AllergiesSection2) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSectionEntriesOptionalAllergyProblemActTestCase.doValidationTest();
	}

	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidateAllergiesSectionEntriesOptionalAllergyConcernAct2() {
	// OperationsTestCase<AllergiesSection2> validateAllergiesSectionEntriesOptionalAllergyConcernAct2TestCase = new
	// OperationsTestCase<AllergiesSection2>(
	// "validateAllergiesSectionEntriesOptionalAllergyConcernAct2",
	// operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_CONCERN_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(AllergiesSection2 target) {
	// // target.init defaults to a nullFlavor of NI which allows a pass
	// }
	//
	// @Override
	// protected void updateToPass(AllergiesSection2 target) {
	// target.addAct(ConsolFactory.eINSTANCE.createAllergyConcernAct2().init());
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return AllergiesSection2Operations.validateAllergiesSectionEntriesOptionalAllergyConcernAct2(
	// (AllergiesSection2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateAllergiesSectionEntriesOptionalAllergyConcernAct2TestCase.doValidationTest();
	// }

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolAllergyConcernAct2s() {

		AllergiesSection2 target = objectFactory.create();
		target.getConsolAllergyConcernAct2s();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AllergiesSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergiesSection2> {
		@Override
		public AllergiesSection2 create() {
			return ConsolFactory.eINSTANCE.createAllergiesSection2();
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
	private static class ConstructorTestClass extends AllergiesSection2Operations {
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

} // AllergiesSection2Operations
