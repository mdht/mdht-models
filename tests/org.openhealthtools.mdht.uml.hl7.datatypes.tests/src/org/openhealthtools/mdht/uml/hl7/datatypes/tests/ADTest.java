/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.AD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.operations.ADOperations;
import org.eclipse.mdht.uml.hl7.vocab.AddressPartType;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>AD</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateDelimiter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delimiter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateCounty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate County</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validatePostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateHouseNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate House Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateHouseNumberNumeric(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate House Number Numeric</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateDirection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Direction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateStreetName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Street Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateStreetNameBase(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Street Name Base</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateStreetNameType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Street Name Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateAdditionalLocator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Locator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateUnitID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateUnitType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateCareOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateCensusTract(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Census Tract</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateDeliveryAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delivery Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateDeliveryInstallationType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delivery Installation Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateDeliveryInstallationArea(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delivery Installation Area</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateDeliveryInstallationQualifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delivery Installation Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateDeliveryMode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delivery Mode</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateDeliveryModeIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delivery Mode Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateBuildingNumberSuffix(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Building Number Suffix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validatePostBox(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Box</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validatePrecinct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precinct</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addDelimiter(java.lang.String) <em>Add Delimiter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addCountry(java.lang.String) <em>Add Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addState(java.lang.String) <em>Add State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addCounty(java.lang.String) <em>Add County</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addCity(java.lang.String) <em>Add City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addPostalCode(java.lang.String) <em>Add Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addStreetAddressLine(java.lang.String) <em>Add Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addHouseNumber(java.lang.String) <em>Add House Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addHouseNumberNumeric(java.lang.String) <em>Add House Number Numeric</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addDirection(java.lang.String) <em>Add Direction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addStreetName(java.lang.String) <em>Add Street Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addStreetNameBase(java.lang.String) <em>Add Street Name Base</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addStreetNameType(java.lang.String) <em>Add Street Name Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addAdditionalLocator(java.lang.String) <em>Add Additional Locator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addUnitID(java.lang.String) <em>Add Unit ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addUnitType(java.lang.String) <em>Add Unit Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addCareOf(java.lang.String) <em>Add Care Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addCensusTract(java.lang.String) <em>Add Census Tract</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addDeliveryAddressLine(java.lang.String) <em>Add Delivery Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addDeliveryInstallationType(java.lang.String) <em>Add Delivery Installation Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addDeliveryInstallationArea(java.lang.String) <em>Add Delivery Installation Area</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addDeliveryInstallationQualifier(java.lang.String) <em>Add Delivery Installation Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addDeliveryMode(java.lang.String) <em>Add Delivery Mode</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addDeliveryModeIdentifier(java.lang.String) <em>Add Delivery Mode Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addBuildingNumberSuffix(java.lang.String) <em>Add Building Number Suffix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addPostBox(java.lang.String) <em>Add Post Box</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addPrecinct(java.lang.String) <em>Add Precinct</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addText(java.lang.String) <em>Add Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getText() <em>Get Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ADTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDelimiter() {
		OperationsTestCase<AD> validateDelimiterTestCase = new OperationsTestCase<AD>(
			"validateDelimiter", operationsForOCL.getOCLValue("VALIDATE_DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getDelimiters().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getDelimiters().clear();
				target.getDelimiters().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DEL, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validateDelimiter((AD) objectToTest, diagnostician, map);
			}

		};

		validateDelimiterTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCountry() {
		OperationsTestCase<AD> validateCountryTestCase = new OperationsTestCase<AD>(
			"validateCountry", operationsForOCL.getOCLValue("VALIDATE_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getCountries().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getCountries().clear();
				target.getCountries().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CNT, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validateCountry((AD) objectToTest, diagnostician, map);
			}

		};

		validateCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateState() {
		OperationsTestCase<AD> validateStateTestCase = new OperationsTestCase<AD>(
			"validateState", operationsForOCL.getOCLValue("VALIDATE_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getStates().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getStates().clear();
				target.getStates().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.STA, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validateState((AD) objectToTest, diagnostician, map);
			}

		};

		validateStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCounty() {
		OperationsTestCase<AD> validateCountyTestCase = new OperationsTestCase<AD>(
			"validateCounty", operationsForOCL.getOCLValue("VALIDATE_COUNTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getCounties().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getCounties().clear();
				target.getCounties().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CPA, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validateCounty((AD) objectToTest, diagnostician, map);
			}

		};

		validateCountyTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCity() {
		OperationsTestCase<AD> validateCityTestCase = new OperationsTestCase<AD>(
			"validateCity", operationsForOCL.getOCLValue("VALIDATE_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getCities().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getCities().clear();
				target.getCities().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CTY, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validateCity((AD) objectToTest, diagnostician, map);
			}

		};

		validateCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePostalCode() {
		OperationsTestCase<AD> validatePostalCodeTestCase = new OperationsTestCase<AD>(
			"validatePostalCode", operationsForOCL.getOCLValue("VALIDATE_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getPostalCodes().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getPostalCodes().clear();
				target.getPostalCodes().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ZIP, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validatePostalCode((AD) objectToTest, diagnostician, map);
			}

		};

		validatePostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateStreetAddressLine() {
		OperationsTestCase<AD> validateStreetAddressLineTestCase = new OperationsTestCase<AD>(
			"validateStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getStreetAddressLines().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getStreetAddressLines().clear();
				target.getStreetAddressLines().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.SAL, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validateStreetAddressLine((AD) objectToTest, diagnostician, map);
			}

		};

		validateStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHouseNumber() {
		OperationsTestCase<AD> validateHouseNumberTestCase = new OperationsTestCase<AD>(
			"validateHouseNumber",
			operationsForOCL.getOCLValue("VALIDATE_HOUSE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getHouseNumbers().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getHouseNumbers().clear();
				target.getHouseNumbers().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.BNR, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validateHouseNumber((AD) objectToTest, diagnostician, map);
			}

		};

		validateHouseNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHouseNumberNumeric() {
		OperationsTestCase<AD> validateHouseNumberNumericTestCase = new OperationsTestCase<AD>(
			"validateHouseNumberNumeric",
			operationsForOCL.getOCLValue("VALIDATE_HOUSE_NUMBER_NUMERIC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getHouseNumberNumerics().add(
					DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getHouseNumberNumerics().clear();
				target.getHouseNumberNumerics().add(
					DatatypesFactory.eINSTANCE.createADXP(AddressPartType.BNN, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validateHouseNumberNumeric((AD) objectToTest, diagnostician, map);
			}

		};

		validateHouseNumberNumericTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDirection() {
		OperationsTestCase<AD> validateDirectionTestCase = new OperationsTestCase<AD>(
			"validateDirection", operationsForOCL.getOCLValue("VALIDATE_DIRECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getDirections().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getDirections().clear();
				target.getDirections().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DIR, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validateDirection((AD) objectToTest, diagnostician, map);
			}

		};

		validateDirectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateStreetName() {
		OperationsTestCase<AD> validateStreetNameTestCase = new OperationsTestCase<AD>(
			"validateStreetName", operationsForOCL.getOCLValue("VALIDATE_STREET_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getStreetNames().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getStreetNames().clear();
				target.getStreetNames().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.STR, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validateStreetName((AD) objectToTest, diagnostician, map);
			}

		};

		validateStreetNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateStreetNameBase() {
		OperationsTestCase<AD> validateStreetNameBaseTestCase = new OperationsTestCase<AD>(
			"validateStreetNameBase",
			operationsForOCL.getOCLValue("VALIDATE_STREET_NAME_BASE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getStreetNameBases().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getStreetNameBases().clear();
				target.getStreetNameBases().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.STB, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validateStreetNameBase((AD) objectToTest, diagnostician, map);
			}

		};

		validateStreetNameBaseTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateStreetNameType() {
		OperationsTestCase<AD> validateStreetNameTypeTestCase = new OperationsTestCase<AD>(
			"validateStreetNameType",
			operationsForOCL.getOCLValue("VALIDATE_STREET_NAME_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getStreetNameTypes().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getStreetNameTypes().clear();
				target.getStreetNameTypes().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.STTYP, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validateStreetNameType((AD) objectToTest, diagnostician, map);
			}

		};

		validateStreetNameTypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAdditionalLocator() {
		OperationsTestCase<AD> validateAdditionalLocatorTestCase = new OperationsTestCase<AD>(
			"validateAdditionalLocator",
			operationsForOCL.getOCLValue("VALIDATE_ADDITIONAL_LOCATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getAdditionalLocators().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ZIP, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getAdditionalLocators().clear();
				target.getAdditionalLocators().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validateAdditionalLocator((AD) objectToTest, diagnostician, map);
			}

		};

		validateAdditionalLocatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateUnitID() {
		OperationsTestCase<AD> validateUnitIDTestCase = new OperationsTestCase<AD>(
			"validateUnitID", operationsForOCL.getOCLValue("VALIDATE_UNIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getUnitIDs().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getUnitIDs().clear();
				target.getUnitIDs().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.UNID, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validateUnitID((AD) objectToTest, diagnostician, map);
			}

		};

		validateUnitIDTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateUnitType() {
		OperationsTestCase<AD> validateUnitTypeTestCase = new OperationsTestCase<AD>(
			"validateUnitType", operationsForOCL.getOCLValue("VALIDATE_UNIT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getUnitTypes().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getUnitTypes().clear();
				target.getUnitTypes().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.UNIT, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validateUnitType((AD) objectToTest, diagnostician, map);
			}

		};

		validateUnitTypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCareOf() {
		OperationsTestCase<AD> validateCareOfTestCase = new OperationsTestCase<AD>(
			"validateCareOf", operationsForOCL.getOCLValue("VALIDATE_CARE_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getCareOfs().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getCareOfs().clear();
				target.getCareOfs().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CAR, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validateCareOf((AD) objectToTest, diagnostician, map);
			}

		};

		validateCareOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCensusTract() {
		OperationsTestCase<AD> validateCensusTractTestCase = new OperationsTestCase<AD>(
			"validateCensusTract",
			operationsForOCL.getOCLValue("VALIDATE_CENSUS_TRACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getCensusTracts().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getCensusTracts().clear();
				target.getCensusTracts().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CEN, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validateCensusTract((AD) objectToTest, diagnostician, map);
			}

		};

		validateCensusTractTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDeliveryAddressLine() {
		OperationsTestCase<AD> validateDeliveryAddressLineTestCase = new OperationsTestCase<AD>(
			"validateDeliveryAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_DELIVERY_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {

				target.getDeliveryAddressLines().add(
					DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "asdfadsf"));

			}

			@Override
			protected void updateToPass(AD target) {

				target.getDeliveryAddressLines().clear();

				target.getDeliveryAddressLines().add(
					DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DAL, "asdfadsf"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validateDeliveryAddressLine((AD) objectToTest, diagnostician, map);
			}

		};

		validateDeliveryAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDeliveryInstallationType() {
		OperationsTestCase<AD> validateDeliveryInstallationTypeTestCase = new OperationsTestCase<AD>(
			"validateDeliveryInstallationType",
			operationsForOCL.getOCLValue("VALIDATE_DELIVERY_INSTALLATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getDeliveryInstallationTypes().add(
					DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getDeliveryInstallationTypes().clear();
				target.getDeliveryInstallationTypes().add(
					DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DINST, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validateDeliveryInstallationType((AD) objectToTest, diagnostician, map);
			}

		};

		validateDeliveryInstallationTypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDeliveryInstallationArea() {
		OperationsTestCase<AD> validateDeliveryInstallationAreaTestCase = new OperationsTestCase<AD>(
			"validateDeliveryInstallationArea",
			operationsForOCL.getOCLValue("VALIDATE_DELIVERY_INSTALLATION_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getDeliveryInstallationAreas().add(
					DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getDeliveryInstallationAreas().clear();
				target.getDeliveryInstallationAreas().add(
					DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DINSTA, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validateDeliveryInstallationArea((AD) objectToTest, diagnostician, map);
			}

		};

		validateDeliveryInstallationAreaTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDeliveryInstallationQualifier() {
		OperationsTestCase<AD> validateDeliveryInstallationQualifierTestCase = new OperationsTestCase<AD>(
			"validateDeliveryInstallationQualifier",
			operationsForOCL.getOCLValue("VALIDATE_DELIVERY_INSTALLATION_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getDeliveryInstallationQualifiers().add(
					DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getDeliveryInstallationQualifiers().clear();
				target.getDeliveryInstallationQualifiers().add(
					DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DINSTQ, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validateDeliveryInstallationQualifier((AD) objectToTest, diagnostician, map);
			}

		};

		validateDeliveryInstallationQualifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDeliveryMode() {
		OperationsTestCase<AD> validateDeliveryModeTestCase = new OperationsTestCase<AD>(
			"validateDeliveryMode",
			operationsForOCL.getOCLValue("VALIDATE_DELIVERY_MODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getDeliveryModes().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getDeliveryModes().clear();
				target.getDeliveryModes().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DMOD, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validateDeliveryMode((AD) objectToTest, diagnostician, map);
			}

		};

		validateDeliveryModeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDeliveryModeIdentifier() {
		OperationsTestCase<AD> validateDeliveryModeIdentifierTestCase = new OperationsTestCase<AD>(
			"validateDeliveryModeIdentifier",
			operationsForOCL.getOCLValue("VALIDATE_DELIVERY_MODE_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getDeliveryModeIdentifiers().add(
					DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getDeliveryModeIdentifiers().clear();
				target.getDeliveryModeIdentifiers().add(
					DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DMODID, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validateDeliveryModeIdentifier((AD) objectToTest, diagnostician, map);
			}

		};

		validateDeliveryModeIdentifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateBuildingNumberSuffix() {
		OperationsTestCase<AD> validateBuildingNumberSuffixTestCase = new OperationsTestCase<AD>(
			"validateBuildingNumberSuffix",
			operationsForOCL.getOCLValue("VALIDATE_BUILDING_NUMBER_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getBuildingNumberSuffixes().add(
					DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getBuildingNumberSuffixes().clear();
				target.getBuildingNumberSuffixes().add(
					DatatypesFactory.eINSTANCE.createADXP(AddressPartType.BNS, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validateBuildingNumberSuffix((AD) objectToTest, diagnostician, map);
			}

		};

		validateBuildingNumberSuffixTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePostBox() {
		OperationsTestCase<AD> validatePostBoxTestCase = new OperationsTestCase<AD>(
			"validatePostBox", operationsForOCL.getOCLValue("VALIDATE_POST_BOX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getPostBoxes().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getPostBoxes().clear();
				target.getPostBoxes().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.POB, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validatePostBox((AD) objectToTest, diagnostician, map);
			}

		};

		validatePostBoxTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePrecinct() {
		OperationsTestCase<AD> validatePrecinctTestCase = new OperationsTestCase<AD>(
			"validatePrecinct", operationsForOCL.getOCLValue("VALIDATE_PRECINCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AD target) {
				target.getPrecincts().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, "12345"));
			}

			@Override
			protected void updateToPass(AD target) {
				target.getPrecincts().clear();
				target.getPrecincts().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.PRE, "12345"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ADOperations.validatePrecinct((AD) objectToTest, diagnostician, map);
			}

		};

		validatePrecinctTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetText() {

		AD target = objectFactory.create();
		target.getText();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ADOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AD> {

		public AD create() {
			return DatatypesFactory.eINSTANCE.createAD();
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
	private static class ConstructorTestClass extends ADOperations {
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

} // ADOperations
