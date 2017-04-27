/*******************************************************************************
 * Copyright (c) 2014, 2015 Dan Brown and others.
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
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Test;
import org.eclipse.mdht.uml.hl7.vocab.*;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.SensoryStatus;
import org.openhealthtools.mdht.uml.cda.consol.operations.SensoryStatusOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Sensory Status</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryStatus#validateSensoryStatusTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory Status Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryStatus#validateSensoryStatusClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory Status Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryStatus#validateSensoryStatusMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory Status Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryStatus#validateSensoryStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryStatus#validateSensoryStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryStatus#validateSensoryStatusStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory Status Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryStatus#validateSensoryStatusStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory Status Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryStatus#validateSensoryStatusEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory Status Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryStatus#validateSensoryStatusValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory Status Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryStatus#validateSensoryStatusValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory Status Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryStatus#validateSensoryStatusAssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory Status Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryStatus#validateSensoryStatusAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory Status Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryStatus#validateSensoryStatusIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory Status IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryStatus#validateSensoryStatusIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sensory Status IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SensoryStatus#getAssessmentScaleObservations() <em>Get Assessment Scale Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SensoryStatusTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSensoryStatusTemplateId() {
		OperationsTestCase<SensoryStatus> validateSensoryStatusTemplateIdTestCase = new OperationsTestCase<SensoryStatus>(
			"validateSensoryStatusTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SENSORY_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryStatus target) {

			}

			@Override
			protected void updateToPass(SensoryStatus target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryStatusOperations.validateSensoryStatusTemplateId(
					(SensoryStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryStatusTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSensoryStatusClassCode() {
		OperationsTestCase<SensoryStatus> validateSensoryStatusClassCodeTestCase = new OperationsTestCase<SensoryStatus>(
			"validateSensoryStatusClassCode",
			operationsForOCL.getOCLValue("VALIDATE_SENSORY_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryStatus target) {

			}

			@Override
			protected void updateToPass(SensoryStatus target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryStatusOperations.validateSensoryStatusClassCode(
					(SensoryStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryStatusClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSensoryStatusMoodCode() {
		OperationsTestCase<SensoryStatus> validateSensoryStatusMoodCodeTestCase = new OperationsTestCase<SensoryStatus>(
			"validateSensoryStatusMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_SENSORY_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryStatus target) {

			}

			@Override
			protected void updateToPass(SensoryStatus target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryStatusOperations.validateSensoryStatusMoodCode(
					(SensoryStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryStatusMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSensoryStatusCodeP() {
		OperationsTestCase<SensoryStatus> validateSensoryStatusCodePTestCase = new OperationsTestCase<SensoryStatus>(
			"validateSensoryStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SENSORY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryStatus target) {

			}

			@Override
			protected void updateToPass(SensoryStatus target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryStatusOperations.validateSensoryStatusCodeP(
					(SensoryStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSensoryStatusCode() {
		OperationsTestCase<SensoryStatus> validateSensoryStatusCodeTestCase = new OperationsTestCase<SensoryStatus>(
			"validateSensoryStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_SENSORY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryStatus target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(code);
			}

			@Override
			protected void updateToPass(SensoryStatus target) {
				CD code = DatatypesFactory.eINSTANCE.createCD("47078008", SNOMEDCT_ID);
				target.setCode(code);
			}

			@Override
			protected void setDependency(SensoryStatus target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SensoryStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryStatusOperations.validateSensoryStatusCode(
					(SensoryStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSensoryStatusStatusCode() {
		OperationsTestCase<SensoryStatus> validateSensoryStatusStatusCodeTestCase = new OperationsTestCase<SensoryStatus>(
			"validateSensoryStatusStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_SENSORY_STATUS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryStatus target) {

			}

			@Override
			protected void updateToPass(SensoryStatus target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryStatusOperations.validateSensoryStatusStatusCode(
					(SensoryStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryStatusStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSensoryStatusStatusCodeP() {
		OperationsTestCase<SensoryStatus> validateSensoryStatusStatusCodePTestCase = new OperationsTestCase<SensoryStatus>(
			"validateSensoryStatusStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SENSORY_STATUS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryStatus target) {

			}

			@Override
			protected void updateToPass(SensoryStatus target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryStatusOperations.validateSensoryStatusStatusCodeP(
					(SensoryStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryStatusStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSensoryStatusEffectiveTime() {
		OperationsTestCase<SensoryStatus> validateSensoryStatusEffectiveTimeTestCase = new OperationsTestCase<SensoryStatus>(
			"validateSensoryStatusEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SENSORY_STATUS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryStatus target) {

			}

			@Override
			protected void updateToPass(SensoryStatus target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryStatusOperations.validateSensoryStatusEffectiveTime(
					(SensoryStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryStatusEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSensoryStatusValue() {
		OperationsTestCase<SensoryStatus> validateSensoryStatusValueTestCase = new OperationsTestCase<SensoryStatus>(
			"validateSensoryStatusValue",
			operationsForOCL.getOCLValue("VALIDATE_SENSORY_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryStatus target) {
				CD val = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(val);
			}

			@Override
			protected void updateToPass(SensoryStatus target) {
				target.getValues().clear();
				CD val = DatatypesFactory.eINSTANCE.createCD("11163003", SNOMEDCT_ID);
				target.getValues().add(val);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryStatusOperations.validateSensoryStatusValue(
					(SensoryStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryStatusValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSensoryStatusValueP() {
		OperationsTestCase<SensoryStatus> validateSensoryStatusValuePTestCase = new OperationsTestCase<SensoryStatus>(
			"validateSensoryStatusValueP",
			operationsForOCL.getOCLValue("VALIDATE_SENSORY_STATUS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryStatus target) {

			}

			@Override
			protected void updateToPass(SensoryStatus target) {
				target.init();
				CD val = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(val);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryStatusOperations.validateSensoryStatusValueP(
					(SensoryStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryStatusValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSensoryStatusAssessmentScaleObservation() {
		OperationsTestCase<SensoryStatus> validateSensoryStatusAssessmentScaleObservationTestCase = new OperationsTestCase<SensoryStatus>(
			"validateSensoryStatusAssessmentScaleObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_SENSORY_STATUS_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryStatus target) {
				target.init();
			}

			@Override
			protected void updateToPass(SensoryStatus target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setObservation(ConsolFactory.eINSTANCE.createAssessmentScaleObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryStatusOperations.validateSensoryStatusAssessmentScaleObservation(
					(SensoryStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryStatusAssessmentScaleObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSensoryStatusAuthorParticipation() {
		OperationsTestCase<SensoryStatus> validateSensoryStatusAuthorParticipationTestCase = new OperationsTestCase<SensoryStatus>(
			"validateSensoryStatusAuthorParticipation", operationsForOCL.getOCLValue(
				"VALIDATE_SENSORY_STATUS_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryStatus target) {
				target.init();
			}

			@Override
			protected void updateToPass(SensoryStatus target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryStatusOperations.validateSensoryStatusAuthorParticipation(
					(SensoryStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryStatusAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSensoryStatusIVLTSLow() {
		OperationsTestCase<SensoryStatus> validateSensoryStatusIVLTSLowTestCase = new OperationsTestCase<SensoryStatus>(
			"validateSensoryStatusIVLTSLow",
			operationsForOCL.getOCLValue("VALIDATE_SENSORY_STATUS_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryStatus target) {
				target.init();
				IVL_TS et = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(et);
			}

			@Override
			protected void updateToPass(SensoryStatus target) {
				target.getEffectiveTime().setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryStatusOperations.validateSensoryStatusIVLTSLow(
					(SensoryStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryStatusIVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSensoryStatusIVLTSHigh() {
		OperationsTestCase<SensoryStatus> validateSensoryStatusIVLTSHighTestCase = new OperationsTestCase<SensoryStatus>(
			"validateSensoryStatusIVLTSHigh",
			operationsForOCL.getOCLValue("VALIDATE_SENSORY_STATUS_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SensoryStatus target) {
				target.init();
				IVL_TS et = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(et);
			}

			@Override
			protected void updateToPass(SensoryStatus target) {
				target.getEffectiveTime().setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SensoryStatusOperations.validateSensoryStatusIVLTSHigh(
					(SensoryStatus) objectToTest, diagnostician, map);
			}

		};

		validateSensoryStatusIVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentScaleObservations() {

		SensoryStatus target = objectFactory.create();
		target.getAssessmentScaleObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SensoryStatusOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SensoryStatus> {
		public SensoryStatus create() {
			return ConsolFactory.eINSTANCE.createSensoryStatus();
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
	private static class ConstructorTestClass extends SensoryStatusOperations {
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

} // SensoryStatusOperations
