
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ST;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.CareTeams;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.CareTeamsOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Care Teams</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeams#validateCareTeamsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeams#validateCareTeamsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeams#validateCareTeamsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeams#validateCareTeamsTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeams#validateCareTeamsText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeams#validateCareTeamsCareTeamOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams Care Team Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeams#getCareTeamOrganizers() <em>Get Care Team Organizers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CareTeamsTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamsTemplateId() {
		OperationsTestCase<CareTeams> validateCareTeamsTemplateIdTestCase = new OperationsTestCase<CareTeams>(
			"validateCareTeamsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAMS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeams target) {

			}

			@Override
			protected void updateToPass(CareTeams target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamsOperations.validateCareTeamsTemplateId((CareTeams) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamsCodeP() {
		OperationsTestCase<CareTeams> validateCareTeamsCodePTestCase = new OperationsTestCase<CareTeams>(
			"validateCareTeamsCodeP",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAMS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(CareTeams target) {

			}

			@Override
			protected void updateToPass(CareTeams target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamsOperations.validateCareTeamsCodeP((CareTeams) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamsCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamsCode() {
		OperationsTestCase<CareTeams> validateCareTeamsCodeTestCase = new OperationsTestCase<CareTeams>(
			"validateCareTeamsCode",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAMS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(CareTeams target) {

			}

			@Override
			protected void updateToPass(CareTeams target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE("85847-2", "2.16.840.1.113883.6.1"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamsOperations.validateCareTeamsCode((CareTeams) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamsTitle() {
		OperationsTestCase<CareTeams> validateCareTeamsTitleTestCase = new OperationsTestCase<CareTeams>(
			"validateCareTeamsTitle",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAMS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(CareTeams target) {

			}

			@Override
			protected void updateToPass(CareTeams target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamsOperations.validateCareTeamsTitle((CareTeams) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamsTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateCareTeamsText() {
		OperationsTestCase<CareTeams> validateCareTeamsTextTestCase = new OperationsTestCase<CareTeams>(
			"validateCareTeamsText",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAMS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(CareTeams target) {

			}

			@Override
			protected void updateToPass(CareTeams target) {
				target.init();

				DatatypesFactory.eINSTANCE.createED();
				target.setText(CDAFactory.eINSTANCE.createStrucDocText());
				// target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamsOperations.validateCareTeamsText((CareTeams) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamsTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateCareTeamsCareTeamOrganizer() {
		OperationsTestCase<CareTeams> validateCareTeamsCareTeamOrganizerTestCase = new OperationsTestCase<CareTeams>(
			"validateCareTeamsCareTeamOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAMS_CARE_TEAM_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeams target) {

			}

			@Override
			protected void updateToPass(CareTeams target) {
				target.init();
				target.addOrganizer(ConsolFactory.eINSTANCE.createCareTeamOrganizer().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamsOperations.validateCareTeamsCareTeamOrganizer(
					(CareTeams) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamsCareTeamOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetCareTeamOrganizers() {

		CareTeams target = objectFactory.create();
		target.getCareTeamOrganizers();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CareTeamsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CareTeams> {
		public CareTeams create() {
			return ConsolFactory.eINSTANCE.createCareTeams();
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
	private static class ConstructorTestClass extends CareTeamsOperations {
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

} // CareTeamsOperations
