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
import org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedure;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.ObstetricProcedureOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Obstetric Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedure#validateObstetricProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedure#validateObstetricProcedureClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedure Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedure#validateObstetricProcedureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedure Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedure#validateObstetricProcedureNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedure Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedure#validateObstetricProcedureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedure Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedure#validateObstetricProcedureCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedure Code P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ObstetricProcedureTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateObstetricProcedureTemplateId() {
		OperationsTestCase<ObstetricProcedure> validateObstetricProcedureTemplateIdTestCase = new OperationsTestCase<ObstetricProcedure>(
			"validateObstetricProcedureTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_OBSTETRIC_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ObstetricProcedure target) {

			}

			@Override
			protected void updateToPass(ObstetricProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ObstetricProcedureOperations.validateObstetricProcedureTemplateId(
					(ObstetricProcedure) objectToTest, diagnostician, map);
			}

		};

		validateObstetricProcedureTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateObstetricProcedureClassCode() {
		OperationsTestCase<ObstetricProcedure> validateObstetricProcedureClassCodeTestCase = new OperationsTestCase<ObstetricProcedure>(
			"validateObstetricProcedureClassCode",
			operationsForOCL.getOCLValue("VALIDATE_OBSTETRIC_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ObstetricProcedure target) {

			}

			@Override
			protected void updateToPass(ObstetricProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ObstetricProcedureOperations.validateObstetricProcedureClassCode(
					(ObstetricProcedure) objectToTest, diagnostician, map);
			}

		};

		validateObstetricProcedureClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateObstetricProcedureMoodCode() {
		OperationsTestCase<ObstetricProcedure> validateObstetricProcedureMoodCodeTestCase = new OperationsTestCase<ObstetricProcedure>(
			"validateObstetricProcedureMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_OBSTETRIC_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ObstetricProcedure target) {

			}

			@Override
			protected void updateToPass(ObstetricProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ObstetricProcedureOperations.validateObstetricProcedureMoodCode(
					(ObstetricProcedure) objectToTest, diagnostician, map);
			}

		};

		validateObstetricProcedureMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateObstetricProcedureNegationInd() {
		OperationsTestCase<ObstetricProcedure> validateObstetricProcedureNegationIndTestCase = new OperationsTestCase<ObstetricProcedure>(
			"validateObstetricProcedureNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_OBSTETRIC_PROCEDURE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ObstetricProcedure target) {

			}

			@Override
			protected void updateToPass(ObstetricProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ObstetricProcedureOperations.validateObstetricProcedureNegationInd(
					(ObstetricProcedure) objectToTest, diagnostician, map);
			}

		};

		validateObstetricProcedureNegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateObstetricProcedureCode() {
		OperationsTestCase<ObstetricProcedure> validateObstetricProcedureCodeTestCase = new OperationsTestCase<ObstetricProcedure>(
			"validateObstetricProcedureCode",
			operationsForOCL.getOCLValue("VALIDATE_OBSTETRIC_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ObstetricProcedure target) {

			}

			@Override
			protected void updateToPass(ObstetricProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ObstetricProcedureOperations.validateObstetricProcedureCode(
					(ObstetricProcedure) objectToTest, diagnostician, map);
			}

		};

		validateObstetricProcedureCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateObstetricProcedureCodeP() {
		OperationsTestCase<ObstetricProcedure> validateObstetricProcedureCodePTestCase = new OperationsTestCase<ObstetricProcedure>(
			"validateObstetricProcedureCodeP",
			operationsForOCL.getOCLValue("VALIDATE_OBSTETRIC_PROCEDURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ObstetricProcedure target) {

			}

			@Override
			protected void updateToPass(ObstetricProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ObstetricProcedureOperations.validateObstetricProcedureCodeP(
					(ObstetricProcedure) objectToTest, diagnostician, map);
			}

		};

		validateObstetricProcedureCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ObstetricProcedureOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ObstetricProcedure> {
		public ObstetricProcedure create() {
			return VsbrFactory.eINSTANCE.createObstetricProcedure();
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
	private static class ConstructorTestClass extends ObstetricProcedureOperations {
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

} // ObstetricProcedureOperations
