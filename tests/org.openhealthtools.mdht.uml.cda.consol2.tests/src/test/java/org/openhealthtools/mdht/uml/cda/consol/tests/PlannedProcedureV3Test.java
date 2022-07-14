
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.vocab.x_DocumentProcedureMood;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureV3;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedProcedureV3Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Procedure V3</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureV3#validatePlannedProcedureV3TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureV3#validatePlannedProcedureV3Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureV3#validatePlannedProcedureV3Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureV3#validatePlannedProcedureV3StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureV3#validatePlannedProcedureV3StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureV3#validatePlannedProcedureV3EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureV3#validatePlannedProcedureV3MethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureV3#validatePlannedProcedureV3TargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureV3#validatePlannedProcedureV3ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureV3#validatePlannedProcedureV3MoodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Mood Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureV3#validatePlannedProcedureV3MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure V3 Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlannedProcedureV3Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedProcedureV3TemplateId() {
		OperationsTestCase<PlannedProcedureV3> validatePlannedProcedureV3TemplateIdTestCase = new OperationsTestCase<PlannedProcedureV3>(
			"validatePlannedProcedureV3TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE_V3_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedureV3 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedureV3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedureV3Operations.validatePlannedProcedureV3TemplateId(
					(PlannedProcedureV3) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedureV3TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidatePlannedProcedureV3Id() {
		OperationsTestCase<PlannedProcedureV3> validatePlannedProcedureV3IdTestCase = new OperationsTestCase<PlannedProcedureV3>(
			"validatePlannedProcedureV3Id",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE_V3_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedureV3 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedureV3 target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedureV3Operations.validatePlannedProcedureV3Id(
					(PlannedProcedureV3) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedureV3IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidatePlannedProcedureV3Code() {
		OperationsTestCase<PlannedProcedureV3> validatePlannedProcedureV3CodeTestCase = new OperationsTestCase<PlannedProcedureV3>(
			"validatePlannedProcedureV3Code",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedureV3 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedureV3 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedureV3Operations.validatePlannedProcedureV3Code(
					(PlannedProcedureV3) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedureV3CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedProcedureV3StatusCodeP() {
		OperationsTestCase<PlannedProcedureV3> validatePlannedProcedureV3StatusCodePTestCase = new OperationsTestCase<PlannedProcedureV3>(
			"validatePlannedProcedureV3StatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE_V3_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedureV3 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedureV3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedureV3Operations.validatePlannedProcedureV3StatusCodeP(
					(PlannedProcedureV3) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedureV3StatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidatePlannedProcedureV3StatusCode() {
		OperationsTestCase<PlannedProcedureV3> validatePlannedProcedureV3StatusCodeTestCase = new OperationsTestCase<PlannedProcedureV3>(
			"validatePlannedProcedureV3StatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedureV3 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedureV3 target) {
				target.init();

				// CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				// target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(PlannedProcedureV3 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureV3StatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedureV3Operations.validatePlannedProcedureV3StatusCode(
					(PlannedProcedureV3) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedureV3StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedProcedureV3EffectiveTime() {
		OperationsTestCase<PlannedProcedureV3> validatePlannedProcedureV3EffectiveTimeTestCase = new OperationsTestCase<PlannedProcedureV3>(
			"validatePlannedProcedureV3EffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_PROCEDURE_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedureV3 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedureV3 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedureV3Operations.validatePlannedProcedureV3EffectiveTime(
					(PlannedProcedureV3) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedureV3EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidatePlannedProcedureV3MethodCode() {
		OperationsTestCase<PlannedProcedureV3> validatePlannedProcedureV3MethodCodeTestCase = new OperationsTestCase<PlannedProcedureV3>(
			"validatePlannedProcedureV3MethodCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE_V3_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedureV3 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedureV3 target) {
				target.init();
				target.getMethodCodes().add(DatatypesFactory.eINSTANCE.createCE());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedureV3Operations.validatePlannedProcedureV3MethodCode(
					(PlannedProcedureV3) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedureV3MethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidatePlannedProcedureV3TargetSiteCode() {
		OperationsTestCase<PlannedProcedureV3> validatePlannedProcedureV3TargetSiteCodeTestCase = new OperationsTestCase<PlannedProcedureV3>(
			"validatePlannedProcedureV3TargetSiteCode", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_PROCEDURE_V3_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedureV3 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedureV3 target) {
				target.init();
				target.getTargetSiteCodes().add(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedureV3Operations.validatePlannedProcedureV3TargetSiteCode(
					(PlannedProcedureV3) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedureV3TargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedProcedureV3ClassCode() {
		OperationsTestCase<PlannedProcedureV3> validatePlannedProcedureV3ClassCodeTestCase = new OperationsTestCase<PlannedProcedureV3>(
			"validatePlannedProcedureV3ClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE_V3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedureV3 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedureV3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedureV3Operations.validatePlannedProcedureV3ClassCode(
					(PlannedProcedureV3) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedureV3ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidatePlannedProcedureV3MoodCodeP() {
		OperationsTestCase<PlannedProcedureV3> validatePlannedProcedureV3MoodCodePTestCase = new OperationsTestCase<PlannedProcedureV3>(
			"validatePlannedProcedureV3MoodCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE_V3_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedureV3 target) {

			}

			@Override
			protected void updateToPass(PlannedProcedureV3 target) {
				target.init();
				target.setMoodCode(x_DocumentProcedureMood.APT);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedureV3Operations.validatePlannedProcedureV3MoodCodeP(
					(PlannedProcedureV3) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedureV3MoodCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidatePlannedProcedureV3MoodCode() {
		OperationsTestCase<PlannedProcedureV3> validatePlannedProcedureV3MoodCodeTestCase = new OperationsTestCase<PlannedProcedureV3>(
			"validatePlannedProcedureV3MoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE_V3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PlannedProcedureV3 target) {
				// target.setm
			}

			@Override
			protected void updateToPass(PlannedProcedureV3 target) {
				target.init();
				// x_DocumentProcedureMood x_DocumentProcedureMood;
				target.setMoodCode(x_DocumentProcedureMood.INT);

			}

			@Override
			protected void setDependency(PlannedProcedureV3 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureV3MoodCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedureV3Operations.validatePlannedProcedureV3MoodCode(
					(PlannedProcedureV3) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedureV3MoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlannedProcedureV3Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PlannedProcedureV3> {
		public PlannedProcedureV3 create() {
			return ConsolFactory.eINSTANCE.createPlannedProcedureV3();
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
	private static class ConstructorTestClass extends PlannedProcedureV3Operations {
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

} // PlannedProcedureV3Operations
