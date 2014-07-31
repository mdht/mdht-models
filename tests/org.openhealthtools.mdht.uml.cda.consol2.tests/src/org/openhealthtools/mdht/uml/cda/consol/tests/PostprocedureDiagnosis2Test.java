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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PostprocedureDiagnosis2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Postprocedure Diagnosis2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis2#validatePostprocedureDiagnosisCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis2#validatePostprocedureDiagnosisProblemObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Problem Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis2#getConsolProblemObservation2s() <em>Get Consol Problem Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis2#validatePostprocedureDiagnosisTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis2#validatePostprocedureDiagnosisCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PostprocedureDiagnosis2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePostprocedureDiagnosisCodeP() {
		OperationsTestCase<PostprocedureDiagnosis2> validatePostprocedureDiagnosisCodePTestCase = new OperationsTestCase<PostprocedureDiagnosis2>(
			"validatePostprocedureDiagnosisCodeP",
			operationsForOCL.getOCLValue("VALIDATE_POSTPROCEDURE_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PostprocedureDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(PostprocedureDiagnosis2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostprocedureDiagnosis2Operations.validatePostprocedureDiagnosisCodeP(
					(PostprocedureDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validatePostprocedureDiagnosisCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePostprocedureDiagnosisProblemObservation2() {
		OperationsTestCase<PostprocedureDiagnosis2> validatePostprocedureDiagnosisProblemObservation2TestCase = new OperationsTestCase<PostprocedureDiagnosis2>(
			"validatePostprocedureDiagnosisProblemObservation2",
			operationsForOCL.getOCLValue("VALIDATE_POSTPROCEDURE_DIAGNOSIS_PROBLEM_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PostprocedureDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(PostprocedureDiagnosis2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(ConsolFactory.eINSTANCE.createProblemObservation2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostprocedureDiagnosis2Operations.validatePostprocedureDiagnosisProblemObservation2(
					(PostprocedureDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validatePostprocedureDiagnosisProblemObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolProblemObservation2s() {

		PostprocedureDiagnosis2 target = objectFactory.create();
		target.getConsolProblemObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePostprocedureDiagnosisTemplateId() {
		OperationsTestCase<PostprocedureDiagnosis2> validatePostprocedureDiagnosisTemplateIdTestCase = new OperationsTestCase<PostprocedureDiagnosis2>(
			"validatePostprocedureDiagnosisTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_POSTPROCEDURE_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PostprocedureDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(PostprocedureDiagnosis2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostprocedureDiagnosis2Operations.validatePostprocedureDiagnosisTemplateId(
					(PostprocedureDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validatePostprocedureDiagnosisTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePostprocedureDiagnosisCode() {
		OperationsTestCase<PostprocedureDiagnosis2> validatePostprocedureDiagnosisCodeTestCase = new OperationsTestCase<PostprocedureDiagnosis2>(
			"validatePostprocedureDiagnosisCode",
			operationsForOCL.getOCLValue("VALIDATE_POSTPROCEDURE_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PostprocedureDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(PostprocedureDiagnosis2 target) {
				target.init();

			}

			@Override
			protected void setDependency(PostprocedureDiagnosis2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostprocedureDiagnosis2Operations.validatePostprocedureDiagnosisCode(
					(PostprocedureDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validatePostprocedureDiagnosisCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PostprocedureDiagnosis2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PostprocedureDiagnosis2> {
		public PostprocedureDiagnosis2 create() {
			return ConsolFactory.eINSTANCE.createPostprocedureDiagnosis2();
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
	private static class ConstructorTestClass extends PostprocedureDiagnosis2Operations {
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

} // PostprocedureDiagnosis2Operations
