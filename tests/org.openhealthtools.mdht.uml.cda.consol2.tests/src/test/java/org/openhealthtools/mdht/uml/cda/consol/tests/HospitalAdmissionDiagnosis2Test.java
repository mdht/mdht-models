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
import org.eclipse.mdht.uml.cda.EntryRelationship;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.junit.Test;
import org.eclipse.mdht.uml.hl7.vocab.*;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalAdmissionDiagnosis2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Admission Diagnosis2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2#validateHospitalAdmissionDiagnosis2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2#validateHospitalAdmissionDiagnosisCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2#getConsolProblemObservation2s() <em>Get Consol Problem Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2#validateHospitalAdmissionDiagnosisCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2#validateHospitalAdmissionDiagnosisProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Problem Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalAdmissionDiagnosis2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHospitalAdmissionDiagnosis2TemplateId() {
		OperationsTestCase<HospitalAdmissionDiagnosis2> validateHospitalAdmissionDiagnosis2TemplateIdTestCase = new OperationsTestCase<HospitalAdmissionDiagnosis2>(
			"validateHospitalAdmissionDiagnosis2TemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosis2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosis2Operations.validateHospitalAdmissionDiagnosis2TemplateId(
					(HospitalAdmissionDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosis2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisCodeP() {
		OperationsTestCase<HospitalAdmissionDiagnosis2> validateHospitalAdmissionDiagnosisCodePTestCase = new OperationsTestCase<HospitalAdmissionDiagnosis2>(
			"validateHospitalAdmissionDiagnosisCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosis2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosis2Operations.validateHospitalAdmissionDiagnosisCodeP(
					(HospitalAdmissionDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolProblemObservation2s() {

		HospitalAdmissionDiagnosis2 target = objectFactory.create();
		target.getConsolProblemObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisCode() {
		OperationsTestCase<HospitalAdmissionDiagnosis2> validateHospitalAdmissionDiagnosisCodeTestCase = new OperationsTestCase<HospitalAdmissionDiagnosis2>(
			"validateHospitalAdmissionDiagnosisCode",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosis2 target) {
				target.init();

			}

			@Override
			protected void setDependency(HospitalAdmissionDiagnosis2 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosis2Operations.validateHospitalAdmissionDiagnosisCode(
					(HospitalAdmissionDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisProblemObservation() {
		OperationsTestCase<HospitalAdmissionDiagnosis2> validateHospitalAdmissionDiagnosisProblemObservationTestCase = new OperationsTestCase<HospitalAdmissionDiagnosis2>(
			"validateHospitalAdmissionDiagnosisProblemObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosis2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(ConsolFactory.eINSTANCE.createProblemObservation2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosis2Operations.validateHospitalAdmissionDiagnosisProblemObservation(
					(HospitalAdmissionDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisProblemObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HospitalAdmissionDiagnosis2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalAdmissionDiagnosis2> {
		@Override
		public HospitalAdmissionDiagnosis2 create() {
			return ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosis2();
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
	private static class ConstructorTestClass extends HospitalAdmissionDiagnosis2Operations {
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

} // HospitalAdmissionDiagnosis2Operations
