/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.SmokingStatusObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Smoking Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationCDCodeTermAssertionOrLoinc(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation CD Code Term Assertion Or Loinc</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationCDCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation CD Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationCDCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation CD Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationIVLTSCenter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation IVLTS Center</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationIVLTSWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation IVLTS Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SmokingStatusObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSmokingStatusObservationTemplateId() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationTemplateIdTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_SMOKING_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {

			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationTemplateId(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSmokingStatusObservationClassCode() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationClassCodeTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_SMOKING_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {

			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationClassCode(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSmokingStatusObservationMoodCode() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationMoodCodeTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_SMOKING_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {

			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationMoodCode(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSmokingStatusObservationCode() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationCodeTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {

			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationCode(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*
	* Note: This is being treated as a TS instead of an IVL_TS via nested constraints and custom messages.
	*/
	@Test
	public void testValidateSmokingStatusObservationEffectiveTime() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationEffectiveTimeTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationEffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_SMOKING_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {

			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationEffectiveTime(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSmokingStatusObservationStatusCodeP() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationStatusCodePTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationStatusCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_SMOKING_STATUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {

			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationStatusCodeP(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSmokingStatusObservationStatusCode() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationStatusCodeTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationStatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_SMOKING_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {

			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationStatusCode(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSmokingStatusObservationValueP() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationValuePTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {

			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationValueP(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSmokingStatusObservationCDCodeTermAssertionOrLoinc() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationCDCodeTermAssertionOrLoincTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationCDCodeTermAssertionOrLoinc",
			operationsForOCL.getOCLValue(
				"VALIDATE_SMOKING_STATUS_OBSERVATION_CD_CODE_TERM_ASSERTION_OR_LOINC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(SmokingStatusObservation target) {
						// code with no @code or @codeSystem
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD());
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(SmokingStatusObservation target) {
						// invalid @code
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD(BAD_CODE_VALUE, "2.16.840.1.113883.5.4"));
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(SmokingStatusObservation target) {
						// invalid @codeSystem
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("ASSERTION", BAD_CODESYSTEM_ID));
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(SmokingStatusObservation target) {
						// invalid @code and invalid @codeSystem
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD(BAD_CODE_VALUE, BAD_CODESYSTEM_ID));
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(SmokingStatusObservation target) {
						// old R1.1 way for backwards compatibility
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("ASSERTION", "2.16.840.1.113883.5.4"));
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(SmokingStatusObservation target) {
						// new R2.1 option (as per errata 596)
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("72166-2", LOINC_ID));
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationCDCodeTermAssertionOrLoinc(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationCDCodeTermAssertionOrLoincTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSmokingStatusObservationCDCode() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationCDCodeTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationCDCode",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD("mustExistOnly", BAD_CODESYSTEM_ID));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationCDCode(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationCDCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSmokingStatusObservationCDCodeSystem() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationCDCodeSystemTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationCDCodeSystem", operationsForOCL.getOCLValue(
				"VALIDATE_SMOKING_STATUS_OBSERVATION_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD(BAD_CODE_VALUE, "mustExistOnly"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationCDCodeSystem(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationCDCodeSystemTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSmokingStatusObservationIVLTSCenter() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationIVLTSCenterTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationIVLTSCenter", operationsForOCL.getOCLValue(
				"VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_CENTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				target.getEffectiveTime().setCenter(DatatypesFactory.eINSTANCE.createIVXB_TS());
			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationIVLTSCenter(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationIVLTSCenterTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSmokingStatusObservationIVLTSHigh() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationIVLTSHighTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationIVLTSHigh", operationsForOCL.getOCLValue(
				"VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				target.getEffectiveTime().setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationIVLTSHigh(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationIVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSmokingStatusObservationIVLTSLow() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationIVLTSLowTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationIVLTSLow", operationsForOCL.getOCLValue(
				"VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				target.getEffectiveTime().setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationIVLTSLow(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationIVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSmokingStatusObservationIVLTSWidth() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationIVLTSWidthTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationIVLTSWidth", operationsForOCL.getOCLValue(
				"VALIDATE_SMOKING_STATUS_OBSERVATION_IVLTS_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				target.getEffectiveTime().setWidth((DatatypesFactory.eINSTANCE.createPQ()));
			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationIVLTSWidth(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationIVLTSWidthTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSmokingStatusObservationValue() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationValueTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(SmokingStatusObservation target) {
						// empty test
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(SmokingStatusObservation target) {
						// has value but no code or codeSystem
						target.init();
						CD value = DatatypesFactory.eINSTANCE.createCD();
						target.getValues().add(value);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(SmokingStatusObservation target) {
						// invalid @codeSystem
						target.init();
						CD value = DatatypesFactory.eINSTANCE.createCD("449868002", BAD_CODESYSTEM_ID);
						target.getValues().add(value);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(SmokingStatusObservation target) {
						// invalid @code and invalid @codeSystem
						target.init();
						CD value = DatatypesFactory.eINSTANCE.createCD(BAD_CODE_VALUE, BAD_CODESYSTEM_ID);
						target.getValues().add(value);
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(SmokingStatusObservation target) {
						// code is in both old and new valueset
						target.init();
						CD value = DatatypesFactory.eINSTANCE.createCD("449868002", SNOMEDCT_ID);
						target.getValues().add(value);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(SmokingStatusObservation target) {
						// ensure code which only belongs to the new value set works (as per errata 596)
						// this is interesting because previously we had to override this value in MU2 in order to use this code because it wasn't in
						// the set. And now we are using the newer set in R1.1 as well. This mean that R1.1, R2.0, R2.1, and MU2 are now aligned.
						target.init();
						CD value = DatatypesFactory.eINSTANCE.createCD("428061000124105", SNOMEDCT_ID);
						target.getValues().add(value);
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationValue(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SmokingStatusObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SmokingStatusObservation> {
		@Override
		public SmokingStatusObservation create() {
			return ConsolFactory.eINSTANCE.createSmokingStatusObservation();
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
	private static class ConstructorTestClass extends SmokingStatusObservationOperations {
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

} // SmokingStatusObservationOperations
