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
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.eclipse.mdht.uml.hl7.vocab.*;
import org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyConcernAct2Operations;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyProblemActOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Concern Act2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyConcernAct2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyConcernAct2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#getConsolAllergyObservation2s() <em>Get Consol Allergy Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyProblemActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyProblemActAllergyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Allergy Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyProblemActCDCodeAndCodeSystemValues(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act CD Code And Code System Values</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyProblemActCDCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act CD Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyProblemActCDCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act CD Code System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AllergyConcernAct2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAllergyConcernAct2TemplateId() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyConcernAct2TemplateIdTestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyConcernAct2TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_CONCERN_ACT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyConcernAct2 target) {

			}

			@Override
			protected void updateToPass(AllergyConcernAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyConcernAct2Operations.validateAllergyConcernAct2TemplateId(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyConcernAct2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateAllergyConcernAct2EffectiveTimeLow() {
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateAllergyConcernAct2EffectiveTimeHigh() {
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyConcernAct2AuthorParticipation() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyConcernAct2AuthorParticipationTestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyConcernAct2AuthorParticipation", operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_CONCERN_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyConcernAct2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(AllergyConcernAct2 target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyConcernAct2Operations.validateAllergyConcernAct2AuthorParticipation(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyConcernAct2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolAllergyObservation2s() {

		AllergyConcernAct2 target = objectFactory.create();
		target.getConsolAllergyObservation2s();

	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateAllergyProblemActEffectiveTimeLow() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyProblemActEffectiveTimeLowTestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyProblemActEffectiveTimeLow", operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyConcernAct2 target) {

			}

			@Override
			protected void updateToPass(AllergyConcernAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActEffectiveTimeLow(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActEffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateAllergyProblemActEffectiveTimeHigh() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyProblemActEffectiveTimeHighTestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyProblemActEffectiveTimeHigh", operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyConcernAct2 target) {

			}

			@Override
			protected void updateToPass(AllergyConcernAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActEffectiveTimeHigh(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActEffectiveTimeHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyProblemActCode() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyProblemActCodeTestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyProblemActCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyConcernAct2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(AllergyConcernAct2 target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD("CONC", "2.16.840.1.113883.5.6"));
			}

			@Override
			protected void setDependency(AllergyConcernAct2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.AllergyProblemActCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActCode(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyProblemActAllergyObservation() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyProblemActAllergyObservationTestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyProblemActAllergyObservation", operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_PROBLEM_ACT_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyConcernAct2 target) {

			}

			@Override
			protected void updateToPass(AllergyConcernAct2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(ConsolFactory.eINSTANCE.createAllergyObservation2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyConcernAct2Operations.validateAllergyProblemActAllergyObservation(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActAllergyObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyProblemActCDCodeAndCodeSystemValues() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyProblemActCDCodeAndCodeSystemValuesTestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyProblemActCDCodeAndCodeSystemValues",
			operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE_AND_CODE_SYSTEM_VALUES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(AllergyConcernAct2 target) {
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD());
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(AllergyConcernAct2 target) {
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD(BAD_CODE_VALUE, BAD_CODESYSTEM_ID));
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(AllergyConcernAct2 target) {
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("CONC", "2.16.840.1.113883.5.6"));
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(AllergyConcernAct2 target) {
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("48765-2", LOINC_ID));
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyConcernAct2Operations.validateAllergyProblemActCDCodeAndCodeSystemValues(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActCDCodeAndCodeSystemValuesTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyProblemActCDCode() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyProblemActCDCodeTestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyProblemActCDCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyConcernAct2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(AllergyConcernAct2 target) {
				target.getCode().setCode("mustExistOnly");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyConcernAct2Operations.validateAllergyProblemActCDCode(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActCDCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyProblemActCDCodeSystem() {
		OperationsTestCase<AllergyConcernAct2> validateAllergyProblemActCDCodeSystemTestCase = new OperationsTestCase<AllergyConcernAct2>(
			"validateAllergyProblemActCDCodeSystem",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyConcernAct2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(AllergyConcernAct2 target) {
				target.getCode().setCodeSystem("mustExistOnly");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyConcernAct2Operations.validateAllergyProblemActCDCodeSystem(
					(AllergyConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActCDCodeSystemTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AllergyConcernAct2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergyConcernAct2> {
		@Override
		public AllergyConcernAct2 create() {
			return ConsolFactory.eINSTANCE.createAllergyConcernAct2();
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
	private static class ConstructorTestClass extends AllergyConcernAct2Operations {
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

} // AllergyConcernAct2Operations
