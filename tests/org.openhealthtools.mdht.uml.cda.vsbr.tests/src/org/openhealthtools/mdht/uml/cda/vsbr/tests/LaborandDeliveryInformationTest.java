/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.LaborandDeliveryInformationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Laborand Delivery Information</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationAttendantParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Attendant Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Characteristicsof Laborand Delivery</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationHomeBirthPlan(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Home Birth Plan</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationMaternalTransfer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Maternal Transfer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationParticipatingLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Participating Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationMaternalMorbidities(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Maternal Morbidities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationRiskFactors(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Risk Factors</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationCertifierParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Certifier Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getCharacteristicsofLaborandDeliveries() <em>Get Characteristicsof Laborand Deliveries</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getHomeBirthPlan() <em>Get Home Birth Plan</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getMaternalTransfer() <em>Get Maternal Transfer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getMaternalMorbiditiess() <em>Get Maternal Morbiditiess</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getRiskFactorss() <em>Get Risk Factorss</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class LaborandDeliveryInformationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLaborandDeliveryInformationTemplateId() {
		OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationTemplateIdTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationTemplateId(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLaborandDeliveryInformationClassCode() {
		OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationClassCodeTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationClassCode(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLaborandDeliveryInformationMoodCode() {
		OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationMoodCodeTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationMoodCode(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLaborandDeliveryInformationCodeP() {
		OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationCodePTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationCodeP(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLaborandDeliveryInformationCode() {
		OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationCodeTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationCode",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationCode(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLaborandDeliveryInformationAttendantParticipation() {
		OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationAttendantParticipationTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationAttendantParticipation",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTENDANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationAttendantParticipation(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationAttendantParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLaborandDeliveryInformationEntryRelationship() {
		OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationEntryRelationshipTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationEntryRelationship",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationEntryRelationship(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationEntryRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLaborandDeliveryInformationCharacteristicsofLaborandDelivery() {
		OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationCharacteristicsofLaborandDeliveryTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_CHARACTERISTICSOF_LABORAND_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationCharacteristicsofLaborandDeliveryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLaborandDeliveryInformationHomeBirthPlan() {
		OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationHomeBirthPlanTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationHomeBirthPlan",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_HOME_BIRTH_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationHomeBirthPlan(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationHomeBirthPlanTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLaborandDeliveryInformationMaternalTransfer() {
		OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationMaternalTransferTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationMaternalTransfer",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_MATERNAL_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationMaternalTransfer(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationMaternalTransferTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLaborandDeliveryInformationParticipatingLocation() {
		OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationParticipatingLocationTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationParticipatingLocation",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_PARTICIPATING_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationParticipatingLocation(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationParticipatingLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLaborandDeliveryInformationMaternalMorbidities() {
		OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationMaternalMorbiditiesTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationMaternalMorbidities",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_MATERNAL_MORBIDITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationMaternalMorbidities(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationMaternalMorbiditiesTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLaborandDeliveryInformationRiskFactors() {
		OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationRiskFactorsTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationRiskFactors",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_RISK_FACTORS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationRiskFactors(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationRiskFactorsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLaborandDeliveryInformationCertifierParticipation() {
		OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationCertifierParticipationTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationCertifierParticipation",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_CERTIFIER_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationCertifierParticipation(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationCertifierParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCharacteristicsofLaborandDeliveries() {

		LaborandDeliveryInformation target = objectFactory.create();
		target.getCharacteristicsofLaborandDeliveries();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHomeBirthPlan() {

		LaborandDeliveryInformation target = objectFactory.create();
		target.getHomeBirthPlan();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMaternalTransfer() {

		LaborandDeliveryInformation target = objectFactory.create();
		target.getMaternalTransfer();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMaternalMorbiditiess() {

		LaborandDeliveryInformation target = objectFactory.create();
		target.getMaternalMorbiditiess();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetRiskFactorss() {

		LaborandDeliveryInformation target = objectFactory.create();
		target.getRiskFactorss();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends LaborandDeliveryInformationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<LaborandDeliveryInformation> {
		public LaborandDeliveryInformation create() {
			return VsbrFactory.eINSTANCE.createLaborandDeliveryInformation();
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
	private static class ConstructorTestClass extends LaborandDeliveryInformationOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // LaborandDeliveryInformationOperations
