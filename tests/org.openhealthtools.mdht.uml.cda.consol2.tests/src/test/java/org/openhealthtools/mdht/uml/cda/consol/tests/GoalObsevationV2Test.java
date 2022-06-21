
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
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.GoalObsevationV2;
import org.openhealthtools.mdht.uml.cda.consol.operations.GoalObsevationV2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Goal Obsevation V2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObsevationV2#validateGoalObsevationV2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObsevationV2#validateGoalObsevationV2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObsevationV2#validateGoalObsevationV2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObsevationV2#validateGoalObsevationV2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObsevationV2#validateGoalObsevationV2ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObsevationV2#validateGoalObsevationV2MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObsevationV2#validateGoalObsevationV2Author(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Obsevation V2 Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GoalObsevationV2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateGoalObsevationV2Id() {
		OperationsTestCase<GoalObsevationV2> validateGoalObsevationV2IdTestCase = new OperationsTestCase<GoalObsevationV2>(
			"validateGoalObsevationV2Id",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSEVATION_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObsevationV2 target) {

			}

			@Override
			protected void updateToPass(GoalObsevationV2 target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObsevationV2Operations.validateGoalObsevationV2Id(
					(GoalObsevationV2) objectToTest, diagnostician, map);
			}

		};

		validateGoalObsevationV2IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateGoalObsevationV2Code() {
		OperationsTestCase<GoalObsevationV2> validateGoalObsevationV2CodeTestCase = new OperationsTestCase<GoalObsevationV2>(
			"validateGoalObsevationV2Code",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSEVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObsevationV2 target) {

			}

			@Override
			protected void updateToPass(GoalObsevationV2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObsevationV2Operations.validateGoalObsevationV2Code(
					(GoalObsevationV2) objectToTest, diagnostician, map);
			}

		};

		validateGoalObsevationV2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateGoalObsevationV2StatusCode() {
		OperationsTestCase<GoalObsevationV2> validateGoalObsevationV2StatusCodeTestCase = new OperationsTestCase<GoalObsevationV2>(
			"validateGoalObsevationV2StatusCode",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSEVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObsevationV2 target) {

			}

			@Override
			protected void updateToPass(GoalObsevationV2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObsevationV2Operations.validateGoalObsevationV2StatusCode(
					(GoalObsevationV2) objectToTest, diagnostician, map);
			}

		};

		validateGoalObsevationV2StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateGoalObsevationV2Value() {
		OperationsTestCase<GoalObsevationV2> validateGoalObsevationV2ValueTestCase = new OperationsTestCase<GoalObsevationV2>(
			"validateGoalObsevationV2Value",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSEVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObsevationV2 target) {

			}

			@Override
			protected void updateToPass(GoalObsevationV2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObsevationV2Operations.validateGoalObsevationV2Value(
					(GoalObsevationV2) objectToTest, diagnostician, map);
			}

		};

		validateGoalObsevationV2ValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateGoalObsevationV2ClassCode() {
		OperationsTestCase<GoalObsevationV2> validateGoalObsevationV2ClassCodeTestCase = new OperationsTestCase<GoalObsevationV2>(
			"validateGoalObsevationV2ClassCode",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSEVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObsevationV2 target) {

			}

			@Override
			protected void updateToPass(GoalObsevationV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObsevationV2Operations.validateGoalObsevationV2ClassCode(
					(GoalObsevationV2) objectToTest, diagnostician, map);
			}

		};

		validateGoalObsevationV2ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateGoalObsevationV2MoodCode() {
		OperationsTestCase<GoalObsevationV2> validateGoalObsevationV2MoodCodeTestCase = new OperationsTestCase<GoalObsevationV2>(
			"validateGoalObsevationV2MoodCode",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSEVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObsevationV2 target) {

			}

			@Override
			protected void updateToPass(GoalObsevationV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObsevationV2Operations.validateGoalObsevationV2MoodCode(
					(GoalObsevationV2) objectToTest, diagnostician, map);
			}

		};

		validateGoalObsevationV2MoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateGoalObsevationV2Author() {
		OperationsTestCase<GoalObsevationV2> validateGoalObsevationV2AuthorTestCase = new OperationsTestCase<GoalObsevationV2>(
			"validateGoalObsevationV2Author",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSEVATION_V2_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObsevationV2 target) {

			}

			@Override
			protected void updateToPass(GoalObsevationV2 target) {
				target.init();
				target.getAuthors().add(CDAFactory.eINSTANCE.createAuthor());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObsevationV2Operations.validateGoalObsevationV2Author(
					(GoalObsevationV2) objectToTest, diagnostician, map);
			}

		};

		validateGoalObsevationV2AuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GoalObsevationV2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<GoalObsevationV2> {
		public GoalObsevationV2 create() {
			return ConsolFactory.eINSTANCE.createGoalObsevationV2();
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
	private static class ConstructorTestClass extends GoalObsevationV2Operations {
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

} // GoalObsevationV2Operations
