
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

import org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.AutopsyPerformanceOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Autopsy Performance</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance#validateAutopsyPerformanceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance#validateAutopsyPerformanceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance#validateAutopsyPerformanceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance#validateAutopsyPerformanceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance#validateAutopsyPerformanceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance#validateAutopsyPerformanceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance#validateAutopsyPerformanceValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance#validateAutopsyPerformanceUseAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Use Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance#validateAutopsyPerformanceHistologicalExamAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Histological Exam Association</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AutopsyPerformanceTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAutopsyPerformanceTemplateId() {
		OperationsTestCase<AutopsyPerformance> validateAutopsyPerformanceTemplateIdTestCase = new OperationsTestCase<AutopsyPerformance>(
			"validateAutopsyPerformanceTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_PERFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AutopsyPerformance target) {

			}

			@Override
			protected void updateToPass(AutopsyPerformance target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AutopsyPerformanceOperations.validateAutopsyPerformanceTemplateId(
					(AutopsyPerformance) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyPerformanceTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAutopsyPerformanceClassCode() {
		OperationsTestCase<AutopsyPerformance> validateAutopsyPerformanceClassCodeTestCase = new OperationsTestCase<AutopsyPerformance>(
			"validateAutopsyPerformanceClassCode",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_PERFORMANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AutopsyPerformance target) {

			}

			@Override
			protected void updateToPass(AutopsyPerformance target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AutopsyPerformanceOperations.validateAutopsyPerformanceClassCode(
					(AutopsyPerformance) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyPerformanceClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAutopsyPerformanceMoodCode() {
		OperationsTestCase<AutopsyPerformance> validateAutopsyPerformanceMoodCodeTestCase = new OperationsTestCase<AutopsyPerformance>(
			"validateAutopsyPerformanceMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_PERFORMANCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AutopsyPerformance target) {

			}

			@Override
			protected void updateToPass(AutopsyPerformance target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AutopsyPerformanceOperations.validateAutopsyPerformanceMoodCode(
					(AutopsyPerformance) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyPerformanceMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAutopsyPerformanceCodeP() {
		OperationsTestCase<AutopsyPerformance> validateAutopsyPerformanceCodePTestCase = new OperationsTestCase<AutopsyPerformance>(
			"validateAutopsyPerformanceCodeP",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_PERFORMANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AutopsyPerformance target) {

			}

			@Override
			protected void updateToPass(AutopsyPerformance target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AutopsyPerformanceOperations.validateAutopsyPerformanceCodeP(
					(AutopsyPerformance) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyPerformanceCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAutopsyPerformanceCode() {
		OperationsTestCase<AutopsyPerformance> validateAutopsyPerformanceCodeTestCase = new OperationsTestCase<AutopsyPerformance>(
			"validateAutopsyPerformanceCode",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_PERFORMANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AutopsyPerformance target) {

			}

			@Override
			protected void updateToPass(AutopsyPerformance target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AutopsyPerformanceOperations.validateAutopsyPerformanceCode(
					(AutopsyPerformance) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyPerformanceCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAutopsyPerformanceValue() {
		OperationsTestCase<AutopsyPerformance> validateAutopsyPerformanceValueTestCase = new OperationsTestCase<AutopsyPerformance>(
			"validateAutopsyPerformanceValue",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_PERFORMANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AutopsyPerformance target) {

			}

			@Override
			protected void updateToPass(AutopsyPerformance target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AutopsyPerformanceOperations.validateAutopsyPerformanceValue(
					(AutopsyPerformance) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyPerformanceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAutopsyPerformanceValueP() {
		OperationsTestCase<AutopsyPerformance> validateAutopsyPerformanceValuePTestCase = new OperationsTestCase<AutopsyPerformance>(
			"validateAutopsyPerformanceValueP",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_PERFORMANCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AutopsyPerformance target) {

			}

			@Override
			protected void updateToPass(AutopsyPerformance target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AutopsyPerformanceOperations.validateAutopsyPerformanceValueP(
					(AutopsyPerformance) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyPerformanceValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAutopsyPerformanceUseAssociation() {
		OperationsTestCase<AutopsyPerformance> validateAutopsyPerformanceUseAssociationTestCase = new OperationsTestCase<AutopsyPerformance>(
			"validateAutopsyPerformanceUseAssociation", operationsForOCL.getOCLValue(
				"VALIDATE_AUTOPSY_PERFORMANCE_USE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AutopsyPerformance target) {

			}

			@Override
			protected void updateToPass(AutopsyPerformance target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AutopsyPerformanceOperations.validateAutopsyPerformanceUseAssociation(
					(AutopsyPerformance) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyPerformanceUseAssociationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAutopsyPerformanceHistologicalExamAssociation() {
		OperationsTestCase<AutopsyPerformance> validateAutopsyPerformanceHistologicalExamAssociationTestCase = new OperationsTestCase<AutopsyPerformance>(
			"validateAutopsyPerformanceHistologicalExamAssociation",
			operationsForOCL.getOCLValue(
				"VALIDATE_AUTOPSY_PERFORMANCE_HISTOLOGICAL_EXAM_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AutopsyPerformance target) {

			}

			@Override
			protected void updateToPass(AutopsyPerformance target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AutopsyPerformanceOperations.validateAutopsyPerformanceHistologicalExamAssociation(
					(AutopsyPerformance) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyPerformanceHistologicalExamAssociationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AutopsyPerformanceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AutopsyPerformance> {
		public AutopsyPerformance create() {
			return VsbrFactory.eINSTANCE.createAutopsyPerformance();
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
	private static class ConstructorTestClass extends AutopsyPerformanceOperations {
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

} // AutopsyPerformanceOperations
