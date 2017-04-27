
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

import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.FetalDeliverySectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Fetal Delivery Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionBirthOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Birth Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionNumberOfInfantsBornAlive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Number Of Infants Born Alive</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionAutopsyPerformance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Autopsy Performance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionFetalDeathOccurrance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Death Occurrance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionPlurality(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Plurality</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionCongenitalAnomaly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Congenital Anomaly</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionFetalDeliveryTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionFetalDeliverySubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusDeterminerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus Determiner Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus Administrative Gender Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionFetalDeliverySubjectTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#getBirthOrder() <em>Get Birth Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#getNumberOfInfantsBornAlive() <em>Get Number Of Infants Born Alive</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#getAutopsyPerformance() <em>Get Autopsy Performance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#getFetalDeathOccurrance() <em>Get Fetal Death Occurrance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#getPlurality() <em>Get Plurality</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#getCongenitalAnomalies() <em>Get Congenital Anomalies</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#getFetalDeliveryTime() <em>Get Fetal Delivery Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FetalDeliverySectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliverySectionTemplateId() {
		OperationsTestCase<FetalDeliverySection> validateFetalDeliverySectionTemplateIdTestCase = new OperationsTestCase<FetalDeliverySection>(
			"validateFetalDeliverySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliverySection target) {

			}

			@Override
			protected void updateToPass(FetalDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliverySectionOperations.validateFetalDeliverySectionTemplateId(
					(FetalDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliverySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliverySectionClassCode() {
		OperationsTestCase<FetalDeliverySection> validateFetalDeliverySectionClassCodeTestCase = new OperationsTestCase<FetalDeliverySection>(
			"validateFetalDeliverySectionClassCode",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliverySection target) {

			}

			@Override
			protected void updateToPass(FetalDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliverySectionOperations.validateFetalDeliverySectionClassCode(
					(FetalDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliverySectionClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliverySectionMoodCode() {
		OperationsTestCase<FetalDeliverySection> validateFetalDeliverySectionMoodCodeTestCase = new OperationsTestCase<FetalDeliverySection>(
			"validateFetalDeliverySectionMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliverySection target) {

			}

			@Override
			protected void updateToPass(FetalDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliverySectionOperations.validateFetalDeliverySectionMoodCode(
					(FetalDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliverySectionMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliverySectionCode() {
		OperationsTestCase<FetalDeliverySection> validateFetalDeliverySectionCodeTestCase = new OperationsTestCase<FetalDeliverySection>(
			"validateFetalDeliverySectionCode",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliverySection target) {

			}

			@Override
			protected void updateToPass(FetalDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliverySectionOperations.validateFetalDeliverySectionCode(
					(FetalDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliverySectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliverySectionText() {
		OperationsTestCase<FetalDeliverySection> validateFetalDeliverySectionTextTestCase = new OperationsTestCase<FetalDeliverySection>(
			"validateFetalDeliverySectionText",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliverySection target) {

			}

			@Override
			protected void updateToPass(FetalDeliverySection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliverySectionOperations.validateFetalDeliverySectionText(
					(FetalDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliverySectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliverySectionBirthOrder() {
		OperationsTestCase<FetalDeliverySection> validateFetalDeliverySectionBirthOrderTestCase = new OperationsTestCase<FetalDeliverySection>(
			"validateFetalDeliverySectionBirthOrder",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DELIVERY_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliverySection target) {

			}

			@Override
			protected void updateToPass(FetalDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliverySectionOperations.validateFetalDeliverySectionBirthOrder(
					(FetalDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliverySectionBirthOrderTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliverySectionNumberOfInfantsBornAlive() {
		OperationsTestCase<FetalDeliverySection> validateFetalDeliverySectionNumberOfInfantsBornAliveTestCase = new OperationsTestCase<FetalDeliverySection>(
			"validateFetalDeliverySectionNumberOfInfantsBornAlive",
			operationsForOCL.getOCLValue(
				"VALIDATE_FETAL_DELIVERY_SECTION_NUMBER_OF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliverySection target) {

			}

			@Override
			protected void updateToPass(FetalDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliverySectionOperations.validateFetalDeliverySectionNumberOfInfantsBornAlive(
					(FetalDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliverySectionNumberOfInfantsBornAliveTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliverySectionAutopsyPerformance() {
		OperationsTestCase<FetalDeliverySection> validateFetalDeliverySectionAutopsyPerformanceTestCase = new OperationsTestCase<FetalDeliverySection>(
			"validateFetalDeliverySectionAutopsyPerformance", operationsForOCL.getOCLValue(
				"VALIDATE_FETAL_DELIVERY_SECTION_AUTOPSY_PERFORMANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliverySection target) {

			}

			@Override
			protected void updateToPass(FetalDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliverySectionOperations.validateFetalDeliverySectionAutopsyPerformance(
					(FetalDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliverySectionAutopsyPerformanceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliverySectionFetalDeathOccurrance() {
		OperationsTestCase<FetalDeliverySection> validateFetalDeliverySectionFetalDeathOccurranceTestCase = new OperationsTestCase<FetalDeliverySection>(
			"validateFetalDeliverySectionFetalDeathOccurrance",
			operationsForOCL.getOCLValue(
				"VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DEATH_OCCURRANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliverySection target) {

			}

			@Override
			protected void updateToPass(FetalDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliverySectionOperations.validateFetalDeliverySectionFetalDeathOccurrance(
					(FetalDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliverySectionFetalDeathOccurranceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliverySectionPlurality() {
		OperationsTestCase<FetalDeliverySection> validateFetalDeliverySectionPluralityTestCase = new OperationsTestCase<FetalDeliverySection>(
			"validateFetalDeliverySectionPlurality",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DELIVERY_SECTION_PLURALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliverySection target) {

			}

			@Override
			protected void updateToPass(FetalDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliverySectionOperations.validateFetalDeliverySectionPlurality(
					(FetalDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliverySectionPluralityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliverySectionCongenitalAnomaly() {
		OperationsTestCase<FetalDeliverySection> validateFetalDeliverySectionCongenitalAnomalyTestCase = new OperationsTestCase<FetalDeliverySection>(
			"validateFetalDeliverySectionCongenitalAnomaly", operationsForOCL.getOCLValue(
				"VALIDATE_FETAL_DELIVERY_SECTION_CONGENITAL_ANOMALY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliverySection target) {

			}

			@Override
			protected void updateToPass(FetalDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliverySectionOperations.validateFetalDeliverySectionCongenitalAnomaly(
					(FetalDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliverySectionCongenitalAnomalyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliverySectionFetalDeliveryTime() {
		OperationsTestCase<FetalDeliverySection> validateFetalDeliverySectionFetalDeliveryTimeTestCase = new OperationsTestCase<FetalDeliverySection>(
			"validateFetalDeliverySectionFetalDeliveryTime", operationsForOCL.getOCLValue(
				"VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliverySection target) {

			}

			@Override
			protected void updateToPass(FetalDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliverySectionOperations.validateFetalDeliverySectionFetalDeliveryTime(
					(FetalDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliverySectionFetalDeliveryTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliverySectionFetalDeliverySubject() {
		OperationsTestCase<FetalDeliverySection> validateFetalDeliverySectionFetalDeliverySubjectTestCase = new OperationsTestCase<FetalDeliverySection>(
			"validateFetalDeliverySectionFetalDeliverySubject",
			operationsForOCL.getOCLValue(
				"VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliverySection target) {

			}

			@Override
			protected void updateToPass(FetalDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliverySectionOperations.validateFetalDeliverySectionFetalDeliverySubject(
					(FetalDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliverySectionFetalDeliverySubjectTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusClassCode() {
		OperationsTestCase<FetalDeliverySection> validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusClassCodeTestCase = new OperationsTestCase<FetalDeliverySection>(
			"validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliverySection target) {

			}

			@Override
			protected void updateToPass(FetalDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliverySectionOperations.validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusClassCode(
					(FetalDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusDeterminerCode() {
		OperationsTestCase<FetalDeliverySection> validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusDeterminerCodeTestCase = new OperationsTestCase<FetalDeliverySection>(
			"validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusDeterminerCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliverySection target) {

			}

			@Override
			protected void updateToPass(FetalDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliverySectionOperations.validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusDeterminerCode(
					(FetalDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusDeterminerCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusName() {
		OperationsTestCase<FetalDeliverySection> validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusNameTestCase = new OperationsTestCase<FetalDeliverySection>(
			"validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusName",
			operationsForOCL.getOCLValue(
				"VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliverySection target) {

			}

			@Override
			protected void updateToPass(FetalDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliverySectionOperations.validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusName(
					(FetalDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCode() {
		OperationsTestCase<FetalDeliverySection> validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodeTestCase = new OperationsTestCase<FetalDeliverySection>(
			"validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliverySection target) {

			}

			@Override
			protected void updateToPass(FetalDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliverySectionOperations.validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCode(
					(FetalDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodeP() {
		OperationsTestCase<FetalDeliverySection> validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodePTestCase = new OperationsTestCase<FetalDeliverySection>(
			"validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliverySection target) {

			}

			@Override
			protected void updateToPass(FetalDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliverySectionOperations.validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodeP(
					(FetalDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusClassCode() {
		OperationsTestCase<FetalDeliverySection> validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusClassCodeTestCase = new OperationsTestCase<FetalDeliverySection>(
			"validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliverySection target) {

			}

			@Override
			protected void updateToPass(FetalDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliverySectionOperations.validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusClassCode(
					(FetalDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetus() {
		OperationsTestCase<FetalDeliverySection> validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusTestCase = new OperationsTestCase<FetalDeliverySection>(
			"validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetus",
			operationsForOCL.getOCLValue(
				"VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliverySection target) {

			}

			@Override
			protected void updateToPass(FetalDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliverySectionOperations.validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetus(
					(FetalDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliverySectionFetalDeliverySubjectTypeCode() {
		OperationsTestCase<FetalDeliverySection> validateFetalDeliverySectionFetalDeliverySubjectTypeCodeTestCase = new OperationsTestCase<FetalDeliverySection>(
			"validateFetalDeliverySectionFetalDeliverySubjectTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliverySection target) {

			}

			@Override
			protected void updateToPass(FetalDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliverySectionOperations.validateFetalDeliverySectionFetalDeliverySubjectTypeCode(
					(FetalDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliverySectionFetalDeliverySubjectTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliverySectionFetalDeliverySubjectRoleOfFetus() {
		OperationsTestCase<FetalDeliverySection> validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusTestCase = new OperationsTestCase<FetalDeliverySection>(
			"validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetus",
			operationsForOCL.getOCLValue(
				"VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliverySection target) {

			}

			@Override
			protected void updateToPass(FetalDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliverySectionOperations.validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetus(
					(FetalDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetBirthOrder() {

		FetalDeliverySection target = objectFactory.create();
		target.getBirthOrder();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetNumberOfInfantsBornAlive() {

		FetalDeliverySection target = objectFactory.create();
		target.getNumberOfInfantsBornAlive();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetAutopsyPerformance() {

		FetalDeliverySection target = objectFactory.create();
		target.getAutopsyPerformance();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetFetalDeathOccurrance() {

		FetalDeliverySection target = objectFactory.create();
		target.getFetalDeathOccurrance();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetPlurality() {

		FetalDeliverySection target = objectFactory.create();
		target.getPlurality();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetCongenitalAnomalies() {

		FetalDeliverySection target = objectFactory.create();
		target.getCongenitalAnomalies();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetFetalDeliveryTime() {

		FetalDeliverySection target = objectFactory.create();
		target.getFetalDeliveryTime();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FetalDeliverySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FetalDeliverySection> {
		public FetalDeliverySection create() {
			return VsbrFactory.eINSTANCE.createFetalDeliverySection();
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
	private static class ConstructorTestClass extends FetalDeliverySectionOperations {
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

} // FetalDeliverySectionOperations
