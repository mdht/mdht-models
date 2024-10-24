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
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalDischargeDiagnosis2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Diagnosis2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis2#validateHospitalDischargeDiagnosis2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis2#validateHospitalDischargeDiagnosisCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis2#getConsolProblemObservation2s() <em>Get Consol Problem Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis2#validateHospitalDischargeDiagnosisCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis2#validateHospitalDischargeDiagnosisProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Problem Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalDischargeDiagnosis2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHospitalDischargeDiagnosis2TemplateId() {
		OperationsTestCase<HospitalDischargeDiagnosis2> validateHospitalDischargeDiagnosis2TemplateIdTestCase = new OperationsTestCase<HospitalDischargeDiagnosis2>(
			"validateHospitalDischargeDiagnosis2TemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosis2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosis2Operations.validateHospitalDischargeDiagnosis2TemplateId(
					(HospitalDischargeDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosis2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisCodeP() {
		OperationsTestCase<HospitalDischargeDiagnosis2> validateHospitalDischargeDiagnosisCodePTestCase = new OperationsTestCase<HospitalDischargeDiagnosis2>(
			"validateHospitalDischargeDiagnosisCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosis2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosis2Operations.validateHospitalDischargeDiagnosisCodeP(
					(HospitalDischargeDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolProblemObservation2s() {

		HospitalDischargeDiagnosis2 target = objectFactory.create();
		target.getConsolProblemObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisCode() {
		OperationsTestCase<HospitalDischargeDiagnosis2> validateHospitalDischargeDiagnosisCodeTestCase = new OperationsTestCase<HospitalDischargeDiagnosis2>(
			"validateHospitalDischargeDiagnosisCode",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosis2 target) {
				target.init();

			}

			@Override
			protected void setDependency(HospitalDischargeDiagnosis2 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosis2Operations.validateHospitalDischargeDiagnosisCode(
					(HospitalDischargeDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisProblemObservation() {
		OperationsTestCase<HospitalDischargeDiagnosis2> validateHospitalDischargeDiagnosisProblemObservationTestCase = new OperationsTestCase<HospitalDischargeDiagnosis2>(
			"validateHospitalDischargeDiagnosisProblemObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosis2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(ConsolFactory.eINSTANCE.createProblemObservation2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosis2Operations.validateHospitalDischargeDiagnosisProblemObservation(
					(HospitalDischargeDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisProblemObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HospitalDischargeDiagnosis2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalDischargeDiagnosis2> {
		@Override
		public HospitalDischargeDiagnosis2 create() {
			return ConsolFactory.eINSTANCE.createHospitalDischargeDiagnosis2();
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
	private static class ConstructorTestClass extends HospitalDischargeDiagnosis2Operations {
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

} // HospitalDischargeDiagnosis2Operations
