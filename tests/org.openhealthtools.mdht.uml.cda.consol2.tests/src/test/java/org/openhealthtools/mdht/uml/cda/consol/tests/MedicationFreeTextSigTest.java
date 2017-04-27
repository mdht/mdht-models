/*******************************************************************************
 * Copyright (c) 2015 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *     								 - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.Consumable;
import org.eclipse.mdht.uml.cda.LabeledDrug;
import org.eclipse.mdht.uml.cda.ManufacturedProduct;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ED;
import org.eclipse.mdht.uml.hl7.datatypes.TEL;
import org.eclipse.mdht.uml.hl7.vocab.ActClass;
import org.eclipse.mdht.uml.hl7.vocab.NullFlavor;
import org.junit.Test;
import org.eclipse.mdht.uml.hl7.vocab.*;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationFreeTextSigOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Free Text Sig</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigConsumable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Consumable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigEDTELValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig EDTEL Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigEDReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig ED Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrugNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Consumable Manufactured Product Manufactured Labeled Drug Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrug(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Consumable Manufactured Product Manufactured Labeled Drug</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationFreeTextSig#validateMedicationFreeTextSigConsumableManufacturedProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Free Text Sig Consumable Manufactured Product</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationFreeTextSigTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationFreeTextSigTextReferenceValue() {
		OperationsTestCase<MedicationFreeTextSig> validateMedicationFreeTextSigTextReferenceValueTestCase = new NarrativeReferenceTestCase<MedicationFreeTextSig>(
			"validateMedicationFreeTextSigTextReferenceValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_FREE_TEXT_SIG_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationFreeTextSig target) {
				target.init();

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"Not a particularly severe reaction.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));

			}

			@Override
			protected void updateToPass(MedicationFreeTextSig target) {

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "Not a particularly severe reaction.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationFreeTextSigOperations.validateMedicationFreeTextSigTextReferenceValue(
					(MedicationFreeTextSig) objectToTest, diagnostician, map);
			}

		};

		validateMedicationFreeTextSigTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationFreeTextSigTemplateId() {
		OperationsTestCase<MedicationFreeTextSig> validateMedicationFreeTextSigTemplateIdTestCase = new OperationsTestCase<MedicationFreeTextSig>(
			"validateMedicationFreeTextSigTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_FREE_TEXT_SIG_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationFreeTextSig target) {

			}

			@Override
			protected void updateToPass(MedicationFreeTextSig target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationFreeTextSigOperations.validateMedicationFreeTextSigTemplateId(
					(MedicationFreeTextSig) objectToTest, diagnostician, map);
			}

		};

		validateMedicationFreeTextSigTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationFreeTextSigClassCode() {
		OperationsTestCase<MedicationFreeTextSig> validateMedicationFreeTextSigClassCodeTestCase = new OperationsTestCase<MedicationFreeTextSig>(
			"validateMedicationFreeTextSigClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_FREE_TEXT_SIG_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationFreeTextSig target) {
				target.init();
				target.setClassCode(ActClass.ACCM);
			}

			@Override
			protected void updateToPass(MedicationFreeTextSig target) {
				target.setClassCode(ActClass.SBADM);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationFreeTextSigOperations.validateMedicationFreeTextSigClassCode(
					(MedicationFreeTextSig) objectToTest, diagnostician, map);
			}

		};

		validateMedicationFreeTextSigClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationFreeTextSigMoodCode() {
		OperationsTestCase<MedicationFreeTextSig> validateMedicationFreeTextSigMoodCodeTestCase = new OperationsTestCase<MedicationFreeTextSig>(
			"validateMedicationFreeTextSigMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_FREE_TEXT_SIG_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationFreeTextSig target) {
				target.init();
				target.setMoodCode(x_DocumentSubstanceMood.RQO);
			}

			@Override
			protected void updateToPass(MedicationFreeTextSig target) {
				target.setMoodCode(x_DocumentSubstanceMood.EVN);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationFreeTextSigOperations.validateMedicationFreeTextSigMoodCode(
					(MedicationFreeTextSig) objectToTest, diagnostician, map);
			}

		};

		validateMedicationFreeTextSigMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationFreeTextSigCode() {
		OperationsTestCase<MedicationFreeTextSig> validateMedicationFreeTextSigCodeTestCase = new OperationsTestCase<MedicationFreeTextSig>(
			"validateMedicationFreeTextSigCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_FREE_TEXT_SIG_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationFreeTextSig target) {

			}

			@Override
			protected void updateToPass(MedicationFreeTextSig target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationFreeTextSigOperations.validateMedicationFreeTextSigCode(
					(MedicationFreeTextSig) objectToTest, diagnostician, map);
			}

		};

		validateMedicationFreeTextSigCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationFreeTextSigCodeP() {
		OperationsTestCase<MedicationFreeTextSig> validateMedicationFreeTextSigCodePTestCase = new OperationsTestCase<MedicationFreeTextSig>(
			"validateMedicationFreeTextSigCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_FREE_TEXT_SIG_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationFreeTextSig target) {

			}

			@Override
			protected void updateToPass(MedicationFreeTextSig target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationFreeTextSigOperations.validateMedicationFreeTextSigCodeP(
					(MedicationFreeTextSig) objectToTest, diagnostician, map);
			}

		};

		validateMedicationFreeTextSigCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationFreeTextSigText() {
		OperationsTestCase<MedicationFreeTextSig> validateMedicationFreeTextSigTextTestCase = new OperationsTestCase<MedicationFreeTextSig>(
			"validateMedicationFreeTextSigText",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_FREE_TEXT_SIG_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationFreeTextSig target) {

			}

			@Override
			protected void updateToPass(MedicationFreeTextSig target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationFreeTextSigOperations.validateMedicationFreeTextSigText(
					(MedicationFreeTextSig) objectToTest, diagnostician, map);
			}

		};

		validateMedicationFreeTextSigTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationFreeTextSigConsumable() {
		OperationsTestCase<MedicationFreeTextSig> validateMedicationFreeTextSigConsumableTestCase = new OperationsTestCase<MedicationFreeTextSig>(
			"validateMedicationFreeTextSigConsumable", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationFreeTextSig target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationFreeTextSig target) {
				Consumable con = CDAFactory.eINSTANCE.createConsumable();
				target.setConsumable(con);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationFreeTextSigOperations.validateMedicationFreeTextSigConsumable(
					(MedicationFreeTextSig) objectToTest, diagnostician, map);
			}

		};

		validateMedicationFreeTextSigConsumableTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationFreeTextSigEDTELValue() {
		OperationsTestCase<MedicationFreeTextSig> validateMedicationFreeTextSigEDTELValueTestCase = new OperationsTestCase<MedicationFreeTextSig>(
			"validateMedicationFreeTextSigEDTELValue", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_FREE_TEXT_SIG_EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationFreeTextSig target) {
				target.init();
				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);
				TEL reference = DatatypesFactory.eINSTANCE.createTEL();
				target.getText().setReference(reference);
			}

			@Override
			protected void updateToPass(MedicationFreeTextSig target) {
				target.getText().getReference().setValue("hasValue");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationFreeTextSigOperations.validateMedicationFreeTextSigEDTELValue(
					(MedicationFreeTextSig) objectToTest, diagnostician, map);
			}

		};

		validateMedicationFreeTextSigEDTELValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationFreeTextSigEDReference() {
		OperationsTestCase<MedicationFreeTextSig> validateMedicationFreeTextSigEDReferenceTestCase = new OperationsTestCase<MedicationFreeTextSig>(
			"validateMedicationFreeTextSigEDReference", operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_FREE_TEXT_SIG_ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationFreeTextSig target) {
				target.init();
				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);
			}

			@Override
			protected void updateToPass(MedicationFreeTextSig target) {
				TEL reference = DatatypesFactory.eINSTANCE.createTEL();
				target.getText().setReference(reference);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationFreeTextSigOperations.validateMedicationFreeTextSigEDReference(
					(MedicationFreeTextSig) objectToTest, diagnostician, map);
			}

		};

		validateMedicationFreeTextSigEDReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* Note: OCL is modified in operations
	*/
	@Test
	public void testValidateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrugNullFlavor() {
		OperationsTestCase<MedicationFreeTextSig> validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrugNullFlavorTestCase = new OperationsTestCase<MedicationFreeTextSig>(
			"validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrugNullFlavor",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT_MANUFACTURED_LABELED_DRUG_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(MedicationFreeTextSig target) {
						// no nullFlavor at all
						target.init();
						Consumable con = CDAFactory.eINSTANCE.createConsumable();
						target.setConsumable(con);
						ManufacturedProduct mp = CDAFactory.eINSTANCE.createManufacturedProduct();
						con.setManufacturedProduct(mp);
						LabeledDrug mld = CDAFactory.eINSTANCE.createLabeledDrug();
						mp.setManufacturedLabeledDrug(mld);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(MedicationFreeTextSig target) {
						// has nullFlavor but it's the wrong type
						target.init();
						Consumable con = CDAFactory.eINSTANCE.createConsumable();
						target.setConsumable(con);
						ManufacturedProduct mp = CDAFactory.eINSTANCE.createManufacturedProduct();
						con.setManufacturedProduct(mp);
						LabeledDrug mld = CDAFactory.eINSTANCE.createLabeledDrug();
						mp.setManufacturedLabeledDrug(mld);
						mld.setNullFlavor(NullFlavor.ASKU);
					}
				});

			}

			@Override
			protected void updateToPass(MedicationFreeTextSig target) {
				// has nullFlavor and it's the correct type
				target.init();
				Consumable con = CDAFactory.eINSTANCE.createConsumable();
				target.setConsumable(con);
				ManufacturedProduct mp = CDAFactory.eINSTANCE.createManufacturedProduct();
				con.setManufacturedProduct(mp);
				LabeledDrug mld = CDAFactory.eINSTANCE.createLabeledDrug();
				mp.setManufacturedLabeledDrug(mld);
				mld.setNullFlavor(NullFlavor.NA);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationFreeTextSigOperations.validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrugNullFlavor(
					(MedicationFreeTextSig) objectToTest, diagnostician, map);
			}

		};

		validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrugNullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrug() {
		OperationsTestCase<MedicationFreeTextSig> validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrugTestCase = new OperationsTestCase<MedicationFreeTextSig>(
			"validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrug",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT_MANUFACTURED_LABELED_DRUG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationFreeTextSig target) {
				target.init();
				Consumable con = CDAFactory.eINSTANCE.createConsumable();
				target.setConsumable(con);
				ManufacturedProduct mp = CDAFactory.eINSTANCE.createManufacturedProduct();
				con.setManufacturedProduct(mp);
			}

			@Override
			protected void updateToPass(MedicationFreeTextSig target) {
				LabeledDrug mld = CDAFactory.eINSTANCE.createLabeledDrug();
				target.getConsumable().getManufacturedProduct().setManufacturedLabeledDrug(mld);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationFreeTextSigOperations.validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrug(
					(MedicationFreeTextSig) objectToTest, diagnostician, map);
			}

		};

		validateMedicationFreeTextSigConsumableManufacturedProductManufacturedLabeledDrugTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationFreeTextSigConsumableManufacturedProduct() {
		OperationsTestCase<MedicationFreeTextSig> validateMedicationFreeTextSigConsumableManufacturedProductTestCase = new OperationsTestCase<MedicationFreeTextSig>(
			"validateMedicationFreeTextSigConsumableManufacturedProduct",
			operationsForOCL.getOCLValue(
				"VALIDATE_MEDICATION_FREE_TEXT_SIG_CONSUMABLE_MANUFACTURED_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationFreeTextSig target) {
				target.init();
				Consumable con = CDAFactory.eINSTANCE.createConsumable();
				target.setConsumable(con);
			}

			@Override
			protected void updateToPass(MedicationFreeTextSig target) {
				ManufacturedProduct mp = CDAFactory.eINSTANCE.createManufacturedProduct();
				target.getConsumable().setManufacturedProduct(mp);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationFreeTextSigOperations.validateMedicationFreeTextSigConsumableManufacturedProduct(
					(MedicationFreeTextSig) objectToTest, diagnostician, map);
			}

		};

		validateMedicationFreeTextSigConsumableManufacturedProductTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationFreeTextSigOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationFreeTextSig> {
		public MedicationFreeTextSig create() {
			return ConsolFactory.eINSTANCE.createMedicationFreeTextSig();
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
	private static class ConstructorTestClass extends MedicationFreeTextSigOperations {
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

} // MedicationFreeTextSigOperations
