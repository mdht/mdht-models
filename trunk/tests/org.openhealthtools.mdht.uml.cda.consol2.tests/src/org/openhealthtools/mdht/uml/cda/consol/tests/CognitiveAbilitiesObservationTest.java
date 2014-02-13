/*******************************************************************************
 * Copyright (c) 2014 Sean Muir, Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) and Dan Brown (Audacious Inquiry) - initial API and implementation
 *     Dan Brown - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.CognitiveAbilitiesObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cognitive Abilities Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#validateCognitiveAbilitiesObservationAssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Abilities Observation Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation#getAssessmentScaleObservations() <em>Get Assessment Scale Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CognitiveAbilitiesObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveAbilitiesObservationTemplateId() {
		OperationsTestCase<CognitiveAbilitiesObservation> validateCognitiveAbilitiesObservationTemplateIdTestCase = new OperationsTestCase<CognitiveAbilitiesObservation>(
			"validateCognitiveAbilitiesObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveAbilitiesObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveAbilitiesObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationTemplateId(
					(CognitiveAbilitiesObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveAbilitiesObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveAbilitiesObservationClassCode() {
		OperationsTestCase<CognitiveAbilitiesObservation> validateCognitiveAbilitiesObservationClassCodeTestCase = new OperationsTestCase<CognitiveAbilitiesObservation>(
			"validateCognitiveAbilitiesObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveAbilitiesObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveAbilitiesObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationClassCode(
					(CognitiveAbilitiesObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveAbilitiesObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveAbilitiesObservationMoodCode() {
		OperationsTestCase<CognitiveAbilitiesObservation> validateCognitiveAbilitiesObservationMoodCodeTestCase = new OperationsTestCase<CognitiveAbilitiesObservation>(
			"validateCognitiveAbilitiesObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveAbilitiesObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveAbilitiesObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationMoodCode(
					(CognitiveAbilitiesObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveAbilitiesObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveAbilitiesObservationId() {
		OperationsTestCase<CognitiveAbilitiesObservation> validateCognitiveAbilitiesObservationIdTestCase = new OperationsTestCase<CognitiveAbilitiesObservation>(
			"validateCognitiveAbilitiesObservationId",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveAbilitiesObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveAbilitiesObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationId(
					(CognitiveAbilitiesObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveAbilitiesObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveAbilitiesObservationCodeP() {
		OperationsTestCase<CognitiveAbilitiesObservation> validateCognitiveAbilitiesObservationCodePTestCase = new OperationsTestCase<CognitiveAbilitiesObservation>(
			"validateCognitiveAbilitiesObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveAbilitiesObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveAbilitiesObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationCodeP(
					(CognitiveAbilitiesObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveAbilitiesObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCognitiveAbilitiesObservationCode() {
		OperationsTestCase<CognitiveAbilitiesObservation> validateCognitiveAbilitiesObservationCodeTestCase = new OperationsTestCase<CognitiveAbilitiesObservation>(
			"validateCognitiveAbilitiesObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveAbilitiesObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveAbilitiesObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD(
					"61254005", "2.16.840.1.113883.6.96", "SNOMED CT", "Judgement");
				target.setCode(cd);

			}

			@Override
			protected void setDependency(CognitiveAbilitiesObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationCode(
					(CognitiveAbilitiesObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveAbilitiesObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveAbilitiesObservationText() {
		OperationsTestCase<CognitiveAbilitiesObservation> validateCognitiveAbilitiesObservationTextTestCase = new OperationsTestCase<CognitiveAbilitiesObservation>(
			"validateCognitiveAbilitiesObservationText",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveAbilitiesObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveAbilitiesObservation target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationText(
					(CognitiveAbilitiesObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveAbilitiesObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveAbilitiesObservationStatusCode() {
		OperationsTestCase<CognitiveAbilitiesObservation> validateCognitiveAbilitiesObservationStatusCodeTestCase = new OperationsTestCase<CognitiveAbilitiesObservation>(
			"validateCognitiveAbilitiesObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveAbilitiesObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveAbilitiesObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationStatusCode(
					(CognitiveAbilitiesObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveAbilitiesObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveAbilitiesObservationStatusCodeP() {
		OperationsTestCase<CognitiveAbilitiesObservation> validateCognitiveAbilitiesObservationStatusCodePTestCase = new OperationsTestCase<CognitiveAbilitiesObservation>(
			"validateCognitiveAbilitiesObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveAbilitiesObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveAbilitiesObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationStatusCodeP(
					(CognitiveAbilitiesObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveAbilitiesObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveAbilitiesObservationEffectiveTime() {
		OperationsTestCase<CognitiveAbilitiesObservation> validateCognitiveAbilitiesObservationEffectiveTimeTestCase = new OperationsTestCase<CognitiveAbilitiesObservation>(
			"validateCognitiveAbilitiesObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveAbilitiesObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveAbilitiesObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationEffectiveTime(
					(CognitiveAbilitiesObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveAbilitiesObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCognitiveAbilitiesObservationValue() {
		OperationsTestCase<CognitiveAbilitiesObservation> validateCognitiveAbilitiesObservationValueTestCase = new OperationsTestCase<CognitiveAbilitiesObservation>(
			"validateCognitiveAbilitiesObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveAbilitiesObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveAbilitiesObservation target) {
				target.init();
				CD valueCD = DatatypesFactory.eINSTANCE.createCD(
					"11163003", "2.16.840.1.113883.6.96", "SNOMED CT", "Intact");
				target.getValues().add(valueCD);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationValue(
					(CognitiveAbilitiesObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveAbilitiesObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCognitiveAbilitiesObservationValueP() {
		OperationsTestCase<CognitiveAbilitiesObservation> validateCognitiveAbilitiesObservationValuePTestCase = new OperationsTestCase<CognitiveAbilitiesObservation>(
			"validateCognitiveAbilitiesObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveAbilitiesObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveAbilitiesObservation target) {
				target.init();
				CD valueCD = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(valueCD);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationValueP(
					(CognitiveAbilitiesObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveAbilitiesObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCognitiveAbilitiesObservationAssessmentScaleObservation() {
		OperationsTestCase<CognitiveAbilitiesObservation> validateCognitiveAbilitiesObservationAssessmentScaleObservationTestCase = new OperationsTestCase<CognitiveAbilitiesObservation>(
			"validateCognitiveAbilitiesObservationAssessmentScaleObservation",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_ABILITIES_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveAbilitiesObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveAbilitiesObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setObservation(ConsolFactory.eINSTANCE.createAssessmentScaleObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveAbilitiesObservationOperations.validateCognitiveAbilitiesObservationAssessmentScaleObservation(
					(CognitiveAbilitiesObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveAbilitiesObservationAssessmentScaleObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentScaleObservations() {

		CognitiveAbilitiesObservation target = objectFactory.create();
		target.getAssessmentScaleObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CognitiveAbilitiesObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CognitiveAbilitiesObservation> {
		public CognitiveAbilitiesObservation create() {
			return ConsolFactory.eINSTANCE.createCognitiveAbilitiesObservation();
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
	private static class ConstructorTestClass extends CognitiveAbilitiesObservationOperations {
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

} // CognitiveAbilitiesObservationOperations
