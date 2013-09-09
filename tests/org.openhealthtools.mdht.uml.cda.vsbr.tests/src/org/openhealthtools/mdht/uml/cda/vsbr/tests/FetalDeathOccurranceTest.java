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
import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathOccurrance;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.FetalDeathOccurranceOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Fetal Death Occurrance</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathOccurrance#validateFetalDeathOccurranceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathOccurrance#validateFetalDeathOccurranceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathOccurrance#validateFetalDeathOccurranceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathOccurrance#validateFetalDeathOccurranceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathOccurrance#validateFetalDeathOccurranceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathOccurrance#validateFetalDeathOccurranceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathOccurrance#validateFetalDeathOccurranceValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Death Occurrance Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FetalDeathOccurranceTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFetalDeathOccurranceTemplateId() {
		OperationsTestCase<FetalDeathOccurrance> validateFetalDeathOccurranceTemplateIdTestCase = new OperationsTestCase<FetalDeathOccurrance>(
			"validateFetalDeathOccurranceTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DEATH_OCCURRANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeathOccurrance target) {

			}

			@Override
			protected void updateToPass(FetalDeathOccurrance target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeathOccurranceOperations.validateFetalDeathOccurranceTemplateId(
					(FetalDeathOccurrance) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeathOccurranceTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFetalDeathOccurranceClassCode() {
		OperationsTestCase<FetalDeathOccurrance> validateFetalDeathOccurranceClassCodeTestCase = new OperationsTestCase<FetalDeathOccurrance>(
			"validateFetalDeathOccurranceClassCode",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DEATH_OCCURRANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeathOccurrance target) {

			}

			@Override
			protected void updateToPass(FetalDeathOccurrance target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeathOccurranceOperations.validateFetalDeathOccurranceClassCode(
					(FetalDeathOccurrance) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeathOccurranceClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFetalDeathOccurranceMoodCode() {
		OperationsTestCase<FetalDeathOccurrance> validateFetalDeathOccurranceMoodCodeTestCase = new OperationsTestCase<FetalDeathOccurrance>(
			"validateFetalDeathOccurranceMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DEATH_OCCURRANCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeathOccurrance target) {

			}

			@Override
			protected void updateToPass(FetalDeathOccurrance target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeathOccurranceOperations.validateFetalDeathOccurranceMoodCode(
					(FetalDeathOccurrance) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeathOccurranceMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFetalDeathOccurranceCodeP() {
		OperationsTestCase<FetalDeathOccurrance> validateFetalDeathOccurranceCodePTestCase = new OperationsTestCase<FetalDeathOccurrance>(
			"validateFetalDeathOccurranceCodeP",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DEATH_OCCURRANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeathOccurrance target) {

			}

			@Override
			protected void updateToPass(FetalDeathOccurrance target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeathOccurranceOperations.validateFetalDeathOccurranceCodeP(
					(FetalDeathOccurrance) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeathOccurranceCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFetalDeathOccurranceCode() {
		OperationsTestCase<FetalDeathOccurrance> validateFetalDeathOccurranceCodeTestCase = new OperationsTestCase<FetalDeathOccurrance>(
			"validateFetalDeathOccurranceCode",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DEATH_OCCURRANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeathOccurrance target) {

			}

			@Override
			protected void updateToPass(FetalDeathOccurrance target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeathOccurranceOperations.validateFetalDeathOccurranceCode(
					(FetalDeathOccurrance) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeathOccurranceCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFetalDeathOccurranceValue() {
		OperationsTestCase<FetalDeathOccurrance> validateFetalDeathOccurranceValueTestCase = new OperationsTestCase<FetalDeathOccurrance>(
			"validateFetalDeathOccurranceValue",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DEATH_OCCURRANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeathOccurrance target) {

			}

			@Override
			protected void updateToPass(FetalDeathOccurrance target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeathOccurranceOperations.validateFetalDeathOccurranceValue(
					(FetalDeathOccurrance) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeathOccurranceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFetalDeathOccurranceValueP() {
		OperationsTestCase<FetalDeathOccurrance> validateFetalDeathOccurranceValuePTestCase = new OperationsTestCase<FetalDeathOccurrance>(
			"validateFetalDeathOccurranceValueP",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DEATH_OCCURRANCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeathOccurrance target) {

			}

			@Override
			protected void updateToPass(FetalDeathOccurrance target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeathOccurranceOperations.validateFetalDeathOccurranceValueP(
					(FetalDeathOccurrance) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeathOccurranceValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FetalDeathOccurranceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FetalDeathOccurrance> {
		public FetalDeathOccurrance create() {
			return VsbrFactory.eINSTANCE.createFetalDeathOccurrance();
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
	private static class ConstructorTestClass extends FetalDeathOccurranceOperations {
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

} // FetalDeathOccurranceOperations
