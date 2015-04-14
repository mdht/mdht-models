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
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PostprocedureDiagnosisSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Postprocedure Diagnosis Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection2#validatePostprocedureDiagnosisSectionPostprocedureDiagnosis2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Postprocedure Diagnosis2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection2#getConsolPostprocedureDiagnosis2() <em>Get Consol Postprocedure Diagnosis2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection2#validatePostprocedureDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection2#validatePostprocedureDiagnosisSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection2#validatePostprocedureDiagnosisSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PostprocedureDiagnosisSection2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePostprocedureDiagnosisSectionPostprocedureDiagnosis2() {
		OperationsTestCase<PostprocedureDiagnosisSection2> validatePostprocedureDiagnosisSectionPostprocedureDiagnosis2TestCase = new OperationsTestCase<PostprocedureDiagnosisSection2>(
			"validatePostprocedureDiagnosisSectionPostprocedureDiagnosis2",
			operationsForOCL.getOCLValue("VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PostprocedureDiagnosisSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PostprocedureDiagnosisSection2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createPostprocedureDiagnosis2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostprocedureDiagnosisSection2Operations.validatePostprocedureDiagnosisSectionPostprocedureDiagnosis2(
					(PostprocedureDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validatePostprocedureDiagnosisSectionPostprocedureDiagnosis2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolPostprocedureDiagnosis2() {

		PostprocedureDiagnosisSection2 target = objectFactory.create();
		target.getConsolPostprocedureDiagnosis2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePostprocedureDiagnosisSectionTemplateId() {
		OperationsTestCase<PostprocedureDiagnosisSection2> validatePostprocedureDiagnosisSectionTemplateIdTestCase = new OperationsTestCase<PostprocedureDiagnosisSection2>(
			"validatePostprocedureDiagnosisSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PostprocedureDiagnosisSection2 target) {

			}

			@Override
			protected void updateToPass(PostprocedureDiagnosisSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostprocedureDiagnosisSection2Operations.validatePostprocedureDiagnosisSectionTemplateId(
					(PostprocedureDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validatePostprocedureDiagnosisSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePostprocedureDiagnosisSectionCodeP() {
		OperationsTestCase<PostprocedureDiagnosisSection2> validatePostprocedureDiagnosisSectionCodePTestCase = new OperationsTestCase<PostprocedureDiagnosisSection2>(
			"validatePostprocedureDiagnosisSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PostprocedureDiagnosisSection2 target) {

			}

			@Override
			protected void updateToPass(PostprocedureDiagnosisSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostprocedureDiagnosisSection2Operations.validatePostprocedureDiagnosisSectionCodeP(
					(PostprocedureDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validatePostprocedureDiagnosisSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePostprocedureDiagnosisSectionCode() {
		OperationsTestCase<PostprocedureDiagnosisSection2> validatePostprocedureDiagnosisSectionCodeTestCase = new OperationsTestCase<PostprocedureDiagnosisSection2>(
			"validatePostprocedureDiagnosisSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_POSTPROCEDURE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PostprocedureDiagnosisSection2 target) {

			}

			@Override
			protected void updateToPass(PostprocedureDiagnosisSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(PostprocedureDiagnosisSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostprocedureDiagnosisSection2Operations.validatePostprocedureDiagnosisSectionCode(
					(PostprocedureDiagnosisSection2) objectToTest, diagnostician, map);
			}

		};

		validatePostprocedureDiagnosisSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PostprocedureDiagnosisSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PostprocedureDiagnosisSection2> {
		@Override
		public PostprocedureDiagnosisSection2 create() {
			return ConsolFactory.eINSTANCE.createPostprocedureDiagnosisSection2();
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
	private static class ConstructorTestClass extends PostprocedureDiagnosisSection2Operations {
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

} // PostprocedureDiagnosisSection2Operations
