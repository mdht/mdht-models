
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
import org.openhealthtools.mdht.uml.cda.consol.CareTeamTypeObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.CareTeamTypeObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Care Team Type Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamTypeObservation#validateCareTeamTypeObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Type Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamTypeObservation#validateCareTeamTypeObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Type Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamTypeObservation#validateCareTeamTypeObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Type Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamTypeObservation#validateCareTeamTypeObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Type Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamTypeObservation#validateCareTeamTypeObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Type Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamTypeObservation#validateCareTeamTypeObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Type Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamTypeObservation#validateCareTeamTypeObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Type Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CareTeamTypeObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamTypeObservationTemplateId() {
		OperationsTestCase<CareTeamTypeObservation> validateCareTeamTypeObservationTemplateIdTestCase = new OperationsTestCase<CareTeamTypeObservation>(
			"validateCareTeamTypeObservationTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_TYPE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamTypeObservation target) {

			}

			@Override
			protected void updateToPass(CareTeamTypeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamTypeObservationOperations.validateCareTeamTypeObservationTemplateId(
					(CareTeamTypeObservation) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamTypeObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamTypeObservationCode() {
		OperationsTestCase<CareTeamTypeObservation> validateCareTeamTypeObservationCodeTestCase = new OperationsTestCase<CareTeamTypeObservation>(
			"validateCareTeamTypeObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_TYPE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamTypeObservation target) {

			}

			@Override
			protected void updateToPass(CareTeamTypeObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamTypeObservationOperations.validateCareTeamTypeObservationCode(
					(CareTeamTypeObservation) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamTypeObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamTypeObservationStatusCodeP() {
		OperationsTestCase<CareTeamTypeObservation> validateCareTeamTypeObservationStatusCodePTestCase = new OperationsTestCase<CareTeamTypeObservation>(
			"validateCareTeamTypeObservationStatusCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_TYPE_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamTypeObservation target) {

			}

			@Override
			protected void updateToPass(CareTeamTypeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamTypeObservationOperations.validateCareTeamTypeObservationStatusCodeP(
					(CareTeamTypeObservation) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamTypeObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamTypeObservationStatusCode() {
		OperationsTestCase<CareTeamTypeObservation> validateCareTeamTypeObservationStatusCodeTestCase = new OperationsTestCase<CareTeamTypeObservation>(
			"validateCareTeamTypeObservationStatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_TYPE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamTypeObservation target) {

			}

			@Override
			protected void updateToPass(CareTeamTypeObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(CareTeamTypeObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.CareTeamTypeObservationStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamTypeObservationOperations.validateCareTeamTypeObservationStatusCode(
					(CareTeamTypeObservation) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamTypeObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateCareTeamTypeObservationValue() {
		OperationsTestCase<CareTeamTypeObservation> validateCareTeamTypeObservationValueTestCase = new OperationsTestCase<CareTeamTypeObservation>(
			"validateCareTeamTypeObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_TYPE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamTypeObservation target) {

			}

			@Override
			protected void updateToPass(CareTeamTypeObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("LA27975-4", "2.16.840.1.113883.6.1");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamTypeObservationOperations.validateCareTeamTypeObservationValue(
					(CareTeamTypeObservation) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamTypeObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamTypeObservationClassCode() {
		OperationsTestCase<CareTeamTypeObservation> validateCareTeamTypeObservationClassCodeTestCase = new OperationsTestCase<CareTeamTypeObservation>(
			"validateCareTeamTypeObservationClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_TYPE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamTypeObservation target) {

			}

			@Override
			protected void updateToPass(CareTeamTypeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamTypeObservationOperations.validateCareTeamTypeObservationClassCode(
					(CareTeamTypeObservation) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamTypeObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamTypeObservationMoodCode() {
		OperationsTestCase<CareTeamTypeObservation> validateCareTeamTypeObservationMoodCodeTestCase = new OperationsTestCase<CareTeamTypeObservation>(
			"validateCareTeamTypeObservationMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_TYPE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamTypeObservation target) {

			}

			@Override
			protected void updateToPass(CareTeamTypeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamTypeObservationOperations.validateCareTeamTypeObservationMoodCode(
					(CareTeamTypeObservation) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamTypeObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CareTeamTypeObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CareTeamTypeObservation> {
		public CareTeamTypeObservation create() {
			return ConsolFactory.eINSTANCE.createCareTeamTypeObservation();
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
	private static class ConstructorTestClass extends CareTeamTypeObservationOperations {
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

} // CareTeamTypeObservationOperations
