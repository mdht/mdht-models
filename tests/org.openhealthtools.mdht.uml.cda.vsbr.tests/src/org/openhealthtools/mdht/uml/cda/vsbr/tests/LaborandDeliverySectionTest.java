
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
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection;
import org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.LaborandDeliverySectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Laborand Delivery Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#validateLaborandDeliverySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#validateLaborandDeliverySectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#validateLaborandDeliverySectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#validateLaborandDeliverySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#validateLaborandDeliverySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#validateLaborandDeliverySectionLaborAndDeliveryProcess(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Labor And Delivery Process</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#validateLaborandDeliverySectionLaborAndDeliveryProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Labor And Delivery Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#validateLaborandDeliverySectionLaborOnsets(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Labor Onsets</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#validateLaborandDeliverySectionMothersVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Mothers Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#getLaborAndDeliveryProcess() <em>Get Labor And Delivery Process</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#getLaborAndDeliveryProceduresSection() <em>Get Labor And Delivery Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#getLaborOnsetss() <em>Get Labor Onsetss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#getMothersVitalSignsSection() <em>Get Mothers Vital Signs Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class LaborandDeliverySectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliverySectionTemplateId() {
		OperationsTestCase<LaborandDeliverySection> validateLaborandDeliverySectionTemplateIdTestCase = new OperationsTestCase<LaborandDeliverySection>(
			"validateLaborandDeliverySectionTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliverySection target) {

			}

			@Override
			protected void updateToPass(LaborandDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliverySectionOperations.validateLaborandDeliverySectionTemplateId(
					(LaborandDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliverySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliverySectionClassCode() {
		OperationsTestCase<LaborandDeliverySection> validateLaborandDeliverySectionClassCodeTestCase = new OperationsTestCase<LaborandDeliverySection>(
			"validateLaborandDeliverySectionClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliverySection target) {

			}

			@Override
			protected void updateToPass(LaborandDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliverySectionOperations.validateLaborandDeliverySectionClassCode(
					(LaborandDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliverySectionClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliverySectionMoodCode() {
		OperationsTestCase<LaborandDeliverySection> validateLaborandDeliverySectionMoodCodeTestCase = new OperationsTestCase<LaborandDeliverySection>(
			"validateLaborandDeliverySectionMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliverySection target) {

			}

			@Override
			protected void updateToPass(LaborandDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliverySectionOperations.validateLaborandDeliverySectionMoodCode(
					(LaborandDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliverySectionMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliverySectionCode() {
		OperationsTestCase<LaborandDeliverySection> validateLaborandDeliverySectionCodeTestCase = new OperationsTestCase<LaborandDeliverySection>(
			"validateLaborandDeliverySectionCode",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliverySection target) {

			}

			@Override
			protected void updateToPass(LaborandDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliverySectionOperations.validateLaborandDeliverySectionCode(
					(LaborandDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliverySectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliverySectionText() {
		OperationsTestCase<LaborandDeliverySection> validateLaborandDeliverySectionTextTestCase = new OperationsTestCase<LaborandDeliverySection>(
			"validateLaborandDeliverySectionText",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliverySection target) {

			}

			@Override
			protected void updateToPass(LaborandDeliverySection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliverySectionOperations.validateLaborandDeliverySectionText(
					(LaborandDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliverySectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliverySectionLaborAndDeliveryProcess() {
		OperationsTestCase<LaborandDeliverySection> validateLaborandDeliverySectionLaborAndDeliveryProcessTestCase = new OperationsTestCase<LaborandDeliverySection>(
			"validateLaborandDeliverySectionLaborAndDeliveryProcess",
			operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_SECTION_LABOR_AND_DELIVERY_PROCESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliverySection target) {

			}

			@Override
			protected void updateToPass(LaborandDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliverySectionOperations.validateLaborandDeliverySectionLaborAndDeliveryProcess(
					(LaborandDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliverySectionLaborAndDeliveryProcessTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliverySectionLaborAndDeliveryProceduresSection() {
		OperationsTestCase<LaborandDeliverySection> validateLaborandDeliverySectionLaborAndDeliveryProceduresSectionTestCase = new OperationsTestCase<LaborandDeliverySection>(
			"validateLaborandDeliverySectionLaborAndDeliveryProceduresSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_SECTION_LABOR_AND_DELIVERY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliverySection target) {

			}

			@Override
			protected void updateToPass(LaborandDeliverySection target) {
				target.init();

				/* LaborAndDeliveryProceduresSection */
				LaborandDeliveryProcedureSection section =

						VsbrFactory.eINSTANCE.createLaborandDeliveryProcedureSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliverySectionOperations.validateLaborandDeliverySectionLaborAndDeliveryProceduresSection(
					(LaborandDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliverySectionLaborAndDeliveryProceduresSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliverySectionLaborOnsets() {
		OperationsTestCase<LaborandDeliverySection> validateLaborandDeliverySectionLaborOnsetsTestCase = new OperationsTestCase<LaborandDeliverySection>(
			"validateLaborandDeliverySectionLaborOnsets", operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_SECTION_LABOR_ONSETS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliverySection target) {

			}

			@Override
			protected void updateToPass(LaborandDeliverySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliverySectionOperations.validateLaborandDeliverySectionLaborOnsets(
					(LaborandDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliverySectionLaborOnsetsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliverySectionMothersVitalSignsSection() {
		OperationsTestCase<LaborandDeliverySection> validateLaborandDeliverySectionMothersVitalSignsSectionTestCase = new OperationsTestCase<LaborandDeliverySection>(
			"validateLaborandDeliverySectionMothersVitalSignsSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_SECTION_MOTHERS_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliverySection target) {

			}

			@Override
			protected void updateToPass(LaborandDeliverySection target) {
				target.init();

				/* MothersVitalSignsSection */
				MothersVitalSignsSection section =

						VsbrFactory.eINSTANCE.createMothersVitalSignsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliverySectionOperations.validateLaborandDeliverySectionMothersVitalSignsSection(
					(LaborandDeliverySection) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliverySectionMothersVitalSignsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetLaborAndDeliveryProcess() {

		LaborandDeliverySection target = objectFactory.create();
		target.getLaborAndDeliveryProcess();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetLaborAndDeliveryProceduresSection() {

		LaborandDeliverySection target = objectFactory.create();
		target.getLaborAndDeliveryProceduresSection();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetLaborOnsetss() {

		LaborandDeliverySection target = objectFactory.create();
		target.getLaborOnsetss();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetMothersVitalSignsSection() {

		LaborandDeliverySection target = objectFactory.create();
		target.getMothersVitalSignsSection();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends LaborandDeliverySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<LaborandDeliverySection> {
		public LaborandDeliverySection create() {
			return VsbrFactory.eINSTANCE.createLaborandDeliverySection();
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
	private static class ConstructorTestClass extends LaborandDeliverySectionOperations {
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

} // LaborandDeliverySectionOperations
