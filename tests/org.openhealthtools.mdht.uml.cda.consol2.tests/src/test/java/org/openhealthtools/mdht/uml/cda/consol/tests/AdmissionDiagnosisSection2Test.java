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
import org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AdmissionDiagnosisSection2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Admission Diagnosis Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2#validateAdmissionDiagnosisSection2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Diagnosis Section2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2#validateAdmissionDiagnosisSection2CETranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Diagnosis Section2 CE Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2#validateAdmissionDiagnosisSection2CETranslationP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Diagnosis Section2 CE Translation P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2#getConsolHospitalAdmissionDiagnosis2() <em>Get Consol Hospital Admission Diagnosis2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2#validateHospitalAdmissionDiagnosisSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2#validateHospitalAdmissionDiagnosisSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2#validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Hospital Admission Diagnosis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdmissionDiagnosisSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdmissionDiagnosisSection2TemplateId() {
		OperationsTestCase<AdmissionDiagnosisSection2> validateAdmissionDiagnosisSection2TemplateIdTestCase = new OperationsTestCase<AdmissionDiagnosisSection2>(
			"validateAdmissionDiagnosisSection2TemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_ADMISSION_DIAGNOSIS_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionDiagnosisSection2 target) {

			}

			@Override
			protected void updateToPass(AdmissionDiagnosisSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionDiagnosisSection2Operations.validateAdmissionDiagnosisSection2TemplateId(
					(AdmissionDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdmissionDiagnosisSection2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdmissionDiagnosisSection2CETranslation() {
		OperationsTestCase<AdmissionDiagnosisSection2> validateAdmissionDiagnosisSection2CETranslationTestCase = new OperationsTestCase<AdmissionDiagnosisSection2>(
			"validateAdmissionDiagnosisSection2CETranslation",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADMISSION_DIAGNOSIS_SECTION2_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionDiagnosisSection2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
				target.getCode().setCode("46241-6");
				target.getCode().setCodeSystem(LOINC_ID);
				target.getCode().getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(AdmissionDiagnosisSection2 target) {
				for (CD translation : target.getCode().getTranslations()) {
					translation.setCodeSystem(LOINC_ID);
					translation.setCode("42347-5");
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionDiagnosisSection2Operations.validateAdmissionDiagnosisSection2CETranslation(
					(AdmissionDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdmissionDiagnosisSection2CETranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdmissionDiagnosisSection2CETranslationP() {
		OperationsTestCase<AdmissionDiagnosisSection2> validateAdmissionDiagnosisSection2CETranslationPTestCase = new OperationsTestCase<AdmissionDiagnosisSection2>(
			"validateAdmissionDiagnosisSection2CETranslationP",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADMISSION_DIAGNOSIS_SECTION2_CE_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionDiagnosisSection2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
				target.getCode().setCode("46241-6");
				target.getCode().setCodeSystem(LOINC_ID);
			}

			@Override
			protected void updateToPass(AdmissionDiagnosisSection2 target) {
				target.getCode().getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionDiagnosisSection2Operations.validateAdmissionDiagnosisSection2CETranslationP(
					(AdmissionDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateAdmissionDiagnosisSection2CETranslationPTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolHospitalAdmissionDiagnosis2() {

		AdmissionDiagnosisSection2 target = objectFactory.create();
		target.getConsolHospitalAdmissionDiagnosis2();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisSectionCodeP() {
		OperationsTestCase<AdmissionDiagnosisSection2> validateHospitalAdmissionDiagnosisSectionCodePTestCase = new OperationsTestCase<AdmissionDiagnosisSection2>(
			"validateHospitalAdmissionDiagnosisSectionCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionDiagnosisSection2 target) {

			}

			@Override
			protected void updateToPass(AdmissionDiagnosisSection2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionDiagnosisSection2Operations.validateHospitalAdmissionDiagnosisSectionCodeP(
					(AdmissionDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisSectionCode() {
		OperationsTestCase<AdmissionDiagnosisSection2> validateHospitalAdmissionDiagnosisSectionCodeTestCase = new OperationsTestCase<AdmissionDiagnosisSection2>(
			"validateHospitalAdmissionDiagnosisSectionCode", operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionDiagnosisSection2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected void updateToPass(AdmissionDiagnosisSection2 target) {
				target.getCode().setCode("46241-6");
				target.getCode().setCodeSystem(LOINC_ID);
			}

			@Override
			protected void setDependency(AdmissionDiagnosisSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionDiagnosisSection2Operations.validateHospitalAdmissionDiagnosisSectionCode(
					(AdmissionDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis() {
		OperationsTestCase<AdmissionDiagnosisSection2> validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosisTestCase = new OperationsTestCase<AdmissionDiagnosisSection2>(
			"validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionDiagnosisSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(AdmissionDiagnosisSection2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosis2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionDiagnosisSection2Operations.validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(
					(AdmissionDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosisTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdmissionDiagnosisSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<AdmissionDiagnosisSection2> {
		@Override
		public AdmissionDiagnosisSection2 create() {
			return ConsolFactory.eINSTANCE.createAdmissionDiagnosisSection2();
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
	private static class ConstructorTestClass extends AdmissionDiagnosisSection2Operations {
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

} // AdmissionDiagnosisSection2Operations
