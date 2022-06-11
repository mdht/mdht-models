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
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationInformation2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Information2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2#validateMedicationInformation2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2#validateMedicationInformation2MedicationInformationManufacturedMaterialCETranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information2 Medication Information Manufactured Material CE Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2#validateMedicationInformationMedicationInformationManufacturedMaterialReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2#validateMedicationInformationMedicationInformationManufacturedMaterialCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2#validateMedicationInformationManufacturedMaterial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Manufactured Material</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2#validateMedicationInformationMedicationInformationManufacturedMaterialCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2#validateMedicationInformationMedicationInformationManufacturedMaterialCodeTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Code Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2#validateMedicationInformationMedicationInformationManufacturedMaterialReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2#validateMedicationInformationMedicationInformationManufacturedMaterialOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2#validateMedicationInformationMedicationInformationManufacturedMaterialCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationInformation2Test extends CDAValidationTest {

	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidateMedicationInformation2ManufacturedMaterial() {
	// OperationsTestCase<MedicationInformation2> validateMedicationInformation2ManufacturedMaterialTestCase = new
	// OperationsTestCase<MedicationInformation2>(
	// "validateMedicationInformation2ManufacturedMaterial",
	// operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION2_MANUFACTURED_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(MedicationInformation2 target) {
	// target.init();
	// }
	//
	// @Override
	// protected void updateToPass(MedicationInformation2 target) {
	// Material m = CDAFactory.eINSTANCE.createMaterial();
	// target.setManufacturedMaterial(m);
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return MedicationInformation2Operations.validateMedicationInformation2ManufacturedMaterial(
	// (MedicationInformation2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateMedicationInformation2ManufacturedMaterialTestCase.doValidationTest();
	// }

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMedicationInformation2TemplateId() {
		OperationsTestCase<MedicationInformation2> validateMedicationInformation2TemplateIdTestCase = new OperationsTestCase<MedicationInformation2>(
			"validateMedicationInformation2TemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_INFORMATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation2 target) {

			}

			@Override
			protected void updateToPass(MedicationInformation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformation2Operations.validateMedicationInformation2TemplateId(
					(MedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformation2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationInformation2MedicationInformationManufacturedMaterialCETranslation() {
		OperationsTestCase<MedicationInformation2> validateMedicationInformation2MedicationInformationManufacturedMaterialCETranslationTestCase = new OperationsTestCase<MedicationInformation2>(
			"validateMedicationInformation2MedicationInformationManufacturedMaterialCETranslation",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_INFORMATION2_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation2 target) {
				target.init();
				Material m = CDAFactory.eINSTANCE.createMaterial();
				m.setCode(DatatypesFactory.eINSTANCE.createCE());
				target.setManufacturedMaterial(m);
			}

			@Override
			protected void updateToPass(MedicationInformation2 target) {
				target.getManufacturedMaterial().getCode().getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformation2Operations.validateMedicationInformation2MedicationInformationManufacturedMaterialCETranslation(
					(MedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformation2MedicationInformationManufacturedMaterialCETranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateMedicationInformationMedicationInformationManufacturedMaterialReferenceValue() {
		OperationsTestCase<MedicationInformation2> validateMedicationInformationMedicationInformationManufacturedMaterialReferenceValueTestCase = new OperationsTestCase<MedicationInformation2>(
			"validateMedicationInformationMedicationInformationManufacturedMaterialReferenceValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation2 target) {

			}

			@Override
			protected void updateToPass(MedicationInformation2 target) {

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformation2Operations.validateMedicationInformationMedicationInformationManufacturedMaterialReferenceValue(
					(MedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationMedicationInformationManufacturedMaterialReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationInformationMedicationInformationManufacturedMaterialCodeP() {
		OperationsTestCase<MedicationInformation2> validateMedicationInformationMedicationInformationManufacturedMaterialCodePTestCase = new OperationsTestCase<MedicationInformation2>(
			"validateMedicationInformationMedicationInformationManufacturedMaterialCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation2 target) {
				target.init();
				Material m = CDAFactory.eINSTANCE.createMaterial();
				target.setManufacturedMaterial(m);
			}

			@Override
			protected void updateToPass(MedicationInformation2 target) {
				target.getManufacturedMaterial().setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformation2Operations.validateMedicationInformationMedicationInformationManufacturedMaterialCodeP(
					(MedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationMedicationInformationManufacturedMaterialCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationInformationManufacturedMaterial() {
		OperationsTestCase<MedicationInformation2> validateMedicationInformationManufacturedMaterialTestCase = new OperationsTestCase<MedicationInformation2>(
			"validateMedicationInformationManufacturedMaterial",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationInformation2 target) {
				Material m = CDAFactory.eINSTANCE.createMaterial();
				target.setManufacturedMaterial(m);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformation2Operations.validateMedicationInformationManufacturedMaterial(
					(MedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationManufacturedMaterialTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateMedicationInformationMedicationInformationManufacturedMaterialCodeOriginalText() {
		OperationsTestCase<MedicationInformation2> validateMedicationInformationMedicationInformationManufacturedMaterialCodeOriginalTextTestCase = new OperationsTestCase<MedicationInformation2>(
			"validateMedicationInformationMedicationInformationManufacturedMaterialCodeOriginalText",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation2 target) {

			}

			@Override
			protected void updateToPass(MedicationInformation2 target) {

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformation2Operations.validateMedicationInformationMedicationInformationManufacturedMaterialCodeOriginalText(
					(MedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationMedicationInformationManufacturedMaterialCodeOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateMedicationInformationMedicationInformationManufacturedMaterialCodeTranslation() {
		OperationsTestCase<MedicationInformation2> validateMedicationInformationMedicationInformationManufacturedMaterialCodeTranslationTestCase = new OperationsTestCase<MedicationInformation2>(
			"validateMedicationInformationMedicationInformationManufacturedMaterialCodeTranslation",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation2 target) {

			}

			@Override
			protected void updateToPass(MedicationInformation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformation2Operations.validateMedicationInformationMedicationInformationManufacturedMaterialCodeTranslation(
					(MedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationMedicationInformationManufacturedMaterialCodeTranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateMedicationInformationMedicationInformationManufacturedMaterialReference() {
		OperationsTestCase<MedicationInformation2> validateMedicationInformationMedicationInformationManufacturedMaterialReferenceTestCase = new OperationsTestCase<MedicationInformation2>(
			"validateMedicationInformationMedicationInformationManufacturedMaterialReference",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation2 target) {

			}

			@Override
			protected void updateToPass(MedicationInformation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformation2Operations.validateMedicationInformationMedicationInformationManufacturedMaterialReference(
					(MedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationMedicationInformationManufacturedMaterialReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateMedicationInformationMedicationInformationManufacturedMaterialOriginalTextReferenceValue() {
		OperationsTestCase<MedicationInformation2> validateMedicationInformationMedicationInformationManufacturedMaterialOriginalTextReferenceValueTestCase = new OperationsTestCase<MedicationInformation2>(
			"validateMedicationInformationMedicationInformationManufacturedMaterialOriginalTextReferenceValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation2 target) {

			}

			@Override
			protected void updateToPass(MedicationInformation2 target) {

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformation2Operations.validateMedicationInformationMedicationInformationManufacturedMaterialOriginalTextReferenceValue(
					(MedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationMedicationInformationManufacturedMaterialOriginalTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationInformationMedicationInformationManufacturedMaterialCode() {
		OperationsTestCase<MedicationInformation2> validateMedicationInformationMedicationInformationManufacturedMaterialCodeTestCase = new OperationsTestCase<MedicationInformation2>(
			"validateMedicationInformationMedicationInformationManufacturedMaterialCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation2 target) {
				target.init();
				Material m = CDAFactory.eINSTANCE.createMaterial();
				target.setManufacturedMaterial(m);
			}

			@Override
			protected void updateToPass(MedicationInformation2 target) {
				target.getManufacturedMaterial().setCode(
					DatatypesFactory.eINSTANCE.createCE("notChecked", "2.16.840.1.113883.6.88"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformation2Operations.validateMedicationInformationMedicationInformationManufacturedMaterialCode(
					(MedicationInformation2) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationMedicationInformationManufacturedMaterialCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationInformation2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationInformation2> {
		@Override
		public MedicationInformation2 create() {
			return ConsolFactory.eINSTANCE.createMedicationInformation2();
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
	private static class ConstructorTestClass extends MedicationInformation2Operations {
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

} // MedicationInformation2Operations
