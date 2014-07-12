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
import org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.MaternalMorbidityOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Maternal Morbidity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity#validateMaternalMorbidityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity#validateMaternalMorbidityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity#validateMaternalMorbidityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity#validateMaternalMorbidityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity#validateMaternalMorbidityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity#validateMaternalMorbidityCodeVS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Code VS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity#validateMaternalMorbidityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity#validateMaternalMorbidityValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidity Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MaternalMorbidityTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMaternalMorbidityTemplateId() {
		OperationsTestCase<MaternalMorbidity> validateMaternalMorbidityTemplateIdTestCase = new OperationsTestCase<MaternalMorbidity>(
			"validateMaternalMorbidityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MATERNAL_MORBIDITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MaternalMorbidity target) {

			}

			@Override
			protected void updateToPass(MaternalMorbidity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MaternalMorbidityOperations.validateMaternalMorbidityTemplateId(
					(MaternalMorbidity) objectToTest, diagnostician, map);
			}

		};

		validateMaternalMorbidityTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMaternalMorbidityClassCode() {
		OperationsTestCase<MaternalMorbidity> validateMaternalMorbidityClassCodeTestCase = new OperationsTestCase<MaternalMorbidity>(
			"validateMaternalMorbidityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_MATERNAL_MORBIDITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MaternalMorbidity target) {

			}

			@Override
			protected void updateToPass(MaternalMorbidity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MaternalMorbidityOperations.validateMaternalMorbidityClassCode(
					(MaternalMorbidity) objectToTest, diagnostician, map);
			}

		};

		validateMaternalMorbidityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMaternalMorbidityMoodCode() {
		OperationsTestCase<MaternalMorbidity> validateMaternalMorbidityMoodCodeTestCase = new OperationsTestCase<MaternalMorbidity>(
			"validateMaternalMorbidityMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_MATERNAL_MORBIDITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MaternalMorbidity target) {

			}

			@Override
			protected void updateToPass(MaternalMorbidity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MaternalMorbidityOperations.validateMaternalMorbidityMoodCode(
					(MaternalMorbidity) objectToTest, diagnostician, map);
			}

		};

		validateMaternalMorbidityMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMaternalMorbidityCodeP() {
		OperationsTestCase<MaternalMorbidity> validateMaternalMorbidityCodePTestCase = new OperationsTestCase<MaternalMorbidity>(
			"validateMaternalMorbidityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MATERNAL_MORBIDITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MaternalMorbidity target) {

			}

			@Override
			protected void updateToPass(MaternalMorbidity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MaternalMorbidityOperations.validateMaternalMorbidityCodeP(
					(MaternalMorbidity) objectToTest, diagnostician, map);
			}

		};

		validateMaternalMorbidityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMaternalMorbidityCode() {
		OperationsTestCase<MaternalMorbidity> validateMaternalMorbidityCodeTestCase = new OperationsTestCase<MaternalMorbidity>(
			"validateMaternalMorbidityCode",
			operationsForOCL.getOCLValue("VALIDATE_MATERNAL_MORBIDITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MaternalMorbidity target) {

			}

			@Override
			protected void updateToPass(MaternalMorbidity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MaternalMorbidityOperations.validateMaternalMorbidityCode(
					(MaternalMorbidity) objectToTest, diagnostician, map);
			}

		};

		validateMaternalMorbidityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMaternalMorbidityCodeVS() {
		OperationsTestCase<MaternalMorbidity> validateMaternalMorbidityCodeVSTestCase = new OperationsTestCase<MaternalMorbidity>(
			"validateMaternalMorbidityCodeVS",
			operationsForOCL.getOCLValue("VALIDATE_MATERNAL_MORBIDITY_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MaternalMorbidity target) {

			}

			@Override
			protected void updateToPass(MaternalMorbidity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MaternalMorbidityOperations.validateMaternalMorbidityCodeVS(
					(MaternalMorbidity) objectToTest, diagnostician, map);
			}

		};

		validateMaternalMorbidityCodeVSTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMaternalMorbidityValue() {
		OperationsTestCase<MaternalMorbidity> validateMaternalMorbidityValueTestCase = new OperationsTestCase<MaternalMorbidity>(
			"validateMaternalMorbidityValue",
			operationsForOCL.getOCLValue("VALIDATE_MATERNAL_MORBIDITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MaternalMorbidity target) {

			}

			@Override
			protected void updateToPass(MaternalMorbidity target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MaternalMorbidityOperations.validateMaternalMorbidityValue(
					(MaternalMorbidity) objectToTest, diagnostician, map);
			}

		};

		validateMaternalMorbidityValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMaternalMorbidityValueP() {
		OperationsTestCase<MaternalMorbidity> validateMaternalMorbidityValuePTestCase = new OperationsTestCase<MaternalMorbidity>(
			"validateMaternalMorbidityValueP",
			operationsForOCL.getOCLValue("VALIDATE_MATERNAL_MORBIDITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MaternalMorbidity target) {

			}

			@Override
			protected void updateToPass(MaternalMorbidity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MaternalMorbidityOperations.validateMaternalMorbidityValueP(
					(MaternalMorbidity) objectToTest, diagnostician, map);
			}

		};

		validateMaternalMorbidityValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MaternalMorbidityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MaternalMorbidity> {
		public MaternalMorbidity create() {
			return VsbrFactory.eINSTANCE.createMaternalMorbidity();
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
	private static class ConstructorTestClass extends MaternalMorbidityOperations {
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

} // MaternalMorbidityOperations
