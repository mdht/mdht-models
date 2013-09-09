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
import org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresent;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.InfectionPresentOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Infection Present</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresent#validateInfectionPresentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresent#validateInfectionPresentClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresent#validateInfectionPresentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresent#validateInfectionPresentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresent#validateInfectionPresentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresent#validateInfectionPresentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InfectionPresentTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInfectionPresentTemplateId() {
		OperationsTestCase<InfectionPresent> validateInfectionPresentTemplateIdTestCase = new OperationsTestCase<InfectionPresent>(
			"validateInfectionPresentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INFECTION_PRESENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfectionPresent target) {

			}

			@Override
			protected void updateToPass(InfectionPresent target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfectionPresentOperations.validateInfectionPresentTemplateId(
					(InfectionPresent) objectToTest, diagnostician, map);
			}

		};

		validateInfectionPresentTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInfectionPresentClassCode() {
		OperationsTestCase<InfectionPresent> validateInfectionPresentClassCodeTestCase = new OperationsTestCase<InfectionPresent>(
			"validateInfectionPresentClassCode",
			operationsForOCL.getOCLValue("VALIDATE_INFECTION_PRESENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfectionPresent target) {

			}

			@Override
			protected void updateToPass(InfectionPresent target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfectionPresentOperations.validateInfectionPresentClassCode(
					(InfectionPresent) objectToTest, diagnostician, map);
			}

		};

		validateInfectionPresentClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInfectionPresentMoodCode() {
		OperationsTestCase<InfectionPresent> validateInfectionPresentMoodCodeTestCase = new OperationsTestCase<InfectionPresent>(
			"validateInfectionPresentMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_INFECTION_PRESENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfectionPresent target) {

			}

			@Override
			protected void updateToPass(InfectionPresent target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfectionPresentOperations.validateInfectionPresentMoodCode(
					(InfectionPresent) objectToTest, diagnostician, map);
			}

		};

		validateInfectionPresentMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInfectionPresentCodeP() {
		OperationsTestCase<InfectionPresent> validateInfectionPresentCodePTestCase = new OperationsTestCase<InfectionPresent>(
			"validateInfectionPresentCodeP",
			operationsForOCL.getOCLValue("VALIDATE_INFECTION_PRESENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfectionPresent target) {

			}

			@Override
			protected void updateToPass(InfectionPresent target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfectionPresentOperations.validateInfectionPresentCodeP(
					(InfectionPresent) objectToTest, diagnostician, map);
			}

		};

		validateInfectionPresentCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInfectionPresentCode() {
		OperationsTestCase<InfectionPresent> validateInfectionPresentCodeTestCase = new OperationsTestCase<InfectionPresent>(
			"validateInfectionPresentCode",
			operationsForOCL.getOCLValue("VALIDATE_INFECTION_PRESENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfectionPresent target) {

			}

			@Override
			protected void updateToPass(InfectionPresent target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfectionPresentOperations.validateInfectionPresentCode(
					(InfectionPresent) objectToTest, diagnostician, map);
			}

		};

		validateInfectionPresentCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInfectionPresentValue() {
		OperationsTestCase<InfectionPresent> validateInfectionPresentValueTestCase = new OperationsTestCase<InfectionPresent>(
			"validateInfectionPresentValue",
			operationsForOCL.getOCLValue("VALIDATE_INFECTION_PRESENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfectionPresent target) {

			}

			@Override
			protected void updateToPass(InfectionPresent target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfectionPresentOperations.validateInfectionPresentValue(
					(InfectionPresent) objectToTest, diagnostician, map);
			}

		};

		validateInfectionPresentValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends InfectionPresentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<InfectionPresent> {
		public InfectionPresent create() {
			return VsbrFactory.eINSTANCE.createInfectionPresent();
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
	private static class ConstructorTestClass extends InfectionPresentOperations {
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

} // InfectionPresentOperations
