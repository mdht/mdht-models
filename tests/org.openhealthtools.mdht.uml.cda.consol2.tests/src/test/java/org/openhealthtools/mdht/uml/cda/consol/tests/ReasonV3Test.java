
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
import org.openhealthtools.mdht.uml.cda.consol.ReasonV3;
import org.openhealthtools.mdht.uml.cda.consol.operations.ReasonV3Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reason V3</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonV3#validateReasonV3Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason V3 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonV3#validateReasonV3CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason V3 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonV3#validateReasonV3Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason V3 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonV3#validateReasonV3StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason V3 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonV3#validateReasonV3StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason V3 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonV3#validateReasonV3EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason V3 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonV3#validateReasonV3Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason V3 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonV3#validateReasonV3ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason V3 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonV3#validateReasonV3MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason V3 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonV3#validateReasonV3IVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason V3IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonV3#validateReasonV3IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason V3IVLTS High</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ReasonV3Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateReasonV3Id() {
		OperationsTestCase<ReasonV3> validateReasonV3IdTestCase = new OperationsTestCase<ReasonV3>(
			"validateReasonV3Id", operationsForOCL.getOCLValue("VALIDATE_REASON_V3_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonV3 target) {

			}

			@Override
			protected void updateToPass(ReasonV3 target) {
				target.init();
				target.getIds().add(THE_BAD_II);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonV3Operations.validateReasonV3Id((ReasonV3) objectToTest, diagnostician, map);
			}

		};

		validateReasonV3IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReasonV3CodeP() {
		OperationsTestCase<ReasonV3> validateReasonV3CodePTestCase = new OperationsTestCase<ReasonV3>(
			"validateReasonV3CodeP",
			operationsForOCL.getOCLValue("VALIDATE_REASON_V3_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ReasonV3 target) {

			}

			@Override
			protected void updateToPass(ReasonV3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonV3Operations.validateReasonV3CodeP((ReasonV3) objectToTest, diagnostician, map);
			}

		};

		validateReasonV3CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReasonV3Code() {
		OperationsTestCase<ReasonV3> validateReasonV3CodeTestCase = new OperationsTestCase<ReasonV3>(
			"validateReasonV3Code",
			operationsForOCL.getOCLValue("VALIDATE_REASON_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ReasonV3 target) {

			}

			@Override
			protected void updateToPass(ReasonV3 target) {
				target.init();

			}

			@Override
			protected void setDependency(ReasonV3 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ReasonV3CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonV3Operations.validateReasonV3Code((ReasonV3) objectToTest, diagnostician, map);
			}

		};

		validateReasonV3CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReasonV3StatusCodeP() {
		OperationsTestCase<ReasonV3> validateReasonV3StatusCodePTestCase = new OperationsTestCase<ReasonV3>(
			"validateReasonV3StatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_REASON_V3_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonV3 target) {

			}

			@Override
			protected void updateToPass(ReasonV3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonV3Operations.validateReasonV3StatusCodeP((ReasonV3) objectToTest, diagnostician, map);
			}

		};

		validateReasonV3StatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReasonV3StatusCode() {
		OperationsTestCase<ReasonV3> validateReasonV3StatusCodeTestCase = new OperationsTestCase<ReasonV3>(
			"validateReasonV3StatusCode",
			operationsForOCL.getOCLValue("VALIDATE_REASON_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonV3 target) {

			}

			@Override
			protected void updateToPass(ReasonV3 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonV3Operations.validateReasonV3StatusCode((ReasonV3) objectToTest, diagnostician, map);
			}

		};

		validateReasonV3StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReasonV3EffectiveTime() {
		OperationsTestCase<ReasonV3> validateReasonV3EffectiveTimeTestCase = new OperationsTestCase<ReasonV3>(
			"validateReasonV3EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_REASON_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonV3 target) {

			}

			@Override
			protected void updateToPass(ReasonV3 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonV3Operations.validateReasonV3EffectiveTime((ReasonV3) objectToTest, diagnostician, map);
			}

		};

		validateReasonV3EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReasonV3Value() {
		OperationsTestCase<ReasonV3> validateReasonV3ValueTestCase = new OperationsTestCase<ReasonV3>(
			"validateReasonV3Value",
			operationsForOCL.getOCLValue("VALIDATE_REASON_V3_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ReasonV3 target) {

			}

			@Override
			protected void updateToPass(ReasonV3 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonV3Operations.validateReasonV3Value((ReasonV3) objectToTest, diagnostician, map);
			}

		};

		validateReasonV3ValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReasonV3ClassCode() {
		OperationsTestCase<ReasonV3> validateReasonV3ClassCodeTestCase = new OperationsTestCase<ReasonV3>(
			"validateReasonV3ClassCode",
			operationsForOCL.getOCLValue("VALIDATE_REASON_V3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonV3 target) {

			}

			@Override
			protected void updateToPass(ReasonV3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonV3Operations.validateReasonV3ClassCode((ReasonV3) objectToTest, diagnostician, map);
			}

		};

		validateReasonV3ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReasonV3MoodCode() {
		OperationsTestCase<ReasonV3> validateReasonV3MoodCodeTestCase = new OperationsTestCase<ReasonV3>(
			"validateReasonV3MoodCode",
			operationsForOCL.getOCLValue("VALIDATE_REASON_V3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonV3 target) {

			}

			@Override
			protected void updateToPass(ReasonV3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonV3Operations.validateReasonV3MoodCode((ReasonV3) objectToTest, diagnostician, map);
			}

		};

		validateReasonV3MoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateReasonV3IVLTSLow() {
		OperationsTestCase<ReasonV3> validateReasonV3IVLTSLowTestCase = new OperationsTestCase<ReasonV3>(
			"validateReasonV3IVLTSLow",
			operationsForOCL.getOCLValue("VALIDATE_REASON_V3IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonV3 target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(ReasonV3 target) {
				target.getEffectiveTime().setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonV3Operations.validateReasonV3IVLTSLow((ReasonV3) objectToTest, diagnostician, map);
			}

		};

		validateReasonV3IVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateReasonV3IVLTSHigh() {
		OperationsTestCase<ReasonV3> validateReasonV3IVLTSHighTestCase = new OperationsTestCase<ReasonV3>(
			"validateReasonV3IVLTSHigh",
			operationsForOCL.getOCLValue("VALIDATE_REASON_V3IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonV3 target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(ReasonV3 target) {
				target.getEffectiveTime().setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonV3Operations.validateReasonV3IVLTSHigh((ReasonV3) objectToTest, diagnostician, map);
			}

		};

		validateReasonV3IVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ReasonV3Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ReasonV3> {
		public ReasonV3 create() {
			return ConsolFactory.eINSTANCE.createReasonV3();
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
	private static class ConstructorTestClass extends ReasonV3Operations {
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

} // ReasonV3Operations
