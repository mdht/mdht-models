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
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.Material;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CE;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ImmunizationMedicationInformation2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunization Medication Information2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information2 Immunization Medication Information Manufactured Material CE Translation P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information2 Immunization Medication Information Manufactured Material CE Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformationManufacturedMaterial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Manufactured Material</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Lot Number Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ImmunizationMedicationInformation2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationP() {
		OperationsTestCase<ImmunizationMedicationInformation2> validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationPTestCase = new OperationsTestCase<ImmunizationMedicationInformation2>(
			"validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationP",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION2_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CE_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformation2 target) {
				target.init();
				Material m = CDAFactory.eINSTANCE.createMaterial();
				target.setManufacturedMaterial(m);
				CE code = DatatypesFactory.eINSTANCE.createCE();
				target.getManufacturedMaterial().setCode(code);
			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation2 target) {
				target.getManufacturedMaterial().getCode().getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformation2Operations.validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationP(
					(ImmunizationMedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationPTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslation() {
		OperationsTestCase<ImmunizationMedicationInformation2> validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationTestCase = new OperationsTestCase<ImmunizationMedicationInformation2>(
			"validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslation",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION2_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformation2 target) {
				target.init();
				Material m = CDAFactory.eINSTANCE.createMaterial();
				target.setManufacturedMaterial(m);
				target.getManufacturedMaterial().setCode(
					DatatypesFactory.eINSTANCE.createCE("notCheckedYet", "2.16.840.1.113883.12.292"));
				target.getManufacturedMaterial().getCode().getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation2 target) {
				target.getManufacturedMaterial().getCode().getTranslations().clear();
				target.getManufacturedMaterial().getCode().getTranslations().add(
					DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.88", "mustExistOnly", ""));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformation2Operations.validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslation(
					(ImmunizationMedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceValue() {
		OperationsTestCase<ImmunizationMedicationInformation2> validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceValueTestCase = new OperationsTestCase<ImmunizationMedicationInformation2>(
			"validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformation2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation2 target) {

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformation2Operations.validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceValue(
					(ImmunizationMedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeP() {
		OperationsTestCase<ImmunizationMedicationInformation2> validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodePTestCase = new OperationsTestCase<ImmunizationMedicationInformation2>(
			"validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformation2 target) {
				target.init();
				Material m = CDAFactory.eINSTANCE.createMaterial();
				target.setManufacturedMaterial(m);
			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation2 target) {
				target.getManufacturedMaterial().setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformation2Operations.validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeP(
					(ImmunizationMedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationMedicationInformationTemplateId() {
		OperationsTestCase<ImmunizationMedicationInformation2> validateImmunizationMedicationInformationTemplateIdTestCase = new OperationsTestCase<ImmunizationMedicationInformation2>(
			"validateImmunizationMedicationInformationTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformation2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformation2Operations.validateImmunizationMedicationInformationTemplateId(
					(ImmunizationMedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationMedicationInformationManufacturedMaterial() {
		OperationsTestCase<ImmunizationMedicationInformation2> validateImmunizationMedicationInformationManufacturedMaterialTestCase = new OperationsTestCase<ImmunizationMedicationInformation2>(
			"validateImmunizationMedicationInformationManufacturedMaterial",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation2 target) {
				target.setManufacturedMaterial(CDAFactory.eINSTANCE.createMaterial());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformation2Operations.validateImmunizationMedicationInformationManufacturedMaterial(
					(ImmunizationMedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformationManufacturedMaterialTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText() {
		OperationsTestCase<ImmunizationMedicationInformation2> validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalTextTestCase = new OperationsTestCase<ImmunizationMedicationInformation2>(
			"validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformation2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation2 target) {

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformation2Operations.validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(
					(ImmunizationMedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference() {
		OperationsTestCase<ImmunizationMedicationInformation2> validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceTestCase = new OperationsTestCase<ImmunizationMedicationInformation2>(
			"validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformation2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformation2Operations.validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(
					(ImmunizationMedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue() {
		OperationsTestCase<ImmunizationMedicationInformation2> validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValueTestCase = new OperationsTestCase<ImmunizationMedicationInformation2>(
			"validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformation2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation2 target) {

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformation2Operations.validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue(
					(ImmunizationMedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation() {
		OperationsTestCase<ImmunizationMedicationInformation2> validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslationTestCase = new OperationsTestCase<ImmunizationMedicationInformation2>(
			"validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformation2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformation2Operations.validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation(
					(ImmunizationMedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode() {
		OperationsTestCase<ImmunizationMedicationInformation2> validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTestCase = new OperationsTestCase<ImmunizationMedicationInformation2>(
			"validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformation2 target) {
				target.init();
				Material m = CDAFactory.eINSTANCE.createMaterial();
				target.setManufacturedMaterial(m);
			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation2 target) {
				target.getManufacturedMaterial().setCode(
					DatatypesFactory.eINSTANCE.createCE("notCheckedAsDynamicSet", "2.16.840.1.113883.12.292"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformation2Operations.validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode(
					(ImmunizationMedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText() {
		OperationsTestCase<ImmunizationMedicationInformation2> validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberTextTestCase = new OperationsTestCase<ImmunizationMedicationInformation2>(
			"validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformation2 target) {
				target.init();
				Material m = CDAFactory.eINSTANCE.createMaterial();
				target.setManufacturedMaterial(m);
			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation2 target) {
				target.getManufacturedMaterial().setLotNumberText(DatatypesFactory.eINSTANCE.createST());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformation2Operations.validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText(
					(ImmunizationMedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ImmunizationMedicationInformation2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ImmunizationMedicationInformation2> {
		@Override
		public ImmunizationMedicationInformation2 create() {
			return ConsolFactory.eINSTANCE.createImmunizationMedicationInformation2();
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
	private static class ConstructorTestClass extends ImmunizationMedicationInformation2Operations {
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

} // ImmunizationMedicationInformation2Operations
