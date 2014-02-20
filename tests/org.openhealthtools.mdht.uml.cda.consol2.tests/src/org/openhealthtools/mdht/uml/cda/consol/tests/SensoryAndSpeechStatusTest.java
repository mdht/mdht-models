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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus;
import org.openhealthtools.mdht.uml.cda.consol.operations.SensoryAndSpeechStatusOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Sensory And Speech Status</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusAssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#validateSensoryAndSpeechStatusAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory And Speech Status Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus#getAssessmentScaleObservations() <em>Get Assessment Scale Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SensoryAndSpeechStatusTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSensoryAndSpeechStatusTemplateId() {
		OperationsTestCase<SensoryAndSpeechStatus> validateSensoryAndSpeechStatusTemplateIdTestCase = new OperationsTestCase<SensoryAndSpeechStatus>(
			"validateSensoryAndSpeechStatusTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SENSORY_AND_SPEECH_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryAndSpeechStatus target) {

			}

			@Override
			protected void updateToPass(SensoryAndSpeechStatus target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusTemplateId(
					(SensoryAndSpeechStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryAndSpeechStatusTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSensoryAndSpeechStatusClassCode() {
		OperationsTestCase<SensoryAndSpeechStatus> validateSensoryAndSpeechStatusClassCodeTestCase = new OperationsTestCase<SensoryAndSpeechStatus>(
			"validateSensoryAndSpeechStatusClassCode",
			operationsForOCL.getOCLValue("VALIDATE_SENSORY_AND_SPEECH_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryAndSpeechStatus target) {

			}

			@Override
			protected void updateToPass(SensoryAndSpeechStatus target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusClassCode(
					(SensoryAndSpeechStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryAndSpeechStatusClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSensoryAndSpeechStatusMoodCode() {
		OperationsTestCase<SensoryAndSpeechStatus> validateSensoryAndSpeechStatusMoodCodeTestCase = new OperationsTestCase<SensoryAndSpeechStatus>(
			"validateSensoryAndSpeechStatusMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_SENSORY_AND_SPEECH_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryAndSpeechStatus target) {

			}

			@Override
			protected void updateToPass(SensoryAndSpeechStatus target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusMoodCode(
					(SensoryAndSpeechStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryAndSpeechStatusMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSensoryAndSpeechStatusCodeP() {
		OperationsTestCase<SensoryAndSpeechStatus> validateSensoryAndSpeechStatusCodePTestCase = new OperationsTestCase<SensoryAndSpeechStatus>(
			"validateSensoryAndSpeechStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SENSORY_AND_SPEECH_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryAndSpeechStatus target) {

			}

			@Override
			protected void updateToPass(SensoryAndSpeechStatus target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusCodeP(
					(SensoryAndSpeechStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryAndSpeechStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSensoryAndSpeechStatusCode() {
		OperationsTestCase<SensoryAndSpeechStatus> validateSensoryAndSpeechStatusCodeTestCase = new OperationsTestCase<SensoryAndSpeechStatus>(
			"validateSensoryAndSpeechStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_SENSORY_AND_SPEECH_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryAndSpeechStatus target) {

			}

			@Override
			protected void updateToPass(SensoryAndSpeechStatus target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(SensoryAndSpeechStatus target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusCode(
					(SensoryAndSpeechStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryAndSpeechStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSensoryAndSpeechStatusStatusCode() {
		OperationsTestCase<SensoryAndSpeechStatus> validateSensoryAndSpeechStatusStatusCodeTestCase = new OperationsTestCase<SensoryAndSpeechStatus>(
			"validateSensoryAndSpeechStatusStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_SENSORY_AND_SPEECH_STATUS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryAndSpeechStatus target) {

			}

			@Override
			protected void updateToPass(SensoryAndSpeechStatus target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusStatusCode(
					(SensoryAndSpeechStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryAndSpeechStatusStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSensoryAndSpeechStatusStatusCodeP() {
		OperationsTestCase<SensoryAndSpeechStatus> validateSensoryAndSpeechStatusStatusCodePTestCase = new OperationsTestCase<SensoryAndSpeechStatus>(
			"validateSensoryAndSpeechStatusStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SENSORY_AND_SPEECH_STATUS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryAndSpeechStatus target) {

			}

			@Override
			protected void updateToPass(SensoryAndSpeechStatus target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusStatusCodeP(
					(SensoryAndSpeechStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryAndSpeechStatusStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSensoryAndSpeechStatusEffectiveTime() {
		OperationsTestCase<SensoryAndSpeechStatus> validateSensoryAndSpeechStatusEffectiveTimeTestCase = new OperationsTestCase<SensoryAndSpeechStatus>(
			"validateSensoryAndSpeechStatusEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SENSORY_AND_SPEECH_STATUS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryAndSpeechStatus target) {

			}

			@Override
			protected void updateToPass(SensoryAndSpeechStatus target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusEffectiveTime(
					(SensoryAndSpeechStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryAndSpeechStatusEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSensoryAndSpeechStatusValue() {
		OperationsTestCase<SensoryAndSpeechStatus> validateSensoryAndSpeechStatusValueTestCase = new OperationsTestCase<SensoryAndSpeechStatus>(
			"validateSensoryAndSpeechStatusValue",
			operationsForOCL.getOCLValue("VALIDATE_SENSORY_AND_SPEECH_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryAndSpeechStatus target) {

			}

			@Override
			protected void updateToPass(SensoryAndSpeechStatus target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusValue(
					(SensoryAndSpeechStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryAndSpeechStatusValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSensoryAndSpeechStatusValueP() {
		OperationsTestCase<SensoryAndSpeechStatus> validateSensoryAndSpeechStatusValuePTestCase = new OperationsTestCase<SensoryAndSpeechStatus>(
			"validateSensoryAndSpeechStatusValueP",
			operationsForOCL.getOCLValue("VALIDATE_SENSORY_AND_SPEECH_STATUS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryAndSpeechStatus target) {

			}

			@Override
			protected void updateToPass(SensoryAndSpeechStatus target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusValueP(
					(SensoryAndSpeechStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryAndSpeechStatusValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSensoryAndSpeechStatusAuthor() {
		OperationsTestCase<SensoryAndSpeechStatus> validateSensoryAndSpeechStatusAuthorTestCase = new OperationsTestCase<SensoryAndSpeechStatus>(
			"validateSensoryAndSpeechStatusAuthor",
			operationsForOCL.getOCLValue("VALIDATE_SENSORY_AND_SPEECH_STATUS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryAndSpeechStatus target) {

			}

			@Override
			protected void updateToPass(SensoryAndSpeechStatus target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusAuthor(
					(SensoryAndSpeechStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryAndSpeechStatusAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSensoryAndSpeechStatusAssessmentScaleObservation() {
		OperationsTestCase<SensoryAndSpeechStatus> validateSensoryAndSpeechStatusAssessmentScaleObservationTestCase = new OperationsTestCase<SensoryAndSpeechStatus>(
			"validateSensoryAndSpeechStatusAssessmentScaleObservation",
			operationsForOCL.getOCLValue("VALIDATE_SENSORY_AND_SPEECH_STATUS_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryAndSpeechStatus target) {

			}

			@Override
			protected void updateToPass(SensoryAndSpeechStatus target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusAssessmentScaleObservation(
					(SensoryAndSpeechStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryAndSpeechStatusAssessmentScaleObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSensoryAndSpeechStatusAuthorTime() {
		OperationsTestCase<SensoryAndSpeechStatus> validateSensoryAndSpeechStatusAuthorTimeTestCase = new OperationsTestCase<SensoryAndSpeechStatus>(
			"validateSensoryAndSpeechStatusAuthorTime",
			operationsForOCL.getOCLValue("VALIDATE_SENSORY_AND_SPEECH_STATUS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryAndSpeechStatus target) {

			}

			@Override
			protected void updateToPass(SensoryAndSpeechStatus target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryAndSpeechStatusOperations.validateSensoryAndSpeechStatusAuthorTime(
					(SensoryAndSpeechStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryAndSpeechStatusAuthorTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentScaleObservations() {

		SensoryAndSpeechStatus target = objectFactory.create();
		target.getAssessmentScaleObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SensoryAndSpeechStatusOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SensoryAndSpeechStatus> {
		public SensoryAndSpeechStatus create() {
			return ConsolFactory.eINSTANCE.createSensoryAndSpeechStatus();
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
	private static class ConstructorTestClass extends SensoryAndSpeechStatusOperations {
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

} // SensoryAndSpeechStatusOperations
