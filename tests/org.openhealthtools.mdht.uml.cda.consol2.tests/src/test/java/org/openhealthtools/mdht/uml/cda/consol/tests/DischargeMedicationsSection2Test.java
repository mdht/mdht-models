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
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ST;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.DischargeMedicationsSection2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Medications Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSection2#validateDischargeMedicationsSection2NullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medications Section2 Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSection2#validateDischargeMedicationsSection2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medications Section2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSection2#validateDischargeMedicationsSection2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medications Section2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSection2#validateDischargeMedicationsSection2Title(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medications Section2 Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSection2#validateDischargeMedicationsSection2Text(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medications Section2 Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSection2#validateDischargeMedicationsSection2CETranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medications Section2 CE Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSection2#validateDischargeMedicationsSection2CETranslationP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medications Section2 CE Translation P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSection2#validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSection2#validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Discharge Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSection2#getConsolDischargeMedication2s() <em>Get Consol Discharge Medication2s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DischargeMedicationsSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeMedicationsSection2NullFlavor() {
		OperationsTestCase<DischargeMedicationsSection2> validateDischargeMedicationsSection2NullFlavorTestCase = new OperationsTestCase<DischargeMedicationsSection2>(
			"validateDischargeMedicationsSection2NullFlavor", operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_MEDICATIONS_SECTION2_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeMedicationsSection2 target) {

			}

			@Override
			protected void updateToPass(DischargeMedicationsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeMedicationsSection2Operations.validateDischargeMedicationsSection2NullFlavor(
					(DischargeMedicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeMedicationsSection2NullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeMedicationsSection2CodeP() {
		OperationsTestCase<DischargeMedicationsSection2> validateDischargeMedicationsSection2CodePTestCase = new OperationsTestCase<DischargeMedicationsSection2>(
			"validateDischargeMedicationsSection2CodeP", operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_MEDICATIONS_SECTION2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeMedicationsSection2 target) {

			}

			@Override
			protected void updateToPass(DischargeMedicationsSection2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeMedicationsSection2Operations.validateDischargeMedicationsSection2CodeP(
					(DischargeMedicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeMedicationsSection2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeMedicationsSection2Code() {
		OperationsTestCase<DischargeMedicationsSection2> validateDischargeMedicationsSection2CodeTestCase = new OperationsTestCase<DischargeMedicationsSection2>(
			"validateDischargeMedicationsSection2Code", operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_MEDICATIONS_SECTION2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeMedicationsSection2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected void updateToPass(DischargeMedicationsSection2 target) {
				target.getCode().setCode("10183-2");
				target.getCode().setCodeSystem(LOINC_ID);
			}

			@Override
			protected void setDependency(DischargeMedicationsSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSection2CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeMedicationsSection2Operations.validateDischargeMedicationsSection2Code(
					(DischargeMedicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeMedicationsSection2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeMedicationsSection2Title() {
		OperationsTestCase<DischargeMedicationsSection2> validateDischargeMedicationsSection2TitleTestCase = new OperationsTestCase<DischargeMedicationsSection2>(
			"validateDischargeMedicationsSection2Title", operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_MEDICATIONS_SECTION2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeMedicationsSection2 target) {

			}

			@Override
			protected void updateToPass(DischargeMedicationsSection2 target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeMedicationsSection2Operations.validateDischargeMedicationsSection2Title(
					(DischargeMedicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeMedicationsSection2TitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeMedicationsSection2Text() {
		OperationsTestCase<DischargeMedicationsSection2> validateDischargeMedicationsSection2TextTestCase = new OperationsTestCase<DischargeMedicationsSection2>(
			"validateDischargeMedicationsSection2Text",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeMedicationsSection2 target) {

			}

			@Override
			protected void updateToPass(DischargeMedicationsSection2 target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeMedicationsSection2Operations.validateDischargeMedicationsSection2Text(
					(DischargeMedicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeMedicationsSection2TextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeMedicationsSection2CETranslation() {
		OperationsTestCase<DischargeMedicationsSection2> validateDischargeMedicationsSection2CETranslationTestCase = new OperationsTestCase<DischargeMedicationsSection2>(
			"validateDischargeMedicationsSection2CETranslation",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_MEDICATIONS_SECTION2_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeMedicationsSection2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
				target.getCode().setCode("10183-2");
				target.getCode().setCodeSystem(LOINC_ID);
				target.getCode().getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(DischargeMedicationsSection2 target) {
				for (CD trans : target.getCode().getTranslations()) {
					trans.setCode("75311-1");
					trans.setCodeSystem(LOINC_ID);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeMedicationsSection2Operations.validateDischargeMedicationsSection2CETranslation(
					(DischargeMedicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeMedicationsSection2CETranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeMedicationsSection2CETranslationP() {
		OperationsTestCase<DischargeMedicationsSection2> validateDischargeMedicationsSection2CETranslationPTestCase = new OperationsTestCase<DischargeMedicationsSection2>(
			"validateDischargeMedicationsSection2CETranslationP",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_MEDICATIONS_SECTION2_CE_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeMedicationsSection2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
				target.getCode().setCode("10183-2");
				target.getCode().setCodeSystem(LOINC_ID);
			}

			@Override
			protected void updateToPass(DischargeMedicationsSection2 target) {
				target.getCode().getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeMedicationsSection2Operations.validateDischargeMedicationsSection2CETranslationP(
					(DischargeMedicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeMedicationsSection2CETranslationPTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<DischargeMedicationsSection2> validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<DischargeMedicationsSection2>(
			"validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeMedicationsSection2 target) {

			}

			@Override
			protected void updateToPass(DischargeMedicationsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeMedicationsSection2Operations.validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId(
					(DischargeMedicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication() {
		OperationsTestCase<DischargeMedicationsSection2> validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedicationTestCase = new OperationsTestCase<DischargeMedicationsSection2>(
			"validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_DISCHARGE_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeMedicationsSection2 target) {
				// target.init defaults to a nullFlavor of NI which allows a pass
			}

			@Override
			protected void updateToPass(DischargeMedicationsSection2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createDischargeMedication2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeMedicationsSection2Operations.validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication(
					(DischargeMedicationsSection2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolDischargeMedication2s() {

		DischargeMedicationsSection2 target = objectFactory.create();
		target.getConsolDischargeMedication2s();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DischargeMedicationsSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<DischargeMedicationsSection2> {
		@Override
		public DischargeMedicationsSection2 create() {
			return ConsolFactory.eINSTANCE.createDischargeMedicationsSection2();
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
	private static class ConstructorTestClass extends DischargeMedicationsSection2Operations {
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

} // DischargeMedicationsSection2Operations
