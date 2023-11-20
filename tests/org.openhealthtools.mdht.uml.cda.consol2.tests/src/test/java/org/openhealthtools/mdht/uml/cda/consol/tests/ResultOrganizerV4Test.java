
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizerV4;
import org.openhealthtools.mdht.uml.cda.consol.operations.ResultOrganizerV4Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Organizer V4</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizerV4#validateResultOrganizerV4Specimen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer V4 Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizerV4#validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer V4 Specimen Specimen Role Playing Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizerV4#validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer V4 Specimen Specimen Role Playing Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizerV4#validateResultOrganizerV4SpecimenSpecimenRoleSpecimenPlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer V4 Specimen Specimen Role Specimen Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizerV4#validateResultOrganizerV4SpecimenSpecimenRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer V4 Specimen Specimen Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizerV4#validateResultOrganizer2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer2 Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ResultOrganizerV4Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateResultOrganizerV4Specimen() {
		OperationsTestCase<ResultOrganizerV4> validateResultOrganizerV4SpecimenTestCase = new OperationsTestCase<ResultOrganizerV4>(
			"validateResultOrganizerV4Specimen",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizerV4 target) {
				target.init();

			}

			@Override
			protected void updateToPass(ResultOrganizerV4 target) {
				target.getSpecimens().add(CDAFactory.eINSTANCE.createSpecimen());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerV4Operations.validateResultOrganizerV4Specimen(
					(ResultOrganizerV4) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerV4SpecimenTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCode() {
		OperationsTestCase<ResultOrganizerV4> validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCodeTestCase = new OperationsTestCase<ResultOrganizerV4>(
			"validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizerV4 target) {
				target.init();
				target.getSpecimens().add(CDAFactory.eINSTANCE.createSpecimen());
				target.getSpecimens().get(0).setSpecimenRole(CDAFactory.eINSTANCE.createSpecimenRole());
				target.getSpecimens().get(0).getSpecimenRole().setSpecimenPlayingEntity(
					CDAFactory.eINSTANCE.createPlayingEntity());

			}

			@Override
			protected void updateToPass(ResultOrganizerV4 target) {
				target.getSpecimens().get(0).getSpecimenRole().getSpecimenPlayingEntity().setCode(
					DatatypesFactory.eINSTANCE.createCE("code", "2.16.840.1.113883.6.96"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerV4Operations.validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCode(
					(ResultOrganizerV4) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCodeP() {
		OperationsTestCase<ResultOrganizerV4> validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCodePTestCase = new OperationsTestCase<ResultOrganizerV4>(
			"validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizerV4 target) {
				target.init();
				target.getSpecimens().add(CDAFactory.eINSTANCE.createSpecimen());
				target.getSpecimens().get(0).setSpecimenRole(CDAFactory.eINSTANCE.createSpecimenRole());
				target.getSpecimens().get(0).getSpecimenRole().setSpecimenPlayingEntity(
					CDAFactory.eINSTANCE.createPlayingEntity());
			}

			@Override
			protected void updateToPass(ResultOrganizerV4 target) {
				target.getSpecimens().get(0).getSpecimenRole().getSpecimenPlayingEntity().setCode(
					DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerV4Operations.validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCodeP(
					(ResultOrganizerV4) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerV4SpecimenSpecimenRolePlayingEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateResultOrganizerV4SpecimenSpecimenRoleSpecimenPlayingEntity() {
		OperationsTestCase<ResultOrganizerV4> validateResultOrganizerV4SpecimenSpecimenRoleSpecimenPlayingEntityTestCase = new OperationsTestCase<ResultOrganizerV4>(
			"validateResultOrganizerV4SpecimenSpecimenRoleSpecimenPlayingEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE_SPECIMEN_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizerV4 target) {
				target.init();
				target.getSpecimens().add(CDAFactory.eINSTANCE.createSpecimen());
				target.getSpecimens().get(0).setSpecimenRole(CDAFactory.eINSTANCE.createSpecimenRole());
			}

			@Override
			protected void updateToPass(ResultOrganizerV4 target) {
				target.getSpecimens().get(0).getSpecimenRole().setSpecimenPlayingEntity(
					CDAFactory.eINSTANCE.createPlayingEntity());

				// target.getSpecimens().get(0).setSpecimenRole(CDAFactory.eINSTANCE.createSpecimenRole());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerV4Operations.validateResultOrganizerV4SpecimenSpecimenRoleSpecimenPlayingEntity(
					(ResultOrganizerV4) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerV4SpecimenSpecimenRoleSpecimenPlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateResultOrganizerV4SpecimenSpecimenRole() {
		OperationsTestCase<ResultOrganizerV4> validateResultOrganizerV4SpecimenSpecimenRoleTestCase = new OperationsTestCase<ResultOrganizerV4>(
			"validateResultOrganizerV4SpecimenSpecimenRole", operationsForOCL.getOCLValue(
				"VALIDATE_RESULT_ORGANIZER_V4_SPECIMEN_SPECIMEN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizerV4 target) {
				target.init();
				target.getSpecimens().add(CDAFactory.eINSTANCE.createSpecimen());
			}

			@Override
			protected void updateToPass(ResultOrganizerV4 target) {

				target.getSpecimens().get(0).setSpecimenRole(CDAFactory.eINSTANCE.createSpecimenRole());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerV4Operations.validateResultOrganizerV4SpecimenSpecimenRole(
					(ResultOrganizerV4) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerV4SpecimenSpecimenRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateResultOrganizer2TemplateId() {
		OperationsTestCase<ResultOrganizerV4> validateResultOrganizer2TemplateIdTestCase = new OperationsTestCase<ResultOrganizerV4>(
			"validateResultOrganizer2TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizerV4 target) {

			}

			@Override
			protected void updateToPass(ResultOrganizerV4 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultOrganizerV4Operations.validateResultOrganizer2TemplateId(
					(ResultOrganizerV4) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizer2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ResultOrganizerV4Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ResultOrganizerV4> {
		public ResultOrganizerV4 create() {
			return ConsolFactory.eINSTANCE.createResultOrganizerV4();
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
	private static class ConstructorTestClass extends ResultOrganizerV4Operations {
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

} // ResultOrganizerV4Operations
