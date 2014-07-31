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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.OutcomeObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Outcome Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationActReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Act Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationActReference2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Act Reference2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationGoalObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Goal Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationProgressTowardGoalObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Progress Toward Goal Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationInterventionAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Intervention Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationExternalDocumentReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation External Document Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#getActReferences() <em>Get Act References</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#getActReference2s() <em>Get Act Reference2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#getGoalObservations() <em>Get Goal Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#getProgressTowardGoalObservation() <em>Get Progress Toward Goal Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#getInterventionActs() <em>Get Intervention Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#getExternalDocumentReferences() <em>Get External Document References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class OutcomeObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOutcomeObservationTemplateId() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationTemplateIdTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationTemplateId(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOutcomeObservationClassCode() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationClassCodeTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationClassCode(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOutcomeObservationMoodCode() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationMoodCodeTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationMoodCode(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOutcomeObservationId() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationIdTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationId",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationId(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOutcomeObservationActReference() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationActReferenceTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationActReference",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.GEVL);
				er.setAct(ConsolFactory.eINSTANCE.createActReference());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationActReference(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationActReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOutcomeObservationActReference2() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationActReference2TestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationActReference2",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_ACT_REFERENCE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setAct(ConsolFactory.eINSTANCE.createActReference());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationActReference2(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationActReference2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOutcomeObservationAuthorParticipation() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationAuthorParticipationTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationAuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationAuthorParticipation(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOutcomeObservationGoalObservation() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationGoalObservationTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationGoalObservation",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.GEVL);
				er.setObservation(ConsolFactory.eINSTANCE.createGoalObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationGoalObservation(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationGoalObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOutcomeObservationProgressTowardGoalObservation() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationProgressTowardGoalObservationTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationProgressTowardGoalObservation",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_PROGRESS_TOWARD_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SPRT);
				er.setObservation(ConsolFactory.eINSTANCE.createProgressTowardGoalObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationProgressTowardGoalObservation(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationProgressTowardGoalObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOutcomeObservationInterventionAct() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationInterventionActTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationInterventionAct",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setAct(ConsolFactory.eINSTANCE.createInterventionAct().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationInterventionAct(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationInterventionActTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOutcomeObservationExternalDocumentReference() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationExternalDocumentReferenceTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationExternalDocumentReference",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setAct(ConsolFactory.eINSTANCE.createExternalDocumentReference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationExternalDocumentReference(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationExternalDocumentReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetActReferences() {

		OutcomeObservation target = objectFactory.create();
		target.getActReferences();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetActReference2s() {

		OutcomeObservation target = objectFactory.create();
		target.getActReference2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetGoalObservations() {

		OutcomeObservation target = objectFactory.create();
		target.getGoalObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProgressTowardGoalObservation() {

		OutcomeObservation target = objectFactory.create();
		target.getProgressTowardGoalObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInterventionActs() {

		OutcomeObservation target = objectFactory.create();
		target.getInterventionActs();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetExternalDocumentReferences() {

		OutcomeObservation target = objectFactory.create();
		target.getExternalDocumentReferences();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends OutcomeObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<OutcomeObservation> {
		public OutcomeObservation create() {
			return ConsolFactory.eINSTANCE.createOutcomeObservation();
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
	private static class ConstructorTestClass extends OutcomeObservationOperations {
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

} // OutcomeObservationOperations
