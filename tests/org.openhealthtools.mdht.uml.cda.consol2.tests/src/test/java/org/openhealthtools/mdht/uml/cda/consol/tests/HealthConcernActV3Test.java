
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
import org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3;
import org.openhealthtools.mdht.uml.cda.consol.operations.HealthConcernActV3Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Health Concern Act V3</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3#validateHealthConcernActV3TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3#validateHealthConcernActV3Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3#validateHealthConcernActV3StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3#validateHealthConcernActV3StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3#validateHealthConcernActV3EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3#validateHealthConcernActV3ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3#validateHealthConcernActV3MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3#validateHealthConcernActV3CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3#validateHealthConcernActV3Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concern Act V3 Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HealthConcernActV3Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActV3TemplateId() {
		OperationsTestCase<HealthConcernActV3> validateHealthConcernActV3TemplateIdTestCase = new OperationsTestCase<HealthConcernActV3>(
			"validateHealthConcernActV3TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_V3_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernActV3 target) {

			}

			@Override
			protected void updateToPass(HealthConcernActV3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActV3Operations.validateHealthConcernActV3TemplateId(
					(HealthConcernActV3) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActV3TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateHealthConcernActV3Id() {
		OperationsTestCase<HealthConcernActV3> validateHealthConcernActV3IdTestCase = new OperationsTestCase<HealthConcernActV3>(
			"validateHealthConcernActV3Id",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_V3_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernActV3 target) {

			}

			@Override
			protected void updateToPass(HealthConcernActV3 target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActV3Operations.validateHealthConcernActV3Id(
					(HealthConcernActV3) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActV3IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateHealthConcernActV3StatusCodeP() {
		OperationsTestCase<HealthConcernActV3> validateHealthConcernActV3StatusCodePTestCase = new OperationsTestCase<HealthConcernActV3>(
			"validateHealthConcernActV3StatusCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_V3_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernActV3 target) {

			}

			@Override
			protected void updateToPass(HealthConcernActV3 target) {
				target.init();
				target.setStatusCode(DatatypesFactory.eINSTANCE.createCS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActV3Operations.validateHealthConcernActV3StatusCodeP(
					(HealthConcernActV3) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActV3StatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActV3StatusCode() {
		OperationsTestCase<HealthConcernActV3> validateHealthConcernActV3StatusCodeTestCase = new OperationsTestCase<HealthConcernActV3>(
			"validateHealthConcernActV3StatusCode",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernActV3 target) {

			}

			@Override
			protected void updateToPass(HealthConcernActV3 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(HealthConcernActV3 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3StatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActV3Operations.validateHealthConcernActV3StatusCode(
					(HealthConcernActV3) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActV3StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActV3EffectiveTime() {
		OperationsTestCase<HealthConcernActV3> validateHealthConcernActV3EffectiveTimeTestCase = new OperationsTestCase<HealthConcernActV3>(
			"validateHealthConcernActV3EffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_HEALTH_CONCERN_ACT_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernActV3 target) {

			}

			@Override
			protected void updateToPass(HealthConcernActV3 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActV3Operations.validateHealthConcernActV3EffectiveTime(
					(HealthConcernActV3) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActV3EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActV3ClassCode() {
		OperationsTestCase<HealthConcernActV3> validateHealthConcernActV3ClassCodeTestCase = new OperationsTestCase<HealthConcernActV3>(
			"validateHealthConcernActV3ClassCode",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_V3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernActV3 target) {

			}

			@Override
			protected void updateToPass(HealthConcernActV3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActV3Operations.validateHealthConcernActV3ClassCode(
					(HealthConcernActV3) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActV3ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActV3MoodCode() {
		OperationsTestCase<HealthConcernActV3> validateHealthConcernActV3MoodCodeTestCase = new OperationsTestCase<HealthConcernActV3>(
			"validateHealthConcernActV3MoodCode",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_V3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernActV3 target) {

			}

			@Override
			protected void updateToPass(HealthConcernActV3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActV3Operations.validateHealthConcernActV3MoodCode(
					(HealthConcernActV3) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActV3MoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActV3CodeP() {
		OperationsTestCase<HealthConcernActV3> validateHealthConcernActV3CodePTestCase = new OperationsTestCase<HealthConcernActV3>(
			"validateHealthConcernActV3CodeP",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_V3_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernActV3 target) {

			}

			@Override
			protected void updateToPass(HealthConcernActV3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActV3Operations.validateHealthConcernActV3CodeP(
					(HealthConcernActV3) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActV3CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHealthConcernActV3Code() {
		OperationsTestCase<HealthConcernActV3> validateHealthConcernActV3CodeTestCase = new OperationsTestCase<HealthConcernActV3>(
			"validateHealthConcernActV3Code",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CONCERN_ACT_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthConcernActV3 target) {

			}

			@Override
			protected void updateToPass(HealthConcernActV3 target) {
				target.init();

			}

			@Override
			protected void setDependency(HealthConcernActV3 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.HealthConcernActV3CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthConcernActV3Operations.validateHealthConcernActV3Code(
					(HealthConcernActV3) objectToTest, diagnostician, map);
			}

		};

		validateHealthConcernActV3CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HealthConcernActV3Operations {
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
	private static class ObjectFactory implements TestObjectFactory<HealthConcernActV3> {
		public HealthConcernActV3 create() {
			return ConsolFactory.eINSTANCE.createHealthConcernActV3();
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
	private static class ConstructorTestClass extends HealthConcernActV3Operations {
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

} // HealthConcernActV3Operations
