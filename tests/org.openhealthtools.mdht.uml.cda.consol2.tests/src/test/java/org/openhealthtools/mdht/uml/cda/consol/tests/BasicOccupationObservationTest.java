
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.BasicOccupationObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Basic Occupation Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#validateBasicOccupationObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#validateBasicOccupationObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#validateBasicOccupationObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#validateBasicOccupationObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#validateBasicOccupationObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#validateBasicOccupationObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#validateBasicOccupationObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#validateBasicOccupationObservationSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#validateBasicOccupationObservationBasicIndustryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation Basic Industry Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#validateBasicOccupationObservationIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#validateBasicOccupationObservationIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Basic Occupation Observation IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#getBasicIndustryObservation() <em>Get Basic Industry Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservation#validateSocialHistoryObservationV4TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class BasicOccupationObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateBasicOccupationObservationCodeP() {
		OperationsTestCase<BasicOccupationObservation> validateBasicOccupationObservationCodePTestCase = new OperationsTestCase<BasicOccupationObservation>(
			"validateBasicOccupationObservationCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_BASIC_OCCUPATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BasicOccupationObservation target) {

			}

			@Override
			protected void updateToPass(BasicOccupationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BasicOccupationObservationOperations.validateBasicOccupationObservationCodeP(
					(BasicOccupationObservation) objectToTest, diagnostician, map);
			}

		};

		validateBasicOccupationObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateBasicOccupationObservationCode() {
		OperationsTestCase<BasicOccupationObservation> validateBasicOccupationObservationCodeTestCase = new OperationsTestCase<BasicOccupationObservation>(
			"validateBasicOccupationObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_BASIC_OCCUPATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BasicOccupationObservation target) {

			}

			@Override
			protected void updateToPass(BasicOccupationObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				cd.setCode("11341-5");
				cd.setCodeSystem("2.16.840.1.113883.6.1");
				target.setCode(cd);

			}

			@Override
			protected void setDependency(BasicOccupationObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BasicOccupationObservationOperations.validateBasicOccupationObservationCode(
					(BasicOccupationObservation) objectToTest, diagnostician, map);
			}

		};

		validateBasicOccupationObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateBasicOccupationObservationStatusCode() {
		OperationsTestCase<BasicOccupationObservation> validateBasicOccupationObservationStatusCodeTestCase = new OperationsTestCase<BasicOccupationObservation>(
			"validateBasicOccupationObservationStatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_BASIC_OCCUPATION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BasicOccupationObservation target) {

			}

			@Override
			protected void updateToPass(BasicOccupationObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(BasicOccupationObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.BasicOccupationObservationStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BasicOccupationObservationOperations.validateBasicOccupationObservationStatusCode(
					(BasicOccupationObservation) objectToTest, diagnostician, map);
			}

		};

		validateBasicOccupationObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateBasicOccupationObservationStatusCodeP() {
		OperationsTestCase<BasicOccupationObservation> validateBasicOccupationObservationStatusCodePTestCase = new OperationsTestCase<BasicOccupationObservation>(
			"validateBasicOccupationObservationStatusCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_BASIC_OCCUPATION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BasicOccupationObservation target) {

			}

			@Override
			protected void updateToPass(BasicOccupationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BasicOccupationObservationOperations.validateBasicOccupationObservationStatusCodeP(
					(BasicOccupationObservation) objectToTest, diagnostician, map);
			}

		};

		validateBasicOccupationObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateBasicOccupationObservationEffectiveTime() {
		OperationsTestCase<BasicOccupationObservation> validateBasicOccupationObservationEffectiveTimeTestCase = new OperationsTestCase<BasicOccupationObservation>(
			"validateBasicOccupationObservationEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_BASIC_OCCUPATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BasicOccupationObservation target) {

			}

			@Override
			protected void updateToPass(BasicOccupationObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BasicOccupationObservationOperations.validateBasicOccupationObservationEffectiveTime(
					(BasicOccupationObservation) objectToTest, diagnostician, map);
			}

		};

		validateBasicOccupationObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateBasicOccupationObservationClassCode() {
		OperationsTestCase<BasicOccupationObservation> validateBasicOccupationObservationClassCodeTestCase = new OperationsTestCase<BasicOccupationObservation>(
			"validateBasicOccupationObservationClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_BASIC_OCCUPATION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BasicOccupationObservation target) {

			}

			@Override
			protected void updateToPass(BasicOccupationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BasicOccupationObservationOperations.validateBasicOccupationObservationClassCode(
					(BasicOccupationObservation) objectToTest, diagnostician, map);
			}

		};

		validateBasicOccupationObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateBasicOccupationObservationMoodCode() {
		OperationsTestCase<BasicOccupationObservation> validateBasicOccupationObservationMoodCodeTestCase = new OperationsTestCase<BasicOccupationObservation>(
			"validateBasicOccupationObservationMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_BASIC_OCCUPATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BasicOccupationObservation target) {

			}

			@Override
			protected void updateToPass(BasicOccupationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BasicOccupationObservationOperations.validateBasicOccupationObservationMoodCode(
					(BasicOccupationObservation) objectToTest, diagnostician, map);
			}

		};

		validateBasicOccupationObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateBasicOccupationObservationSubject() {
		OperationsTestCase<BasicOccupationObservation> validateBasicOccupationObservationSubjectTestCase = new OperationsTestCase<BasicOccupationObservation>(
			"validateBasicOccupationObservationSubject", operationsForOCL.getOCLValue(
				"VALIDATE_BASIC_OCCUPATION_OBSERVATION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BasicOccupationObservation target) {

			}

			@Override
			protected void updateToPass(BasicOccupationObservation target) {
				target.init();
				target.setSubject(CDAFactory.eINSTANCE.createSubject());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BasicOccupationObservationOperations.validateBasicOccupationObservationSubject(
					(BasicOccupationObservation) objectToTest, diagnostician, map);
			}

		};

		validateBasicOccupationObservationSubjectTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateBasicOccupationObservationBasicIndustryObservation() {
		OperationsTestCase<BasicOccupationObservation> validateBasicOccupationObservationBasicIndustryObservationTestCase = new OperationsTestCase<BasicOccupationObservation>(
			"validateBasicOccupationObservationBasicIndustryObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_BASIC_OCCUPATION_OBSERVATION_BASIC_INDUSTRY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BasicOccupationObservation target) {

			}

			@Override
			protected void updateToPass(BasicOccupationObservation target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createBasicIndustryObservation().init());
				target.getEntryRelationships().get(0).setTypeCode(x_ActRelationshipEntryRelationship.REFR);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BasicOccupationObservationOperations.validateBasicOccupationObservationBasicIndustryObservation(
					(BasicOccupationObservation) objectToTest, diagnostician, map);
			}

		};

		validateBasicOccupationObservationBasicIndustryObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateBasicOccupationObservationIVLTSLow() {
		OperationsTestCase<BasicOccupationObservation> validateBasicOccupationObservationIVLTSLowTestCase = new OperationsTestCase<BasicOccupationObservation>(
			"validateBasicOccupationObservationIVLTSLow", operationsForOCL.getOCLValue(
				"VALIDATE_BASIC_OCCUPATION_OBSERVATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BasicOccupationObservation target) {
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(BasicOccupationObservation target) {
				target.init();
				IVL_TS efftime = DatatypesFactory.eINSTANCE.createIVL_TS("2020", "2023");
				target.setEffectiveTime(efftime);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BasicOccupationObservationOperations.validateBasicOccupationObservationIVLTSLow(
					(BasicOccupationObservation) objectToTest, diagnostician, map);
			}

		};

		validateBasicOccupationObservationIVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateBasicOccupationObservationIVLTSHigh() {
		OperationsTestCase<BasicOccupationObservation> validateBasicOccupationObservationIVLTSHighTestCase = new OperationsTestCase<BasicOccupationObservation>(
			"validateBasicOccupationObservationIVLTSHigh", operationsForOCL.getOCLValue(
				"VALIDATE_BASIC_OCCUPATION_OBSERVATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BasicOccupationObservation target) {
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(BasicOccupationObservation target) {
				target.init();
				IVL_TS efftime = DatatypesFactory.eINSTANCE.createIVL_TS("2020", "2023");
				target.setEffectiveTime(efftime);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BasicOccupationObservationOperations.validateBasicOccupationObservationIVLTSHigh(
					(BasicOccupationObservation) objectToTest, diagnostician, map);
			}

		};

		validateBasicOccupationObservationIVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetBasicIndustryObservation() {

		BasicOccupationObservation target = objectFactory.create();
		target.getBasicIndustryObservation();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistoryObservationV4TemplateId() {
		OperationsTestCase<BasicOccupationObservation> validateSocialHistoryObservationV4TemplateIdTestCase = new OperationsTestCase<BasicOccupationObservation>(
			"validateSocialHistoryObservationV4TemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BasicOccupationObservation target) {

			}

			@Override
			protected void updateToPass(BasicOccupationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BasicOccupationObservationOperations.validateSocialHistoryObservationV4TemplateId(
					(BasicOccupationObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationV4TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends BasicOccupationObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<BasicOccupationObservation> {
		public BasicOccupationObservation create() {
			return ConsolFactory.eINSTANCE.createBasicOccupationObservation();
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
	private static class ConstructorTestClass extends BasicOccupationObservationOperations {
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

} // BasicOccupationObservationOperations
