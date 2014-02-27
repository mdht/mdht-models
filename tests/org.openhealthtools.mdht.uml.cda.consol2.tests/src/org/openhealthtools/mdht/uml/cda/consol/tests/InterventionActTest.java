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
import org.openhealthtools.mdht.uml.cda.consol.InterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.InterventionActOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentActMood;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Intervention Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActGoalObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Goal Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActNutritionRecommendations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Nutrition Recommendations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActActReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Act Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActActReference2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Act Reference2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getGoalObservations() <em>Get Goal Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getInterventionActs() <em>Get Intervention Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getNutritionRecommendationss() <em>Get Nutrition Recommendationss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getActReferences() <em>Get Act References</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getActReference2s() <em>Get Act Reference2s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InterventionActTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionActTemplateId() {
		OperationsTestCase<InterventionAct> validateInterventionActTemplateIdTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActTemplateId(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionActClassCode() {
		OperationsTestCase<InterventionAct> validateInterventionActClassCodeTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActClassCode(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActMoodCode() {
		OperationsTestCase<InterventionAct> validateInterventionActMoodCodeTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				target.setMoodCode(x_DocumentActMood.APT);
			}

			@Override
			protected void setDependency(InterventionAct target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.InterventionActMoodCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActMoodCode(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActId() {
		OperationsTestCase<InterventionAct> validateInterventionActIdTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActId",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActId(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionActCodeP() {
		OperationsTestCase<InterventionAct> validateInterventionActCodePTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActCodeP",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActCodeP(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionActCode() {
		OperationsTestCase<InterventionAct> validateInterventionActCodeTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActCode",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected void setDependency(InterventionAct target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.InterventionActCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActCode(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionActStatusCode() {
		OperationsTestCase<InterventionAct> validateInterventionActStatusCodeTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActStatusCode(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionActEffectiveTime() {
		OperationsTestCase<InterventionAct> validateInterventionActEffectiveTimeTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActEffectiveTime(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActGoalObservation() {
		OperationsTestCase<InterventionAct> validateInterventionActGoalObservationTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActGoalObservation",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setObservation(ConsolFactory.eINSTANCE.createGoalObservation());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActGoalObservation(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActGoalObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionAct() {
		OperationsTestCase<InterventionAct> validateInterventionActTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionAct",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setAct(ConsolFactory.eINSTANCE.createInterventionAct());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionAct(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActNutritionRecommendations() {
		OperationsTestCase<InterventionAct> validateInterventionActNutritionRecommendationsTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActNutritionRecommendations",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_NUTRITION_RECOMMENDATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createNutritionRecommendations());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActNutritionRecommendations(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActNutritionRecommendationsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActActReference() {
		OperationsTestCase<InterventionAct> validateInterventionActActReferenceTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActActReference",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setAct(ConsolFactory.eINSTANCE.createActReference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActActReference(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActActReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActActReference2() {
		OperationsTestCase<InterventionAct> validateInterventionActActReference2TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActActReference2",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_ACT_REFERENCE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.GEVL);
				er.setAct(ConsolFactory.eINSTANCE.createActReference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActActReference2(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActActReference2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetGoalObservations() {

		InterventionAct target = objectFactory.create();
		target.getGoalObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInterventionActs() {

		InterventionAct target = objectFactory.create();
		target.getInterventionActs();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNutritionRecommendationss() {

		InterventionAct target = objectFactory.create();
		target.getNutritionRecommendationss();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetActReferences() {

		InterventionAct target = objectFactory.create();
		target.getActReferences();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetActReference2s() {

		InterventionAct target = objectFactory.create();
		target.getActReference2s();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends InterventionActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<InterventionAct> {
		public InterventionAct create() {
			return ConsolFactory.eINSTANCE.createInterventionAct();
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
	private static class ConstructorTestClass extends InterventionActOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // InterventionActOperations
