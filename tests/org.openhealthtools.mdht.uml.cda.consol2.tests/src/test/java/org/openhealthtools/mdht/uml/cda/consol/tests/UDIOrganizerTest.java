
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.operations.UDIOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>UDI Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerDeviceIdentifierObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Device Identifier Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerLotOrBatchNumberObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Lot Or Batch Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerSerialNumberObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Serial Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerManufacturingDateObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Manufacturing Date Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerExpirationDateObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Expiration Date Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerDistinctIdentificationCodeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Distinct Identification Code Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerBrandNameObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Brand Name Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerModelNumberObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Model Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerCompanyNameObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Company Name Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerCatalogNumberObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Catalog Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerLatexSafetyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Latex Safety Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerMRISafetyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer MRI Safety Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerImplantableDeviceStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Implantable Device Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getDeviceIdentifierObservation() <em>Get Device Identifier Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getLotOrBatchNumberObservation() <em>Get Lot Or Batch Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getSerialNumberObservation() <em>Get Serial Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getManufacturingDateObservation() <em>Get Manufacturing Date Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getExpirationDateObservation() <em>Get Expiration Date Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getDistinctIdentificationCodeObservation() <em>Get Distinct Identification Code Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getBrandNameObservation() <em>Get Brand Name Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getModelNumberObservation() <em>Get Model Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getCompanyNameObservation() <em>Get Company Name Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getCatalogNumberObservation() <em>Get Catalog Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getLatexSafetyObservation() <em>Get Latex Safety Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getMRISafetyObservation() <em>Get MRI Safety Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getImplantableDeviceStatusObservation() <em>Get Implantable Device Status Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated NOT
 */

public class UDIOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateUDIOrganizerTemplateId() {
		OperationsTestCase<UDIOrganizer> validateUDIOrganizerTemplateIdTestCase = new OperationsTestCase<UDIOrganizer>(
			"validateUDIOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_UDI_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UDIOrganizer target) {

			}

			@Override
			protected void updateToPass(UDIOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UDIOrganizerOperations.validateUDIOrganizerTemplateId(
					(UDIOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateUDIOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateUDIOrganizerId() {
		OperationsTestCase<UDIOrganizer> validateUDIOrganizerIdTestCase = new OperationsTestCase<UDIOrganizer>(
			"validateUDIOrganizerId",
			operationsForOCL.getOCLValue("VALIDATE_UDI_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(UDIOrganizer target) {

			}

			@Override
			protected void updateToPass(UDIOrganizer target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UDIOrganizerOperations.validateUDIOrganizerId((UDIOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateUDIOrganizerIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateUDIOrganizerCodeP() {
		OperationsTestCase<UDIOrganizer> validateUDIOrganizerCodePTestCase = new OperationsTestCase<UDIOrganizer>(
			"validateUDIOrganizerCodeP",
			operationsForOCL.getOCLValue("VALIDATE_UDI_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UDIOrganizer target) {

			}

			@Override
			protected void updateToPass(UDIOrganizer target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UDIOrganizerOperations.validateUDIOrganizerCodeP(
					(UDIOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateUDIOrganizerCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateUDIOrganizerCode() {
		OperationsTestCase<UDIOrganizer> validateUDIOrganizerCodeTestCase = new OperationsTestCase<UDIOrganizer>(
			"validateUDIOrganizerCode",
			operationsForOCL.getOCLValue("VALIDATE_UDI_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UDIOrganizer target) {

			}

			@Override
			protected void updateToPass(UDIOrganizer target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD("code", "2.16.840.1.113883.6.1"));

			}

			@Override
			protected void setDependency(UDIOrganizer target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.UDIOrganizerCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UDIOrganizerOperations.validateUDIOrganizerCode((UDIOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateUDIOrganizerCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateUDIOrganizerStatusCodeP() {
		OperationsTestCase<UDIOrganizer> validateUDIOrganizerStatusCodePTestCase = new OperationsTestCase<UDIOrganizer>(
			"validateUDIOrganizerStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_UDI_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UDIOrganizer target) {

			}

			@Override
			protected void updateToPass(UDIOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UDIOrganizerOperations.validateUDIOrganizerStatusCodeP(
					(UDIOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateUDIOrganizerStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateUDIOrganizerStatusCode() {
		OperationsTestCase<UDIOrganizer> validateUDIOrganizerStatusCodeTestCase = new OperationsTestCase<UDIOrganizer>(
			"validateUDIOrganizerStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_UDI_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UDIOrganizer target) {

			}

			@Override
			protected void updateToPass(UDIOrganizer target) {
				target.init();

				DatatypesFactory.eINSTANCE.createCS("completed");

			}

			@Override
			protected void setDependency(UDIOrganizer target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.UDIOrganizerStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UDIOrganizerOperations.validateUDIOrganizerStatusCode(
					(UDIOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateUDIOrganizerStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateUDIOrganizerClassCode() {
		OperationsTestCase<UDIOrganizer> validateUDIOrganizerClassCodeTestCase = new OperationsTestCase<UDIOrganizer>(
			"validateUDIOrganizerClassCode",
			operationsForOCL.getOCLValue("VALIDATE_UDI_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UDIOrganizer target) {

			}

			@Override
			protected void updateToPass(UDIOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UDIOrganizerOperations.validateUDIOrganizerClassCode(
					(UDIOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateUDIOrganizerClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateUDIOrganizerMoodCode() {
		OperationsTestCase<UDIOrganizer> validateUDIOrganizerMoodCodeTestCase = new OperationsTestCase<UDIOrganizer>(
			"validateUDIOrganizerMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_UDI_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UDIOrganizer target) {

			}

			@Override
			protected void updateToPass(UDIOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UDIOrganizerOperations.validateUDIOrganizerMoodCode(
					(UDIOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateUDIOrganizerMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateUDIOrganizerDeviceIdentifierObservation() {
		OperationsTestCase<UDIOrganizer> validateUDIOrganizerDeviceIdentifierObservationTestCase = new OperationsTestCase<UDIOrganizer>(
			"validateUDIOrganizerDeviceIdentifierObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_UDI_ORGANIZER_DEVICE_IDENTIFIER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UDIOrganizer target) {

			}

			@Override
			protected void updateToPass(UDIOrganizer target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createDeviceIdentifierObservation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UDIOrganizerOperations.validateUDIOrganizerDeviceIdentifierObservation(
					(UDIOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateUDIOrganizerDeviceIdentifierObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateUDIOrganizerLotOrBatchNumberObservation() {
		OperationsTestCase<UDIOrganizer> validateUDIOrganizerLotOrBatchNumberObservationTestCase = new OperationsTestCase<UDIOrganizer>(
			"validateUDIOrganizerLotOrBatchNumberObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_UDI_ORGANIZER_LOT_OR_BATCH_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UDIOrganizer target) {

			}

			@Override
			protected void updateToPass(UDIOrganizer target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createLotOrBatchNumberObservation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UDIOrganizerOperations.validateUDIOrganizerLotOrBatchNumberObservation(
					(UDIOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateUDIOrganizerLotOrBatchNumberObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateUDIOrganizerSerialNumberObservation() {
		OperationsTestCase<UDIOrganizer> validateUDIOrganizerSerialNumberObservationTestCase = new OperationsTestCase<UDIOrganizer>(
			"validateUDIOrganizerSerialNumberObservation", operationsForOCL.getOCLValue(
				"VALIDATE_UDI_ORGANIZER_SERIAL_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UDIOrganizer target) {

			}

			@Override
			protected void updateToPass(UDIOrganizer target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createSerialNumberObservation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UDIOrganizerOperations.validateUDIOrganizerSerialNumberObservation(
					(UDIOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateUDIOrganizerSerialNumberObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateUDIOrganizerManufacturingDateObservation() {
		OperationsTestCase<UDIOrganizer> validateUDIOrganizerManufacturingDateObservationTestCase = new OperationsTestCase<UDIOrganizer>(
			"validateUDIOrganizerManufacturingDateObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_UDI_ORGANIZER_MANUFACTURING_DATE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UDIOrganizer target) {

			}

			@Override
			protected void updateToPass(UDIOrganizer target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createManufacturingDateObservation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UDIOrganizerOperations.validateUDIOrganizerManufacturingDateObservation(
					(UDIOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateUDIOrganizerManufacturingDateObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateUDIOrganizerExpirationDateObservation() {
		OperationsTestCase<UDIOrganizer> validateUDIOrganizerExpirationDateObservationTestCase = new OperationsTestCase<UDIOrganizer>(
			"validateUDIOrganizerExpirationDateObservation", operationsForOCL.getOCLValue(
				"VALIDATE_UDI_ORGANIZER_EXPIRATION_DATE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UDIOrganizer target) {

			}

			@Override
			protected void updateToPass(UDIOrganizer target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createExpirationDateObservation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UDIOrganizerOperations.validateUDIOrganizerExpirationDateObservation(
					(UDIOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateUDIOrganizerExpirationDateObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateUDIOrganizerDistinctIdentificationCodeObservation() {
		OperationsTestCase<UDIOrganizer> validateUDIOrganizerDistinctIdentificationCodeObservationTestCase = new OperationsTestCase<UDIOrganizer>(
			"validateUDIOrganizerDistinctIdentificationCodeObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_UDI_ORGANIZER_DISTINCT_IDENTIFICATION_CODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UDIOrganizer target) {

			}

			@Override
			protected void updateToPass(UDIOrganizer target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createDistinctIdentificationCodeObservation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UDIOrganizerOperations.validateUDIOrganizerDistinctIdentificationCodeObservation(
					(UDIOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateUDIOrganizerDistinctIdentificationCodeObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateUDIOrganizerBrandNameObservation() {
		OperationsTestCase<UDIOrganizer> validateUDIOrganizerBrandNameObservationTestCase = new OperationsTestCase<UDIOrganizer>(
			"validateUDIOrganizerBrandNameObservation", operationsForOCL.getOCLValue(
				"VALIDATE_UDI_ORGANIZER_BRAND_NAME_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UDIOrganizer target) {

			}

			@Override
			protected void updateToPass(UDIOrganizer target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createBrandNameObservation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UDIOrganizerOperations.validateUDIOrganizerBrandNameObservation(
					(UDIOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateUDIOrganizerBrandNameObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateUDIOrganizerModelNumberObservation() {
		OperationsTestCase<UDIOrganizer> validateUDIOrganizerModelNumberObservationTestCase = new OperationsTestCase<UDIOrganizer>(
			"validateUDIOrganizerModelNumberObservation", operationsForOCL.getOCLValue(
				"VALIDATE_UDI_ORGANIZER_MODEL_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UDIOrganizer target) {

			}

			@Override
			protected void updateToPass(UDIOrganizer target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createModelNumberObservation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UDIOrganizerOperations.validateUDIOrganizerModelNumberObservation(
					(UDIOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateUDIOrganizerModelNumberObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateUDIOrganizerCompanyNameObservation() {
		OperationsTestCase<UDIOrganizer> validateUDIOrganizerCompanyNameObservationTestCase = new OperationsTestCase<UDIOrganizer>(
			"validateUDIOrganizerCompanyNameObservation", operationsForOCL.getOCLValue(
				"VALIDATE_UDI_ORGANIZER_COMPANY_NAME_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UDIOrganizer target) {

			}

			@Override
			protected void updateToPass(UDIOrganizer target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createCompanyNameObservation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UDIOrganizerOperations.validateUDIOrganizerCompanyNameObservation(
					(UDIOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateUDIOrganizerCompanyNameObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateUDIOrganizerCatalogNumberObservation() {
		OperationsTestCase<UDIOrganizer> validateUDIOrganizerCatalogNumberObservationTestCase = new OperationsTestCase<UDIOrganizer>(
			"validateUDIOrganizerCatalogNumberObservation", operationsForOCL.getOCLValue(
				"VALIDATE_UDI_ORGANIZER_CATALOG_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UDIOrganizer target) {

			}

			@Override
			protected void updateToPass(UDIOrganizer target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createCatalogNumberObservation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UDIOrganizerOperations.validateUDIOrganizerCatalogNumberObservation(
					(UDIOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateUDIOrganizerCatalogNumberObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateUDIOrganizerLatexSafetyObservation() {
		OperationsTestCase<UDIOrganizer> validateUDIOrganizerLatexSafetyObservationTestCase = new OperationsTestCase<UDIOrganizer>(
			"validateUDIOrganizerLatexSafetyObservation", operationsForOCL.getOCLValue(
				"VALIDATE_UDI_ORGANIZER_LATEX_SAFETY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UDIOrganizer target) {

			}

			@Override
			protected void updateToPass(UDIOrganizer target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createLatexSafetyObservation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UDIOrganizerOperations.validateUDIOrganizerLatexSafetyObservation(
					(UDIOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateUDIOrganizerLatexSafetyObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateUDIOrganizerMRISafetyObservation() {
		OperationsTestCase<UDIOrganizer> validateUDIOrganizerMRISafetyObservationTestCase = new OperationsTestCase<UDIOrganizer>(
			"validateUDIOrganizerMRISafetyObservation", operationsForOCL.getOCLValue(
				"VALIDATE_UDI_ORGANIZER_MRI_SAFETY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UDIOrganizer target) {

			}

			@Override
			protected void updateToPass(UDIOrganizer target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createMRISafetyObservation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UDIOrganizerOperations.validateUDIOrganizerMRISafetyObservation(
					(UDIOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateUDIOrganizerMRISafetyObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateUDIOrganizerImplantableDeviceStatusObservation() {
		OperationsTestCase<UDIOrganizer> validateUDIOrganizerImplantableDeviceStatusObservationTestCase = new OperationsTestCase<UDIOrganizer>(
			"validateUDIOrganizerImplantableDeviceStatusObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_UDI_ORGANIZER_IMPLANTABLE_DEVICE_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UDIOrganizer target) {

			}

			@Override
			protected void updateToPass(UDIOrganizer target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createImplantableDeviceStatusObservation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UDIOrganizerOperations.validateUDIOrganizerImplantableDeviceStatusObservation(
					(UDIOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateUDIOrganizerImplantableDeviceStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testGetDeviceIdentifierObservation() {

		UDIOrganizer target = objectFactory.create();
		target.getDeviceIdentifierObservation();

	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testGetLotOrBatchNumberObservation() {

		UDIOrganizer target = objectFactory.create();
		target.getLotOrBatchNumberObservation();

	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testGetSerialNumberObservation() {

		UDIOrganizer target = objectFactory.create();
		target.getSerialNumberObservation();

	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testGetManufacturingDateObservation() {

		UDIOrganizer target = objectFactory.create();
		target.getManufacturingDateObservation();

	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testGetExpirationDateObservation() {

		UDIOrganizer target = objectFactory.create();
		target.getExpirationDateObservation();

	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testGetDistinctIdentificationCodeObservation() {

		UDIOrganizer target = objectFactory.create();
		target.getDistinctIdentificationCodeObservation();

	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testGetBrandNameObservation() {

		UDIOrganizer target = objectFactory.create();
		target.getBrandNameObservation();

	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testGetModelNumberObservation() {

		UDIOrganizer target = objectFactory.create();
		target.getModelNumberObservation();

	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testGetCompanyNameObservation() {

		UDIOrganizer target = objectFactory.create();
		target.getCompanyNameObservation();

	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testGetCatalogNumberObservation() {

		UDIOrganizer target = objectFactory.create();
		target.getCatalogNumberObservation();

	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testGetLatexSafetyObservation() {

		UDIOrganizer target = objectFactory.create();
		target.getLatexSafetyObservation();

	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testGetMRISafetyObservation() {

		UDIOrganizer target = objectFactory.create();
		target.getMRISafetyObservation();

	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testGetImplantableDeviceStatusObservation() {

		UDIOrganizer target = objectFactory.create();
		target.getImplantableDeviceStatusObservation();

	}

	/**
	*
	* @generated NOT
	*/
	private static class OperationsForOCL extends UDIOrganizerOperations {
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
	* @generated NOT
	*/
	private static class ObjectFactory implements TestObjectFactory<UDIOrganizer> {
		public UDIOrganizer create() {
			return ConsolFactory.eINSTANCE.createUDIOrganizer();
		}
	}

	/**
	*
	* @generated NOT
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated NOT
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated NOT
	*/
	private static class ConstructorTestClass extends UDIOrganizerOperations {
	}

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated NOT
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated NOT
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // UDIOrganizerOperations
