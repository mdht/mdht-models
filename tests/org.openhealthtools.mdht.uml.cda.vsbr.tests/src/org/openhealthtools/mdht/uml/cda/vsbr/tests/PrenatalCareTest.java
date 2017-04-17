
/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.PrenatalCareOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Prenatal Care</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare#validatePrenatalCareTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare#validatePrenatalCareClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare#validatePrenatalCareMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare#validatePrenatalCareNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare#validatePrenatalCareCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare#validatePrenatalCareCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare#validatePrenatalCareEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare#validatePrenatalCareEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Care Entry Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PrenatalCareTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrenatalCareTemplateId() {
		OperationsTestCase<PrenatalCare> validatePrenatalCareTemplateIdTestCase = new OperationsTestCase<PrenatalCare>(
			"validatePrenatalCareTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PRENATAL_CARE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrenatalCare target) {

			}

			@Override
			protected void updateToPass(PrenatalCare target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrenatalCareOperations.validatePrenatalCareTemplateId(
					(PrenatalCare) objectToTest, diagnostician, map);
			}

		};

		validatePrenatalCareTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrenatalCareClassCode() {
		OperationsTestCase<PrenatalCare> validatePrenatalCareClassCodeTestCase = new OperationsTestCase<PrenatalCare>(
			"validatePrenatalCareClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PRENATAL_CARE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrenatalCare target) {

			}

			@Override
			protected void updateToPass(PrenatalCare target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrenatalCareOperations.validatePrenatalCareClassCode(
					(PrenatalCare) objectToTest, diagnostician, map);
			}

		};

		validatePrenatalCareClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrenatalCareMoodCode() {
		OperationsTestCase<PrenatalCare> validatePrenatalCareMoodCodeTestCase = new OperationsTestCase<PrenatalCare>(
			"validatePrenatalCareMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PRENATAL_CARE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrenatalCare target) {

			}

			@Override
			protected void updateToPass(PrenatalCare target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrenatalCareOperations.validatePrenatalCareMoodCode(
					(PrenatalCare) objectToTest, diagnostician, map);
			}

		};

		validatePrenatalCareMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrenatalCareNegationInd() {
		OperationsTestCase<PrenatalCare> validatePrenatalCareNegationIndTestCase = new OperationsTestCase<PrenatalCare>(
			"validatePrenatalCareNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_PRENATAL_CARE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrenatalCare target) {

			}

			@Override
			protected void updateToPass(PrenatalCare target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrenatalCareOperations.validatePrenatalCareNegationInd(
					(PrenatalCare) objectToTest, diagnostician, map);
			}

		};

		validatePrenatalCareNegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrenatalCareCodeP() {
		OperationsTestCase<PrenatalCare> validatePrenatalCareCodePTestCase = new OperationsTestCase<PrenatalCare>(
			"validatePrenatalCareCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PRENATAL_CARE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrenatalCare target) {

			}

			@Override
			protected void updateToPass(PrenatalCare target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrenatalCareOperations.validatePrenatalCareCodeP(
					(PrenatalCare) objectToTest, diagnostician, map);
			}

		};

		validatePrenatalCareCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrenatalCareCode() {
		OperationsTestCase<PrenatalCare> validatePrenatalCareCodeTestCase = new OperationsTestCase<PrenatalCare>(
			"validatePrenatalCareCode",
			operationsForOCL.getOCLValue("VALIDATE_PRENATAL_CARE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrenatalCare target) {

			}

			@Override
			protected void updateToPass(PrenatalCare target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrenatalCareOperations.validatePrenatalCareCode((PrenatalCare) objectToTest, diagnostician, map);
			}

		};

		validatePrenatalCareCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrenatalCareEffectiveTime() {
		OperationsTestCase<PrenatalCare> validatePrenatalCareEffectiveTimeTestCase = new OperationsTestCase<PrenatalCare>(
			"validatePrenatalCareEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PRENATAL_CARE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrenatalCare target) {

			}

			@Override
			protected void updateToPass(PrenatalCare target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrenatalCareOperations.validatePrenatalCareEffectiveTime(
					(PrenatalCare) objectToTest, diagnostician, map);
			}

		};

		validatePrenatalCareEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrenatalCareEntryRelationship() {
		OperationsTestCase<PrenatalCare> validatePrenatalCareEntryRelationshipTestCase = new OperationsTestCase<PrenatalCare>(
			"validatePrenatalCareEntryRelationship",
			operationsForOCL.getOCLValue("VALIDATE_PRENATAL_CARE_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrenatalCare target) {

			}

			@Override
			protected void updateToPass(PrenatalCare target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrenatalCareOperations.validatePrenatalCareEntryRelationship(
					(PrenatalCare) objectToTest, diagnostician, map);
			}

		};

		validatePrenatalCareEntryRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PrenatalCareOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PrenatalCare> {
		public PrenatalCare create() {
			return VsbrFactory.eINSTANCE.createPrenatalCare();
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
	private static class ConstructorTestClass extends PrenatalCareOperations {
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

} // PrenatalCareOperations
