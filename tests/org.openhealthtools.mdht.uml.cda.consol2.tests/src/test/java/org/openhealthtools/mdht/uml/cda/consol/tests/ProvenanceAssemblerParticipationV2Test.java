
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.Organization;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.vocab.PostalAddressUse;
import org.eclipse.mdht.uml.hl7.vocab.RoleClassAssociative;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProvenanceAssemblerParticipationV2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Provenance Assembler Participation V2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2FunctionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Function Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2FunctionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Function Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2Time(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2TypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address If Country Is Us Require State Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address If Country Is Us Require Postal Code Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAssemblerParticipationV2#validateProvenanceAssemblerParticipationV2AssociatedEntityScopingOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Assembler Participation V2 Associated Entity Scoping Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProvenanceAssemblerParticipationV2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProvenanceAssemblerParticipationV2TemplateId() {
		OperationsTestCase<ProvenanceAssemblerParticipationV2> validateProvenanceAssemblerParticipationV2TemplateIdTestCase = new OperationsTestCase<ProvenanceAssemblerParticipationV2>(
			"validateProvenanceAssemblerParticipationV2TemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAssemblerParticipationV2 target) {

			}

			@Override
			protected void updateToPass(ProvenanceAssemblerParticipationV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAssemblerParticipationV2Operations.validateProvenanceAssemblerParticipationV2TemplateId(
					(ProvenanceAssemblerParticipationV2) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAssemblerParticipationV2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProvenanceAssemblerParticipationV2FunctionCode() {
		OperationsTestCase<ProvenanceAssemblerParticipationV2> validateProvenanceAssemblerParticipationV2FunctionCodeTestCase = new OperationsTestCase<ProvenanceAssemblerParticipationV2>(
			"validateProvenanceAssemblerParticipationV2FunctionCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAssemblerParticipationV2 target) {

			}

			@Override
			protected void updateToPass(ProvenanceAssemblerParticipationV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAssemblerParticipationV2Operations.validateProvenanceAssemblerParticipationV2FunctionCode(
					(ProvenanceAssemblerParticipationV2) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAssemblerParticipationV2FunctionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProvenanceAssemblerParticipationV2FunctionCodeP() {
		OperationsTestCase<ProvenanceAssemblerParticipationV2> validateProvenanceAssemblerParticipationV2FunctionCodePTestCase = new OperationsTestCase<ProvenanceAssemblerParticipationV2>(
			"validateProvenanceAssemblerParticipationV2FunctionCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAssemblerParticipationV2 target) {

			}

			@Override
			protected void updateToPass(ProvenanceAssemblerParticipationV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAssemblerParticipationV2Operations.validateProvenanceAssemblerParticipationV2FunctionCodeP(
					(ProvenanceAssemblerParticipationV2) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAssemblerParticipationV2FunctionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProvenanceAssemblerParticipationV2Time() {
		OperationsTestCase<ProvenanceAssemblerParticipationV2> validateProvenanceAssemblerParticipationV2TimeTestCase = new OperationsTestCase<ProvenanceAssemblerParticipationV2>(
			"validateProvenanceAssemblerParticipationV2Time", operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAssemblerParticipationV2 target) {

			}

			@Override
			protected void updateToPass(ProvenanceAssemblerParticipationV2 target) {
				target.init();
				target.setTime(DatatypesFactory.eINSTANCE.createIVL_TS("2022"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAssemblerParticipationV2Operations.validateProvenanceAssemblerParticipationV2Time(
					(ProvenanceAssemblerParticipationV2) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAssemblerParticipationV2TimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProvenanceAssemblerParticipationV2TypeCode() {
		OperationsTestCase<ProvenanceAssemblerParticipationV2> validateProvenanceAssemblerParticipationV2TypeCodeTestCase = new OperationsTestCase<ProvenanceAssemblerParticipationV2>(
			"validateProvenanceAssemblerParticipationV2TypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAssemblerParticipationV2 target) {

			}

			@Override
			protected void updateToPass(ProvenanceAssemblerParticipationV2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAssemblerParticipationV2Operations.validateProvenanceAssemblerParticipationV2TypeCode(
					(ProvenanceAssemblerParticipationV2) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAssemblerParticipationV2TypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProvenanceAssemblerParticipationV2AssociatedEntity() {
		OperationsTestCase<ProvenanceAssemblerParticipationV2> validateProvenanceAssemblerParticipationV2AssociatedEntityTestCase = new OperationsTestCase<ProvenanceAssemblerParticipationV2>(
			"validateProvenanceAssemblerParticipationV2AssociatedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAssemblerParticipationV2 target) {

			}

			@Override
			protected void updateToPass(ProvenanceAssemblerParticipationV2 target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAssemblerParticipationV2Operations.validateProvenanceAssemblerParticipationV2AssociatedEntity(
					(ProvenanceAssemblerParticipationV2) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAssemblerParticipationV2AssociatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet() {
		OperationsTestCase<ProvenanceAssemblerParticipationV2> validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase = new OperationsTestCase<ProvenanceAssemblerParticipationV2>(
			"validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAssemblerParticipationV2 target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());

				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				target.getAssociatedEntity().setScopingOrganization(organization);
				target.getAssociatedEntity().getScopingOrganization().getAddrs().add(
					DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(ProvenanceAssemblerParticipationV2 target) {

				target.getAssociatedEntity().getScopingOrganization().getAddrs().get(0).addStreetAddressLine(
					"101 main");

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAssemblerParticipationV2Operations.validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
					(ProvenanceAssemblerParticipationV2) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement() {
		OperationsTestCase<ProvenanceAssemblerParticipationV2> validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElementTestCase = new OperationsTestCase<ProvenanceAssemblerParticipationV2>(
			"validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_STATE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAssemblerParticipationV2 target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());

				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				target.getAssociatedEntity().setScopingOrganization(organization);
				target.getAssociatedEntity().getScopingOrganization().getAddrs().add(
					DatatypesFactory.eINSTANCE.createAD());

				target.getAssociatedEntity().getScopingOrganization().getAddrs().get(0).addCountry("US");

			}

			@Override
			protected void updateToPass(ProvenanceAssemblerParticipationV2 target) {

				target.getAssociatedEntity().getScopingOrganization().getAddrs().get(0).addState("CA");

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAssemblerParticipationV2Operations.validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(
					(ProvenanceAssemblerParticipationV2) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElementTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement() {
		OperationsTestCase<ProvenanceAssemblerParticipationV2> validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElementTestCase = new OperationsTestCase<ProvenanceAssemblerParticipationV2>(
			"validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_POSTAL_CODE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAssemblerParticipationV2 target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());

				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				target.getAssociatedEntity().setScopingOrganization(organization);
				target.getAssociatedEntity().getScopingOrganization().getAddrs().add(
					DatatypesFactory.eINSTANCE.createAD());
				target.getAssociatedEntity().getScopingOrganization().getAddrs().get(0).addCountry("US");
			}

			@Override
			protected void updateToPass(ProvenanceAssemblerParticipationV2 target) {

				target.getAssociatedEntity().getScopingOrganization().getAddrs().get(0).addPostalCode("90001");

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAssemblerParticipationV2Operations.validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(
					(ProvenanceAssemblerParticipationV2) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElementTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUse() {
		OperationsTestCase<ProvenanceAssemblerParticipationV2> validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUseTestCase = new OperationsTestCase<ProvenanceAssemblerParticipationV2>(
			"validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUse",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAssemblerParticipationV2 target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());

				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				target.getAssociatedEntity().setScopingOrganization(organization);
				target.getAssociatedEntity().getScopingOrganization().getAddrs().add(
					DatatypesFactory.eINSTANCE.createAD());
				target.getAssociatedEntity().getScopingOrganization().getAddrs().get(0).getUses().add(
					PostalAddressUse.ABC);
			}

			@Override
			protected void updateToPass(ProvenanceAssemblerParticipationV2 target) {

				target.getAssociatedEntity().getScopingOrganization().getAddrs().get(0).getUses().clear();
				target.getAssociatedEntity().getScopingOrganization().getAddrs().get(0).getUses().add(
					PostalAddressUse.HP);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAssemblerParticipationV2Operations.validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUse(
					(ProvenanceAssemblerParticipationV2) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUseP() {
		OperationsTestCase<ProvenanceAssemblerParticipationV2> validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUsePTestCase = new OperationsTestCase<ProvenanceAssemblerParticipationV2>(
			"validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUseP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAssemblerParticipationV2 target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());

				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				target.getAssociatedEntity().setScopingOrganization(organization);
				target.getAssociatedEntity().getScopingOrganization().getAddrs().add(
					DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(ProvenanceAssemblerParticipationV2 target) {

				target.getAssociatedEntity().getScopingOrganization().getAddrs().get(0).getUses().add(
					PostalAddressUse.ABC);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAssemblerParticipationV2Operations.validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUseP(
					(ProvenanceAssemblerParticipationV2) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCountry() {
		OperationsTestCase<ProvenanceAssemblerParticipationV2> validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCountryTestCase = new OperationsTestCase<ProvenanceAssemblerParticipationV2>(
			"validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCountry",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAssemblerParticipationV2 target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());

				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				target.getAssociatedEntity().setScopingOrganization(organization);
				target.getAssociatedEntity().getScopingOrganization().getAddrs().add(
					DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(ProvenanceAssemblerParticipationV2 target) {

				target.getAssociatedEntity().getScopingOrganization().getAddrs().get(0).addCountry("US");

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAssemblerParticipationV2Operations.validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCountry(
					(ProvenanceAssemblerParticipationV2) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressState() {
		OperationsTestCase<ProvenanceAssemblerParticipationV2> validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressStateTestCase = new OperationsTestCase<ProvenanceAssemblerParticipationV2>(
			"validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressState",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAssemblerParticipationV2 target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());

				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				target.getAssociatedEntity().setScopingOrganization(organization);
				target.getAssociatedEntity().getScopingOrganization().getAddrs().add(
					DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(ProvenanceAssemblerParticipationV2 target) {

				target.getAssociatedEntity().getScopingOrganization().getAddrs().get(0).addState("CA");

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAssemblerParticipationV2Operations.validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressState(
					(ProvenanceAssemblerParticipationV2) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCity() {
		OperationsTestCase<ProvenanceAssemblerParticipationV2> validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCityTestCase = new OperationsTestCase<ProvenanceAssemblerParticipationV2>(
			"validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCity",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAssemblerParticipationV2 target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());

				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				target.getAssociatedEntity().setScopingOrganization(organization);
				target.getAssociatedEntity().getScopingOrganization().getAddrs().add(
					DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(ProvenanceAssemblerParticipationV2 target) {

				target.getAssociatedEntity().getScopingOrganization().getAddrs().get(0).addCity("LA");

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAssemblerParticipationV2Operations.validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCity(
					(ProvenanceAssemblerParticipationV2) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode() {
		OperationsTestCase<ProvenanceAssemblerParticipationV2> validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase = new OperationsTestCase<ProvenanceAssemblerParticipationV2>(
			"validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAssemblerParticipationV2 target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());

				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				target.getAssociatedEntity().setScopingOrganization(organization);
				target.getAssociatedEntity().getScopingOrganization().getAddrs().add(
					DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(ProvenanceAssemblerParticipationV2 target) {

				target.getAssociatedEntity().getScopingOrganization().getAddrs().get(0).addPostalCode("90001");

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAssemblerParticipationV2Operations.validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode(
					(ProvenanceAssemblerParticipationV2) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine() {
		OperationsTestCase<ProvenanceAssemblerParticipationV2> validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<ProvenanceAssemblerParticipationV2>(
			"validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAssemblerParticipationV2 target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());

				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				target.getAssociatedEntity().setScopingOrganization(organization);
				target.getAssociatedEntity().getScopingOrganization().getAddrs().add(
					DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(ProvenanceAssemblerParticipationV2 target) {

				target.getAssociatedEntity().getScopingOrganization().getAddrs().get(0).addStreetAddressLine(
					"101 Main Street");

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAssemblerParticipationV2Operations.validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
					(ProvenanceAssemblerParticipationV2) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationId() {
		OperationsTestCase<ProvenanceAssemblerParticipationV2> validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationIdTestCase = new OperationsTestCase<ProvenanceAssemblerParticipationV2>(
			"validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAssemblerParticipationV2 target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());

				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				target.getAssociatedEntity().setScopingOrganization(organization);
			}

			@Override
			protected void updateToPass(ProvenanceAssemblerParticipationV2 target) {
				target.getAssociatedEntity().getScopingOrganization().getIds().add(
					DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAssemblerParticipationV2Operations.validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationId(
					(ProvenanceAssemblerParticipationV2) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationName() {
		OperationsTestCase<ProvenanceAssemblerParticipationV2> validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationNameTestCase = new OperationsTestCase<ProvenanceAssemblerParticipationV2>(
			"validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationName",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAssemblerParticipationV2 target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());

				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				target.getAssociatedEntity().setScopingOrganization(organization);
			}

			@Override
			protected void updateToPass(ProvenanceAssemblerParticipationV2 target) {
				target.getAssociatedEntity().getScopingOrganization().getNames().add(
					DatatypesFactory.eINSTANCE.createON());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAssemblerParticipationV2Operations.validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationName(
					(ProvenanceAssemblerParticipationV2) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationTelecom() {
		OperationsTestCase<ProvenanceAssemblerParticipationV2> validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationTelecomTestCase = new OperationsTestCase<ProvenanceAssemblerParticipationV2>(
			"validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationTelecom",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAssemblerParticipationV2 target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());

				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				target.getAssociatedEntity().setScopingOrganization(organization);
			}

			@Override
			protected void updateToPass(ProvenanceAssemblerParticipationV2 target) {
				target.getAssociatedEntity().getScopingOrganization().getTelecoms().add(
					DatatypesFactory.eINSTANCE.createTEL());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAssemblerParticipationV2Operations.validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationTelecom(
					(ProvenanceAssemblerParticipationV2) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationAddr() {
		OperationsTestCase<ProvenanceAssemblerParticipationV2> validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationAddrTestCase = new OperationsTestCase<ProvenanceAssemblerParticipationV2>(
			"validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationAddr",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAssemblerParticipationV2 target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());

				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				target.getAssociatedEntity().setScopingOrganization(organization);
			}

			@Override
			protected void updateToPass(ProvenanceAssemblerParticipationV2 target) {
				target.getAssociatedEntity().getScopingOrganization().getAddrs().add(
					DatatypesFactory.eINSTANCE.createAD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAssemblerParticipationV2Operations.validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationAddr(
					(ProvenanceAssemblerParticipationV2) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAssemblerParticipationV2AssociatedEntityOrganizationAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProvenanceAssemblerParticipationV2AssociatedEntityClassCode() {
		OperationsTestCase<ProvenanceAssemblerParticipationV2> validateProvenanceAssemblerParticipationV2AssociatedEntityClassCodeTestCase = new OperationsTestCase<ProvenanceAssemblerParticipationV2>(
			"validateProvenanceAssemblerParticipationV2AssociatedEntityClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAssemblerParticipationV2 target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(ProvenanceAssemblerParticipationV2 target) {

				target.getAssociatedEntity().setClassCode(RoleClassAssociative.OWN);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAssemblerParticipationV2Operations.validateProvenanceAssemblerParticipationV2AssociatedEntityClassCode(
					(ProvenanceAssemblerParticipationV2) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAssemblerParticipationV2AssociatedEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProvenanceAssemblerParticipationV2AssociatedEntityScopingOrganization() {
		OperationsTestCase<ProvenanceAssemblerParticipationV2> validateProvenanceAssemblerParticipationV2AssociatedEntityScopingOrganizationTestCase = new OperationsTestCase<ProvenanceAssemblerParticipationV2>(
			"validateProvenanceAssemblerParticipationV2AssociatedEntityScopingOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_ASSEMBLER_PARTICIPATION_V2_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAssemblerParticipationV2 target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());

			}

			@Override
			protected void updateToPass(ProvenanceAssemblerParticipationV2 target) {

				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				target.getAssociatedEntity().setScopingOrganization(organization);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAssemblerParticipationV2Operations.validateProvenanceAssemblerParticipationV2AssociatedEntityScopingOrganization(
					(ProvenanceAssemblerParticipationV2) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAssemblerParticipationV2AssociatedEntityScopingOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProvenanceAssemblerParticipationV2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ProvenanceAssemblerParticipationV2> {
		public ProvenanceAssemblerParticipationV2 create() {
			return ConsolFactory.eINSTANCE.createProvenanceAssemblerParticipationV2();
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
	private static class ConstructorTestClass extends ProvenanceAssemblerParticipationV2Operations {
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

} // ProvenanceAssemblerParticipationV2Operations
