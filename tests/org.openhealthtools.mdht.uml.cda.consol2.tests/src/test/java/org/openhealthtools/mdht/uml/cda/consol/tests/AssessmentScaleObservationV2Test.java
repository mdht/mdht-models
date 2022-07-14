
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AssessmentScaleObservationV2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assessment Scale Observation V2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2DerivationExpr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Derivation Expr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2InterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservationV2#validateAssessmentScaleObservationV2ReferenceRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation V2 Reference Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AssessmentScaleObservationV2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentScaleObservationV2TemplateId() {
		OperationsTestCase<AssessmentScaleObservationV2> validateAssessmentScaleObservationV2TemplateIdTestCase = new OperationsTestCase<AssessmentScaleObservationV2>(
			"validateAssessmentScaleObservationV2TemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservationV2 target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservationV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationV2Operations.validateAssessmentScaleObservationV2TemplateId(
					(AssessmentScaleObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationV2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateAssessmentScaleObservationV2Id() {
		OperationsTestCase<AssessmentScaleObservationV2> validateAssessmentScaleObservationV2IdTestCase = new OperationsTestCase<AssessmentScaleObservationV2>(
			"validateAssessmentScaleObservationV2Id",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservationV2 target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservationV2 target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationV2Operations.validateAssessmentScaleObservationV2Id(
					(AssessmentScaleObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationV2IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentScaleObservationV2CodeP() {
		OperationsTestCase<AssessmentScaleObservationV2> validateAssessmentScaleObservationV2CodePTestCase = new OperationsTestCase<AssessmentScaleObservationV2>(
			"validateAssessmentScaleObservationV2CodeP", operationsForOCL.getOCLValue(
				"VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservationV2 target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservationV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationV2Operations.validateAssessmentScaleObservationV2CodeP(
					(AssessmentScaleObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationV2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateAssessmentScaleObservationV2Code() {
		OperationsTestCase<AssessmentScaleObservationV2> validateAssessmentScaleObservationV2CodeTestCase = new OperationsTestCase<AssessmentScaleObservationV2>(
			"validateAssessmentScaleObservationV2Code", operationsForOCL.getOCLValue(
				"VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservationV2 target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservationV2 target) {
				target.init();
				// target.setCode(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationV2Operations.validateAssessmentScaleObservationV2Code(
					(AssessmentScaleObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationV2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateAssessmentScaleObservationV2DerivationExpr() {
		OperationsTestCase<AssessmentScaleObservationV2> validateAssessmentScaleObservationV2DerivationExprTestCase = new OperationsTestCase<AssessmentScaleObservationV2>(
			"validateAssessmentScaleObservationV2DerivationExpr",
			operationsForOCL.getOCLValue(
				"VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_DERIVATION_EXPR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservationV2 target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservationV2 target) {
				target.init();
				target.setDerivationExpr(DatatypesFactory.eINSTANCE.createST());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationV2Operations.validateAssessmentScaleObservationV2DerivationExpr(
					(AssessmentScaleObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationV2DerivationExprTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentScaleObservationV2StatusCodeP() {
		OperationsTestCase<AssessmentScaleObservationV2> validateAssessmentScaleObservationV2StatusCodePTestCase = new OperationsTestCase<AssessmentScaleObservationV2>(
			"validateAssessmentScaleObservationV2StatusCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservationV2 target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservationV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationV2Operations.validateAssessmentScaleObservationV2StatusCodeP(
					(AssessmentScaleObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationV2StatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateAssessmentScaleObservationV2StatusCode() {
		OperationsTestCase<AssessmentScaleObservationV2> validateAssessmentScaleObservationV2StatusCodeTestCase = new OperationsTestCase<AssessmentScaleObservationV2>(
			"validateAssessmentScaleObservationV2StatusCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservationV2 target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservationV2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationV2Operations.validateAssessmentScaleObservationV2StatusCode(
					(AssessmentScaleObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationV2StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateAssessmentScaleObservationV2EffectiveTime() {
		OperationsTestCase<AssessmentScaleObservationV2> validateAssessmentScaleObservationV2EffectiveTimeTestCase = new OperationsTestCase<AssessmentScaleObservationV2>(
			"validateAssessmentScaleObservationV2EffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservationV2 target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservationV2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationV2Operations.validateAssessmentScaleObservationV2EffectiveTime(
					(AssessmentScaleObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationV2EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateAssessmentScaleObservationV2Value() {
		OperationsTestCase<AssessmentScaleObservationV2> validateAssessmentScaleObservationV2ValueTestCase = new OperationsTestCase<AssessmentScaleObservationV2>(
			"validateAssessmentScaleObservationV2Value", operationsForOCL.getOCLValue(
				"VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(AssessmentScaleObservationV2 target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservationV2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationV2Operations.validateAssessmentScaleObservationV2Value(
					(AssessmentScaleObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationV2ValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateAssessmentScaleObservationV2InterpretationCode() {
		OperationsTestCase<AssessmentScaleObservationV2> validateAssessmentScaleObservationV2InterpretationCodeTestCase = new OperationsTestCase<AssessmentScaleObservationV2>(
			"validateAssessmentScaleObservationV2InterpretationCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservationV2 target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservationV2 target) {
				target.init();
				target.getInterpretationCodes().add(DatatypesFactory.eINSTANCE.createCE());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationV2Operations.validateAssessmentScaleObservationV2InterpretationCode(
					(AssessmentScaleObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationV2InterpretationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentScaleObservationV2ClassCode() {
		OperationsTestCase<AssessmentScaleObservationV2> validateAssessmentScaleObservationV2ClassCodeTestCase = new OperationsTestCase<AssessmentScaleObservationV2>(
			"validateAssessmentScaleObservationV2ClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservationV2 target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservationV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationV2Operations.validateAssessmentScaleObservationV2ClassCode(
					(AssessmentScaleObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationV2ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentScaleObservationV2MoodCode() {
		OperationsTestCase<AssessmentScaleObservationV2> validateAssessmentScaleObservationV2MoodCodeTestCase = new OperationsTestCase<AssessmentScaleObservationV2>(
			"validateAssessmentScaleObservationV2MoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservationV2 target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservationV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationV2Operations.validateAssessmentScaleObservationV2MoodCode(
					(AssessmentScaleObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationV2MoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateAssessmentScaleObservationV2ReferenceRange() {
		OperationsTestCase<AssessmentScaleObservationV2> validateAssessmentScaleObservationV2ReferenceRangeTestCase = new OperationsTestCase<AssessmentScaleObservationV2>(
			"validateAssessmentScaleObservationV2ReferenceRange",
			operationsForOCL.getOCLValue(
				"VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservationV2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(AssessmentScaleObservationV2 target) {
				target.getReferenceRanges().add(CDAFactory.eINSTANCE.createReferenceRange());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationV2Operations.validateAssessmentScaleObservationV2ReferenceRange(
					(AssessmentScaleObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationV2ReferenceRangeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	// @Test
	//
	// public void testValidateAssessmentScaleObservationV2AssessmentScaleSupportingObservation() {
	// OperationsTestCase<AssessmentScaleObservationV2> validateAssessmentScaleObservationV2AssessmentScaleSupportingObservationTestCase = new
	// OperationsTestCase<AssessmentScaleObservationV2>(
	// "validateAssessmentScaleObservationV2AssessmentScaleSupportingObservation",
	// operationsForOCL.getOCLValue(
	// "VALIDATE_ASSESSMENT_SCALE_OBSERVATION_V2_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(AssessmentScaleObservationV2 target) {
	//
	// }
	//
	// @Override
	// protected void updateToPass(AssessmentScaleObservationV2 target) {
	// target.init();
	// target.addObservation(ConsolFactory.eINSTANCE.createAssessmentScaleSupportingObservation().init());
	// for (org.eclipse.mdht.uml.cda.EntryRelationship er : target.getEntryRelationships()) {
	// er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
	// }
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return AssessmentScaleObservationV2Operations.validateAssessmentScaleObservationV2AssessmentScaleSupportingObservation(
	// (AssessmentScaleObservationV2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateAssessmentScaleObservationV2AssessmentScaleSupportingObservationTestCase.doValidationTest();
	// }

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AssessmentScaleObservationV2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<AssessmentScaleObservationV2> {
		public AssessmentScaleObservationV2 create() {
			return ConsolFactory.eINSTANCE.createAssessmentScaleObservationV2();
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
	private static class ConstructorTestClass extends AssessmentScaleObservationV2Operations {
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

} // AssessmentScaleObservationV2Operations
