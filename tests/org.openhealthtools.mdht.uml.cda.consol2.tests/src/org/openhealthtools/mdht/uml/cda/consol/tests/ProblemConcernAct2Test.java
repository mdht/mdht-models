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
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemConcernAct2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Concern Act2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernAct2EffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act2 Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernAct2EffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act2 Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernAct2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernAct2ProviderPriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act2 Provider Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernActProblemObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Problem Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#getProviderPriorityPreferences() <em>Get Provider Priority Preferences</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#getConsolProblemObservation2s() <em>Get Consol Problem Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProblemConcernAct2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemConcernAct2EffectiveTimeLow() {
		OperationsTestCase<ProblemConcernAct2> validateProblemConcernAct2EffectiveTimeLowTestCase = new OperationsTestCase<ProblemConcernAct2>(
			"validateProblemConcernAct2EffectiveTimeLow",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT2_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct2 target) {
				target.init();
				IVL_TS et = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(et);
			}

			@Override
			protected void updateToPass(ProblemConcernAct2 target) {
				IVL_TS etWithLow = DatatypesFactory.eINSTANCE.createIVL_TS();
				etWithLow.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
				target.setEffectiveTime(etWithLow);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernAct2Operations.validateProblemConcernAct2EffectiveTimeLow(
					(ProblemConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernAct2EffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemConcernAct2EffectiveTimeHigh() {
		OperationsTestCase<ProblemConcernAct2> validateProblemConcernAct2EffectiveTimeHighTestCase = new OperationsTestCase<ProblemConcernAct2>(
			"validateProblemConcernAct2EffectiveTimeHigh",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT2_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct2 target) {
				target.init();
				IVL_TS et = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(et);
			}

			@Override
			protected void updateToPass(ProblemConcernAct2 target) {
				IVL_TS etWithHigh = DatatypesFactory.eINSTANCE.createIVL_TS();
				etWithHigh.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
				target.setEffectiveTime(etWithHigh);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernAct2Operations.validateProblemConcernAct2EffectiveTimeHigh(
					(ProblemConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernAct2EffectiveTimeHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemConcernActStatusCodeP() {
		OperationsTestCase<ProblemConcernAct2> validateProblemConcernActStatusCodePTestCase = new OperationsTestCase<ProblemConcernAct2>(
			"validateProblemConcernActStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct2 target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct2 target) {
				target.init();
				CS statusCode = DatatypesFactory.eINSTANCE.createCS();
				target.setStatusCode(statusCode);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernAct2Operations.validateProblemConcernActStatusCodeP(
					(ProblemConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemConcernAct2AuthorParticipation() {
		OperationsTestCase<ProblemConcernAct2> validateProblemConcernAct2AuthorParticipationTestCase = new OperationsTestCase<ProblemConcernAct2>(
			"validateProblemConcernAct2AuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProblemConcernAct2 target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernAct2Operations.validateProblemConcernAct2AuthorParticipation(
					(ProblemConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernAct2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemConcernAct2ProviderPriorityPreference() {
		OperationsTestCase<ProblemConcernAct2> validateProblemConcernAct2ProviderPriorityPreferenceTestCase = new OperationsTestCase<ProblemConcernAct2>(
			"validateProblemConcernAct2ProviderPriorityPreference",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT2_PROVIDER_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProblemConcernAct2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createProviderPriorityPreference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernAct2Operations.validateProblemConcernAct2ProviderPriorityPreference(
					(ProblemConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernAct2ProviderPriorityPreferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemConcernActProblemObservation2() {
		OperationsTestCase<ProblemConcernAct2> validateProblemConcernActProblemObservation2TestCase = new OperationsTestCase<ProblemConcernAct2>(
			"validateProblemConcernActProblemObservation2",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_PROBLEM_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct2 target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(ConsolFactory.eINSTANCE.createProblemObservation2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernAct2Operations.validateProblemConcernActProblemObservation2(
					(ProblemConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActProblemObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProviderPriorityPreferences() {

		ProblemConcernAct2 target = objectFactory.create();
		target.getProviderPriorityPreferences();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolProblemObservation2s() {

		ProblemConcernAct2 target = objectFactory.create();
		target.getConsolProblemObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActTemplateId() {
		OperationsTestCase<ProblemConcernAct2> validateProblemConcernActTemplateIdTestCase = new OperationsTestCase<ProblemConcernAct2>(
			"validateProblemConcernActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct2 target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernAct2Operations.validateProblemConcernActTemplateId(
					(ProblemConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActStatusCode() {
		OperationsTestCase<ProblemConcernAct2> validateProblemConcernActStatusCodeTestCase = new OperationsTestCase<ProblemConcernAct2>(
			"validateProblemConcernActStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct2 target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(ProblemConcernAct2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProblemConcernActStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernAct2Operations.validateProblemConcernActStatusCode(
					(ProblemConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActEffectiveTime() {
		OperationsTestCase<ProblemConcernAct2> validateProblemConcernActEffectiveTimeTestCase = new OperationsTestCase<ProblemConcernAct2>(
			"validateProblemConcernActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct2 target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernAct2Operations.validateProblemConcernActEffectiveTime(
					(ProblemConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActCodeP() {
		OperationsTestCase<ProblemConcernAct2> validateProblemConcernActCodePTestCase = new OperationsTestCase<ProblemConcernAct2>(
			"validateProblemConcernActCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct2 target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernAct2Operations.validateProblemConcernActCodeP(
					(ProblemConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActCode() {
		OperationsTestCase<ProblemConcernAct2> validateProblemConcernActCodeTestCase = new OperationsTestCase<ProblemConcernAct2>(
			"validateProblemConcernActCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct2 target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct2 target) {
				target.init();

			}

			@Override
			protected void setDependency(ProblemConcernAct2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProblemConcernActCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernAct2Operations.validateProblemConcernActCode(
					(ProblemConcernAct2) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProblemConcernAct2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ProblemConcernAct2> {
		public ProblemConcernAct2 create() {
			return ConsolFactory.eINSTANCE.createProblemConcernAct2();
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
	private static class ConstructorTestClass extends ProblemConcernAct2Operations {
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

} // ProblemConcernAct2Operations
