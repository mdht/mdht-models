
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
import org.eclipse.mdht.uml.hl7.datatypes.ED;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.datatypes.IVXB_TS;
import org.eclipse.mdht.uml.hl7.datatypes.TEL;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.CareTeamMemberScheduleObservationV2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Care Team Member Schedule Observation V2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2#validateCareTeamMemberScheduleObservationV2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2#validateCareTeamMemberScheduleObservationV2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2#validateCareTeamMemberScheduleObservationV2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2#validateCareTeamMemberScheduleObservationV2Text(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2#validateCareTeamMemberScheduleObservationV2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2#validateCareTeamMemberScheduleObservationV2ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2#validateCareTeamMemberScheduleObservationV2MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2#validateCareTeamMemberScheduleObservationV2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2#validateCareTeamMemberScheduleObservationV2EDTELValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2EDTEL Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2#validateCareTeamMemberScheduleObservationV2EDReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2ED Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2#validateCareTeamMemberScheduleObservationV2IVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2#validateCareTeamMemberScheduleObservationV2IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation V2IVLTS High</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CareTeamMemberScheduleObservationV2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamMemberScheduleObservationV2TemplateId() {
		OperationsTestCase<CareTeamMemberScheduleObservationV2> validateCareTeamMemberScheduleObservationV2TemplateIdTestCase = new OperationsTestCase<CareTeamMemberScheduleObservationV2>(
			"validateCareTeamMemberScheduleObservationV2TemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberScheduleObservationV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberScheduleObservationV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberScheduleObservationV2Operations.validateCareTeamMemberScheduleObservationV2TemplateId(
					(CareTeamMemberScheduleObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberScheduleObservationV2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamMemberScheduleObservationV2CodeP() {
		OperationsTestCase<CareTeamMemberScheduleObservationV2> validateCareTeamMemberScheduleObservationV2CodePTestCase = new OperationsTestCase<CareTeamMemberScheduleObservationV2>(
			"validateCareTeamMemberScheduleObservationV2CodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberScheduleObservationV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberScheduleObservationV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberScheduleObservationV2Operations.validateCareTeamMemberScheduleObservationV2CodeP(
					(CareTeamMemberScheduleObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberScheduleObservationV2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamMemberScheduleObservationV2Code() {
		OperationsTestCase<CareTeamMemberScheduleObservationV2> validateCareTeamMemberScheduleObservationV2CodeTestCase = new OperationsTestCase<CareTeamMemberScheduleObservationV2>(
			"validateCareTeamMemberScheduleObservationV2Code",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberScheduleObservationV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberScheduleObservationV2 target) {
				target.init();

			}

			@Override
			protected void setDependency(CareTeamMemberScheduleObservationV2 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationV2CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberScheduleObservationV2Operations.validateCareTeamMemberScheduleObservationV2Code(
					(CareTeamMemberScheduleObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberScheduleObservationV2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamMemberScheduleObservationV2Text() {
		OperationsTestCase<CareTeamMemberScheduleObservationV2> validateCareTeamMemberScheduleObservationV2TextTestCase = new OperationsTestCase<CareTeamMemberScheduleObservationV2>(
			"validateCareTeamMemberScheduleObservationV2Text",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberScheduleObservationV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberScheduleObservationV2 target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberScheduleObservationV2Operations.validateCareTeamMemberScheduleObservationV2Text(
					(CareTeamMemberScheduleObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberScheduleObservationV2TextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamMemberScheduleObservationV2Value() {
		OperationsTestCase<CareTeamMemberScheduleObservationV2> validateCareTeamMemberScheduleObservationV2ValueTestCase = new OperationsTestCase<CareTeamMemberScheduleObservationV2>(
			"validateCareTeamMemberScheduleObservationV2Value",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberScheduleObservationV2 target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected void updateToPass(CareTeamMemberScheduleObservationV2 target) {
				target.getValues().clear();
				IVL_TS value = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberScheduleObservationV2Operations.validateCareTeamMemberScheduleObservationV2Value(
					(CareTeamMemberScheduleObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberScheduleObservationV2ValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamMemberScheduleObservationV2ClassCode() {
		OperationsTestCase<CareTeamMemberScheduleObservationV2> validateCareTeamMemberScheduleObservationV2ClassCodeTestCase = new OperationsTestCase<CareTeamMemberScheduleObservationV2>(
			"validateCareTeamMemberScheduleObservationV2ClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberScheduleObservationV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberScheduleObservationV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberScheduleObservationV2Operations.validateCareTeamMemberScheduleObservationV2ClassCode(
					(CareTeamMemberScheduleObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberScheduleObservationV2ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamMemberScheduleObservationV2MoodCode() {
		OperationsTestCase<CareTeamMemberScheduleObservationV2> validateCareTeamMemberScheduleObservationV2MoodCodeTestCase = new OperationsTestCase<CareTeamMemberScheduleObservationV2>(
			"validateCareTeamMemberScheduleObservationV2MoodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberScheduleObservationV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberScheduleObservationV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberScheduleObservationV2Operations.validateCareTeamMemberScheduleObservationV2MoodCode(
					(CareTeamMemberScheduleObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberScheduleObservationV2MoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamMemberScheduleObservationV2StatusCode() {
		OperationsTestCase<CareTeamMemberScheduleObservationV2> validateCareTeamMemberScheduleObservationV2StatusCodeTestCase = new OperationsTestCase<CareTeamMemberScheduleObservationV2>(
			"validateCareTeamMemberScheduleObservationV2StatusCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberScheduleObservationV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberScheduleObservationV2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberScheduleObservationV2Operations.validateCareTeamMemberScheduleObservationV2StatusCode(
					(CareTeamMemberScheduleObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberScheduleObservationV2StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateCareTeamMemberScheduleObservationV2EDTELValue() {
		OperationsTestCase<CareTeamMemberScheduleObservationV2> validateCareTeamMemberScheduleObservationV2EDTELValueTestCase = new OperationsTestCase<CareTeamMemberScheduleObservationV2>(
			"validateCareTeamMemberScheduleObservationV2EDTELValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberScheduleObservationV2 target) {
				target.init();
				ED value = DatatypesFactory.eINSTANCE.createED();
				target.setText(value);
				TEL value2 = DatatypesFactory.eINSTANCE.createTEL();
				target.getText().setReference(value2);

			}

			@Override
			protected void updateToPass(CareTeamMemberScheduleObservationV2 target) {
				target.getText().getReference().setValue("value");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberScheduleObservationV2Operations.validateCareTeamMemberScheduleObservationV2EDTELValue(
					(CareTeamMemberScheduleObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberScheduleObservationV2EDTELValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateCareTeamMemberScheduleObservationV2EDReference() {
		OperationsTestCase<CareTeamMemberScheduleObservationV2> validateCareTeamMemberScheduleObservationV2EDReferenceTestCase = new OperationsTestCase<CareTeamMemberScheduleObservationV2>(
			"validateCareTeamMemberScheduleObservationV2EDReference",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberScheduleObservationV2 target) {
				target.init();
				target.setText(DatatypesFactory.eINSTANCE.createED());

			}

			@Override
			protected void updateToPass(CareTeamMemberScheduleObservationV2 target) {
				target.getText().setReference(DatatypesFactory.eINSTANCE.createTEL());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberScheduleObservationV2Operations.validateCareTeamMemberScheduleObservationV2EDReference(
					(CareTeamMemberScheduleObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberScheduleObservationV2EDReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamMemberScheduleObservationV2IVLTSLow() {
		OperationsTestCase<CareTeamMemberScheduleObservationV2> validateCareTeamMemberScheduleObservationV2IVLTSLowTestCase = new OperationsTestCase<CareTeamMemberScheduleObservationV2>(
			"validateCareTeamMemberScheduleObservationV2IVLTSLow",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberScheduleObservationV2 target) {
				target.init();
				IVL_TS value = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(value);

			}

			@Override
			protected void updateToPass(CareTeamMemberScheduleObservationV2 target) {

				//
				IVXB_TS low = DatatypesFactory.eINSTANCE.createIVXB_TS();
				target.getEffectiveTime().setLow(low);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberScheduleObservationV2Operations.validateCareTeamMemberScheduleObservationV2IVLTSLow(
					(CareTeamMemberScheduleObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberScheduleObservationV2IVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamMemberScheduleObservationV2IVLTSHigh() {
		OperationsTestCase<CareTeamMemberScheduleObservationV2> validateCareTeamMemberScheduleObservationV2IVLTSHighTestCase = new OperationsTestCase<CareTeamMemberScheduleObservationV2>(
			"validateCareTeamMemberScheduleObservationV2IVLTSHigh",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_V2IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberScheduleObservationV2 target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(CareTeamMemberScheduleObservationV2 target) {
				target.getEffectiveTime().setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberScheduleObservationV2Operations.validateCareTeamMemberScheduleObservationV2IVLTSHigh(
					(CareTeamMemberScheduleObservationV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberScheduleObservationV2IVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CareTeamMemberScheduleObservationV2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<CareTeamMemberScheduleObservationV2> {
		public CareTeamMemberScheduleObservationV2 create() {
			return ConsolFactory.eINSTANCE.createCareTeamMemberScheduleObservationV2();
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
	private static class ConstructorTestClass extends CareTeamMemberScheduleObservationV2Operations {
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

} // CareTeamMemberScheduleObservationV2Operations
