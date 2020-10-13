
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.EntryRelationship;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.CareTeamMemberActOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Care Team Member Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#validateCareTeamMemberActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#validateCareTeamMemberActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#validateCareTeamMemberActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#validateCareTeamMemberActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#validateCareTeamMemberActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#validateCareTeamMemberActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#validateCareTeamMemberActPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#validateCareTeamMemberActParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#validateCareTeamMemberActCareTeamMemberScheduleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act Care Team Member Schedule Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#validateCareTeamMemberActIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#validateCareTeamMemberActIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Act IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberAct#getCareTeamMemberScheduleObservations() <em>Get Care Team Member Schedule Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CareTeamMemberActTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamMemberActTemplateId() {
		OperationsTestCase<CareTeamMemberAct> validateCareTeamMemberActTemplateIdTestCase = new OperationsTestCase<CareTeamMemberAct>(
			"validateCareTeamMemberActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_MEMBER_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberAct target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberActOperations.validateCareTeamMemberActTemplateId(
					(CareTeamMemberAct) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamMemberActId() {
		OperationsTestCase<CareTeamMemberAct> validateCareTeamMemberActIdTestCase = new OperationsTestCase<CareTeamMemberAct>(
			"validateCareTeamMemberActId",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_MEMBER_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberAct target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberAct target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberActOperations.validateCareTeamMemberActId(
					(CareTeamMemberAct) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamMemberActStatusCode() {
		OperationsTestCase<CareTeamMemberAct> validateCareTeamMemberActStatusCodeTestCase = new OperationsTestCase<CareTeamMemberAct>(
			"validateCareTeamMemberActStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_MEMBER_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberAct target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberAct target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberActOperations.validateCareTeamMemberActStatusCode(
					(CareTeamMemberAct) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamMemberActEffectiveTime() {
		OperationsTestCase<CareTeamMemberAct> validateCareTeamMemberActEffectiveTimeTestCase = new OperationsTestCase<CareTeamMemberAct>(
			"validateCareTeamMemberActEffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberAct target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberActOperations.validateCareTeamMemberActEffectiveTime(
					(CareTeamMemberAct) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamMemberActClassCode() {
		OperationsTestCase<CareTeamMemberAct> validateCareTeamMemberActClassCodeTestCase = new OperationsTestCase<CareTeamMemberAct>(
			"validateCareTeamMemberActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_MEMBER_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberAct target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberActOperations.validateCareTeamMemberActClassCode(
					(CareTeamMemberAct) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamMemberActMoodCode() {
		OperationsTestCase<CareTeamMemberAct> validateCareTeamMemberActMoodCodeTestCase = new OperationsTestCase<CareTeamMemberAct>(
			"validateCareTeamMemberActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_MEMBER_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberAct target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberActOperations.validateCareTeamMemberActMoodCode(
					(CareTeamMemberAct) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateCareTeamMemberActPerformer() {
		OperationsTestCase<CareTeamMemberAct> validateCareTeamMemberActPerformerTestCase = new OperationsTestCase<CareTeamMemberAct>(
			"validateCareTeamMemberActPerformer",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_MEMBER_ACT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberAct target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberAct target) {
				target.init();
				target.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
				// target

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberActOperations.validateCareTeamMemberActPerformer(
					(CareTeamMemberAct) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberActPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamMemberActParticipant() {
		OperationsTestCase<CareTeamMemberAct> validateCareTeamMemberActParticipantTestCase = new OperationsTestCase<CareTeamMemberAct>(
			"validateCareTeamMemberActParticipant",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_MEMBER_ACT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberAct target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberAct target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant2());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberActOperations.validateCareTeamMemberActParticipant(
					(CareTeamMemberAct) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberActParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamMemberActCareTeamMemberScheduleObservation() {
		OperationsTestCase<CareTeamMemberAct> validateCareTeamMemberActCareTeamMemberScheduleObservationTestCase = new OperationsTestCase<CareTeamMemberAct>(
			"validateCareTeamMemberActCareTeamMemberScheduleObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_ACT_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberAct target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberAct target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createCareTeamMemberScheduleObservation());

				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberActOperations.validateCareTeamMemberActCareTeamMemberScheduleObservation(
					(CareTeamMemberAct) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberActCareTeamMemberScheduleObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamMemberActIVLTSLow() {
		OperationsTestCase<CareTeamMemberAct> validateCareTeamMemberActIVLTSLowTestCase = new OperationsTestCase<CareTeamMemberAct>(
			"validateCareTeamMemberActIVLTSLow",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_MEMBER_ACT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberAct target) {
				target.init();
				IVL_TS value = DatatypesFactory.eINSTANCE.createIVL_TS();
				// value.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
				target.setEffectiveTime(value);

			}

			@Override
			protected void updateToPass(CareTeamMemberAct target) {
				target.init();
				IVL_TS value = DatatypesFactory.eINSTANCE.createIVL_TS();
				value.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
				target.setEffectiveTime(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberActOperations.validateCareTeamMemberActIVLTSLow(
					(CareTeamMemberAct) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberActIVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamMemberActIVLTSHigh() {
		OperationsTestCase<CareTeamMemberAct> validateCareTeamMemberActIVLTSHighTestCase = new OperationsTestCase<CareTeamMemberAct>(
			"validateCareTeamMemberActIVLTSHigh",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_MEMBER_ACT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberAct target) {
				target.init();
				IVL_TS value = DatatypesFactory.eINSTANCE.createIVL_TS();
				// value.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
				target.setEffectiveTime(value);

			}

			@Override
			protected void updateToPass(CareTeamMemberAct target) {
				target.init();
				IVL_TS value = DatatypesFactory.eINSTANCE.createIVL_TS();
				value.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
				target.setEffectiveTime(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberActOperations.validateCareTeamMemberActIVLTSHigh(
					(CareTeamMemberAct) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberActIVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetCareTeamMemberScheduleObservations() {

		CareTeamMemberAct target = objectFactory.create();
		target.getCareTeamMemberScheduleObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CareTeamMemberActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CareTeamMemberAct> {
		public CareTeamMemberAct create() {
			return ConsolFactory.eINSTANCE.createCareTeamMemberAct();
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
	private static class ConstructorTestClass extends CareTeamMemberActOperations {
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

} // CareTeamMemberActOperations
