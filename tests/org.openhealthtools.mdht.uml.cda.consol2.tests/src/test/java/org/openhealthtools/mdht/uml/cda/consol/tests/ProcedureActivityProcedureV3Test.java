
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityProcedureV3Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity Procedure V3</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3#validateProcedureActivityProcedureV3TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3#validateProcedureActivityProcedureV3Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3#validateProcedureActivityProcedureV3Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3#validateProcedureActivityProcedureV3StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3#validateProcedureActivityProcedureV3StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3#validateProcedureActivityProcedureV3EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3#validateProcedureActivityProcedureV3PriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3#validateProcedureActivityProcedureV3MethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3#validateProcedureActivityProcedureV3TargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3#validateProcedureActivityProcedureV3ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3#validateProcedureActivityProcedureV3MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure V3 Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureActivityProcedureV3Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityProcedureV3TemplateId() {
		OperationsTestCase<ProcedureActivityProcedureV3> validateProcedureActivityProcedureV3TemplateIdTestCase = new OperationsTestCase<ProcedureActivityProcedureV3>(
			"validateProcedureActivityProcedureV3TemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedureV3 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedureV3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureV3Operations.validateProcedureActivityProcedureV3TemplateId(
					(ProcedureActivityProcedureV3) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureV3TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProcedureActivityProcedureV3Id() {
		OperationsTestCase<ProcedureActivityProcedureV3> validateProcedureActivityProcedureV3IdTestCase = new OperationsTestCase<ProcedureActivityProcedureV3>(
			"validateProcedureActivityProcedureV3Id",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedureV3 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedureV3 target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureV3Operations.validateProcedureActivityProcedureV3Id(
					(ProcedureActivityProcedureV3) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureV3IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProcedureActivityProcedureV3Code() {
		OperationsTestCase<ProcedureActivityProcedureV3> validateProcedureActivityProcedureV3CodeTestCase = new OperationsTestCase<ProcedureActivityProcedureV3>(
			"validateProcedureActivityProcedureV3Code", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedureV3 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedureV3 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureV3Operations.validateProcedureActivityProcedureV3Code(
					(ProcedureActivityProcedureV3) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureV3CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProcedureActivityProcedureV3StatusCodeP() {
		OperationsTestCase<ProcedureActivityProcedureV3> validateProcedureActivityProcedureV3StatusCodePTestCase = new OperationsTestCase<ProcedureActivityProcedureV3>(
			"validateProcedureActivityProcedureV3StatusCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedureV3 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedureV3 target) {
				target.init();
				target.setStatusCode(DatatypesFactory.eINSTANCE.createCS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureV3Operations.validateProcedureActivityProcedureV3StatusCodeP(
					(ProcedureActivityProcedureV3) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureV3StatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityProcedureV3StatusCode() {
		OperationsTestCase<ProcedureActivityProcedureV3> validateProcedureActivityProcedureV3StatusCodeTestCase = new OperationsTestCase<ProcedureActivityProcedureV3>(
			"validateProcedureActivityProcedureV3StatusCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedureV3 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedureV3 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(ProcedureActivityProcedureV3 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureV3StatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureV3Operations.validateProcedureActivityProcedureV3StatusCode(
					(ProcedureActivityProcedureV3) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureV3StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityProcedureV3EffectiveTime() {
		OperationsTestCase<ProcedureActivityProcedureV3> validateProcedureActivityProcedureV3EffectiveTimeTestCase = new OperationsTestCase<ProcedureActivityProcedureV3>(
			"validateProcedureActivityProcedureV3EffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedureV3 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedureV3 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureV3Operations.validateProcedureActivityProcedureV3EffectiveTime(
					(ProcedureActivityProcedureV3) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureV3EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProcedureActivityProcedureV3PriorityCode() {
		OperationsTestCase<ProcedureActivityProcedureV3> validateProcedureActivityProcedureV3PriorityCodeTestCase = new OperationsTestCase<ProcedureActivityProcedureV3>(
			"validateProcedureActivityProcedureV3PriorityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedureV3 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedureV3 target) {
				target.init();
				target.setPriorityCode(DatatypesFactory.eINSTANCE.createCE());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureV3Operations.validateProcedureActivityProcedureV3PriorityCode(
					(ProcedureActivityProcedureV3) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureV3PriorityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProcedureActivityProcedureV3MethodCode() {
		OperationsTestCase<ProcedureActivityProcedureV3> validateProcedureActivityProcedureV3MethodCodeTestCase = new OperationsTestCase<ProcedureActivityProcedureV3>(
			"validateProcedureActivityProcedureV3MethodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedureV3 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedureV3 target) {
				target.init();
				target.getMethodCodes().add(DatatypesFactory.eINSTANCE.createCE());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureV3Operations.validateProcedureActivityProcedureV3MethodCode(
					(ProcedureActivityProcedureV3) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureV3MethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProcedureActivityProcedureV3TargetSiteCode() {
		OperationsTestCase<ProcedureActivityProcedureV3> validateProcedureActivityProcedureV3TargetSiteCodeTestCase = new OperationsTestCase<ProcedureActivityProcedureV3>(
			"validateProcedureActivityProcedureV3TargetSiteCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedureV3 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedureV3 target) {
				target.init();
				target.getTargetSiteCodes().add(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureV3Operations.validateProcedureActivityProcedureV3TargetSiteCode(
					(ProcedureActivityProcedureV3) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureV3TargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityProcedureV3ClassCode() {
		OperationsTestCase<ProcedureActivityProcedureV3> validateProcedureActivityProcedureV3ClassCodeTestCase = new OperationsTestCase<ProcedureActivityProcedureV3>(
			"validateProcedureActivityProcedureV3ClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedureV3 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedureV3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureV3Operations.validateProcedureActivityProcedureV3ClassCode(
					(ProcedureActivityProcedureV3) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureV3ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProcedureActivityProcedureV3MoodCode() {
		OperationsTestCase<ProcedureActivityProcedureV3> validateProcedureActivityProcedureV3MoodCodeTestCase = new OperationsTestCase<ProcedureActivityProcedureV3>(
			"validateProcedureActivityProcedureV3MoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_V3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedureV3 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedureV3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureV3Operations.validateProcedureActivityProcedureV3MoodCode(
					(ProcedureActivityProcedureV3) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureV3MoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureActivityProcedureV3Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureActivityProcedureV3> {
		public ProcedureActivityProcedureV3 create() {
			return ConsolFactory.eINSTANCE.createProcedureActivityProcedureV3();
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
	private static class ConstructorTestClass extends ProcedureActivityProcedureV3Operations {
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

} // ProcedureActivityProcedureV3Operations
