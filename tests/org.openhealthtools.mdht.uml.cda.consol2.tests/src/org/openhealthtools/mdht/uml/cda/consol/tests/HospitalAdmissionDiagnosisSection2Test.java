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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalAdmissionDiagnosisSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Admission Diagnosis Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection2#validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Hospital Admission Diagnosis2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection2#getConsolHospitalAdmissionDiagnosis2() <em>Get Consol Hospital Admission Diagnosis2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection2#validateHospitalAdmissionDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection2#validateHospitalAdmissionDiagnosisSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection2#validateHospitalAdmissionDiagnosisSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalAdmissionDiagnosisSection2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis2() {
		OperationsTestCase<HospitalAdmissionDiagnosisSection2> validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis2TestCase = new OperationsTestCase<HospitalAdmissionDiagnosisSection2>(
			"validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis2",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosisSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosisSection2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosis2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosisSection2Operations.validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis2(
					(HospitalAdmissionDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolHospitalAdmissionDiagnosis2() {

		HospitalAdmissionDiagnosisSection2 target = objectFactory.create();
		target.getConsolHospitalAdmissionDiagnosis2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisSectionTemplateId() {
		OperationsTestCase<HospitalAdmissionDiagnosisSection2> validateHospitalAdmissionDiagnosisSectionTemplateIdTestCase = new OperationsTestCase<HospitalAdmissionDiagnosisSection2>(
			"validateHospitalAdmissionDiagnosisSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosisSection2 target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosisSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosisSection2Operations.validateHospitalAdmissionDiagnosisSectionTemplateId(
					(HospitalAdmissionDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisSectionCodeP() {
		OperationsTestCase<HospitalAdmissionDiagnosisSection2> validateHospitalAdmissionDiagnosisSectionCodePTestCase = new OperationsTestCase<HospitalAdmissionDiagnosisSection2>(
			"validateHospitalAdmissionDiagnosisSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosisSection2 target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosisSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosisSection2Operations.validateHospitalAdmissionDiagnosisSectionCodeP(
					(HospitalAdmissionDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisSectionCode() {
		OperationsTestCase<HospitalAdmissionDiagnosisSection2> validateHospitalAdmissionDiagnosisSectionCodeTestCase = new OperationsTestCase<HospitalAdmissionDiagnosisSection2>(
			"validateHospitalAdmissionDiagnosisSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosisSection2 target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosisSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(HospitalAdmissionDiagnosisSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosisSection2Operations.validateHospitalAdmissionDiagnosisSectionCode(
					(HospitalAdmissionDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HospitalAdmissionDiagnosisSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalAdmissionDiagnosisSection2> {
		public HospitalAdmissionDiagnosisSection2 create() {
			return ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection2();
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
	private static class ConstructorTestClass extends HospitalAdmissionDiagnosisSection2Operations {
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

} // HospitalAdmissionDiagnosisSection2Operations
