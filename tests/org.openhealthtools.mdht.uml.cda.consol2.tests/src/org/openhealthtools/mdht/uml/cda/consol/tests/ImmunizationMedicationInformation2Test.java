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
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Material;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ImmunizationMedicationInformation2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunization Medication Information2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information2 Immunization Medication Information Manufactured Material CE Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information2 Immunization Medication Information Manufactured Material Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information2 Immunization Medication Information Manufactured Material Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information2 Immunization Medication Information Manufactured Material Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information2 Immunization Medication Information Manufactured Material Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCodeTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information2 Immunization Medication Information Manufactured Material Code Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformation2ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information2 Immunization Medication Information Immunization Medication Information Manufactured Material Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2#validateImmunizationMedicationInformationManufacturedMaterial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Manufactured Material</em>}</li>
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
	public void testValidateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslation() {
		OperationsTestCase<ImmunizationMedicationInformation2> validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslationTestCase = new OperationsTestCase<ImmunizationMedicationInformation2>(
			"validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCETranslation",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION2_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
	public void testValidateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCodeOriginalText() {
		OperationsTestCase<ImmunizationMedicationInformation2> validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCodeOriginalTextTestCase = new OperationsTestCase<ImmunizationMedicationInformation2>(
			"validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCodeOriginalText",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION2_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformation2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation2 target) {

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformation2Operations.validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(
					(ImmunizationMedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCodeOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialOriginalTextReference() {
		OperationsTestCase<ImmunizationMedicationInformation2> validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceTestCase = new OperationsTestCase<ImmunizationMedicationInformation2>(
			"validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialOriginalTextReference",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION2_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformation2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation2 target) {

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformation2Operations.validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(
					(ImmunizationMedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialTextReferenceValue() {
		OperationsTestCase<ImmunizationMedicationInformation2> validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialTextReferenceValueTestCase = new OperationsTestCase<ImmunizationMedicationInformation2>(
			"validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION2_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformation2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation2 target) {
				target.init();

				DatatypesFactory.eINSTANCE.createCD();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformation2Operations.validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialTextReferenceValue(
					(ImmunizationMedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceValue() {
		OperationsTestCase<ImmunizationMedicationInformation2> validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceValueTestCase = new OperationsTestCase<ImmunizationMedicationInformation2>(
			"validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION2_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformation2 target) {

			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation2 target) {
				target.init();

				DatatypesFactory.eINSTANCE.createCD();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformation2Operations.validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceValue(
					(ImmunizationMedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCodeTranslation() {
		OperationsTestCase<ImmunizationMedicationInformation2> validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCodeTranslationTestCase = new OperationsTestCase<ImmunizationMedicationInformation2>(
			"validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCodeTranslation",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION2_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ImmunizationMedicationInformation2Operations.validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCodeTranslation(
					(ImmunizationMedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformation2ImmunizationMedicationInformationManufacturedMaterialCodeTranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationMedicationInformation2ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode() {
		OperationsTestCase<ImmunizationMedicationInformation2> validateImmunizationMedicationInformation2ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTestCase = new OperationsTestCase<ImmunizationMedicationInformation2>(
			"validateImmunizationMedicationInformation2ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION2_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
					DatatypesFactory.eINSTANCE.createCE("notCheckedYet", "2.16.840.1.113883.12.292"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformation2Operations.validateImmunizationMedicationInformation2ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode(
					(ImmunizationMedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformation2ImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationMedicationInformationTemplateId() {
		OperationsTestCase<ImmunizationMedicationInformation2> validateImmunizationMedicationInformationTemplateIdTestCase = new OperationsTestCase<ImmunizationMedicationInformation2>(
			"validateImmunizationMedicationInformationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
