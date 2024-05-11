
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ED;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.NoteActivity;
import org.openhealthtools.mdht.uml.cda.consol.operations.NoteActivityOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Note Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NoteActivity#validateNoteActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Note Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NoteActivity#validateNoteActivityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Note Activity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NoteActivity#validateNoteActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Note Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NoteActivity#validateNoteActivityText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Note Activity Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NoteActivity#validateNoteActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Note Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NoteActivity#validateNoteActivityEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Note Activity Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NoteActivity#validateNoteActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Note Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NoteActivity#validateNoteActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Note Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NoteActivity#validateNoteActivityAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Note Activity Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NoteActivity#validateNoteActivityParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Note Activity Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NoteActivity#validateNoteActivityReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Note Activity Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NoteActivity#validateNoteActivityCDTranslation1P(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Note Activity CD Translation1 P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NoteActivity#validateNoteActivityCDTranslation1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Note Activity CD Translation1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NoteActivity#validateNoteActivityIVLTSValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Note Activity IVLTS Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NoteActivityTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNoteActivityTemplateId() {
		OperationsTestCase<NoteActivity> validateNoteActivityTemplateIdTestCase = new OperationsTestCase<NoteActivity>(
			"validateNoteActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_NOTE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NoteActivity target) {

			}

			@Override
			protected void updateToPass(NoteActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NoteActivityOperations.validateNoteActivityTemplateId(
					(NoteActivity) objectToTest, diagnostician, map);
			}

		};

		validateNoteActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNoteActivityCodeP() {
		OperationsTestCase<NoteActivity> validateNoteActivityCodePTestCase = new OperationsTestCase<NoteActivity>(
			"validateNoteActivityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_NOTE_ACTIVITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NoteActivity target) {

			}

			@Override
			protected void updateToPass(NoteActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NoteActivityOperations.validateNoteActivityCodeP(
					(NoteActivity) objectToTest, diagnostician, map);
			}

		};

		validateNoteActivityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNoteActivityCode() {
		OperationsTestCase<NoteActivity> validateNoteActivityCodeTestCase = new OperationsTestCase<NoteActivity>(
			"validateNoteActivityCode",
			operationsForOCL.getOCLValue("VALIDATE_NOTE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NoteActivity target) {

			}

			@Override
			protected void updateToPass(NoteActivity target) {
				target.init();

			}

			@Override
			protected void setDependency(NoteActivity target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.NoteActivityCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NoteActivityOperations.validateNoteActivityCode((NoteActivity) objectToTest, diagnostician, map);
			}

		};

		validateNoteActivityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNoteActivityText() {
		OperationsTestCase<NoteActivity> validateNoteActivityTextTestCase = new OperationsTestCase<NoteActivity>(
			"validateNoteActivityText",
			operationsForOCL.getOCLValue("VALIDATE_NOTE_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NoteActivity target) {

			}

			@Override
			protected void updateToPass(NoteActivity target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NoteActivityOperations.validateNoteActivityText((NoteActivity) objectToTest, diagnostician, map);
			}

		};

		validateNoteActivityTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateNoteActivityStatusCode() {
		OperationsTestCase<NoteActivity> validateNoteActivityStatusCodeTestCase = new OperationsTestCase<NoteActivity>(
			"validateNoteActivityStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_NOTE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NoteActivity target) {

			}

			@Override
			protected void updateToPass(NoteActivity target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NoteActivityOperations.validateNoteActivityStatusCode(
					(NoteActivity) objectToTest, diagnostician, map);
			}

		};

		validateNoteActivityStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNoteActivityEffectiveTime() {
		OperationsTestCase<NoteActivity> validateNoteActivityEffectiveTimeTestCase = new OperationsTestCase<NoteActivity>(
			"validateNoteActivityEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_NOTE_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NoteActivity target) {

			}

			@Override
			protected void updateToPass(NoteActivity target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NoteActivityOperations.validateNoteActivityEffectiveTime(
					(NoteActivity) objectToTest, diagnostician, map);
			}

		};

		validateNoteActivityEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNoteActivityClassCode() {
		OperationsTestCase<NoteActivity> validateNoteActivityClassCodeTestCase = new OperationsTestCase<NoteActivity>(
			"validateNoteActivityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_NOTE_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NoteActivity target) {

			}

			@Override
			protected void updateToPass(NoteActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NoteActivityOperations.validateNoteActivityClassCode(
					(NoteActivity) objectToTest, diagnostician, map);
			}

		};

		validateNoteActivityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNoteActivityMoodCode() {
		OperationsTestCase<NoteActivity> validateNoteActivityMoodCodeTestCase = new OperationsTestCase<NoteActivity>(
			"validateNoteActivityMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_NOTE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NoteActivity target) {

			}

			@Override
			protected void updateToPass(NoteActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NoteActivityOperations.validateNoteActivityMoodCode(
					(NoteActivity) objectToTest, diagnostician, map);
			}

		};

		validateNoteActivityMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateNoteActivityAuthor() {
		OperationsTestCase<NoteActivity> validateNoteActivityAuthorTestCase = new OperationsTestCase<NoteActivity>(
			"validateNoteActivityAuthor",
			operationsForOCL.getOCLValue("VALIDATE_NOTE_ACTIVITY_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NoteActivity target) {

			}

			@Override
			protected void updateToPass(NoteActivity target) {
				target.init();
				// target.getAuthors()
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NoteActivityOperations.validateNoteActivityAuthor(
					(NoteActivity) objectToTest, diagnostician, map);
			}

		};

		validateNoteActivityAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateNoteActivityParticipant() {
		OperationsTestCase<NoteActivity> validateNoteActivityParticipantTestCase = new OperationsTestCase<NoteActivity>(
			"validateNoteActivityParticipant",
			operationsForOCL.getOCLValue("VALIDATE_NOTE_ACTIVITY_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NoteActivity target) {

			}

			@Override
			protected void updateToPass(NoteActivity target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant2());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NoteActivityOperations.validateNoteActivityParticipant(
					(NoteActivity) objectToTest, diagnostician, map);
			}

		};

		validateNoteActivityParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateNoteActivityReference() {
		OperationsTestCase<NoteActivity> validateNoteActivityReferenceTestCase = new OperationsTestCase<NoteActivity>(
			"validateNoteActivityReference",
			operationsForOCL.getOCLValue("VALIDATE_NOTE_ACTIVITY_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NoteActivity target) {

			}

			@Override
			protected void updateToPass(NoteActivity target) {
				target.init();
				target.getReferences().add(CDAFactory.eINSTANCE.createReference());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NoteActivityOperations.validateNoteActivityReference(
					(NoteActivity) objectToTest, diagnostician, map);
			}

		};

		validateNoteActivityReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateNoteActivityCDTranslation1P() {
		OperationsTestCase<NoteActivity> validateNoteActivityCDTranslation1PTestCase = new OperationsTestCase<NoteActivity>(
			"validateNoteActivityCDTranslation1P",
			operationsForOCL.getOCLValue("VALIDATE_NOTE_ACTIVITY_CD_TRANSLATION1_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NoteActivity target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected void updateToPass(NoteActivity target) {
				target.getCode().getTranslations().add(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NoteActivityOperations.validateNoteActivityCDTranslation1P(
					(NoteActivity) objectToTest, diagnostician, map);
			}

		};

		validateNoteActivityCDTranslation1PTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateNoteActivityCDTranslation1() {
		OperationsTestCase<NoteActivity> validateNoteActivityCDTranslation1TestCase = new OperationsTestCase<NoteActivity>(
			"validateNoteActivityCDTranslation1",
			operationsForOCL.getOCLValue("VALIDATE_NOTE_ACTIVITY_CD_TRANSLATION1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NoteActivity target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
				target.getCode().getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(NoteActivity target) {
				for (CD trans : target.getCode().getTranslations()) {
					trans.setCode("28570-0");
					trans.setCodeSystem("2.16.840.1.113883.6.1");
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NoteActivityOperations.validateNoteActivityCDTranslation1(
					(NoteActivity) objectToTest, diagnostician, map);
			}

		};

		validateNoteActivityCDTranslation1TestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateNoteActivityIVLTSValue() {
		OperationsTestCase<NoteActivity> validateNoteActivityIVLTSValueTestCase = new OperationsTestCase<NoteActivity>(
			"validateNoteActivityIVLTSValue",
			operationsForOCL.getOCLValue("VALIDATE_NOTE_ACTIVITY_IVLTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NoteActivity target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());

			}

			@Override
			protected void updateToPass(NoteActivity target) {

				target.getEffectiveTime().setValue("2020");

				// CD value = DatatypesFactory.eINSTANCE.createCD();
				// target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NoteActivityOperations.validateNoteActivityIVLTSValue(
					(NoteActivity) objectToTest, diagnostician, map);
			}

		};

		validateNoteActivityIVLTSValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NoteActivityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NoteActivity> {
		public NoteActivity create() {
			return ConsolFactory.eINSTANCE.createNoteActivity();
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
	private static class ConstructorTestClass extends NoteActivityOperations {
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

} // NoteActivityOperations
