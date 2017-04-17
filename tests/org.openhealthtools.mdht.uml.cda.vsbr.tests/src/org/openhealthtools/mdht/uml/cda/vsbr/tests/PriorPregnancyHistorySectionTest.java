
/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.StrucDocText;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.PriorPregnancyHistorySectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Prior Pregnancy History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#validatePriorPregnancyHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#validatePriorPregnancyHistorySectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#validatePriorPregnancyHistorySectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#validatePriorPregnancyHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#validatePriorPregnancyHistorySectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#validatePriorPregnancyHistorySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#validatePriorPregnancyHistorySectionDateofLastLiveBirth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Dateof Last Live Birth</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#validatePriorPregnancyHistorySectionLastMenstrualPeriodDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Last Menstrual Period Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#validatePriorPregnancyHistorySectionNumberofBirthsStillLiving(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Numberof Births Still Living</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#validatePriorPregnancyHistorySectionNumberofLiveBirthsnowDead(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Numberof Live Birthsnow Dead</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#validatePriorPregnancyHistorySectionOtherPregnancyOutcomes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Other Pregnancy Outcomes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#validatePriorPregnancyHistorySectionEstimateofGestation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Pregnancy History Section Estimateof Gestation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#getDateofLastLiveBirth() <em>Get Dateof Last Live Birth</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#getLastMenstrualPeriodDate() <em>Get Last Menstrual Period Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#getNumberofBirthsStillLiving() <em>Get Numberof Births Still Living</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#getNumberofLiveBirthsnowDead() <em>Get Numberof Live Birthsnow Dead</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#getOtherPregnancyOutcomes() <em>Get Other Pregnancy Outcomes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection#getEstimateofGestation() <em>Get Estimateof Gestation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PriorPregnancyHistorySectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePriorPregnancyHistorySectionTemplateId() {
		OperationsTestCase<PriorPregnancyHistorySection> validatePriorPregnancyHistorySectionTemplateIdTestCase = new OperationsTestCase<PriorPregnancyHistorySection>(
			"validatePriorPregnancyHistorySectionTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorPregnancyHistorySection target) {

			}

			@Override
			protected void updateToPass(PriorPregnancyHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorPregnancyHistorySectionOperations.validatePriorPregnancyHistorySectionTemplateId(
					(PriorPregnancyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePriorPregnancyHistorySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePriorPregnancyHistorySectionClassCode() {
		OperationsTestCase<PriorPregnancyHistorySection> validatePriorPregnancyHistorySectionClassCodeTestCase = new OperationsTestCase<PriorPregnancyHistorySection>(
			"validatePriorPregnancyHistorySectionClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorPregnancyHistorySection target) {

			}

			@Override
			protected void updateToPass(PriorPregnancyHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorPregnancyHistorySectionOperations.validatePriorPregnancyHistorySectionClassCode(
					(PriorPregnancyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePriorPregnancyHistorySectionClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePriorPregnancyHistorySectionMoodCode() {
		OperationsTestCase<PriorPregnancyHistorySection> validatePriorPregnancyHistorySectionMoodCodeTestCase = new OperationsTestCase<PriorPregnancyHistorySection>(
			"validatePriorPregnancyHistorySectionMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorPregnancyHistorySection target) {

			}

			@Override
			protected void updateToPass(PriorPregnancyHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorPregnancyHistorySectionOperations.validatePriorPregnancyHistorySectionMoodCode(
					(PriorPregnancyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePriorPregnancyHistorySectionMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePriorPregnancyHistorySectionCode() {
		OperationsTestCase<PriorPregnancyHistorySection> validatePriorPregnancyHistorySectionCodeTestCase = new OperationsTestCase<PriorPregnancyHistorySection>(
			"validatePriorPregnancyHistorySectionCode", operationsForOCL.getOCLValue(
				"VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorPregnancyHistorySection target) {

			}

			@Override
			protected void updateToPass(PriorPregnancyHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorPregnancyHistorySectionOperations.validatePriorPregnancyHistorySectionCode(
					(PriorPregnancyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePriorPregnancyHistorySectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePriorPregnancyHistorySectionCodeP() {
		OperationsTestCase<PriorPregnancyHistorySection> validatePriorPregnancyHistorySectionCodePTestCase = new OperationsTestCase<PriorPregnancyHistorySection>(
			"validatePriorPregnancyHistorySectionCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorPregnancyHistorySection target) {

			}

			@Override
			protected void updateToPass(PriorPregnancyHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorPregnancyHistorySectionOperations.validatePriorPregnancyHistorySectionCodeP(
					(PriorPregnancyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePriorPregnancyHistorySectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePriorPregnancyHistorySectionText() {
		OperationsTestCase<PriorPregnancyHistorySection> validatePriorPregnancyHistorySectionTextTestCase = new OperationsTestCase<PriorPregnancyHistorySection>(
			"validatePriorPregnancyHistorySectionText", operationsForOCL.getOCLValue(
				"VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorPregnancyHistorySection target) {

			}

			@Override
			protected void updateToPass(PriorPregnancyHistorySection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorPregnancyHistorySectionOperations.validatePriorPregnancyHistorySectionText(
					(PriorPregnancyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePriorPregnancyHistorySectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePriorPregnancyHistorySectionDateofLastLiveBirth() {
		OperationsTestCase<PriorPregnancyHistorySection> validatePriorPregnancyHistorySectionDateofLastLiveBirthTestCase = new OperationsTestCase<PriorPregnancyHistorySection>(
			"validatePriorPregnancyHistorySectionDateofLastLiveBirth",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_DATEOF_LAST_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorPregnancyHistorySection target) {

			}

			@Override
			protected void updateToPass(PriorPregnancyHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorPregnancyHistorySectionOperations.validatePriorPregnancyHistorySectionDateofLastLiveBirth(
					(PriorPregnancyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePriorPregnancyHistorySectionDateofLastLiveBirthTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePriorPregnancyHistorySectionLastMenstrualPeriodDate() {
		OperationsTestCase<PriorPregnancyHistorySection> validatePriorPregnancyHistorySectionLastMenstrualPeriodDateTestCase = new OperationsTestCase<PriorPregnancyHistorySection>(
			"validatePriorPregnancyHistorySectionLastMenstrualPeriodDate",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_LAST_MENSTRUAL_PERIOD_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorPregnancyHistorySection target) {

			}

			@Override
			protected void updateToPass(PriorPregnancyHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorPregnancyHistorySectionOperations.validatePriorPregnancyHistorySectionLastMenstrualPeriodDate(
					(PriorPregnancyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePriorPregnancyHistorySectionLastMenstrualPeriodDateTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePriorPregnancyHistorySectionNumberofBirthsStillLiving() {
		OperationsTestCase<PriorPregnancyHistorySection> validatePriorPregnancyHistorySectionNumberofBirthsStillLivingTestCase = new OperationsTestCase<PriorPregnancyHistorySection>(
			"validatePriorPregnancyHistorySectionNumberofBirthsStillLiving",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_NUMBEROF_BIRTHS_STILL_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorPregnancyHistorySection target) {

			}

			@Override
			protected void updateToPass(PriorPregnancyHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorPregnancyHistorySectionOperations.validatePriorPregnancyHistorySectionNumberofBirthsStillLiving(
					(PriorPregnancyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePriorPregnancyHistorySectionNumberofBirthsStillLivingTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePriorPregnancyHistorySectionNumberofLiveBirthsnowDead() {
		OperationsTestCase<PriorPregnancyHistorySection> validatePriorPregnancyHistorySectionNumberofLiveBirthsnowDeadTestCase = new OperationsTestCase<PriorPregnancyHistorySection>(
			"validatePriorPregnancyHistorySectionNumberofLiveBirthsnowDead",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_NUMBEROF_LIVE_BIRTHSNOW_DEAD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorPregnancyHistorySection target) {

			}

			@Override
			protected void updateToPass(PriorPregnancyHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorPregnancyHistorySectionOperations.validatePriorPregnancyHistorySectionNumberofLiveBirthsnowDead(
					(PriorPregnancyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePriorPregnancyHistorySectionNumberofLiveBirthsnowDeadTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePriorPregnancyHistorySectionOtherPregnancyOutcomes() {
		OperationsTestCase<PriorPregnancyHistorySection> validatePriorPregnancyHistorySectionOtherPregnancyOutcomesTestCase = new OperationsTestCase<PriorPregnancyHistorySection>(
			"validatePriorPregnancyHistorySectionOtherPregnancyOutcomes",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_OTHER_PREGNANCY_OUTCOMES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorPregnancyHistorySection target) {

			}

			@Override
			protected void updateToPass(PriorPregnancyHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorPregnancyHistorySectionOperations.validatePriorPregnancyHistorySectionOtherPregnancyOutcomes(
					(PriorPregnancyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePriorPregnancyHistorySectionOtherPregnancyOutcomesTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePriorPregnancyHistorySectionEstimateofGestation() {
		OperationsTestCase<PriorPregnancyHistorySection> validatePriorPregnancyHistorySectionEstimateofGestationTestCase = new OperationsTestCase<PriorPregnancyHistorySection>(
			"validatePriorPregnancyHistorySectionEstimateofGestation",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRIOR_PREGNANCY_HISTORY_SECTION_ESTIMATEOF_GESTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PriorPregnancyHistorySection target) {

			}

			@Override
			protected void updateToPass(PriorPregnancyHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PriorPregnancyHistorySectionOperations.validatePriorPregnancyHistorySectionEstimateofGestation(
					(PriorPregnancyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePriorPregnancyHistorySectionEstimateofGestationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetDateofLastLiveBirth() {

		PriorPregnancyHistorySection target = objectFactory.create();
		target.getDateofLastLiveBirth();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetLastMenstrualPeriodDate() {

		PriorPregnancyHistorySection target = objectFactory.create();
		target.getLastMenstrualPeriodDate();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetNumberofBirthsStillLiving() {

		PriorPregnancyHistorySection target = objectFactory.create();
		target.getNumberofBirthsStillLiving();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetNumberofLiveBirthsnowDead() {

		PriorPregnancyHistorySection target = objectFactory.create();
		target.getNumberofLiveBirthsnowDead();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetOtherPregnancyOutcomes() {

		PriorPregnancyHistorySection target = objectFactory.create();
		target.getOtherPregnancyOutcomes();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetEstimateofGestation() {

		PriorPregnancyHistorySection target = objectFactory.create();
		target.getEstimateofGestation();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PriorPregnancyHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PriorPregnancyHistorySection> {
		public PriorPregnancyHistorySection create() {
			return VsbrFactory.eINSTANCE.createPriorPregnancyHistorySection();
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
	private static class ConstructorTestClass extends PriorPregnancyHistorySectionOperations {
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

} // PriorPregnancyHistorySectionOperations
