
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
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
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemObservationV4Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Observation V4</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4ValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4IVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4#validateProblemObservationV4IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation V4IVLTS High</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProblemObservationV4Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemObservationV4TemplateId() {
		OperationsTestCase<ProblemObservationV4> validateProblemObservationV4TemplateIdTestCase = new OperationsTestCase<ProblemObservationV4>(
			"validateProblemObservationV4TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservationV4 target) {

			}

			@Override
			protected void updateToPass(ProblemObservationV4 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationV4Operations.validateProblemObservationV4TemplateId(
					(ProblemObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationV4TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProblemObservationV4Id() {
		OperationsTestCase<ProblemObservationV4> validateProblemObservationV4IdTestCase = new OperationsTestCase<ProblemObservationV4>(
			"validateProblemObservationV4Id",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_V4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservationV4 target) {

			}

			@Override
			protected void updateToPass(ProblemObservationV4 target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationV4Operations.validateProblemObservationV4Id(
					(ProblemObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationV4IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemObservationV4CodeP() {
		OperationsTestCase<ProblemObservationV4> validateProblemObservationV4CodePTestCase = new OperationsTestCase<ProblemObservationV4>(
			"validateProblemObservationV4CodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_V4_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservationV4 target) {

			}

			@Override
			protected void updateToPass(ProblemObservationV4 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationV4Operations.validateProblemObservationV4CodeP(
					(ProblemObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationV4CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProblemObservationV4Code() {
		OperationsTestCase<ProblemObservationV4> validateProblemObservationV4CodeTestCase = new OperationsTestCase<ProblemObservationV4>(
			"validateProblemObservationV4Code",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_V4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservationV4 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProblemObservationV4 target) {
				target.getCode().setCode("404684003");
			}

			@Override
			protected void setDependency(ProblemObservationV4 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationV4Operations.validateProblemObservationV4Code(
					(ProblemObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationV4CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemObservationV4StatusCodeP() {
		OperationsTestCase<ProblemObservationV4> validateProblemObservationV4StatusCodePTestCase = new OperationsTestCase<ProblemObservationV4>(
			"validateProblemObservationV4StatusCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_V4_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservationV4 target) {

			}

			@Override
			protected void updateToPass(ProblemObservationV4 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationV4Operations.validateProblemObservationV4StatusCodeP(
					(ProblemObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationV4StatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemObservationV4StatusCode() {
		OperationsTestCase<ProblemObservationV4> validateProblemObservationV4StatusCodeTestCase = new OperationsTestCase<ProblemObservationV4>(
			"validateProblemObservationV4StatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_V4_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservationV4 target) {

			}

			@Override
			protected void updateToPass(ProblemObservationV4 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(ProblemObservationV4 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProblemObservationV4StatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationV4Operations.validateProblemObservationV4StatusCode(
					(ProblemObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationV4StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemObservationV4EffectiveTime() {
		OperationsTestCase<ProblemObservationV4> validateProblemObservationV4EffectiveTimeTestCase = new OperationsTestCase<ProblemObservationV4>(
			"validateProblemObservationV4EffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_PROBLEM_OBSERVATION_V4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservationV4 target) {

			}

			@Override
			protected void updateToPass(ProblemObservationV4 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationV4Operations.validateProblemObservationV4EffectiveTime(
					(ProblemObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationV4EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProblemObservationV4Value() {
		OperationsTestCase<ProblemObservationV4> validateProblemObservationV4ValueTestCase = new OperationsTestCase<ProblemObservationV4>(
			"validateProblemObservationV4Value",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_V4_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservationV4 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected void updateToPass(ProblemObservationV4 target) {
				target.getValues().clear();
				CD value = DatatypesFactory.eINSTANCE.createCD("c", "2.16.840.1.113883.6.96");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationV4Operations.validateProblemObservationV4Value(
					(ProblemObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationV4ValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProblemObservationV4ValueP() {
		OperationsTestCase<ProblemObservationV4> validateProblemObservationV4ValuePTestCase = new OperationsTestCase<ProblemObservationV4>(
			"validateProblemObservationV4ValueP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_V4_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservationV4 target) {

			}

			@Override
			protected void updateToPass(ProblemObservationV4 target) {
				target.init();
				target.getValues().clear();
				CD value = DatatypesFactory.eINSTANCE.createCD("c", "2.16.840.1.113883.6.96");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationV4Operations.validateProblemObservationV4ValueP(
					(ProblemObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationV4ValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemObservationV4ClassCode() {
		OperationsTestCase<ProblemObservationV4> validateProblemObservationV4ClassCodeTestCase = new OperationsTestCase<ProblemObservationV4>(
			"validateProblemObservationV4ClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_V4_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservationV4 target) {

			}

			@Override
			protected void updateToPass(ProblemObservationV4 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationV4Operations.validateProblemObservationV4ClassCode(
					(ProblemObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationV4ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemObservationV4MoodCode() {
		OperationsTestCase<ProblemObservationV4> validateProblemObservationV4MoodCodeTestCase = new OperationsTestCase<ProblemObservationV4>(
			"validateProblemObservationV4MoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_V4_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservationV4 target) {

			}

			@Override
			protected void updateToPass(ProblemObservationV4 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationV4Operations.validateProblemObservationV4MoodCode(
					(ProblemObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationV4MoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemObservationV4IVLTSLow() {
		OperationsTestCase<ProblemObservationV4> validateProblemObservationV4IVLTSLowTestCase = new OperationsTestCase<ProblemObservationV4>(
			"validateProblemObservationV4IVLTSLow",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_V4IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservationV4 target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());

			}

			@Override
			protected void updateToPass(ProblemObservationV4 target) {

				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("2002", "2023"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationV4Operations.validateProblemObservationV4IVLTSLow(
					(ProblemObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationV4IVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemObservationV4IVLTSHigh() {
		OperationsTestCase<ProblemObservationV4> validateProblemObservationV4IVLTSHighTestCase = new OperationsTestCase<ProblemObservationV4>(
			"validateProblemObservationV4IVLTSHigh",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_V4IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservationV4 target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());

			}

			@Override
			protected void updateToPass(ProblemObservationV4 target) {

				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("2002", "2023"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationV4Operations.validateProblemObservationV4IVLTSHigh(
					(ProblemObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationV4IVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProblemObservationV4Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ProblemObservationV4> {
		public ProblemObservationV4 create() {
			return ConsolFactory.eINSTANCE.createProblemObservationV4();
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
	private static class ConstructorTestClass extends ProblemObservationV4Operations {
	}

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

} // ProblemObservationV4Operations
