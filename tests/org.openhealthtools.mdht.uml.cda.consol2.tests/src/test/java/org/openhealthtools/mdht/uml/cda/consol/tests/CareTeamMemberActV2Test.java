
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.CareTeamMemberActV2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Care Team Member Act V2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2#validateCareTeamMemberActV2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2#validateCareTeamMemberActV2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2#validateCareTeamMemberActV2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2#validateCareTeamMemberActV2ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2#validateCareTeamMemberActV2MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2#validateCareTeamMemberActV2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2#validateCareTeamMemberActV2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2#validateCareTeamMemberActV2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2#validateCareTeamMemberActV2Participant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2 Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2#validateCareTeamMemberActV2IVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2#validateCareTeamMemberActV2IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act V2IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2#getCareTeamMemberScheduleObservationV2s() <em>Get Care Team Member Schedule Observation V2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2#getNoteActivities() <em>Get Note Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CareTeamMemberActV2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamMemberActV2TemplateId() {
		OperationsTestCase<CareTeamMemberActV2> validateCareTeamMemberActV2TemplateIdTestCase = new OperationsTestCase<CareTeamMemberActV2>(
			"validateCareTeamMemberActV2TemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_ACT_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberActV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberActV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberActV2Operations.validateCareTeamMemberActV2TemplateId(
					(CareTeamMemberActV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberActV2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateCareTeamMemberActV2Id() {
		OperationsTestCase<CareTeamMemberActV2> validateCareTeamMemberActV2IdTestCase = new OperationsTestCase<CareTeamMemberActV2>(
			"validateCareTeamMemberActV2Id",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_MEMBER_ACT_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberActV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberActV2 target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberActV2Operations.validateCareTeamMemberActV2Id(
					(CareTeamMemberActV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberActV2IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamMemberActV2StatusCode() {
		OperationsTestCase<CareTeamMemberActV2> validateCareTeamMemberActV2StatusCodeTestCase = new OperationsTestCase<CareTeamMemberActV2>(
			"validateCareTeamMemberActV2StatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_ACT_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberActV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberActV2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberActV2Operations.validateCareTeamMemberActV2StatusCode(
					(CareTeamMemberActV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberActV2StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamMemberActV2EffectiveTime() {
		OperationsTestCase<CareTeamMemberActV2> validateCareTeamMemberActV2EffectiveTimeTestCase = new OperationsTestCase<CareTeamMemberActV2>(
			"validateCareTeamMemberActV2EffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_ACT_V2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberActV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberActV2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberActV2Operations.validateCareTeamMemberActV2EffectiveTime(
					(CareTeamMemberActV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberActV2EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamMemberActV2ClassCode() {
		OperationsTestCase<CareTeamMemberActV2> validateCareTeamMemberActV2ClassCodeTestCase = new OperationsTestCase<CareTeamMemberActV2>(
			"validateCareTeamMemberActV2ClassCode",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_MEMBER_ACT_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberActV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberActV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberActV2Operations.validateCareTeamMemberActV2ClassCode(
					(CareTeamMemberActV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberActV2ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamMemberActV2MoodCode() {
		OperationsTestCase<CareTeamMemberActV2> validateCareTeamMemberActV2MoodCodeTestCase = new OperationsTestCase<CareTeamMemberActV2>(
			"validateCareTeamMemberActV2MoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_MEMBER_ACT_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberActV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberActV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberActV2Operations.validateCareTeamMemberActV2MoodCode(
					(CareTeamMemberActV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberActV2MoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamMemberActV2CodeP() {
		OperationsTestCase<CareTeamMemberActV2> validateCareTeamMemberActV2CodePTestCase = new OperationsTestCase<CareTeamMemberActV2>(
			"validateCareTeamMemberActV2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_MEMBER_ACT_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberActV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberActV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberActV2Operations.validateCareTeamMemberActV2CodeP(
					(CareTeamMemberActV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberActV2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamMemberActV2Code() {
		OperationsTestCase<CareTeamMemberActV2> validateCareTeamMemberActV2CodeTestCase = new OperationsTestCase<CareTeamMemberActV2>(
			"validateCareTeamMemberActV2Code",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_MEMBER_ACT_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberActV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberActV2 target) {
				target.init();

			}

			@Override
			protected void setDependency(CareTeamMemberActV2 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberActV2CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberActV2Operations.validateCareTeamMemberActV2Code(
					(CareTeamMemberActV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberActV2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateCareTeamMemberActV2Participant() {
		OperationsTestCase<CareTeamMemberActV2> validateCareTeamMemberActV2ParticipantTestCase = new OperationsTestCase<CareTeamMemberActV2>(
			"validateCareTeamMemberActV2Participant", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_ACT_V2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberActV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberActV2 target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant2());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberActV2Operations.validateCareTeamMemberActV2Participant(
					(CareTeamMemberActV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberActV2ParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateCareTeamMemberActV2IVLTSLow() {
		OperationsTestCase<CareTeamMemberActV2> validateCareTeamMemberActV2IVLTSLowTestCase = new OperationsTestCase<CareTeamMemberActV2>(
			"validateCareTeamMemberActV2IVLTSLow",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_MEMBER_ACT_V2IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberActV2 target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(CareTeamMemberActV2 target) {
				target.getEffectiveTime().setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberActV2Operations.validateCareTeamMemberActV2IVLTSLow(
					(CareTeamMemberActV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberActV2IVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamMemberActV2IVLTSHigh() {
		OperationsTestCase<CareTeamMemberActV2> validateCareTeamMemberActV2IVLTSHighTestCase = new OperationsTestCase<CareTeamMemberActV2>(
			"validateCareTeamMemberActV2IVLTSHigh",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_MEMBER_ACT_V2IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberActV2 target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(CareTeamMemberActV2 target) {
				target.getEffectiveTime().setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberActV2Operations.validateCareTeamMemberActV2IVLTSHigh(
					(CareTeamMemberActV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberActV2IVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetCareTeamMemberScheduleObservationV2s() {

		CareTeamMemberActV2 target = objectFactory.create();
		target.getCareTeamMemberScheduleObservationV2s();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetNoteActivities() {

		CareTeamMemberActV2 target = objectFactory.create();
		target.getNoteActivities();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CareTeamMemberActV2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<CareTeamMemberActV2> {
		public CareTeamMemberActV2 create() {
			return ConsolFactory.eINSTANCE.createCareTeamMemberActV2();
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
	private static class ConstructorTestClass extends CareTeamMemberActV2Operations {
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

} // CareTeamMemberActV2Operations
