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
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PreoperativeDiagnosisSection2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Preoperative Diagnosis Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection2#validatePreoperativeDiagnosisSection2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Section2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection2#getConsolPreoperativeDiagnosis2() <em>Get Consol Preoperative Diagnosis2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection2#validatePreoperativeDiagnosisSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection2#validatePreoperativeDiagnosisSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection2#validatePreoperativeDiagnosisSectionPreoperativeDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Section Preoperative Diagnosis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PreoperativeDiagnosisSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePreoperativeDiagnosisSection2TemplateId() {
		OperationsTestCase<PreoperativeDiagnosisSection2> validatePreoperativeDiagnosisSection2TemplateIdTestCase = new OperationsTestCase<PreoperativeDiagnosisSection2>(
			"validatePreoperativeDiagnosisSection2TemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PREOPERATIVE_DIAGNOSIS_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreoperativeDiagnosisSection2 target) {

			}

			@Override
			protected void updateToPass(PreoperativeDiagnosisSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreoperativeDiagnosisSection2Operations.validatePreoperativeDiagnosisSection2TemplateId(
					(PreoperativeDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validatePreoperativeDiagnosisSection2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolPreoperativeDiagnosis2() {

		PreoperativeDiagnosisSection2 target = objectFactory.create();
		target.getConsolPreoperativeDiagnosis2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePreoperativeDiagnosisSectionCodeP() {
		OperationsTestCase<PreoperativeDiagnosisSection2> validatePreoperativeDiagnosisSectionCodePTestCase = new OperationsTestCase<PreoperativeDiagnosisSection2>(
			"validatePreoperativeDiagnosisSectionCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_PREOPERATIVE_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreoperativeDiagnosisSection2 target) {

			}

			@Override
			protected void updateToPass(PreoperativeDiagnosisSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreoperativeDiagnosisSection2Operations.validatePreoperativeDiagnosisSectionCodeP(
					(PreoperativeDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validatePreoperativeDiagnosisSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePreoperativeDiagnosisSectionCode() {
		OperationsTestCase<PreoperativeDiagnosisSection2> validatePreoperativeDiagnosisSectionCodeTestCase = new OperationsTestCase<PreoperativeDiagnosisSection2>(
			"validatePreoperativeDiagnosisSectionCode", operationsForOCL.getOCLValue(
				"VALIDATE_PREOPERATIVE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreoperativeDiagnosisSection2 target) {

			}

			@Override
			protected void updateToPass(PreoperativeDiagnosisSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(PreoperativeDiagnosisSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreoperativeDiagnosisSection2Operations.validatePreoperativeDiagnosisSectionCode(
					(PreoperativeDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validatePreoperativeDiagnosisSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePreoperativeDiagnosisSectionPreoperativeDiagnosis() {
		OperationsTestCase<PreoperativeDiagnosisSection2> validatePreoperativeDiagnosisSectionPreoperativeDiagnosisTestCase = new OperationsTestCase<PreoperativeDiagnosisSection2>(
			"validatePreoperativeDiagnosisSectionPreoperativeDiagnosis",
			operationsForOCL.getOCLValue(
				"VALIDATE_PREOPERATIVE_DIAGNOSIS_SECTION_PREOPERATIVE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreoperativeDiagnosisSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PreoperativeDiagnosisSection2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createPreoperativeDiagnosis2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreoperativeDiagnosisSection2Operations.validatePreoperativeDiagnosisSectionPreoperativeDiagnosis(
					(PreoperativeDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validatePreoperativeDiagnosisSectionPreoperativeDiagnosisTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PreoperativeDiagnosisSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PreoperativeDiagnosisSection2> {
		@Override
		public PreoperativeDiagnosisSection2 create() {
			return ConsolFactory.eINSTANCE.createPreoperativeDiagnosisSection2();
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
	private static class ConstructorTestClass extends PreoperativeDiagnosisSection2Operations {
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

} // PreoperativeDiagnosisSection2Operations
