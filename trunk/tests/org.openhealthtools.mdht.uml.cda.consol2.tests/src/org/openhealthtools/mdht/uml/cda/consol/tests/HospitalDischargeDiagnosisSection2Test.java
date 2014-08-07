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
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalDischargeDiagnosisSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Diagnosis Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection2#validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Hospital Discharge Diagnosis2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection2#getConsolHospitalDischargeDiagnosis2() <em>Get Consol Hospital Discharge Diagnosis2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection2#validateHospitalDischargeDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection2#validateHospitalDischargeDiagnosisSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection2#validateHospitalDischargeDiagnosisSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalDischargeDiagnosisSection2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis2() {
		OperationsTestCase<HospitalDischargeDiagnosisSection2> validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis2TestCase = new OperationsTestCase<HospitalDischargeDiagnosisSection2>(
			"validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis2",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosisSection2 target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosisSection2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createHospitalDischargeDiagnosis2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosisSection2Operations.validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis2(
					(HospitalDischargeDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolHospitalDischargeDiagnosis2() {

		HospitalDischargeDiagnosisSection2 target = objectFactory.create();
		target.getConsolHospitalDischargeDiagnosis2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisSectionTemplateId() {
		OperationsTestCase<HospitalDischargeDiagnosisSection2> validateHospitalDischargeDiagnosisSectionTemplateIdTestCase = new OperationsTestCase<HospitalDischargeDiagnosisSection2>(
			"validateHospitalDischargeDiagnosisSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosisSection2 target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosisSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosisSection2Operations.validateHospitalDischargeDiagnosisSectionTemplateId(
					(HospitalDischargeDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisSectionCodeP() {
		OperationsTestCase<HospitalDischargeDiagnosisSection2> validateHospitalDischargeDiagnosisSectionCodePTestCase = new OperationsTestCase<HospitalDischargeDiagnosisSection2>(
			"validateHospitalDischargeDiagnosisSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosisSection2 target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosisSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosisSection2Operations.validateHospitalDischargeDiagnosisSectionCodeP(
					(HospitalDischargeDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisSectionCode() {
		OperationsTestCase<HospitalDischargeDiagnosisSection2> validateHospitalDischargeDiagnosisSectionCodeTestCase = new OperationsTestCase<HospitalDischargeDiagnosisSection2>(
			"validateHospitalDischargeDiagnosisSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosisSection2 target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosisSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(HospitalDischargeDiagnosisSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosisSection2Operations.validateHospitalDischargeDiagnosisSectionCode(
					(HospitalDischargeDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HospitalDischargeDiagnosisSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalDischargeDiagnosisSection2> {
		@Override
		public HospitalDischargeDiagnosisSection2 create() {
			return ConsolFactory.eINSTANCE.createHospitalDischargeDiagnosisSection2();
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
	private static class ConstructorTestClass extends HospitalDischargeDiagnosisSection2Operations {
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

} // HospitalDischargeDiagnosisSection2Operations
