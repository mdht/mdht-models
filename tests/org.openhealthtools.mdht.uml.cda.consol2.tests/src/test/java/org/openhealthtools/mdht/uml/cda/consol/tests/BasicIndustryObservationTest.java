
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.BasicIndustryObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.BasicIndustryObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Basic Industry Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicIndustryObservation#validateBasicIndustryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Industry Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicIndustryObservation#validateBasicIndustryObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Industry Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicIndustryObservation#validateBasicIndustryObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Industry Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicIndustryObservation#validateBasicIndustryObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Industry Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicIndustryObservation#validateBasicIndustryObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Industry Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicIndustryObservation#validateBasicIndustryObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Industry Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicIndustryObservation#validateBasicIndustryObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Industry Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicIndustryObservation#validateBasicIndustryObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Industry Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class BasicIndustryObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateBasicIndustryObservationTemplateId() {
		OperationsTestCase<BasicIndustryObservation> validateBasicIndustryObservationTemplateIdTestCase = new OperationsTestCase<BasicIndustryObservation>(
			"validateBasicIndustryObservationTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_BASIC_INDUSTRY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BasicIndustryObservation target) {

			}

			@Override
			protected void updateToPass(BasicIndustryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BasicIndustryObservationOperations.validateBasicIndustryObservationTemplateId(
					(BasicIndustryObservation) objectToTest, diagnostician, map);
			}

		};

		validateBasicIndustryObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateBasicIndustryObservationCode() {
		OperationsTestCase<BasicIndustryObservation> validateBasicIndustryObservationCodeTestCase = new OperationsTestCase<BasicIndustryObservation>(
			"validateBasicIndustryObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_BASIC_INDUSTRY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BasicIndustryObservation target) {

			}

			@Override
			protected void updateToPass(BasicIndustryObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BasicIndustryObservationOperations.validateBasicIndustryObservationCode(
					(BasicIndustryObservation) objectToTest, diagnostician, map);
			}

		};

		validateBasicIndustryObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateBasicIndustryObservationStatusCode() {
		OperationsTestCase<BasicIndustryObservation> validateBasicIndustryObservationStatusCodeTestCase = new OperationsTestCase<BasicIndustryObservation>(
			"validateBasicIndustryObservationStatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_BASIC_INDUSTRY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BasicIndustryObservation target) {

			}

			@Override
			protected void updateToPass(BasicIndustryObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BasicIndustryObservationOperations.validateBasicIndustryObservationStatusCode(
					(BasicIndustryObservation) objectToTest, diagnostician, map);
			}

		};

		validateBasicIndustryObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateBasicIndustryObservationStatusCodeP() {
		OperationsTestCase<BasicIndustryObservation> validateBasicIndustryObservationStatusCodePTestCase = new OperationsTestCase<BasicIndustryObservation>(
			"validateBasicIndustryObservationStatusCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_BASIC_INDUSTRY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BasicIndustryObservation target) {

			}

			@Override
			protected void updateToPass(BasicIndustryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BasicIndustryObservationOperations.validateBasicIndustryObservationStatusCodeP(
					(BasicIndustryObservation) objectToTest, diagnostician, map);
			}

		};

		validateBasicIndustryObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateBasicIndustryObservationValue() {
		OperationsTestCase<BasicIndustryObservation> validateBasicIndustryObservationValueTestCase = new OperationsTestCase<BasicIndustryObservation>(
			"validateBasicIndustryObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_BASIC_INDUSTRY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BasicIndustryObservation target) {

			}

			@Override
			protected void updateToPass(BasicIndustryObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("SOMEvalue", "2.16.840.1.114222.4.5.327");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BasicIndustryObservationOperations.validateBasicIndustryObservationValue(
					(BasicIndustryObservation) objectToTest, diagnostician, map);
			}

		};

		validateBasicIndustryObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateBasicIndustryObservationValueP() {
		OperationsTestCase<BasicIndustryObservation> validateBasicIndustryObservationValuePTestCase = new OperationsTestCase<BasicIndustryObservation>(
			"validateBasicIndustryObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_BASIC_INDUSTRY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BasicIndustryObservation target) {

			}

			@Override
			protected void updateToPass(BasicIndustryObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD("SOMEvalue", "2.16.840.1.114222.4.5.327");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BasicIndustryObservationOperations.validateBasicIndustryObservationValueP(
					(BasicIndustryObservation) objectToTest, diagnostician, map);
			}

		};

		validateBasicIndustryObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateBasicIndustryObservationClassCode() {
		OperationsTestCase<BasicIndustryObservation> validateBasicIndustryObservationClassCodeTestCase = new OperationsTestCase<BasicIndustryObservation>(
			"validateBasicIndustryObservationClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_BASIC_INDUSTRY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BasicIndustryObservation target) {

			}

			@Override
			protected void updateToPass(BasicIndustryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BasicIndustryObservationOperations.validateBasicIndustryObservationClassCode(
					(BasicIndustryObservation) objectToTest, diagnostician, map);
			}

		};

		validateBasicIndustryObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateBasicIndustryObservationMoodCode() {
		OperationsTestCase<BasicIndustryObservation> validateBasicIndustryObservationMoodCodeTestCase = new OperationsTestCase<BasicIndustryObservation>(
			"validateBasicIndustryObservationMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_BASIC_INDUSTRY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BasicIndustryObservation target) {

			}

			@Override
			protected void updateToPass(BasicIndustryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BasicIndustryObservationOperations.validateBasicIndustryObservationMoodCode(
					(BasicIndustryObservation) objectToTest, diagnostician, map);
			}

		};

		validateBasicIndustryObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends BasicIndustryObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<BasicIndustryObservation> {
		public BasicIndustryObservation create() {
			return ConsolFactory.eINSTANCE.createBasicIndustryObservation();
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
	private static class ConstructorTestClass extends BasicIndustryObservationOperations {
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

} // BasicIndustryObservationOperations
