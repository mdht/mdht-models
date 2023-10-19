
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ED;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.SectionTimeRangeObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.SectionTimeRangeObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Section Time Range Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SectionTimeRangeObservation#validateSectionTimeRangeObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Section Time Range Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SectionTimeRangeObservation#validateSectionTimeRangeObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Section Time Range Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SectionTimeRangeObservation#validateSectionTimeRangeObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Section Time Range Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SectionTimeRangeObservation#validateSectionTimeRangeObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Section Time Range Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SectionTimeRangeObservation#validateSectionTimeRangeObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Section Time Range Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SectionTimeRangeObservation#validateSectionTimeRangeObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Section Time Range Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SectionTimeRangeObservation#validateSectionTimeRangeObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Section Time Range Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SectionTimeRangeObservation#validateSectionTimeRangeObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Section Time Range Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SectionTimeRangeObservation#validateSectionTimeRangeObservationIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Section Time Range Observation IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SectionTimeRangeObservation#validateSectionTimeRangeObservationIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Section Time Range Observation IVLTS High</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SectionTimeRangeObservationTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateSectionTimeRangeObservationTextReferenceValue() {
		OperationsTestCase<SectionTimeRangeObservation> validateSectionTimeRangeObservationTextReferenceValueTestCase = new NarrativeReferenceTestCase<SectionTimeRangeObservation>(
			"validateSectionTimeRangeObservationTextReferenceValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_SECTION_TIME_RANGE_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SectionTimeRangeObservation target) {
				target.init();

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected void updateToPass(SectionTimeRangeObservation target) {

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SectionTimeRangeObservationOperations.validateSectionTimeRangeObservationTextReferenceValue(
					(SectionTimeRangeObservation) objectToTest, diagnostician, map);
			}

		};

		validateSectionTimeRangeObservationTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSectionTimeRangeObservationTemplateId() {
		OperationsTestCase<SectionTimeRangeObservation> validateSectionTimeRangeObservationTemplateIdTestCase = new OperationsTestCase<SectionTimeRangeObservation>(
			"validateSectionTimeRangeObservationTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_SECTION_TIME_RANGE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SectionTimeRangeObservation target) {

			}

			@Override
			protected void updateToPass(SectionTimeRangeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SectionTimeRangeObservationOperations.validateSectionTimeRangeObservationTemplateId(
					(SectionTimeRangeObservation) objectToTest, diagnostician, map);
			}

		};

		validateSectionTimeRangeObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateSectionTimeRangeObservationCode() {
		OperationsTestCase<SectionTimeRangeObservation> validateSectionTimeRangeObservationCodeTestCase = new OperationsTestCase<SectionTimeRangeObservation>(
			"validateSectionTimeRangeObservationCode", operationsForOCL.getOCLValue(
				"VALIDATE_SECTION_TIME_RANGE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SectionTimeRangeObservation target) {

			}

			@Override
			protected void updateToPass(SectionTimeRangeObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD("82607-3", "2.16.840.1.113883.6.1");
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SectionTimeRangeObservationOperations.validateSectionTimeRangeObservationCode(
					(SectionTimeRangeObservation) objectToTest, diagnostician, map);
			}

		};

		validateSectionTimeRangeObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSectionTimeRangeObservationText() {
		OperationsTestCase<SectionTimeRangeObservation> validateSectionTimeRangeObservationTextTestCase = new OperationsTestCase<SectionTimeRangeObservation>(
			"validateSectionTimeRangeObservationText", operationsForOCL.getOCLValue(
				"VALIDATE_SECTION_TIME_RANGE_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SectionTimeRangeObservation target) {

			}

			@Override
			protected void updateToPass(SectionTimeRangeObservation target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SectionTimeRangeObservationOperations.validateSectionTimeRangeObservationText(
					(SectionTimeRangeObservation) objectToTest, diagnostician, map);
			}

		};

		validateSectionTimeRangeObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSectionTimeRangeObservationStatusCode() {
		OperationsTestCase<SectionTimeRangeObservation> validateSectionTimeRangeObservationStatusCodeTestCase = new OperationsTestCase<SectionTimeRangeObservation>(
			"validateSectionTimeRangeObservationStatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_SECTION_TIME_RANGE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SectionTimeRangeObservation target) {

			}

			@Override
			protected void updateToPass(SectionTimeRangeObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SectionTimeRangeObservationOperations.validateSectionTimeRangeObservationStatusCode(
					(SectionTimeRangeObservation) objectToTest, diagnostician, map);
			}

		};

		validateSectionTimeRangeObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateSectionTimeRangeObservationValue() {
		OperationsTestCase<SectionTimeRangeObservation> validateSectionTimeRangeObservationValueTestCase = new OperationsTestCase<SectionTimeRangeObservation>(
			"validateSectionTimeRangeObservationValue", operationsForOCL.getOCLValue(
				"VALIDATE_SECTION_TIME_RANGE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SectionTimeRangeObservation target) {
				target.getValues().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(SectionTimeRangeObservation target) {
				target.init();
				target.getValues().clear();

				// CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(DatatypesFactory.eINSTANCE.createIVL_TS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SectionTimeRangeObservationOperations.validateSectionTimeRangeObservationValue(
					(SectionTimeRangeObservation) objectToTest, diagnostician, map);
			}

		};

		validateSectionTimeRangeObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSectionTimeRangeObservationClassCode() {
		OperationsTestCase<SectionTimeRangeObservation> validateSectionTimeRangeObservationClassCodeTestCase = new OperationsTestCase<SectionTimeRangeObservation>(
			"validateSectionTimeRangeObservationClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_SECTION_TIME_RANGE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SectionTimeRangeObservation target) {

			}

			@Override
			protected void updateToPass(SectionTimeRangeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SectionTimeRangeObservationOperations.validateSectionTimeRangeObservationClassCode(
					(SectionTimeRangeObservation) objectToTest, diagnostician, map);
			}

		};

		validateSectionTimeRangeObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSectionTimeRangeObservationMoodCode() {
		OperationsTestCase<SectionTimeRangeObservation> validateSectionTimeRangeObservationMoodCodeTestCase = new OperationsTestCase<SectionTimeRangeObservation>(
			"validateSectionTimeRangeObservationMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_SECTION_TIME_RANGE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SectionTimeRangeObservation target) {

			}

			@Override
			protected void updateToPass(SectionTimeRangeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SectionTimeRangeObservationOperations.validateSectionTimeRangeObservationMoodCode(
					(SectionTimeRangeObservation) objectToTest, diagnostician, map);
			}

		};

		validateSectionTimeRangeObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateSectionTimeRangeObservationIVLTSLow() {
		OperationsTestCase<SectionTimeRangeObservation> validateSectionTimeRangeObservationIVLTSLowTestCase = new OperationsTestCase<SectionTimeRangeObservation>(
			"validateSectionTimeRangeObservationIVLTSLow", operationsForOCL.getOCLValue(
				"VALIDATE_SECTION_TIME_RANGE_OBSERVATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SectionTimeRangeObservation target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(SectionTimeRangeObservation target) {
				target.getEffectiveTime().setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SectionTimeRangeObservationOperations.validateSectionTimeRangeObservationIVLTSLow(
					(SectionTimeRangeObservation) objectToTest, diagnostician, map);
			}

		};

		validateSectionTimeRangeObservationIVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateSectionTimeRangeObservationIVLTSHigh() {
		OperationsTestCase<SectionTimeRangeObservation> validateSectionTimeRangeObservationIVLTSHighTestCase = new OperationsTestCase<SectionTimeRangeObservation>(
			"validateSectionTimeRangeObservationIVLTSHigh", operationsForOCL.getOCLValue(
				"VALIDATE_SECTION_TIME_RANGE_OBSERVATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SectionTimeRangeObservation target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(SectionTimeRangeObservation target) {
				target.getEffectiveTime().setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SectionTimeRangeObservationOperations.validateSectionTimeRangeObservationIVLTSHigh(
					(SectionTimeRangeObservation) objectToTest, diagnostician, map);
			}

		};

		validateSectionTimeRangeObservationIVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SectionTimeRangeObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SectionTimeRangeObservation> {
		public SectionTimeRangeObservation create() {
			return ConsolFactory.eINSTANCE.createSectionTimeRangeObservation();
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
	private static class ConstructorTestClass extends SectionTimeRangeObservationOperations {
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

} // SectionTimeRangeObservationOperations
