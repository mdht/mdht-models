
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
import org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation;
import org.openhealthtools.mdht.uml.cda.consol.operations.TribalAffiliationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tribal Affiliation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation#validateTribalAffiliationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation#validateTribalAffiliationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation#validateTribalAffiliationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation#validateTribalAffiliationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation#validateTribalAffiliationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation#validateTribalAffiliationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation#validateTribalAffiliationIVLTSValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation IVLTS Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation#validateTribalAffiliationIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation#validateTribalAffiliationIVLTSCenter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation IVLTS Center</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation#validateTribalAffiliationIVLTSWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation IVLTS Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation#validateTribalAffiliationIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tribal Affiliation IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation#validateSocialHistoryObservationV4TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class TribalAffiliationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTribalAffiliationCodeP() {
		OperationsTestCase<TribalAffiliation> validateTribalAffiliationCodePTestCase = new OperationsTestCase<TribalAffiliation>(
			"validateTribalAffiliationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_TRIBAL_AFFILIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TribalAffiliation target) {

			}

			@Override
			protected void updateToPass(TribalAffiliation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TribalAffiliationOperations.validateTribalAffiliationCodeP(
					(TribalAffiliation) objectToTest, diagnostician, map);
			}

		};

		validateTribalAffiliationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTribalAffiliationCode() {
		OperationsTestCase<TribalAffiliation> validateTribalAffiliationCodeTestCase = new OperationsTestCase<TribalAffiliation>(
			"validateTribalAffiliationCode",
			operationsForOCL.getOCLValue("VALIDATE_TRIBAL_AFFILIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TribalAffiliation target) {

			}

			@Override
			protected void updateToPass(TribalAffiliation target) {
				target.init();

			}

			@Override
			protected void setDependency(TribalAffiliation target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.TribalAffiliationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TribalAffiliationOperations.validateTribalAffiliationCode(
					(TribalAffiliation) objectToTest, diagnostician, map);
			}

		};

		validateTribalAffiliationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTribalAffiliationStatusCode() {
		OperationsTestCase<TribalAffiliation> validateTribalAffiliationStatusCodeTestCase = new OperationsTestCase<TribalAffiliation>(
			"validateTribalAffiliationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_TRIBAL_AFFILIATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TribalAffiliation target) {

			}

			@Override
			protected void updateToPass(TribalAffiliation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TribalAffiliationOperations.validateTribalAffiliationStatusCode(
					(TribalAffiliation) objectToTest, diagnostician, map);
			}

		};

		validateTribalAffiliationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTribalAffiliationEffectiveTime() {
		OperationsTestCase<TribalAffiliation> validateTribalAffiliationEffectiveTimeTestCase = new OperationsTestCase<TribalAffiliation>(
			"validateTribalAffiliationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_TRIBAL_AFFILIATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TribalAffiliation target) {

			}

			@Override
			protected void updateToPass(TribalAffiliation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TribalAffiliationOperations.validateTribalAffiliationEffectiveTime(
					(TribalAffiliation) objectToTest, diagnostician, map);
			}

		};

		validateTribalAffiliationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTribalAffiliationClassCode() {
		OperationsTestCase<TribalAffiliation> validateTribalAffiliationClassCodeTestCase = new OperationsTestCase<TribalAffiliation>(
			"validateTribalAffiliationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_TRIBAL_AFFILIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TribalAffiliation target) {

			}

			@Override
			protected void updateToPass(TribalAffiliation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TribalAffiliationOperations.validateTribalAffiliationClassCode(
					(TribalAffiliation) objectToTest, diagnostician, map);
			}

		};

		validateTribalAffiliationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateTribalAffiliationMoodCode() {
		OperationsTestCase<TribalAffiliation> validateTribalAffiliationMoodCodeTestCase = new OperationsTestCase<TribalAffiliation>(
			"validateTribalAffiliationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_TRIBAL_AFFILIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TribalAffiliation target) {

			}

			@Override
			protected void updateToPass(TribalAffiliation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TribalAffiliationOperations.validateTribalAffiliationMoodCode(
					(TribalAffiliation) objectToTest, diagnostician, map);
			}

		};

		validateTribalAffiliationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateTribalAffiliationIVLTSValue() {
		OperationsTestCase<TribalAffiliation> validateTribalAffiliationIVLTSValueTestCase = new OperationsTestCase<TribalAffiliation>(
			"validateTribalAffiliationIVLTSValue",
			operationsForOCL.getOCLValue("VALIDATE_TRIBAL_AFFILIATION_IVLTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TribalAffiliation target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(TribalAffiliation target) {

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				target.getEffectiveTime().setValue("2023");

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TribalAffiliationOperations.validateTribalAffiliationIVLTSValue(
					(TribalAffiliation) objectToTest, diagnostician, map);
			}

		};

		validateTribalAffiliationIVLTSValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateTribalAffiliationIVLTSLow() {
		OperationsTestCase<TribalAffiliation> validateTribalAffiliationIVLTSLowTestCase = new OperationsTestCase<TribalAffiliation>(
			"validateTribalAffiliationIVLTSLow",
			operationsForOCL.getOCLValue("VALIDATE_TRIBAL_AFFILIATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TribalAffiliation target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				target.getEffectiveTime().setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());

			}

			@Override
			protected void updateToPass(TribalAffiliation target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TribalAffiliationOperations.validateTribalAffiliationIVLTSLow(
					(TribalAffiliation) objectToTest, diagnostician, map);
			}

		};

		validateTribalAffiliationIVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateTribalAffiliationIVLTSCenter() {
		OperationsTestCase<TribalAffiliation> validateTribalAffiliationIVLTSCenterTestCase = new OperationsTestCase<TribalAffiliation>(
			"validateTribalAffiliationIVLTSCenter",
			operationsForOCL.getOCLValue("VALIDATE_TRIBAL_AFFILIATION_IVLTS_CENTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TribalAffiliation target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				target.getEffectiveTime().setCenter(DatatypesFactory.eINSTANCE.createTS());

			}

			@Override
			protected void updateToPass(TribalAffiliation target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TribalAffiliationOperations.validateTribalAffiliationIVLTSCenter(
					(TribalAffiliation) objectToTest, diagnostician, map);
			}

		};

		validateTribalAffiliationIVLTSCenterTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateTribalAffiliationIVLTSWidth() {
		OperationsTestCase<TribalAffiliation> validateTribalAffiliationIVLTSWidthTestCase = new OperationsTestCase<TribalAffiliation>(
			"validateTribalAffiliationIVLTSWidth",
			operationsForOCL.getOCLValue("VALIDATE_TRIBAL_AFFILIATION_IVLTS_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TribalAffiliation target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				target.getEffectiveTime().setWidth(DatatypesFactory.eINSTANCE.createPQ());

			}

			@Override
			protected void updateToPass(TribalAffiliation target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TribalAffiliationOperations.validateTribalAffiliationIVLTSWidth(
					(TribalAffiliation) objectToTest, diagnostician, map);
			}

		};

		validateTribalAffiliationIVLTSWidthTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateTribalAffiliationIVLTSHigh() {
		OperationsTestCase<TribalAffiliation> validateTribalAffiliationIVLTSHighTestCase = new OperationsTestCase<TribalAffiliation>(
			"validateTribalAffiliationIVLTSHigh",
			operationsForOCL.getOCLValue("VALIDATE_TRIBAL_AFFILIATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TribalAffiliation target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				target.getEffectiveTime().setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());

			}

			@Override
			protected void updateToPass(TribalAffiliation target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TribalAffiliationOperations.validateTribalAffiliationIVLTSHigh(
					(TribalAffiliation) objectToTest, diagnostician, map);
			}

		};

		validateTribalAffiliationIVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistoryObservationV4TemplateId() {
		OperationsTestCase<TribalAffiliation> validateSocialHistoryObservationV4TemplateIdTestCase = new OperationsTestCase<TribalAffiliation>(
			"validateSocialHistoryObservationV4TemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TribalAffiliation target) {

			}

			@Override
			protected void updateToPass(TribalAffiliation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TribalAffiliationOperations.validateSocialHistoryObservationV4TemplateId(
					(TribalAffiliation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationV4TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends TribalAffiliationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TribalAffiliation> {
		public TribalAffiliation create() {
			return ConsolFactory.eINSTANCE.createTribalAffiliation();
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
	private static class ConstructorTestClass extends TribalAffiliationOperations {
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

} // TribalAffiliationOperations
