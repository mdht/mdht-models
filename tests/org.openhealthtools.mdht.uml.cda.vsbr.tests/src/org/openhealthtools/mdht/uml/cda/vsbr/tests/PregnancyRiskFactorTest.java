
/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.PregnancyRiskFactorOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pregnancy Risk Factor</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor#validatePregnancyRiskFactorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor#validatePregnancyRiskFactorClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor#validatePregnancyRiskFactorMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor#validatePregnancyRiskFactorCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor#validatePregnancyRiskFactorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor#validatePregnancyRiskFactorCodeVS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Code VS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor#validatePregnancyRiskFactorValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor#validatePregnancyRiskFactorValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor#validatePregnancyRiskFactorEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Risk Factor Entry Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PregnancyRiskFactorTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePregnancyRiskFactorTemplateId() {
		OperationsTestCase<PregnancyRiskFactor> validatePregnancyRiskFactorTemplateIdTestCase = new OperationsTestCase<PregnancyRiskFactor>(
			"validatePregnancyRiskFactorTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_RISK_FACTOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyRiskFactor target) {

			}

			@Override
			protected void updateToPass(PregnancyRiskFactor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyRiskFactorOperations.validatePregnancyRiskFactorTemplateId(
					(PregnancyRiskFactor) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyRiskFactorTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePregnancyRiskFactorClassCode() {
		OperationsTestCase<PregnancyRiskFactor> validatePregnancyRiskFactorClassCodeTestCase = new OperationsTestCase<PregnancyRiskFactor>(
			"validatePregnancyRiskFactorClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_RISK_FACTOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyRiskFactor target) {

			}

			@Override
			protected void updateToPass(PregnancyRiskFactor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyRiskFactorOperations.validatePregnancyRiskFactorClassCode(
					(PregnancyRiskFactor) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyRiskFactorClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePregnancyRiskFactorMoodCode() {
		OperationsTestCase<PregnancyRiskFactor> validatePregnancyRiskFactorMoodCodeTestCase = new OperationsTestCase<PregnancyRiskFactor>(
			"validatePregnancyRiskFactorMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_RISK_FACTOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyRiskFactor target) {

			}

			@Override
			protected void updateToPass(PregnancyRiskFactor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyRiskFactorOperations.validatePregnancyRiskFactorMoodCode(
					(PregnancyRiskFactor) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyRiskFactorMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePregnancyRiskFactorCodeP() {
		OperationsTestCase<PregnancyRiskFactor> validatePregnancyRiskFactorCodePTestCase = new OperationsTestCase<PregnancyRiskFactor>(
			"validatePregnancyRiskFactorCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_RISK_FACTOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyRiskFactor target) {

			}

			@Override
			protected void updateToPass(PregnancyRiskFactor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyRiskFactorOperations.validatePregnancyRiskFactorCodeP(
					(PregnancyRiskFactor) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyRiskFactorCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePregnancyRiskFactorCode() {
		OperationsTestCase<PregnancyRiskFactor> validatePregnancyRiskFactorCodeTestCase = new OperationsTestCase<PregnancyRiskFactor>(
			"validatePregnancyRiskFactorCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_RISK_FACTOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyRiskFactor target) {

			}

			@Override
			protected void updateToPass(PregnancyRiskFactor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyRiskFactorOperations.validatePregnancyRiskFactorCode(
					(PregnancyRiskFactor) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyRiskFactorCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePregnancyRiskFactorCodeVS() {
		OperationsTestCase<PregnancyRiskFactor> validatePregnancyRiskFactorCodeVSTestCase = new OperationsTestCase<PregnancyRiskFactor>(
			"validatePregnancyRiskFactorCodeVS",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_RISK_FACTOR_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyRiskFactor target) {

			}

			@Override
			protected void updateToPass(PregnancyRiskFactor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyRiskFactorOperations.validatePregnancyRiskFactorCodeVS(
					(PregnancyRiskFactor) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyRiskFactorCodeVSTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePregnancyRiskFactorValue() {
		OperationsTestCase<PregnancyRiskFactor> validatePregnancyRiskFactorValueTestCase = new OperationsTestCase<PregnancyRiskFactor>(
			"validatePregnancyRiskFactorValue",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_RISK_FACTOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyRiskFactor target) {

			}

			@Override
			protected void updateToPass(PregnancyRiskFactor target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyRiskFactorOperations.validatePregnancyRiskFactorValue(
					(PregnancyRiskFactor) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyRiskFactorValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePregnancyRiskFactorValueP() {
		OperationsTestCase<PregnancyRiskFactor> validatePregnancyRiskFactorValuePTestCase = new OperationsTestCase<PregnancyRiskFactor>(
			"validatePregnancyRiskFactorValueP",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_RISK_FACTOR_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyRiskFactor target) {

			}

			@Override
			protected void updateToPass(PregnancyRiskFactor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyRiskFactorOperations.validatePregnancyRiskFactorValueP(
					(PregnancyRiskFactor) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyRiskFactorValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePregnancyRiskFactorEntryRelationship() {
		OperationsTestCase<PregnancyRiskFactor> validatePregnancyRiskFactorEntryRelationshipTestCase = new OperationsTestCase<PregnancyRiskFactor>(
			"validatePregnancyRiskFactorEntryRelationship", operationsForOCL.getOCLValue(
				"VALIDATE_PREGNANCY_RISK_FACTOR_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyRiskFactor target) {

			}

			@Override
			protected void updateToPass(PregnancyRiskFactor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyRiskFactorOperations.validatePregnancyRiskFactorEntryRelationship(
					(PregnancyRiskFactor) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyRiskFactorEntryRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PregnancyRiskFactorOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PregnancyRiskFactor> {
		public PregnancyRiskFactor create() {
			return VsbrFactory.eINSTANCE.createPregnancyRiskFactor();
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
	private static class ConstructorTestClass extends PregnancyRiskFactorOperations {
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

} // PregnancyRiskFactorOperations
