
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention;
import org.openhealthtools.mdht.uml.cda.consol.operations.PregnancyIntentionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pregnancy Intention</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyIntention#validatePregnancyIntentionIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Intention IVLTS High</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PregnancyIntentionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePregnancyIntentionTemplateId() {
		OperationsTestCase<PregnancyIntention> validatePregnancyIntentionTemplateIdTestCase = new OperationsTestCase<PregnancyIntention>(
			"validatePregnancyIntentionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_INTENTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyIntention target) {

			}

			@Override
			protected void updateToPass(PregnancyIntention target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyIntentionOperations.validatePregnancyIntentionTemplateId(
					(PregnancyIntention) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyIntentionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidatePregnancyIntentionId() {
		OperationsTestCase<PregnancyIntention> validatePregnancyIntentionIdTestCase = new OperationsTestCase<PregnancyIntention>(
			"validatePregnancyIntentionId",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_INTENTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyIntention target) {

			}

			@Override
			protected void updateToPass(PregnancyIntention target) {
				target.init();

				target.getIds().add(DatatypesFactory.eINSTANCE.createII("roor"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyIntentionOperations.validatePregnancyIntentionId(
					(PregnancyIntention) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyIntentionIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePregnancyIntentionStatusCode() {
		OperationsTestCase<PregnancyIntention> validatePregnancyIntentionStatusCodeTestCase = new OperationsTestCase<PregnancyIntention>(
			"validatePregnancyIntentionStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_INTENTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyIntention target) {

			}

			@Override
			protected void updateToPass(PregnancyIntention target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyIntentionOperations.validatePregnancyIntentionStatusCode(
					(PregnancyIntention) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyIntentionStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePregnancyIntentionStatusCodeP() {
		OperationsTestCase<PregnancyIntention> validatePregnancyIntentionStatusCodePTestCase = new OperationsTestCase<PregnancyIntention>(
			"validatePregnancyIntentionStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_INTENTION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyIntention target) {

			}

			@Override
			protected void updateToPass(PregnancyIntention target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyIntentionOperations.validatePregnancyIntentionStatusCodeP(
					(PregnancyIntention) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyIntentionStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidatePregnancyIntentionValue() {
		OperationsTestCase<PregnancyIntention> validatePregnancyIntentionValueTestCase = new OperationsTestCase<PregnancyIntention>(
			"validatePregnancyIntentionValue",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_INTENTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyIntention target) {

			}

			@Override
			protected void updateToPass(PregnancyIntention target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("454391000124108", "2.16.840.1.113883.6.96");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyIntentionOperations.validatePregnancyIntentionValue(
					(PregnancyIntention) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyIntentionValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidatePregnancyIntentionValueP() {
		OperationsTestCase<PregnancyIntention> validatePregnancyIntentionValuePTestCase = new OperationsTestCase<PregnancyIntention>(
			"validatePregnancyIntentionValueP",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_INTENTION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyIntention target) {

			}

			@Override
			protected void updateToPass(PregnancyIntention target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyIntentionOperations.validatePregnancyIntentionValueP(
					(PregnancyIntention) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyIntentionValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePregnancyIntentionClassCode() {
		OperationsTestCase<PregnancyIntention> validatePregnancyIntentionClassCodeTestCase = new OperationsTestCase<PregnancyIntention>(
			"validatePregnancyIntentionClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_INTENTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyIntention target) {

			}

			@Override
			protected void updateToPass(PregnancyIntention target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyIntentionOperations.validatePregnancyIntentionClassCode(
					(PregnancyIntention) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyIntentionClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePregnancyIntentionMoodCode() {
		OperationsTestCase<PregnancyIntention> validatePregnancyIntentionMoodCodeTestCase = new OperationsTestCase<PregnancyIntention>(
			"validatePregnancyIntentionMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_INTENTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyIntention target) {

			}

			@Override
			protected void updateToPass(PregnancyIntention target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyIntentionOperations.validatePregnancyIntentionMoodCode(
					(PregnancyIntention) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyIntentionMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePregnancyIntentionCodeP() {
		OperationsTestCase<PregnancyIntention> validatePregnancyIntentionCodePTestCase = new OperationsTestCase<PregnancyIntention>(
			"validatePregnancyIntentionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_INTENTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyIntention target) {

			}

			@Override
			protected void updateToPass(PregnancyIntention target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyIntentionOperations.validatePregnancyIntentionCodeP(
					(PregnancyIntention) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyIntentionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePregnancyIntentionCode() {
		OperationsTestCase<PregnancyIntention> validatePregnancyIntentionCodeTestCase = new OperationsTestCase<PregnancyIntention>(
			"validatePregnancyIntentionCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_INTENTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyIntention target) {

			}

			@Override
			protected void updateToPass(PregnancyIntention target) {
				target.init();

			}

			@Override
			protected void setDependency(PregnancyIntention target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PregnancyIntentionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyIntentionOperations.validatePregnancyIntentionCode(
					(PregnancyIntention) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyIntentionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePregnancyIntentionEffectiveTime() {
		OperationsTestCase<PregnancyIntention> validatePregnancyIntentionEffectiveTimeTestCase = new OperationsTestCase<PregnancyIntention>(
			"validatePregnancyIntentionEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_INTENTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyIntention target) {

			}

			@Override
			protected void updateToPass(PregnancyIntention target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyIntentionOperations.validatePregnancyIntentionEffectiveTime(
					(PregnancyIntention) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyIntentionEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidatePregnancyIntentionIVLTSLow() {
		OperationsTestCase<PregnancyIntention> validatePregnancyIntentionIVLTSLowTestCase = new OperationsTestCase<PregnancyIntention>(
			"validatePregnancyIntentionIVLTSLow",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_INTENTION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyIntention target) {
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(PregnancyIntention target) {
				target.init();

				IVL_TS efftime = DatatypesFactory.eINSTANCE.createIVL_TS("2020", "2023");
				target.setEffectiveTime(efftime);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyIntentionOperations.validatePregnancyIntentionIVLTSLow(
					(PregnancyIntention) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyIntentionIVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidatePregnancyIntentionIVLTSHigh() {
		OperationsTestCase<PregnancyIntention> validatePregnancyIntentionIVLTSHighTestCase = new OperationsTestCase<PregnancyIntention>(
			"validatePregnancyIntentionIVLTSHigh",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_INTENTION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyIntention target) {
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(PregnancyIntention target) {
				target.init();

				IVL_TS efftime = DatatypesFactory.eINSTANCE.createIVL_TS("2020", "2023");
				target.setEffectiveTime(efftime);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyIntentionOperations.validatePregnancyIntentionIVLTSHigh(
					(PregnancyIntention) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyIntentionIVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PregnancyIntentionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PregnancyIntention> {
		public PregnancyIntention create() {
			return ConsolFactory.eINSTANCE.createPregnancyIntention();
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
	private static class ConstructorTestClass extends PregnancyIntentionOperations {
	}

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

} // PregnancyIntentionOperations
