
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
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.CareTeamMemberScheduleObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Care Team Member Schedule Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation#validateCareTeamMemberScheduleObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation#validateCareTeamMemberScheduleObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation#validateCareTeamMemberScheduleObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation#validateCareTeamMemberScheduleObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation#validateCareTeamMemberScheduleObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation#validateCareTeamMemberScheduleObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation#validateCareTeamMemberScheduleObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation#validateCareTeamMemberScheduleObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation#validateCareTeamMemberScheduleObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation#validateCareTeamMemberScheduleObservationEDTELValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation EDTEL Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservation#validateCareTeamMemberScheduleObservationEDReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Team Member Schedule Observation ED Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CareTeamMemberScheduleObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamMemberScheduleObservationTemplateId() {
		OperationsTestCase<CareTeamMemberScheduleObservation> validateCareTeamMemberScheduleObservationTemplateIdTestCase = new OperationsTestCase<CareTeamMemberScheduleObservation>(
			"validateCareTeamMemberScheduleObservationTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberScheduleObservation target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberScheduleObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberScheduleObservationOperations.validateCareTeamMemberScheduleObservationTemplateId(
					(CareTeamMemberScheduleObservation) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberScheduleObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamMemberScheduleObservationCodeP() {
		OperationsTestCase<CareTeamMemberScheduleObservation> validateCareTeamMemberScheduleObservationCodePTestCase = new OperationsTestCase<CareTeamMemberScheduleObservation>(
			"validateCareTeamMemberScheduleObservationCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberScheduleObservation target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberScheduleObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberScheduleObservationOperations.validateCareTeamMemberScheduleObservationCodeP(
					(CareTeamMemberScheduleObservation) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberScheduleObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamMemberScheduleObservationCode() {
		OperationsTestCase<CareTeamMemberScheduleObservation> validateCareTeamMemberScheduleObservationCodeTestCase = new OperationsTestCase<CareTeamMemberScheduleObservation>(
			"validateCareTeamMemberScheduleObservationCode", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberScheduleObservation target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberScheduleObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD("57203-2", "2.16.840.1.113883.6.1");
				// cd.setCode("");
				target.setCode(cd);

			}

			@Override
			protected void setDependency(CareTeamMemberScheduleObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.CareTeamMemberScheduleObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberScheduleObservationOperations.validateCareTeamMemberScheduleObservationCode(
					(CareTeamMemberScheduleObservation) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberScheduleObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamMemberScheduleObservationText() {
		OperationsTestCase<CareTeamMemberScheduleObservation> validateCareTeamMemberScheduleObservationTextTestCase = new OperationsTestCase<CareTeamMemberScheduleObservation>(
			"validateCareTeamMemberScheduleObservationText", operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberScheduleObservation target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberScheduleObservation target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberScheduleObservationOperations.validateCareTeamMemberScheduleObservationText(
					(CareTeamMemberScheduleObservation) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberScheduleObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamMemberScheduleObservationValue() {
		OperationsTestCase<CareTeamMemberScheduleObservation> validateCareTeamMemberScheduleObservationValueTestCase = new OperationsTestCase<CareTeamMemberScheduleObservation>(
			"validateCareTeamMemberScheduleObservationValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberScheduleObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(CareTeamMemberScheduleObservation target) {

				target.getValues().add(DatatypesFactory.eINSTANCE.createTS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberScheduleObservationOperations.validateCareTeamMemberScheduleObservationValue(
					(CareTeamMemberScheduleObservation) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberScheduleObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamMemberScheduleObservationClassCode() {
		OperationsTestCase<CareTeamMemberScheduleObservation> validateCareTeamMemberScheduleObservationClassCodeTestCase = new OperationsTestCase<CareTeamMemberScheduleObservation>(
			"validateCareTeamMemberScheduleObservationClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberScheduleObservation target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberScheduleObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberScheduleObservationOperations.validateCareTeamMemberScheduleObservationClassCode(
					(CareTeamMemberScheduleObservation) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberScheduleObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamMemberScheduleObservationMoodCode() {
		OperationsTestCase<CareTeamMemberScheduleObservation> validateCareTeamMemberScheduleObservationMoodCodeTestCase = new OperationsTestCase<CareTeamMemberScheduleObservation>(
			"validateCareTeamMemberScheduleObservationMoodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberScheduleObservation target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberScheduleObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberScheduleObservationOperations.validateCareTeamMemberScheduleObservationMoodCode(
					(CareTeamMemberScheduleObservation) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberScheduleObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamMemberScheduleObservationStatusCodeP() {
		OperationsTestCase<CareTeamMemberScheduleObservation> validateCareTeamMemberScheduleObservationStatusCodePTestCase = new OperationsTestCase<CareTeamMemberScheduleObservation>(
			"validateCareTeamMemberScheduleObservationStatusCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberScheduleObservation target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberScheduleObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberScheduleObservationOperations.validateCareTeamMemberScheduleObservationStatusCodeP(
					(CareTeamMemberScheduleObservation) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberScheduleObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCareTeamMemberScheduleObservationStatusCode() {
		OperationsTestCase<CareTeamMemberScheduleObservation> validateCareTeamMemberScheduleObservationStatusCodeTestCase = new OperationsTestCase<CareTeamMemberScheduleObservation>(
			"validateCareTeamMemberScheduleObservationStatusCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberScheduleObservation target) {

			}

			@Override
			protected void updateToPass(CareTeamMemberScheduleObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberScheduleObservationOperations.validateCareTeamMemberScheduleObservationStatusCode(
					(CareTeamMemberScheduleObservation) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberScheduleObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateCareTeamMemberScheduleObservationEDTELValue() {
		OperationsTestCase<CareTeamMemberScheduleObservation> validateCareTeamMemberScheduleObservationEDTELValueTestCase = new OperationsTestCase<CareTeamMemberScheduleObservation>(
			"validateCareTeamMemberScheduleObservationEDTELValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_EDTEL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberScheduleObservation target) {
				target.init();
				target.setText(DatatypesFactory.eINSTANCE.createED("xxx"));
				target.getText().setReference(DatatypesFactory.eINSTANCE.createTEL());

			}

			@Override
			protected void updateToPass(CareTeamMemberScheduleObservation target) {
				target.getText().getReference().setValue("valuetest");
				// CD value = DatatypesFactory.eINSTANCE.createCD();
				// target.getValues().add(value);

				// target.getValues().add(DatatypesFactory.eINSTANCE.createED());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberScheduleObservationOperations.validateCareTeamMemberScheduleObservationEDTELValue(
					(CareTeamMemberScheduleObservation) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberScheduleObservationEDTELValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateCareTeamMemberScheduleObservationEDReference() {
		OperationsTestCase<CareTeamMemberScheduleObservation> validateCareTeamMemberScheduleObservationEDReferenceTestCase = new OperationsTestCase<CareTeamMemberScheduleObservation>(
			"validateCareTeamMemberScheduleObservationEDReference",
			operationsForOCL.getOCLValue(
				"VALIDATE_CARE_TEAM_MEMBER_SCHEDULE_OBSERVATION_ED_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CareTeamMemberScheduleObservation target) {
				target.init();
				target.setText(DatatypesFactory.eINSTANCE.createED("TEST"));
			}

			@Override
			protected void updateToPass(CareTeamMemberScheduleObservation target) {
				target.getText().setReference(DatatypesFactory.eINSTANCE.createTEL());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CareTeamMemberScheduleObservationOperations.validateCareTeamMemberScheduleObservationEDReference(
					(CareTeamMemberScheduleObservation) objectToTest, diagnostician, map);
			}

		};

		validateCareTeamMemberScheduleObservationEDReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CareTeamMemberScheduleObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CareTeamMemberScheduleObservation> {
		public CareTeamMemberScheduleObservation create() {
			return ConsolFactory.eINSTANCE.createCareTeamMemberScheduleObservation();
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
	private static class ConstructorTestClass extends CareTeamMemberScheduleObservationOperations {
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

} // CareTeamMemberScheduleObservationOperations
