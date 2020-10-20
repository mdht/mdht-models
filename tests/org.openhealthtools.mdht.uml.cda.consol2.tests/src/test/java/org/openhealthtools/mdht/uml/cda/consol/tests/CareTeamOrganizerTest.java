
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
import org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.CareTeamOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Care Team Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerCareTeamMember(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Care Team Member</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerCareLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Care Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerNoteActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Note Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerCareTeamTypeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Care Team Type Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerCareTeamMemberAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Care Team Member Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#validateCareTeamOrganizerIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Organizer IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#getNoteActivity() <em>Get Note Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#getCareTeamTypeObservation() <em>Get Care Team Type Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer#getCareTeamMemberAct() <em>Get Care Team Member Act</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CareTeamOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamOrganizerTemplateId() {
		OperationsTestCase<CareTeamOrganizer> validateCareTeamOrganizerTemplateIdTestCase = new OperationsTestCase<CareTeamOrganizer>(
			"validateCareTeamOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizer target) {

			}

			@Override
			protected void updateToPass(CareTeamOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerOperations.validateCareTeamOrganizerTemplateId(
					(CareTeamOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamOrganizerId() {
		OperationsTestCase<CareTeamOrganizer> validateCareTeamOrganizerIdTestCase = new OperationsTestCase<CareTeamOrganizer>(
			"validateCareTeamOrganizerId",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizer target) {

			}

			@Override
			protected void updateToPass(CareTeamOrganizer target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII("id"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerOperations.validateCareTeamOrganizerId(
					(CareTeamOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamOrganizerCodeP() {
		OperationsTestCase<CareTeamOrganizer> validateCareTeamOrganizerCodePTestCase = new OperationsTestCase<CareTeamOrganizer>(
			"validateCareTeamOrganizerCodeP",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizer target) {

			}

			@Override
			protected void updateToPass(CareTeamOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerOperations.validateCareTeamOrganizerCodeP(
					(CareTeamOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamOrganizerCode() {
		OperationsTestCase<CareTeamOrganizer> validateCareTeamOrganizerCodeTestCase = new OperationsTestCase<CareTeamOrganizer>(
			"validateCareTeamOrganizerCode",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizer target) {

			}

			@Override
			protected void updateToPass(CareTeamOrganizer target) {
				target.init();

			}

			@Override
			protected void setDependency(CareTeamOrganizer target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerOperations.validateCareTeamOrganizerCode(
					(CareTeamOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamOrganizerStatusCodeP() {
		OperationsTestCase<CareTeamOrganizer> validateCareTeamOrganizerStatusCodePTestCase = new OperationsTestCase<CareTeamOrganizer>(
			"validateCareTeamOrganizerStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizer target) {

			}

			@Override
			protected void updateToPass(CareTeamOrganizer target) {
				target.init();
				target.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerOperations.validateCareTeamOrganizerStatusCodeP(
					(CareTeamOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamOrganizerStatusCode() {
		OperationsTestCase<CareTeamOrganizer> validateCareTeamOrganizerStatusCodeTestCase = new OperationsTestCase<CareTeamOrganizer>(
			"validateCareTeamOrganizerStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizer target) {

			}

			@Override
			protected void updateToPass(CareTeamOrganizer target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(CareTeamOrganizer target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerOperations.validateCareTeamOrganizerStatusCode(
					(CareTeamOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamOrganizerEffectiveTime() {
		OperationsTestCase<CareTeamOrganizer> validateCareTeamOrganizerEffectiveTimeTestCase = new OperationsTestCase<CareTeamOrganizer>(
			"validateCareTeamOrganizerEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizer target) {

			}

			@Override
			protected void updateToPass(CareTeamOrganizer target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerOperations.validateCareTeamOrganizerEffectiveTime(
					(CareTeamOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamOrganizerClassCode() {
		OperationsTestCase<CareTeamOrganizer> validateCareTeamOrganizerClassCodeTestCase = new OperationsTestCase<CareTeamOrganizer>(
			"validateCareTeamOrganizerClassCode",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizer target) {

			}

			@Override
			protected void updateToPass(CareTeamOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerOperations.validateCareTeamOrganizerClassCode(
					(CareTeamOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamOrganizerMoodCode() {
		OperationsTestCase<CareTeamOrganizer> validateCareTeamOrganizerMoodCodeTestCase = new OperationsTestCase<CareTeamOrganizer>(
			"validateCareTeamOrganizerMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizer target) {

			}

			@Override
			protected void updateToPass(CareTeamOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerOperations.validateCareTeamOrganizerMoodCode(
					(CareTeamOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	* @Test NOT
	*/

	@Test
	public void testValidateCareTeamOrganizerCareTeamMember() {
		OperationsTestCase<CareTeamOrganizer> validateCareTeamOrganizerCareTeamMemberTestCase = new OperationsTestCase<CareTeamOrganizer>(
			"validateCareTeamOrganizerCareTeamMember", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_ORGANIZER_CARE_TEAM_MEMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizer target) {
			}

			@Override
			protected void updateToPass(CareTeamOrganizer target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant2());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerOperations.validateCareTeamOrganizerCareTeamMember(
					(CareTeamOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerCareTeamMemberTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateCareTeamOrganizerCareLocation() {
		OperationsTestCase<CareTeamOrganizer> validateCareTeamOrganizerCareLocationTestCase = new OperationsTestCase<CareTeamOrganizer>(
			"validateCareTeamOrganizerCareLocation",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_ORGANIZER_CARE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizer target) {

			}

			@Override
			protected void updateToPass(CareTeamOrganizer target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant2());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerOperations.validateCareTeamOrganizerCareLocation(
					(CareTeamOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerCareLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamOrganizerNoteActivity() {
		OperationsTestCase<CareTeamOrganizer> validateCareTeamOrganizerNoteActivityTestCase = new OperationsTestCase<CareTeamOrganizer>(
			"validateCareTeamOrganizerNoteActivity",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_ORGANIZER_NOTE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizer target) {

			}

			@Override
			protected void updateToPass(CareTeamOrganizer target) {
				target.init();

				target.addAct(ConsolFactory.eINSTANCE.createNoteActivity().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerOperations.validateCareTeamOrganizerNoteActivity(
					(CareTeamOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerNoteActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamOrganizerCareTeamTypeObservation() {
		OperationsTestCase<CareTeamOrganizer> validateCareTeamOrganizerCareTeamTypeObservationTestCase = new OperationsTestCase<CareTeamOrganizer>(
			"validateCareTeamOrganizerCareTeamTypeObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_ORGANIZER_CARE_TEAM_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizer target) {

			}

			@Override
			protected void updateToPass(CareTeamOrganizer target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createCareTeamTypeObservation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerOperations.validateCareTeamOrganizerCareTeamTypeObservation(
					(CareTeamOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerCareTeamTypeObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamOrganizerCareTeamMemberAct() {
		OperationsTestCase<CareTeamOrganizer> validateCareTeamOrganizerCareTeamMemberActTestCase = new OperationsTestCase<CareTeamOrganizer>(
			"validateCareTeamOrganizerCareTeamMemberAct", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_ORGANIZER_CARE_TEAM_MEMBER_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizer target) {

			}

			@Override
			protected void updateToPass(CareTeamOrganizer target) {
				target.init();
				target.addAct(ConsolFactory.eINSTANCE.createCareTeamMemberAct().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerOperations.validateCareTeamOrganizerCareTeamMemberAct(
					(CareTeamOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerCareTeamMemberActTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateCareTeamOrganizerAuthor() {
		OperationsTestCase<CareTeamOrganizer> validateCareTeamOrganizerAuthorTestCase = new OperationsTestCase<CareTeamOrganizer>(
			"validateCareTeamOrganizerAuthor",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_ORGANIZER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizer target) {

			}

			@Override
			protected void updateToPass(CareTeamOrganizer target) {
				target.init();

				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerOperations.validateCareTeamOrganizerAuthor(
					(CareTeamOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateCareTeamOrganizerIVLTSLow() {
		OperationsTestCase<CareTeamOrganizer> validateCareTeamOrganizerIVLTSLowTestCase = new OperationsTestCase<CareTeamOrganizer>(
			"validateCareTeamOrganizerIVLTSLow",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_ORGANIZER_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizer target) {
				target.init();
				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS();

				target.setEffectiveTime(ivlts);

			}

			@Override
			protected void updateToPass(CareTeamOrganizer target) {

				target.getEffectiveTime().setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerOperations.validateCareTeamOrganizerIVLTSLow(
					(CareTeamOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerIVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamOrganizerIVLTSHigh() {
		OperationsTestCase<CareTeamOrganizer> validateCareTeamOrganizerIVLTSHighTestCase = new OperationsTestCase<CareTeamOrganizer>(
			"validateCareTeamOrganizerIVLTSHigh",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAM_ORGANIZER_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamOrganizer target) {
				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ivlts);
			}

			@Override
			protected void updateToPass(CareTeamOrganizer target) {
				target.init();
				target.getEffectiveTime().setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamOrganizerOperations.validateCareTeamOrganizerIVLTSHigh(
					(CareTeamOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamOrganizerIVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetNoteActivity() {

		CareTeamOrganizer target = objectFactory.create();
		target.getNoteActivity();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetCareTeamTypeObservation() {

		CareTeamOrganizer target = objectFactory.create();
		target.getCareTeamTypeObservation();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetCareTeamMemberAct() {

		CareTeamOrganizer target = objectFactory.create();
		target.getCareTeamMemberAct();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CareTeamOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CareTeamOrganizer> {
		public CareTeamOrganizer create() {
			return ConsolFactory.eINSTANCE.createCareTeamOrganizer();
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
	private static class ConstructorTestClass extends CareTeamOrganizerOperations {
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

} // CareTeamOrganizerOperations
