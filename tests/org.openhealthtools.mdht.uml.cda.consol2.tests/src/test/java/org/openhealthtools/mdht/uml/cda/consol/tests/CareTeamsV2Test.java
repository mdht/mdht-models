
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.StrucDocText;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ST;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.CareTeamsV2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.CareTeamsV2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Care Teams V2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamsV2#validateCareTeamsV2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams V2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamsV2#validateCareTeamsV2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams V2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamsV2#validateCareTeamsV2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams V2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamsV2#validateCareTeamsV2Title(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams V2 Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamsV2#validateCareTeamsV2Text(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams V2 Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamsV2#validateCareTeamsV2CareTeamOrganizerV2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Teams V2 Care Team Organizer V2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamsV2#getCareTeamOrganizerV2s() <em>Get Care Team Organizer V2s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CareTeamsV2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamsV2TemplateId() {
		OperationsTestCase<CareTeamsV2> validateCareTeamsV2TemplateIdTestCase = new OperationsTestCase<CareTeamsV2>(
			"validateCareTeamsV2TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAMS_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamsV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamsV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamsV2Operations.validateCareTeamsV2TemplateId(
					(CareTeamsV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamsV2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamsV2Code() {
		OperationsTestCase<CareTeamsV2> validateCareTeamsV2CodeTestCase = new OperationsTestCase<CareTeamsV2>(
			"validateCareTeamsV2Code",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAMS_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamsV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamsV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamsV2Operations.validateCareTeamsV2Code((CareTeamsV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamsV2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamsV2CodeP() {
		OperationsTestCase<CareTeamsV2> validateCareTeamsV2CodePTestCase = new OperationsTestCase<CareTeamsV2>(
			"validateCareTeamsV2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAMS_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamsV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamsV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamsV2Operations.validateCareTeamsV2CodeP((CareTeamsV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamsV2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamsV2Title() {
		OperationsTestCase<CareTeamsV2> validateCareTeamsV2TitleTestCase = new OperationsTestCase<CareTeamsV2>(
			"validateCareTeamsV2Title",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAMS_V2_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamsV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamsV2 target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamsV2Operations.validateCareTeamsV2Title((CareTeamsV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamsV2TitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamsV2Text() {
		OperationsTestCase<CareTeamsV2> validateCareTeamsV2TextTestCase = new OperationsTestCase<CareTeamsV2>(
			"validateCareTeamsV2Text",
			operationsForOCL.getOCLValue("VALIDATE_CARE_TEAMS_V2_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamsV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamsV2 target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				text.addText("testValidateCareTeamsV2Text");
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamsV2Operations.validateCareTeamsV2Text((CareTeamsV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamsV2TextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateCareTeamsV2CareTeamOrganizerV2() {
		OperationsTestCase<CareTeamsV2> validateCareTeamsV2CareTeamOrganizerV2TestCase = new OperationsTestCase<CareTeamsV2>(
			"validateCareTeamsV2CareTeamOrganizerV2", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAMS_V2_CARE_TEAM_ORGANIZER_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamsV2 target) {

			}

			@Override
			protected void updateToPass(CareTeamsV2 target) {
				target.init();
				target.addOrganizer(ConsolFactory.eINSTANCE.createCareTeamOrganizerV2());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamsV2Operations.validateCareTeamsV2CareTeamOrganizerV2(
					(CareTeamsV2) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamsV2CareTeamOrganizerV2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetCareTeamOrganizerV2s() {

		CareTeamsV2 target = objectFactory.create();
		target.getCareTeamOrganizerV2s();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CareTeamsV2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<CareTeamsV2> {
		public CareTeamsV2 create() {
			return ConsolFactory.eINSTANCE.createCareTeamsV2();
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
	private static class ConstructorTestClass extends CareTeamsV2Operations {
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

} // CareTeamsV2Operations
