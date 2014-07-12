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
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.MentalStatusObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mental Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationAssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#validateMentalStatusObservationAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Observation Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation#getAssessmentScaleObservations() <em>Get Assessment Scale Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MentalStatusObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusObservationTemplateId() {
		OperationsTestCase<MentalStatusObservation> validateMentalStatusObservationTemplateIdTestCase = new OperationsTestCase<MentalStatusObservation>(
			"validateMentalStatusObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservationOperations.validateMentalStatusObservationTemplateId(
					(MentalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusObservationClassCode() {
		OperationsTestCase<MentalStatusObservation> validateMentalStatusObservationClassCodeTestCase = new OperationsTestCase<MentalStatusObservation>(
			"validateMentalStatusObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservationOperations.validateMentalStatusObservationClassCode(
					(MentalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusObservationMoodCode() {
		OperationsTestCase<MentalStatusObservation> validateMentalStatusObservationMoodCodeTestCase = new OperationsTestCase<MentalStatusObservation>(
			"validateMentalStatusObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservationOperations.validateMentalStatusObservationMoodCode(
					(MentalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusObservationId() {
		OperationsTestCase<MentalStatusObservation> validateMentalStatusObservationIdTestCase = new OperationsTestCase<MentalStatusObservation>(
			"validateMentalStatusObservationId",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservationOperations.validateMentalStatusObservationId(
					(MentalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusObservationCodeP() {
		OperationsTestCase<MentalStatusObservation> validateMentalStatusObservationCodePTestCase = new OperationsTestCase<MentalStatusObservation>(
			"validateMentalStatusObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservationOperations.validateMentalStatusObservationCodeP(
					(MentalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusObservationCode() {
		OperationsTestCase<MentalStatusObservation> validateMentalStatusObservationCodeTestCase = new OperationsTestCase<MentalStatusObservation>(
			"validateMentalStatusObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				cd.setCode("285231000");
				cd.setCodeSystem("2.16.840.1.113883.6.96");
				target.setCode(cd);
			}

			@Override
			protected void setDependency(MentalStatusObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservationOperations.validateMentalStatusObservationCode(
					(MentalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusObservationStatusCode() {
		OperationsTestCase<MentalStatusObservation> validateMentalStatusObservationStatusCodeTestCase = new OperationsTestCase<MentalStatusObservation>(
			"validateMentalStatusObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservationOperations.validateMentalStatusObservationStatusCode(
					(MentalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusObservationStatusCodeP() {
		OperationsTestCase<MentalStatusObservation> validateMentalStatusObservationStatusCodePTestCase = new OperationsTestCase<MentalStatusObservation>(
			"validateMentalStatusObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservationOperations.validateMentalStatusObservationStatusCodeP(
					(MentalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusObservationEffectiveTime() {
		OperationsTestCase<MentalStatusObservation> validateMentalStatusObservationEffectiveTimeTestCase = new OperationsTestCase<MentalStatusObservation>(
			"validateMentalStatusObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservationOperations.validateMentalStatusObservationEffectiveTime(
					(MentalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusObservationValue() {
		OperationsTestCase<MentalStatusObservation> validateMentalStatusObservationValueTestCase = new OperationsTestCase<MentalStatusObservation>(
			"validateMentalStatusObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setCode("11163003");
				value.setCodeSystem("2.16.840.1.113883.6.96");
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservationOperations.validateMentalStatusObservationValue(
					(MentalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusObservationValueP() {
		OperationsTestCase<MentalStatusObservation> validateMentalStatusObservationValuePTestCase = new OperationsTestCase<MentalStatusObservation>(
			"validateMentalStatusObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservationOperations.validateMentalStatusObservationValueP(
					(MentalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusObservationAssessmentScaleObservation() {
		OperationsTestCase<MentalStatusObservation> validateMentalStatusObservationAssessmentScaleObservationTestCase = new OperationsTestCase<MentalStatusObservation>(
			"validateMentalStatusObservationAssessmentScaleObservation",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation target) {

			}

			@Override
			protected void updateToPass(MentalStatusObservation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setObservation(ConsolFactory.eINSTANCE.createAssessmentScaleObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservationOperations.validateMentalStatusObservationAssessmentScaleObservation(
					(MentalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservationAssessmentScaleObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMentalStatusObservationAuthorParticipation() {
		OperationsTestCase<MentalStatusObservation> validateMentalStatusObservationAuthorParticipationTestCase = new OperationsTestCase<MentalStatusObservation>(
			"validateMentalStatusObservationAuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(MentalStatusObservation target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusObservationOperations.validateMentalStatusObservationAuthorParticipation(
					(MentalStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusObservationAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentScaleObservations() {

		MentalStatusObservation target = objectFactory.create();
		target.getAssessmentScaleObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MentalStatusObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MentalStatusObservation> {
		public MentalStatusObservation create() {
			return ConsolFactory.eINSTANCE.createMentalStatusObservation();
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
	private static class ConstructorTestClass extends MentalStatusObservationOperations {
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

} // MentalStatusObservationOperations
