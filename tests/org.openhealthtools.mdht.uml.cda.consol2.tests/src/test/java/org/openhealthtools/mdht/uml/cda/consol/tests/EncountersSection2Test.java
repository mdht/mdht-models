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
import org.openhealthtools.mdht.uml.cda.consol.EncountersSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.EncountersSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounters Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection2#validateEncountersSection2NullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section2 Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection2#validateEncountersSection2Text(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section2 Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection2#validateEncountersSection2Title(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section2 Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection2#validateEncountersSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection2#validateEncountersSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection2#validateEncountersSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection2#validateEncountersSectionEntriesOptionalEncounterActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Encounter Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection2#getConsolEncounterActivity2s() <em>Get Consol Encounter Activity2s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncountersSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersSection2NullFlavor() {
		OperationsTestCase<EncountersSection2> validateEncountersSection2NullFlavorTestCase = new OperationsTestCase<EncountersSection2>(
			"validateEncountersSection2NullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersSection2 target) {

			}

			@Override
			protected void updateToPass(EncountersSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSection2Operations.validateEncountersSection2NullFlavor(
					(EncountersSection2) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSection2NullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncountersSection2Text() {
		OperationsTestCase<EncountersSection2> validateEncountersSection2TextTestCase = new OperationsTestCase<EncountersSection2>(
			"validateEncountersSection2Text",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersSection2 target) {

			}

			@Override
			protected void updateToPass(EncountersSection2 target) {
				target.init();
				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSection2Operations.validateEncountersSection2Text(
					(EncountersSection2) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSection2TextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersSection2Title() {
		OperationsTestCase<EncountersSection2> validateEncountersSection2TitleTestCase = new OperationsTestCase<EncountersSection2>(
			"validateEncountersSection2Title",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersSection2 target) {

			}

			@Override
			protected void updateToPass(EncountersSection2 target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSection2Operations.validateEncountersSection2Title(
					(EncountersSection2) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSection2TitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersSectionEntriesOptionalTemplateId() {
		OperationsTestCase<EncountersSection2> validateEncountersSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<EncountersSection2>(
			"validateEncountersSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersSection2 target) {

			}

			@Override
			protected void updateToPass(EncountersSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSection2Operations.validateEncountersSectionEntriesOptionalTemplateId(
					(EncountersSection2) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersSectionEntriesOptionalCodeP() {
		OperationsTestCase<EncountersSection2> validateEncountersSectionEntriesOptionalCodePTestCase = new OperationsTestCase<EncountersSection2>(
			"validateEncountersSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersSection2 target) {

			}

			@Override
			protected void updateToPass(EncountersSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSection2Operations.validateEncountersSectionEntriesOptionalCodeP(
					(EncountersSection2) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersSectionEntriesOptionalCode() {
		OperationsTestCase<EncountersSection2> validateEncountersSectionEntriesOptionalCodeTestCase = new OperationsTestCase<EncountersSection2>(
			"validateEncountersSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersSection2 target) {

			}

			@Override
			protected void updateToPass(EncountersSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(EncountersSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptionalCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSection2Operations.validateEncountersSectionEntriesOptionalCode(
					(EncountersSection2) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncountersSectionEntriesOptionalEncounterActivity2() {
		OperationsTestCase<EncountersSection2> validateEncountersSectionEntriesOptionalEncounterActivity2TestCase = new OperationsTestCase<EncountersSection2>(
			"validateEncountersSectionEntriesOptionalEncounterActivity2",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_ENCOUNTER_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersSection2 target) {
				// target.init defaults to a nullFlavor of NI which allows a pass
			}

			@Override
			protected void updateToPass(EncountersSection2 target) {
				target.addEncounter(ConsolFactory.eINSTANCE.createEncounterActivity2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSection2Operations.validateEncountersSectionEntriesOptionalEncounterActivity2(
					(EncountersSection2) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionEntriesOptionalEncounterActivity2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolEncounterActivity2s() {

		EncountersSection2 target = objectFactory.create();
		target.getConsolEncounterActivity2s();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EncountersSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<EncountersSection2> {
		@Override
		public EncountersSection2 create() {
			return ConsolFactory.eINSTANCE.createEncountersSection2();
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
	private static class ConstructorTestClass extends EncountersSection2Operations {
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

} // EncountersSection2Operations
