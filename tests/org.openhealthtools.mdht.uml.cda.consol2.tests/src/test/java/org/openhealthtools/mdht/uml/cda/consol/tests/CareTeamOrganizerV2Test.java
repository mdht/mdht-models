
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.CareTeamOrganizerV2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Care Team Organizer V2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2CareTeamMember(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Care Team Member</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2CareLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Care Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2NoteActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Note Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2CareTeamTypeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Care Team Type Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2CareTeamMemberActV2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2 Care Team Member Act V2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2IVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#validateCareTeamOrganizerV2IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer V2IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#getNoteActivities() <em>Get Note Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#getCareTeamTypeObservations() <em>Get Care Team Type Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2#getCareTeamMemberActV2s() <em>Get Care Team Member Act V2s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CareTeamOrganizerV2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamOrganizerV2TemplateId() {
		OperationsTestCase<CareTeamOrganizerV2> validateCareTeamOrganizerV2TemplateIdTestCase = new OperationsTestCase<CareTeamOrganizerV2>(
			"validateCareTeamOrganizerV2TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_ORGANIZER_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizerV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamOrganizerV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2TemplateId(
					(CareTeamOrganizerV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerV2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamOrganizerV2Id() {
		OperationsTestCase<CareTeamOrganizerV2> validateCareTeamOrganizerV2IdTestCase = new OperationsTestCase<CareTeamOrganizerV2>(
			"validateCareTeamOrganizerV2Id",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_ORGANIZER_V2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizerV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamOrganizerV2 target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2Id(
					(CareTeamOrganizerV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerV2IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamOrganizerV2Code() {
		OperationsTestCase<CareTeamOrganizerV2> validateCareTeamOrganizerV2CodeTestCase = new OperationsTestCase<CareTeamOrganizerV2>(
			"validateCareTeamOrganizerV2Code",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_ORGANIZER_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizerV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamOrganizerV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2Code(
					(CareTeamOrganizerV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerV2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamOrganizerV2CodeP() {
		OperationsTestCase<CareTeamOrganizerV2> validateCareTeamOrganizerV2CodePTestCase = new OperationsTestCase<CareTeamOrganizerV2>(
			"validateCareTeamOrganizerV2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_ORGANIZER_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizerV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamOrganizerV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2CodeP(
					(CareTeamOrganizerV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerV2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamOrganizerV2StatusCode() {
		OperationsTestCase<CareTeamOrganizerV2> validateCareTeamOrganizerV2StatusCodeTestCase = new OperationsTestCase<CareTeamOrganizerV2>(
			"validateCareTeamOrganizerV2StatusCode",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_ORGANIZER_V2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizerV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamOrganizerV2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2StatusCode(
					(CareTeamOrganizerV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerV2StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamOrganizerV2EffectiveTime() {
		OperationsTestCase<CareTeamOrganizerV2> validateCareTeamOrganizerV2EffectiveTimeTestCase = new OperationsTestCase<CareTeamOrganizerV2>(
			"validateCareTeamOrganizerV2EffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_ORGANIZER_V2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizerV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamOrganizerV2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2EffectiveTime(
					(CareTeamOrganizerV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerV2EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamOrganizerV2ClassCode() {
		OperationsTestCase<CareTeamOrganizerV2> validateCareTeamOrganizerV2ClassCodeTestCase = new OperationsTestCase<CareTeamOrganizerV2>(
			"validateCareTeamOrganizerV2ClassCode",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_ORGANIZER_V2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizerV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamOrganizerV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2ClassCode(
					(CareTeamOrganizerV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerV2ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamOrganizerV2MoodCode() {
		OperationsTestCase<CareTeamOrganizerV2> validateCareTeamOrganizerV2MoodCodeTestCase = new OperationsTestCase<CareTeamOrganizerV2>(
			"validateCareTeamOrganizerV2MoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_ORGANIZER_V2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizerV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamOrganizerV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2MoodCode(
					(CareTeamOrganizerV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerV2MoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateCareTeamOrganizerV2CareTeamMember() {
		OperationsTestCase<CareTeamOrganizerV2> validateCareTeamOrganizerV2CareTeamMemberTestCase = new OperationsTestCase<CareTeamOrganizerV2>(
			"validateCareTeamOrganizerV2CareTeamMember", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_TEAM_MEMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
				this.skipPassTest();
			}

			@Override
			protected void updateToFail(CareTeamOrganizerV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamOrganizerV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2CareTeamMember(
					(CareTeamOrganizerV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerV2CareTeamMemberTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateCareTeamOrganizerV2CareLocation() {
		OperationsTestCase<CareTeamOrganizerV2> validateCareTeamOrganizerV2CareLocationTestCase = new OperationsTestCase<CareTeamOrganizerV2>(
			"validateCareTeamOrganizerV2CareLocation", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
				this.skipPassTest();
			}

			@Override
			protected void updateToFail(CareTeamOrganizerV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamOrganizerV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2CareLocation(
					(CareTeamOrganizerV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerV2CareLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamOrganizerV2NoteActivity() {
		OperationsTestCase<CareTeamOrganizerV2> validateCareTeamOrganizerV2NoteActivityTestCase = new OperationsTestCase<CareTeamOrganizerV2>(
			"validateCareTeamOrganizerV2NoteActivity", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_ORGANIZER_V2_NOTE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizerV2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(CareTeamOrganizerV2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createNoteActivity().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2NoteActivity(
					(CareTeamOrganizerV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerV2NoteActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamOrganizerV2CareTeamTypeObservation() {
		OperationsTestCase<CareTeamOrganizerV2> validateCareTeamOrganizerV2CareTeamTypeObservationTestCase = new OperationsTestCase<CareTeamOrganizerV2>(
			"validateCareTeamOrganizerV2CareTeamTypeObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_TEAM_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizerV2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(CareTeamOrganizerV2 target) {
				target.addObservation(ConsolFactory.eINSTANCE.createCareTeamTypeObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2CareTeamTypeObservation(
					(CareTeamOrganizerV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerV2CareTeamTypeObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamOrganizerV2CareTeamMemberActV2() {
		OperationsTestCase<CareTeamOrganizerV2> validateCareTeamOrganizerV2CareTeamMemberActV2TestCase = new OperationsTestCase<CareTeamOrganizerV2>(
			"validateCareTeamOrganizerV2CareTeamMemberActV2",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_ORGANIZER_V2_CARE_TEAM_MEMBER_ACT_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizerV2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(CareTeamOrganizerV2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createCareTeamMemberActV2().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2CareTeamMemberActV2(
					(CareTeamOrganizerV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerV2CareTeamMemberActV2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamOrganizerV2IVLTSLow() {
		OperationsTestCase<CareTeamOrganizerV2> validateCareTeamOrganizerV2IVLTSLowTestCase = new OperationsTestCase<CareTeamOrganizerV2>(
			"validateCareTeamOrganizerV2IVLTSLow",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_ORGANIZER_V2IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizerV2 target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(CareTeamOrganizerV2 target) {
				target.getEffectiveTime().setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2IVLTSLow(
					(CareTeamOrganizerV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerV2IVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateCareTeamOrganizerV2IVLTSHigh() {
		OperationsTestCase<CareTeamOrganizerV2> validateCareTeamOrganizerV2IVLTSHighTestCase = new OperationsTestCase<CareTeamOrganizerV2>(
			"validateCareTeamOrganizerV2IVLTSHigh",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_ORGANIZER_V2IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizerV2 target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(CareTeamOrganizerV2 target) {
				target.getEffectiveTime().setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerV2Operations.validateCareTeamOrganizerV2IVLTSHigh(
					(CareTeamOrganizerV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerV2IVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetNoteActivities() {

		CareTeamOrganizerV2 target = objectFactory.create();
		target.getNoteActivities();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetCareTeamTypeObservations() {

		CareTeamOrganizerV2 target = objectFactory.create();
		target.getCareTeamTypeObservations();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetCareTeamMemberActV2s() {

		CareTeamOrganizerV2 target = objectFactory.create();
		target.getCareTeamMemberActV2s();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CareTeamOrganizerV2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<CareTeamOrganizerV2> {
		public CareTeamOrganizerV2 create() {
			return ConsolFactory.eINSTANCE.createCareTeamOrganizerV2();
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
	private static class ConstructorTestClass extends CareTeamOrganizerV2Operations {
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

} // CareTeamOrganizerV2Operations
