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
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2;
import org.openhealthtools.mdht.uml.cda.consol.operations.SmokingStatusMeaningfulUse2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Smoking Status Meaningful Use2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusMeaningfulUse2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusMeaningfulUse2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusMeaningfulUse2CDCodeTermAssertionOrLoinc(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Meaningful Use2 CD Code Term Assertion Or Loinc</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2#validateSmokingStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SmokingStatusMeaningfulUse2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSmokingStatusMeaningfulUse2Id() {
		OperationsTestCase<SmokingStatusMeaningfulUse2> validateSmokingStatusMeaningfulUse2IdTestCase = new OperationsTestCase<SmokingStatusMeaningfulUse2>(
			"validateSmokingStatusMeaningfulUse2Id",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusMeaningfulUse2 target) {

			}

			@Override
			protected void updateToPass(SmokingStatusMeaningfulUse2 target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusMeaningfulUse2Id(
					(SmokingStatusMeaningfulUse2) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusMeaningfulUse2IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSmokingStatusMeaningfulUse2AuthorParticipation() {
		OperationsTestCase<SmokingStatusMeaningfulUse2> validateSmokingStatusMeaningfulUse2AuthorParticipationTestCase = new OperationsTestCase<SmokingStatusMeaningfulUse2>(
			"validateSmokingStatusMeaningfulUse2AuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusMeaningfulUse2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(SmokingStatusMeaningfulUse2 target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusMeaningfulUse2AuthorParticipation(
					(SmokingStatusMeaningfulUse2) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusMeaningfulUse2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	* In this case, as per errata 596:
	* For backwards compatibility, R1.1 was allowed to use its original code or the R2.0/R2.1 code 
	* where as R2.1 can only use the new code - so we are removing the either or option 
	*/
	@Ignore
	public void testValidateSmokingStatusMeaningfulUse2CDCodeTermAssertionOrLoinc() {
		OperationsTestCase<SmokingStatusMeaningfulUse2> validateSmokingStatusMeaningfulUse2CDCodeTermAssertionOrLoincTestCase = new OperationsTestCase<SmokingStatusMeaningfulUse2>(
			"validateSmokingStatusMeaningfulUse2CDCodeTermAssertionOrLoinc",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_MEANINGFUL_USE2_CD_CODE_TERM_ASSERTION_OR_LOINC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusMeaningfulUse2 target) {

			}

			@Override
			protected void updateToPass(SmokingStatusMeaningfulUse2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusMeaningfulUse2CDCodeTermAssertionOrLoinc(
					(SmokingStatusMeaningfulUse2) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusMeaningfulUse2CDCodeTermAssertionOrLoincTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSmokingStatusObservationTemplateId() {
		OperationsTestCase<SmokingStatusMeaningfulUse2> validateSmokingStatusObservationTemplateIdTestCase = new OperationsTestCase<SmokingStatusMeaningfulUse2>(
			"validateSmokingStatusObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusMeaningfulUse2 target) {

			}

			@Override
			protected void updateToPass(SmokingStatusMeaningfulUse2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusObservationTemplateId(
					(SmokingStatusMeaningfulUse2) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSmokingStatusObservationCodeP() {
		OperationsTestCase<SmokingStatusMeaningfulUse2> validateSmokingStatusObservationCodePTestCase = new OperationsTestCase<SmokingStatusMeaningfulUse2>(
			"validateSmokingStatusObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusMeaningfulUse2 target) {

			}

			@Override
			protected void updateToPass(SmokingStatusMeaningfulUse2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusObservationCodeP(
					(SmokingStatusMeaningfulUse2) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSmokingStatusObservationCode() {
		OperationsTestCase<SmokingStatusMeaningfulUse2> validateSmokingStatusObservationCodeTestCase = new OperationsTestCase<SmokingStatusMeaningfulUse2>(
			"validateSmokingStatusObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(SmokingStatusMeaningfulUse2 target) {
						// code with no @code or @codeSystem
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD());
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(SmokingStatusMeaningfulUse2 target) {
						// invalid @code
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD(BAD_CODE_VALUE, "2.16.840.1.113883.5.4"));
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(SmokingStatusMeaningfulUse2 target) {
						// invalid @codeSystem
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("ASSERTION", BAD_CODESYSTEM_ID));
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(SmokingStatusMeaningfulUse2 target) {
						// invalid @code and invalid @codeSystem
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD(BAD_CODE_VALUE, BAD_CODESYSTEM_ID));
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(SmokingStatusMeaningfulUse2 target) {
						// old R1.1 way
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("ASSERTION", "2.16.840.1.113883.5.4"));
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(SmokingStatusMeaningfulUse2 target) {
						// new R2.1 code
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("72166-2", LOINC_ID));
					}
				});

			}

			@Override
			protected void setDependency(SmokingStatusMeaningfulUse2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusObservationCode(
					(SmokingStatusMeaningfulUse2) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSmokingStatusObservationValueP() {
		OperationsTestCase<SmokingStatusMeaningfulUse2> validateSmokingStatusObservationValuePTestCase = new OperationsTestCase<SmokingStatusMeaningfulUse2>(
			"validateSmokingStatusObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusMeaningfulUse2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(SmokingStatusMeaningfulUse2 target) {
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusObservationValueP(
					(SmokingStatusMeaningfulUse2) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSmokingStatusObservationValue() {
		OperationsTestCase<SmokingStatusMeaningfulUse2> validateSmokingStatusObservationValueTestCase = new OperationsTestCase<SmokingStatusMeaningfulUse2>(
			"validateSmokingStatusObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusMeaningfulUse2 target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(SmokingStatusMeaningfulUse2 target) {
				target.getValues().set(0, DatatypesFactory.eINSTANCE.createCD("449868002", SNOMEDCT_ID));

			}

			@Override
			protected void setDependency(SmokingStatusMeaningfulUse2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservationValueP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusMeaningfulUse2Operations.validateSmokingStatusObservationValue(
					(SmokingStatusMeaningfulUse2) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SmokingStatusMeaningfulUse2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<SmokingStatusMeaningfulUse2> {
		public SmokingStatusMeaningfulUse2 create() {
			return ConsolFactory.eINSTANCE.createSmokingStatusMeaningfulUse2();
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
	private static class ConstructorTestClass extends SmokingStatusMeaningfulUse2Operations {
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

} // SmokingStatusMeaningfulUse2Operations
