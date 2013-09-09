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
import org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionoftheNewborn;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.AbnormalConditionoftheNewbornOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Abnormal Conditionofthe Newborn</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionoftheNewborn#validateAbnormalConditionoftheNewbornTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionoftheNewborn#validateAbnormalConditionoftheNewbornClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionoftheNewborn#validateAbnormalConditionoftheNewbornMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionoftheNewborn#validateAbnormalConditionoftheNewbornCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionoftheNewborn#validateAbnormalConditionoftheNewbornCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionoftheNewborn#validateAbnormalConditionoftheNewbornCodeVS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Code VS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionoftheNewborn#validateAbnormalConditionoftheNewbornValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionoftheNewborn#validateAbnormalConditionoftheNewbornValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abnormal Conditionofthe Newborn Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AbnormalConditionoftheNewbornTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAbnormalConditionoftheNewbornTemplateId() {
		OperationsTestCase<AbnormalConditionoftheNewborn> validateAbnormalConditionoftheNewbornTemplateIdTestCase = new OperationsTestCase<AbnormalConditionoftheNewborn>(
			"validateAbnormalConditionoftheNewbornTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AbnormalConditionoftheNewborn target) {

			}

			@Override
			protected void updateToPass(AbnormalConditionoftheNewborn target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AbnormalConditionoftheNewbornOperations.validateAbnormalConditionoftheNewbornTemplateId(
					(AbnormalConditionoftheNewborn) objectToTest, diagnostician, map);
			}

		};

		validateAbnormalConditionoftheNewbornTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAbnormalConditionoftheNewbornClassCode() {
		OperationsTestCase<AbnormalConditionoftheNewborn> validateAbnormalConditionoftheNewbornClassCodeTestCase = new OperationsTestCase<AbnormalConditionoftheNewborn>(
			"validateAbnormalConditionoftheNewbornClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AbnormalConditionoftheNewborn target) {

			}

			@Override
			protected void updateToPass(AbnormalConditionoftheNewborn target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AbnormalConditionoftheNewbornOperations.validateAbnormalConditionoftheNewbornClassCode(
					(AbnormalConditionoftheNewborn) objectToTest, diagnostician, map);
			}

		};

		validateAbnormalConditionoftheNewbornClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAbnormalConditionoftheNewbornMoodCode() {
		OperationsTestCase<AbnormalConditionoftheNewborn> validateAbnormalConditionoftheNewbornMoodCodeTestCase = new OperationsTestCase<AbnormalConditionoftheNewborn>(
			"validateAbnormalConditionoftheNewbornMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AbnormalConditionoftheNewborn target) {

			}

			@Override
			protected void updateToPass(AbnormalConditionoftheNewborn target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AbnormalConditionoftheNewbornOperations.validateAbnormalConditionoftheNewbornMoodCode(
					(AbnormalConditionoftheNewborn) objectToTest, diagnostician, map);
			}

		};

		validateAbnormalConditionoftheNewbornMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAbnormalConditionoftheNewbornCodeP() {
		OperationsTestCase<AbnormalConditionoftheNewborn> validateAbnormalConditionoftheNewbornCodePTestCase = new OperationsTestCase<AbnormalConditionoftheNewborn>(
			"validateAbnormalConditionoftheNewbornCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AbnormalConditionoftheNewborn target) {

			}

			@Override
			protected void updateToPass(AbnormalConditionoftheNewborn target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AbnormalConditionoftheNewbornOperations.validateAbnormalConditionoftheNewbornCodeP(
					(AbnormalConditionoftheNewborn) objectToTest, diagnostician, map);
			}

		};

		validateAbnormalConditionoftheNewbornCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAbnormalConditionoftheNewbornCode() {
		OperationsTestCase<AbnormalConditionoftheNewborn> validateAbnormalConditionoftheNewbornCodeTestCase = new OperationsTestCase<AbnormalConditionoftheNewborn>(
			"validateAbnormalConditionoftheNewbornCode",
			operationsForOCL.getOCLValue("VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AbnormalConditionoftheNewborn target) {

			}

			@Override
			protected void updateToPass(AbnormalConditionoftheNewborn target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AbnormalConditionoftheNewbornOperations.validateAbnormalConditionoftheNewbornCode(
					(AbnormalConditionoftheNewborn) objectToTest, diagnostician, map);
			}

		};

		validateAbnormalConditionoftheNewbornCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAbnormalConditionoftheNewbornCodeVS() {
		OperationsTestCase<AbnormalConditionoftheNewborn> validateAbnormalConditionoftheNewbornCodeVSTestCase = new OperationsTestCase<AbnormalConditionoftheNewborn>(
			"validateAbnormalConditionoftheNewbornCodeVS",
			operationsForOCL.getOCLValue("VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AbnormalConditionoftheNewborn target) {

			}

			@Override
			protected void updateToPass(AbnormalConditionoftheNewborn target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AbnormalConditionoftheNewbornOperations.validateAbnormalConditionoftheNewbornCodeVS(
					(AbnormalConditionoftheNewborn) objectToTest, diagnostician, map);
			}

		};

		validateAbnormalConditionoftheNewbornCodeVSTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAbnormalConditionoftheNewbornValue() {
		OperationsTestCase<AbnormalConditionoftheNewborn> validateAbnormalConditionoftheNewbornValueTestCase = new OperationsTestCase<AbnormalConditionoftheNewborn>(
			"validateAbnormalConditionoftheNewbornValue",
			operationsForOCL.getOCLValue("VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AbnormalConditionoftheNewborn target) {

			}

			@Override
			protected void updateToPass(AbnormalConditionoftheNewborn target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AbnormalConditionoftheNewbornOperations.validateAbnormalConditionoftheNewbornValue(
					(AbnormalConditionoftheNewborn) objectToTest, diagnostician, map);
			}

		};

		validateAbnormalConditionoftheNewbornValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAbnormalConditionoftheNewbornValueP() {
		OperationsTestCase<AbnormalConditionoftheNewborn> validateAbnormalConditionoftheNewbornValuePTestCase = new OperationsTestCase<AbnormalConditionoftheNewborn>(
			"validateAbnormalConditionoftheNewbornValueP",
			operationsForOCL.getOCLValue("VALIDATE_ABNORMAL_CONDITIONOFTHE_NEWBORN_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AbnormalConditionoftheNewborn target) {

			}

			@Override
			protected void updateToPass(AbnormalConditionoftheNewborn target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AbnormalConditionoftheNewbornOperations.validateAbnormalConditionoftheNewbornValueP(
					(AbnormalConditionoftheNewborn) objectToTest, diagnostician, map);
			}

		};

		validateAbnormalConditionoftheNewbornValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AbnormalConditionoftheNewbornOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AbnormalConditionoftheNewborn> {
		public AbnormalConditionoftheNewborn create() {
			return VsbrFactory.eINSTANCE.createAbnormalConditionoftheNewborn();
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
	private static class ConstructorTestClass extends AbnormalConditionoftheNewbornOperations {
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

} // AbnormalConditionoftheNewbornOperations
