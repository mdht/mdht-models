
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
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.LaborandDeliveryProcedureSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Laborand Delivery Procedure Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection#validateLaborandDeliveryProcedureSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection#validateLaborandDeliveryProcedureSectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection#validateLaborandDeliveryProcedureSectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection#validateLaborandDeliveryProcedureSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection#validateLaborandDeliveryProcedureSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection#validateLaborandDeliveryProcedureSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection#validateLaborandDeliveryProcedureSectionObstetricProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Obstetric Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection#validateLaborandDeliveryProcedureSectionMethodOfDelivery(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Method Of Delivery</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection#getObstetricProcedures() <em>Get Obstetric Procedures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection#getMethodOfDelivery() <em>Get Method Of Delivery</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class LaborandDeliveryProcedureSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliveryProcedureSectionTemplateId() {
		OperationsTestCase<LaborandDeliveryProcedureSection> validateLaborandDeliveryProcedureSectionTemplateIdTestCase = new OperationsTestCase<LaborandDeliveryProcedureSection>(
			"validateLaborandDeliveryProcedureSectionTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryProcedureSection target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryProcedureSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryProcedureSectionOperations.validateLaborandDeliveryProcedureSectionTemplateId(
					(LaborandDeliveryProcedureSection) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryProcedureSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliveryProcedureSectionClassCode() {
		OperationsTestCase<LaborandDeliveryProcedureSection> validateLaborandDeliveryProcedureSectionClassCodeTestCase = new OperationsTestCase<LaborandDeliveryProcedureSection>(
			"validateLaborandDeliveryProcedureSectionClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryProcedureSection target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryProcedureSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryProcedureSectionOperations.validateLaborandDeliveryProcedureSectionClassCode(
					(LaborandDeliveryProcedureSection) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryProcedureSectionClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliveryProcedureSectionMoodCode() {
		OperationsTestCase<LaborandDeliveryProcedureSection> validateLaborandDeliveryProcedureSectionMoodCodeTestCase = new OperationsTestCase<LaborandDeliveryProcedureSection>(
			"validateLaborandDeliveryProcedureSectionMoodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryProcedureSection target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryProcedureSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryProcedureSectionOperations.validateLaborandDeliveryProcedureSectionMoodCode(
					(LaborandDeliveryProcedureSection) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryProcedureSectionMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliveryProcedureSectionCode() {
		OperationsTestCase<LaborandDeliveryProcedureSection> validateLaborandDeliveryProcedureSectionCodeTestCase = new OperationsTestCase<LaborandDeliveryProcedureSection>(
			"validateLaborandDeliveryProcedureSectionCode", operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryProcedureSection target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryProcedureSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryProcedureSectionOperations.validateLaborandDeliveryProcedureSectionCode(
					(LaborandDeliveryProcedureSection) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryProcedureSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliveryProcedureSectionCodeP() {
		OperationsTestCase<LaborandDeliveryProcedureSection> validateLaborandDeliveryProcedureSectionCodePTestCase = new OperationsTestCase<LaborandDeliveryProcedureSection>(
			"validateLaborandDeliveryProcedureSectionCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryProcedureSection target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryProcedureSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryProcedureSectionOperations.validateLaborandDeliveryProcedureSectionCodeP(
					(LaborandDeliveryProcedureSection) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryProcedureSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliveryProcedureSectionText() {
		OperationsTestCase<LaborandDeliveryProcedureSection> validateLaborandDeliveryProcedureSectionTextTestCase = new OperationsTestCase<LaborandDeliveryProcedureSection>(
			"validateLaborandDeliveryProcedureSectionText", operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryProcedureSection target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryProcedureSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryProcedureSectionOperations.validateLaborandDeliveryProcedureSectionText(
					(LaborandDeliveryProcedureSection) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryProcedureSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliveryProcedureSectionObstetricProcedure() {
		OperationsTestCase<LaborandDeliveryProcedureSection> validateLaborandDeliveryProcedureSectionObstetricProcedureTestCase = new OperationsTestCase<LaborandDeliveryProcedureSection>(
			"validateLaborandDeliveryProcedureSectionObstetricProcedure",
			operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_OBSTETRIC_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryProcedureSection target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryProcedureSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryProcedureSectionOperations.validateLaborandDeliveryProcedureSectionObstetricProcedure(
					(LaborandDeliveryProcedureSection) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryProcedureSectionObstetricProcedureTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLaborandDeliveryProcedureSectionMethodOfDelivery() {
		OperationsTestCase<LaborandDeliveryProcedureSection> validateLaborandDeliveryProcedureSectionMethodOfDeliveryTestCase = new OperationsTestCase<LaborandDeliveryProcedureSection>(
			"validateLaborandDeliveryProcedureSectionMethodOfDelivery",
			operationsForOCL.getOCLValue(
				"VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_METHOD_OF_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryProcedureSection target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryProcedureSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LaborandDeliveryProcedureSectionOperations.validateLaborandDeliveryProcedureSectionMethodOfDelivery(
					(LaborandDeliveryProcedureSection) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryProcedureSectionMethodOfDeliveryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetObstetricProcedures() {

		LaborandDeliveryProcedureSection target = objectFactory.create();
		target.getObstetricProcedures();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetMethodOfDelivery() {

		LaborandDeliveryProcedureSection target = objectFactory.create();
		target.getMethodOfDelivery();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends LaborandDeliveryProcedureSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<LaborandDeliveryProcedureSection> {
		public LaborandDeliveryProcedureSection create() {
			return VsbrFactory.eINSTANCE.createLaborandDeliveryProcedureSection();
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
	private static class ConstructorTestClass extends LaborandDeliveryProcedureSectionOperations {
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

} // LaborandDeliveryProcedureSectionOperations
