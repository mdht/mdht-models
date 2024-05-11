
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
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AssessmentScaleSupportingObservationV2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assessment Scale Supporting Observation V2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2#validateAssessmentScaleSupportingObservationV2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2#validateAssessmentScaleSupportingObservationV2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2#validateAssessmentScaleSupportingObservationV2StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2#validateAssessmentScaleSupportingObservationV2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2#validateAssessmentScaleSupportingObservationV2ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2#validateAssessmentScaleSupportingObservationV2MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2#validateAssessmentScaleSupportingObservationV2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2#validateAssessmentScaleSupportingObservationV2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2#validateAssessmentScaleSupportingObservationV2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation V2 Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AssessmentScaleSupportingObservationV2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	// @Test
	//
	// public void testValidateAssessmentScaleSupportingObservationV2CodeCodeSystem() {
	// OperationsTestCase<AssessmentScaleSupportingObservationV2> validateAssessmentScaleSupportingObservationV2CodeCodeSystemTestCase = new
	// OperationsTestCase<AssessmentScaleSupportingObservationV2>(
	// "validateAssessmentScaleSupportingObservationV2CodeCodeSystem",
	// operationsForOCL.getOCLValue(
	// "VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(AssessmentScaleSupportingObservationV2 target) {
	//
	// }
	//
	// @Override
	// protected void updateToPass(AssessmentScaleSupportingObservationV2 target) {
	// target.init();
	// target.setCode(DatatypesFactory.eINSTANCE.createCD(BAD_CODE_VALUE, "2.16.840.1.113883.6.1"));
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return AssessmentScaleSupportingObservationV2Operations.validateAssessmentScaleSupportingObservationV2CodeCodeSystem(
	// (AssessmentScaleSupportingObservationV2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateAssessmentScaleSupportingObservationV2CodeCodeSystemTestCase.doValidationTest();
	// }

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentScaleSupportingObservationV2TemplateId() {
		OperationsTestCase<AssessmentScaleSupportingObservationV2> validateAssessmentScaleSupportingObservationV2TemplateIdTestCase = new OperationsTestCase<AssessmentScaleSupportingObservationV2>(
			"validateAssessmentScaleSupportingObservationV2TemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleSupportingObservationV2 target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleSupportingObservationV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleSupportingObservationV2Operations.validateAssessmentScaleSupportingObservationV2TemplateId(
					(AssessmentScaleSupportingObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleSupportingObservationV2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateAssessmentScaleSupportingObservationV2Id() {
		OperationsTestCase<AssessmentScaleSupportingObservationV2> validateAssessmentScaleSupportingObservationV2IdTestCase = new OperationsTestCase<AssessmentScaleSupportingObservationV2>(
			"validateAssessmentScaleSupportingObservationV2Id",
			operationsForOCL.getOCLValue(
				"VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleSupportingObservationV2 target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleSupportingObservationV2 target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleSupportingObservationV2Operations.validateAssessmentScaleSupportingObservationV2Id(
					(AssessmentScaleSupportingObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleSupportingObservationV2IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentScaleSupportingObservationV2StatusCodeP() {
		OperationsTestCase<AssessmentScaleSupportingObservationV2> validateAssessmentScaleSupportingObservationV2StatusCodePTestCase = new OperationsTestCase<AssessmentScaleSupportingObservationV2>(
			"validateAssessmentScaleSupportingObservationV2StatusCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleSupportingObservationV2 target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleSupportingObservationV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleSupportingObservationV2Operations.validateAssessmentScaleSupportingObservationV2StatusCodeP(
					(AssessmentScaleSupportingObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleSupportingObservationV2StatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentScaleSupportingObservationV2StatusCode() {
		OperationsTestCase<AssessmentScaleSupportingObservationV2> validateAssessmentScaleSupportingObservationV2StatusCodeTestCase = new OperationsTestCase<AssessmentScaleSupportingObservationV2>(
			"validateAssessmentScaleSupportingObservationV2StatusCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleSupportingObservationV2 target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleSupportingObservationV2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(AssessmentScaleSupportingObservationV2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put(
					"org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2StatusCodeP",
					passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleSupportingObservationV2Operations.validateAssessmentScaleSupportingObservationV2StatusCode(
					(AssessmentScaleSupportingObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleSupportingObservationV2StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentScaleSupportingObservationV2Value() {
		OperationsTestCase<AssessmentScaleSupportingObservationV2> validateAssessmentScaleSupportingObservationV2ValueTestCase = new OperationsTestCase<AssessmentScaleSupportingObservationV2>(
			"validateAssessmentScaleSupportingObservationV2Value",
			operationsForOCL.getOCLValue(
				"VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleSupportingObservationV2 target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleSupportingObservationV2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleSupportingObservationV2Operations.validateAssessmentScaleSupportingObservationV2Value(
					(AssessmentScaleSupportingObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleSupportingObservationV2ValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentScaleSupportingObservationV2CodeP() {
		OperationsTestCase<AssessmentScaleSupportingObservationV2> validateAssessmentScaleSupportingObservationV2CodePTestCase = new OperationsTestCase<AssessmentScaleSupportingObservationV2>(
			"validateAssessmentScaleSupportingObservationV2CodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleSupportingObservationV2 target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleSupportingObservationV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleSupportingObservationV2Operations.validateAssessmentScaleSupportingObservationV2CodeP(
					(AssessmentScaleSupportingObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleSupportingObservationV2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentScaleSupportingObservationV2Code() {
		OperationsTestCase<AssessmentScaleSupportingObservationV2> validateAssessmentScaleSupportingObservationV2CodeTestCase = new OperationsTestCase<AssessmentScaleSupportingObservationV2>(
			"validateAssessmentScaleSupportingObservationV2Code",
			operationsForOCL.getOCLValue(
				"VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleSupportingObservationV2 target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleSupportingObservationV2 target) {
				target.init();

			}

			@Override
			protected void setDependency(AssessmentScaleSupportingObservationV2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put(
					"org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservationV2CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleSupportingObservationV2Operations.validateAssessmentScaleSupportingObservationV2Code(
					(AssessmentScaleSupportingObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleSupportingObservationV2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentScaleSupportingObservationV2ClassCode() {
		OperationsTestCase<AssessmentScaleSupportingObservationV2> validateAssessmentScaleSupportingObservationV2ClassCodeTestCase = new OperationsTestCase<AssessmentScaleSupportingObservationV2>(
			"validateAssessmentScaleSupportingObservationV2ClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleSupportingObservationV2 target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleSupportingObservationV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleSupportingObservationV2Operations.validateAssessmentScaleSupportingObservationV2ClassCode(
					(AssessmentScaleSupportingObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleSupportingObservationV2ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentScaleSupportingObservationV2MoodCode() {
		OperationsTestCase<AssessmentScaleSupportingObservationV2> validateAssessmentScaleSupportingObservationV2MoodCodeTestCase = new OperationsTestCase<AssessmentScaleSupportingObservationV2>(
			"validateAssessmentScaleSupportingObservationV2MoodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleSupportingObservationV2 target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleSupportingObservationV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleSupportingObservationV2Operations.validateAssessmentScaleSupportingObservationV2MoodCode(
					(AssessmentScaleSupportingObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleSupportingObservationV2MoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AssessmentScaleSupportingObservationV2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<AssessmentScaleSupportingObservationV2> {
		public AssessmentScaleSupportingObservationV2 create() {
			return ConsolFactory.eINSTANCE.createAssessmentScaleSupportingObservationV2();
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
	private static class ConstructorTestClass extends AssessmentScaleSupportingObservationV2Operations {
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

} // AssessmentScaleSupportingObservationV2Operations
