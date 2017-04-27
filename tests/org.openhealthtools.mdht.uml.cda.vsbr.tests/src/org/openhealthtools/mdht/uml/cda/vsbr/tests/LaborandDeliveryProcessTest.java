
/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.LaborandDeliveryProcessOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Laborand Delivery Process</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessAttendantParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Attendant Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessCharacteristicsOfLaborAndDelivery(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Characteristics Of Labor And Delivery</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessHomeBirthPlan(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Home Birth Plan</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessMaternalTransfer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Maternal Transfer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessParticipatingLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Participating Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessMaternalMorbidities(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Maternal Morbidities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#validateLaborandDeliveryProcessRiskFactors(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Process Risk Factors</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#getCharacteristicsOfLaborAndDeliveries() <em>Get Characteristics Of Labor And Deliveries</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#getHomeBirthPlan() <em>Get Home Birth Plan</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#getMaternalTransfer() <em>Get Maternal Transfer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#getMaternalMorbiditiess() <em>Get Maternal Morbiditiess</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess#getRiskFactorss() <em>Get Risk Factorss</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class LaborandDeliveryProcessTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliveryProcessTemplateId() {
		OperationsTestCase<LaborandDeliveryProcess> validateLaborandDeliveryProcessTemplateIdTestCase = new OperationsTestCase<LaborandDeliveryProcess>(
			"validateLaborandDeliveryProcessTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_PROCESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryProcess target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryProcess target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessTemplateId(
					(LaborandDeliveryProcess) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryProcessTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliveryProcessClassCode() {
		OperationsTestCase<LaborandDeliveryProcess> validateLaborandDeliveryProcessClassCodeTestCase = new OperationsTestCase<LaborandDeliveryProcess>(
			"validateLaborandDeliveryProcessClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_PROCESS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryProcess target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryProcess target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessClassCode(
					(LaborandDeliveryProcess) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryProcessClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliveryProcessMoodCode() {
		OperationsTestCase<LaborandDeliveryProcess> validateLaborandDeliveryProcessMoodCodeTestCase = new OperationsTestCase<LaborandDeliveryProcess>(
			"validateLaborandDeliveryProcessMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_PROCESS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryProcess target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryProcess target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessMoodCode(
					(LaborandDeliveryProcess) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryProcessMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliveryProcessCodeP() {
		OperationsTestCase<LaborandDeliveryProcess> validateLaborandDeliveryProcessCodePTestCase = new OperationsTestCase<LaborandDeliveryProcess>(
			"validateLaborandDeliveryProcessCodeP",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_PROCESS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryProcess target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryProcess target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessCodeP(
					(LaborandDeliveryProcess) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryProcessCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliveryProcessCode() {
		OperationsTestCase<LaborandDeliveryProcess> validateLaborandDeliveryProcessCodeTestCase = new OperationsTestCase<LaborandDeliveryProcess>(
			"validateLaborandDeliveryProcessCode",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_PROCESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryProcess target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryProcess target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessCode(
					(LaborandDeliveryProcess) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryProcessCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliveryProcessAttendantParticipation() {
		OperationsTestCase<LaborandDeliveryProcess> validateLaborandDeliveryProcessAttendantParticipationTestCase = new OperationsTestCase<LaborandDeliveryProcess>(
			"validateLaborandDeliveryProcessAttendantParticipation",
			operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_PROCESS_ATTENDANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryProcess target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryProcess target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessAttendantParticipation(
					(LaborandDeliveryProcess) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryProcessAttendantParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliveryProcessEntryRelationship() {
		OperationsTestCase<LaborandDeliveryProcess> validateLaborandDeliveryProcessEntryRelationshipTestCase = new OperationsTestCase<LaborandDeliveryProcess>(
			"validateLaborandDeliveryProcessEntryRelationship",
			operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_PROCESS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryProcess target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryProcess target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessEntryRelationship(
					(LaborandDeliveryProcess) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryProcessEntryRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliveryProcessCharacteristicsOfLaborAndDelivery() {
		OperationsTestCase<LaborandDeliveryProcess> validateLaborandDeliveryProcessCharacteristicsOfLaborAndDeliveryTestCase = new OperationsTestCase<LaborandDeliveryProcess>(
			"validateLaborandDeliveryProcessCharacteristicsOfLaborAndDelivery",
			operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_PROCESS_CHARACTERISTICS_OF_LABOR_AND_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryProcess target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryProcess target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessCharacteristicsOfLaborAndDelivery(
					(LaborandDeliveryProcess) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryProcessCharacteristicsOfLaborAndDeliveryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliveryProcessHomeBirthPlan() {
		OperationsTestCase<LaborandDeliveryProcess> validateLaborandDeliveryProcessHomeBirthPlanTestCase = new OperationsTestCase<LaborandDeliveryProcess>(
			"validateLaborandDeliveryProcessHomeBirthPlan", operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_PROCESS_HOME_BIRTH_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryProcess target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryProcess target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessHomeBirthPlan(
					(LaborandDeliveryProcess) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryProcessHomeBirthPlanTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliveryProcessMaternalTransfer() {
		OperationsTestCase<LaborandDeliveryProcess> validateLaborandDeliveryProcessMaternalTransferTestCase = new OperationsTestCase<LaborandDeliveryProcess>(
			"validateLaborandDeliveryProcessMaternalTransfer",
			operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_PROCESS_MATERNAL_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryProcess target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryProcess target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessMaternalTransfer(
					(LaborandDeliveryProcess) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryProcessMaternalTransferTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliveryProcessParticipatingLocation() {
		OperationsTestCase<LaborandDeliveryProcess> validateLaborandDeliveryProcessParticipatingLocationTestCase = new OperationsTestCase<LaborandDeliveryProcess>(
			"validateLaborandDeliveryProcessParticipatingLocation",
			operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_PROCESS_PARTICIPATING_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryProcess target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryProcess target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessParticipatingLocation(
					(LaborandDeliveryProcess) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryProcessParticipatingLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliveryProcessMaternalMorbidities() {
		OperationsTestCase<LaborandDeliveryProcess> validateLaborandDeliveryProcessMaternalMorbiditiesTestCase = new OperationsTestCase<LaborandDeliveryProcess>(
			"validateLaborandDeliveryProcessMaternalMorbidities",
			operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_PROCESS_MATERNAL_MORBIDITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryProcess target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryProcess target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessMaternalMorbidities(
					(LaborandDeliveryProcess) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryProcessMaternalMorbiditiesTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliveryProcessRiskFactors() {
		OperationsTestCase<LaborandDeliveryProcess> validateLaborandDeliveryProcessRiskFactorsTestCase = new OperationsTestCase<LaborandDeliveryProcess>(
			"validateLaborandDeliveryProcessRiskFactors", operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_PROCESS_RISK_FACTORS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryProcess target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryProcess target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryProcessOperations.validateLaborandDeliveryProcessRiskFactors(
					(LaborandDeliveryProcess) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryProcessRiskFactorsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetCharacteristicsOfLaborAndDeliveries() {

		LaborandDeliveryProcess target = objectFactory.create();
		target.getCharacteristicsOfLaborAndDeliveries();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetHomeBirthPlan() {

		LaborandDeliveryProcess target = objectFactory.create();
		target.getHomeBirthPlan();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetMaternalTransfer() {

		LaborandDeliveryProcess target = objectFactory.create();
		target.getMaternalTransfer();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetMaternalMorbiditiess() {

		LaborandDeliveryProcess target = objectFactory.create();
		target.getMaternalMorbiditiess();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetRiskFactorss() {

		LaborandDeliveryProcess target = objectFactory.create();
		target.getRiskFactorss();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends LaborandDeliveryProcessOperations {
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
	private static class ObjectFactory implements TestObjectFactory<LaborandDeliveryProcess> {
		public LaborandDeliveryProcess create() {
			return VsbrFactory.eINSTANCE.createLaborandDeliveryProcess();
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
	private static class ConstructorTestClass extends LaborandDeliveryProcessOperations {
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

} // LaborandDeliveryProcessOperations
