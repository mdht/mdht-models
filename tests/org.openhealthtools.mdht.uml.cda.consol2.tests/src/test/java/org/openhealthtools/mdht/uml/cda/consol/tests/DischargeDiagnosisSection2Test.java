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
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.DischargeDiagnosisSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.DischargeDiagnosisSection2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Diagnosis Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeDiagnosisSection2#validateDischargeDiagnosisSection2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Diagnosis Section2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeDiagnosisSection2#validateDischargeDiagnosisSection2CETranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Diagnosis Section2 CE Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeDiagnosisSection2#validateDischargeDiagnosisSection2CETranslationP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Diagnosis Section2 CE Translation P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeDiagnosisSection2#getConsolHospitalDischargeDiagnosis2() <em>Get Consol Hospital Discharge Diagnosis2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeDiagnosisSection2#validateHospitalDischargeDiagnosisSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeDiagnosisSection2#validateHospitalDischargeDiagnosisSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeDiagnosisSection2#validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Hospital Discharge Diagnosis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DischargeDiagnosisSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDischargeDiagnosisSection2TemplateId() {
		OperationsTestCase<DischargeDiagnosisSection2> validateDischargeDiagnosisSection2TemplateIdTestCase = new OperationsTestCase<DischargeDiagnosisSection2>(
			"validateDischargeDiagnosisSection2TemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_DIAGNOSIS_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeDiagnosisSection2 target) {

			}

			@Override
			protected void updateToPass(DischargeDiagnosisSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeDiagnosisSection2Operations.validateDischargeDiagnosisSection2TemplateId(
					(DischargeDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeDiagnosisSection2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeDiagnosisSection2CETranslation() {
		OperationsTestCase<DischargeDiagnosisSection2> validateDischargeDiagnosisSection2CETranslationTestCase = new OperationsTestCase<DischargeDiagnosisSection2>(
			"validateDischargeDiagnosisSection2CETranslation",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_DIAGNOSIS_SECTION2_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeDiagnosisSection2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
				target.getCode().setCode("11535-2");
				target.getCode().setCodeSystem(LOINC_ID);
				target.getCode().getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(DischargeDiagnosisSection2 target) {
				for (CD t : target.getCode().getTranslations()) {
					t.setCode("78375-3");
					t.setCodeSystem(LOINC_ID);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeDiagnosisSection2Operations.validateDischargeDiagnosisSection2CETranslation(
					(DischargeDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeDiagnosisSection2CETranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeDiagnosisSection2CETranslationP() {
		OperationsTestCase<DischargeDiagnosisSection2> validateDischargeDiagnosisSection2CETranslationPTestCase = new OperationsTestCase<DischargeDiagnosisSection2>(
			"validateDischargeDiagnosisSection2CETranslationP",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_DIAGNOSIS_SECTION2_CE_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeDiagnosisSection2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
				target.getCode().setCode("11535-2");
				target.getCode().setCodeSystem(LOINC_ID);
			}

			@Override
			protected void updateToPass(DischargeDiagnosisSection2 target) {
				target.getCode().getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeDiagnosisSection2Operations.validateDischargeDiagnosisSection2CETranslationP(
					(DischargeDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeDiagnosisSection2CETranslationPTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolHospitalDischargeDiagnosis2() {

		DischargeDiagnosisSection2 target = objectFactory.create();
		target.getConsolHospitalDischargeDiagnosis2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisSectionCodeP() {
		OperationsTestCase<DischargeDiagnosisSection2> validateHospitalDischargeDiagnosisSectionCodePTestCase = new OperationsTestCase<DischargeDiagnosisSection2>(
			"validateHospitalDischargeDiagnosisSectionCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeDiagnosisSection2 target) {

			}

			@Override
			protected void updateToPass(DischargeDiagnosisSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeDiagnosisSection2Operations.validateHospitalDischargeDiagnosisSectionCodeP(
					(DischargeDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisSectionCode() {
		OperationsTestCase<DischargeDiagnosisSection2> validateHospitalDischargeDiagnosisSectionCodeTestCase = new OperationsTestCase<DischargeDiagnosisSection2>(
			"validateHospitalDischargeDiagnosisSectionCode", operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeDiagnosisSection2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected void updateToPass(DischargeDiagnosisSection2 target) {
				target.getCode().setCode("11535-2");
				target.getCode().setCodeSystem(LOINC_ID);
			}

			@Override
			protected void setDependency(DischargeDiagnosisSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeDiagnosisSection2Operations.validateHospitalDischargeDiagnosisSectionCode(
					(DischargeDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis() {
		OperationsTestCase<DischargeDiagnosisSection2> validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosisTestCase = new OperationsTestCase<DischargeDiagnosisSection2>(
			"validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeDiagnosisSection2 target) {

			}

			@Override
			protected void updateToPass(DischargeDiagnosisSection2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createHospitalDischargeDiagnosis2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeDiagnosisSection2Operations.validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(
					(DischargeDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosisTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DischargeDiagnosisSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<DischargeDiagnosisSection2> {
		@Override
		public DischargeDiagnosisSection2 create() {
			return ConsolFactory.eINSTANCE.createDischargeDiagnosisSection2();
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
	private static class ConstructorTestClass extends DischargeDiagnosisSection2Operations {
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

} // DischargeDiagnosisSection2Operations
