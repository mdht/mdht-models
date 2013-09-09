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
import org.openhealthtools.mdht.uml.cda.vsbr.DateofLastLiveBirth;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.DateofLastLiveBirthOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Dateof Last Live Birth</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.DateofLastLiveBirth#validateDateofLastLiveBirthTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateof Last Live Birth Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.DateofLastLiveBirth#validateDateofLastLiveBirthMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateof Last Live Birth Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.DateofLastLiveBirth#validateDateofLastLiveBirthCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateof Last Live Birth Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.DateofLastLiveBirth#validateDateofLastLiveBirthCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateof Last Live Birth Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.DateofLastLiveBirth#validateDateofLastLiveBirthValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateof Last Live Birth Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DateofLastLiveBirthTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDateofLastLiveBirthTemplateId() {
		OperationsTestCase<DateofLastLiveBirth> validateDateofLastLiveBirthTemplateIdTestCase = new OperationsTestCase<DateofLastLiveBirth>(
			"validateDateofLastLiveBirthTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DATEOF_LAST_LIVE_BIRTH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DateofLastLiveBirth target) {

			}

			@Override
			protected void updateToPass(DateofLastLiveBirth target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DateofLastLiveBirthOperations.validateDateofLastLiveBirthTemplateId(
					(DateofLastLiveBirth) objectToTest, diagnostician, map);
			}

		};

		validateDateofLastLiveBirthTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDateofLastLiveBirthMoodCode() {
		OperationsTestCase<DateofLastLiveBirth> validateDateofLastLiveBirthMoodCodeTestCase = new OperationsTestCase<DateofLastLiveBirth>(
			"validateDateofLastLiveBirthMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_DATEOF_LAST_LIVE_BIRTH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DateofLastLiveBirth target) {

			}

			@Override
			protected void updateToPass(DateofLastLiveBirth target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DateofLastLiveBirthOperations.validateDateofLastLiveBirthMoodCode(
					(DateofLastLiveBirth) objectToTest, diagnostician, map);
			}

		};

		validateDateofLastLiveBirthMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDateofLastLiveBirthCodeP() {
		OperationsTestCase<DateofLastLiveBirth> validateDateofLastLiveBirthCodePTestCase = new OperationsTestCase<DateofLastLiveBirth>(
			"validateDateofLastLiveBirthCodeP",
			operationsForOCL.getOCLValue("VALIDATE_DATEOF_LAST_LIVE_BIRTH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DateofLastLiveBirth target) {

			}

			@Override
			protected void updateToPass(DateofLastLiveBirth target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DateofLastLiveBirthOperations.validateDateofLastLiveBirthCodeP(
					(DateofLastLiveBirth) objectToTest, diagnostician, map);
			}

		};

		validateDateofLastLiveBirthCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDateofLastLiveBirthCode() {
		OperationsTestCase<DateofLastLiveBirth> validateDateofLastLiveBirthCodeTestCase = new OperationsTestCase<DateofLastLiveBirth>(
			"validateDateofLastLiveBirthCode",
			operationsForOCL.getOCLValue("VALIDATE_DATEOF_LAST_LIVE_BIRTH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DateofLastLiveBirth target) {

			}

			@Override
			protected void updateToPass(DateofLastLiveBirth target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DateofLastLiveBirthOperations.validateDateofLastLiveBirthCode(
					(DateofLastLiveBirth) objectToTest, diagnostician, map);
			}

		};

		validateDateofLastLiveBirthCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDateofLastLiveBirthValue() {
		OperationsTestCase<DateofLastLiveBirth> validateDateofLastLiveBirthValueTestCase = new OperationsTestCase<DateofLastLiveBirth>(
			"validateDateofLastLiveBirthValue",
			operationsForOCL.getOCLValue("VALIDATE_DATEOF_LAST_LIVE_BIRTH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DateofLastLiveBirth target) {

			}

			@Override
			protected void updateToPass(DateofLastLiveBirth target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DateofLastLiveBirthOperations.validateDateofLastLiveBirthValue(
					(DateofLastLiveBirth) objectToTest, diagnostician, map);
			}

		};

		validateDateofLastLiveBirthValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DateofLastLiveBirthOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DateofLastLiveBirth> {
		public DateofLastLiveBirth create() {
			return VsbrFactory.eINSTANCE.createDateofLastLiveBirth();
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
	private static class ConstructorTestClass extends DateofLastLiveBirthOperations {
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

} // DateofLastLiveBirthOperations
