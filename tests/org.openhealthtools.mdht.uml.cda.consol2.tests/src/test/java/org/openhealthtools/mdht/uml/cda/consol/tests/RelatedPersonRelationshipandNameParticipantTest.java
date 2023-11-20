
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.vocab.ParticipationType;
import org.eclipse.mdht.uml.hl7.vocab.PostalAddressUse;
import org.eclipse.mdht.uml.hl7.vocab.RoleClassAssociative;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant;
import org.openhealthtools.mdht.uml.cda.consol.operations.RelatedPersonRelationshipandNameParticipantOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Related Person Relationshipand Name Participant</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address If Country Is Us Require State Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address If Country Is Us Require Postal Code Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Person General Header Constraints US Realm Person Name US Realm Person Name Mixed Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Associated Person</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class RelatedPersonRelationshipandNameParticipantTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRelatedPersonRelationshipandNameParticipantTemplateId() {
		OperationsTestCase<RelatedPersonRelationshipandNameParticipant> validateRelatedPersonRelationshipandNameParticipantTemplateIdTestCase = new OperationsTestCase<RelatedPersonRelationshipandNameParticipant>(
			"validateRelatedPersonRelationshipandNameParticipantTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RelatedPersonRelationshipandNameParticipant target) {

			}

			@Override
			protected void updateToPass(RelatedPersonRelationshipandNameParticipant target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RelatedPersonRelationshipandNameParticipantOperations.validateRelatedPersonRelationshipandNameParticipantTemplateId(
					(RelatedPersonRelationshipandNameParticipant) objectToTest, diagnostician, map);
			}

		};

		validateRelatedPersonRelationshipandNameParticipantTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateRelatedPersonRelationshipandNameParticipantTypeCode() {
		OperationsTestCase<RelatedPersonRelationshipandNameParticipant> validateRelatedPersonRelationshipandNameParticipantTypeCodeTestCase = new OperationsTestCase<RelatedPersonRelationshipandNameParticipant>(
			"validateRelatedPersonRelationshipandNameParticipantTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RelatedPersonRelationshipandNameParticipant target) {

			}

			@Override
			protected void updateToPass(RelatedPersonRelationshipandNameParticipant target) {
				target.init();
				target.setTypeCode(ParticipationType.ADM);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RelatedPersonRelationshipandNameParticipantOperations.validateRelatedPersonRelationshipandNameParticipantTypeCode(
					(RelatedPersonRelationshipandNameParticipant) objectToTest, diagnostician, map);
			}

		};

		validateRelatedPersonRelationshipandNameParticipantTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateRelatedPersonRelationshipandNameParticipantAssociatedEntity() {
		OperationsTestCase<RelatedPersonRelationshipandNameParticipant> validateRelatedPersonRelationshipandNameParticipantAssociatedEntityTestCase = new OperationsTestCase<RelatedPersonRelationshipandNameParticipant>(
			"validateRelatedPersonRelationshipandNameParticipantAssociatedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RelatedPersonRelationshipandNameParticipant target) {

			}

			@Override
			protected void updateToPass(RelatedPersonRelationshipandNameParticipant target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RelatedPersonRelationshipandNameParticipantOperations.validateRelatedPersonRelationshipandNameParticipantAssociatedEntity(
					(RelatedPersonRelationshipandNameParticipant) objectToTest, diagnostician, map);
			}

		};

		validateRelatedPersonRelationshipandNameParticipantAssociatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet() {
		OperationsTestCase<RelatedPersonRelationshipandNameParticipant> validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase = new OperationsTestCase<RelatedPersonRelationshipandNameParticipant>(
			"validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet",
			operationsForOCL.getOCLValue(
				"VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RelatedPersonRelationshipandNameParticipant target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
				target.getAssociatedEntity().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(RelatedPersonRelationshipandNameParticipant target) {
				target.getAssociatedEntity().getAddrs().get(0).addStreetAddressLine("STL1");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RelatedPersonRelationshipandNameParticipantOperations.validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
					(RelatedPersonRelationshipandNameParticipant) objectToTest, diagnostician, map);
			}

		};

		validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement() {
		OperationsTestCase<RelatedPersonRelationshipandNameParticipant> validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElementTestCase = new OperationsTestCase<RelatedPersonRelationshipandNameParticipant>(
			"validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement",
			operationsForOCL.getOCLValue(
				"VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_STATE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RelatedPersonRelationshipandNameParticipant target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
				target.getAssociatedEntity().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				target.getAssociatedEntity().getAddrs().get(0).addCountry("US");
			}

			@Override
			protected void updateToPass(RelatedPersonRelationshipandNameParticipant target) {
				target.getAssociatedEntity().getAddrs().get(0).addState("STATE");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RelatedPersonRelationshipandNameParticipantOperations.validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(
					(RelatedPersonRelationshipandNameParticipant) objectToTest, diagnostician, map);
			}

		};

		validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElementTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement() {
		OperationsTestCase<RelatedPersonRelationshipandNameParticipant> validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElementTestCase = new OperationsTestCase<RelatedPersonRelationshipandNameParticipant>(
			"validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement",
			operationsForOCL.getOCLValue(
				"VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_POSTAL_CODE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RelatedPersonRelationshipandNameParticipant target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
				target.getAssociatedEntity().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				target.getAssociatedEntity().getAddrs().get(0).addCountry("US");
				// target.getAssociatedEntity().getAddrs().get(0).addPostalCode("PC");
			}

			@Override
			protected void updateToPass(RelatedPersonRelationshipandNameParticipant target) {
				target.getAssociatedEntity().getAddrs().get(0).getPostalCodes().clear();
				target.getAssociatedEntity().getAddrs().get(0).addPostalCode("US");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RelatedPersonRelationshipandNameParticipantOperations.validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(
					(RelatedPersonRelationshipandNameParticipant) objectToTest, diagnostician, map);
			}

		};

		validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElementTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUse() {
		OperationsTestCase<RelatedPersonRelationshipandNameParticipant> validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUseTestCase = new OperationsTestCase<RelatedPersonRelationshipandNameParticipant>(
			"validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUse",
			operationsForOCL.getOCLValue(
				"VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(RelatedPersonRelationshipandNameParticipant target) {

			}

			@Override
			protected void updateToPass(RelatedPersonRelationshipandNameParticipant target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
				target.getAssociatedEntity().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				target.getAssociatedEntity().getAddrs().get(0).getUses().add(PostalAddressUse.BAD);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RelatedPersonRelationshipandNameParticipantOperations.validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUse(
					(RelatedPersonRelationshipandNameParticipant) objectToTest, diagnostician, map);
			}

		};

		validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUseP() {
		OperationsTestCase<RelatedPersonRelationshipandNameParticipant> validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUsePTestCase = new OperationsTestCase<RelatedPersonRelationshipandNameParticipant>(
			"validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUseP",
			operationsForOCL.getOCLValue(
				"VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RelatedPersonRelationshipandNameParticipant target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
				target.getAssociatedEntity().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(RelatedPersonRelationshipandNameParticipant target) {
				target.getAssociatedEntity().getAddrs().get(0).getUses().add(PostalAddressUse.BAD);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RelatedPersonRelationshipandNameParticipantOperations.validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
					(RelatedPersonRelationshipandNameParticipant) objectToTest, diagnostician, map);
			}

		};

		validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCountry() {
		OperationsTestCase<RelatedPersonRelationshipandNameParticipant> validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCountryTestCase = new OperationsTestCase<RelatedPersonRelationshipandNameParticipant>(
			"validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCountry",
			operationsForOCL.getOCLValue(
				"VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RelatedPersonRelationshipandNameParticipant target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
				target.getAssociatedEntity().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(RelatedPersonRelationshipandNameParticipant target) {
				target.getAssociatedEntity().getAddrs().get(0).addCountry("CT");

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RelatedPersonRelationshipandNameParticipantOperations.validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
					(RelatedPersonRelationshipandNameParticipant) objectToTest, diagnostician, map);
			}

		};

		validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressState() {
		OperationsTestCase<RelatedPersonRelationshipandNameParticipant> validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressStateTestCase = new OperationsTestCase<RelatedPersonRelationshipandNameParticipant>(
			"validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressState",
			operationsForOCL.getOCLValue(
				"VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RelatedPersonRelationshipandNameParticipant target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
				target.getAssociatedEntity().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(RelatedPersonRelationshipandNameParticipant target) {
				target.getAssociatedEntity().getAddrs().get(0).addState("ST");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RelatedPersonRelationshipandNameParticipantOperations.validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressState(
					(RelatedPersonRelationshipandNameParticipant) objectToTest, diagnostician, map);
			}

		};

		validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCity() {
		OperationsTestCase<RelatedPersonRelationshipandNameParticipant> validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCityTestCase = new OperationsTestCase<RelatedPersonRelationshipandNameParticipant>(
			"validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCity",
			operationsForOCL.getOCLValue(
				"VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RelatedPersonRelationshipandNameParticipant target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
				target.getAssociatedEntity().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(RelatedPersonRelationshipandNameParticipant target) {
				target.getAssociatedEntity().getAddrs().get(0).addCity("CITY");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RelatedPersonRelationshipandNameParticipantOperations.validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCity(
					(RelatedPersonRelationshipandNameParticipant) objectToTest, diagnostician, map);
			}

		};

		validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode() {
		OperationsTestCase<RelatedPersonRelationshipandNameParticipant> validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase = new OperationsTestCase<RelatedPersonRelationshipandNameParticipant>(
			"validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RelatedPersonRelationshipandNameParticipant target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
				target.getAssociatedEntity().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(RelatedPersonRelationshipandNameParticipant target) {
				target.getAssociatedEntity().getAddrs().get(0).addPostalCode("PC");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RelatedPersonRelationshipandNameParticipantOperations.validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
					(RelatedPersonRelationshipandNameParticipant) objectToTest, diagnostician, map);
			}

		};

		validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine() {
		OperationsTestCase<RelatedPersonRelationshipandNameParticipant> validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<RelatedPersonRelationshipandNameParticipant>(
			"validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue(
				"VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RelatedPersonRelationshipandNameParticipant target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
				target.getAssociatedEntity().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(RelatedPersonRelationshipandNameParticipant target) {
				target.getAssociatedEntity().getAddrs().get(0).addStreetAddressLine("SL");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RelatedPersonRelationshipandNameParticipantOperations.validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
					(RelatedPersonRelationshipandNameParticipant) objectToTest, diagnostician, map);
			}

		};

		validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent() {
		OperationsTestCase<RelatedPersonRelationshipandNameParticipant> validateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContentTestCase = new OperationsTestCase<RelatedPersonRelationshipandNameParticipant>(
			"validateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent",
			operationsForOCL.getOCLValue(
				"VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_GENERAL_HEADER_CONSTRAINTS_US_REALM_PERSON_NAME_US_REALM_PERSON_NAME_MIXED_CONTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RelatedPersonRelationshipandNameParticipant target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
				target.getAssociatedEntity().setAssociatedPerson(CDAFactory.eINSTANCE.createPerson());
				target.getAssociatedEntity().getAssociatedPerson().getNames().add(
					DatatypesFactory.eINSTANCE.createPN());
			}

			@Override
			protected void updateToPass(RelatedPersonRelationshipandNameParticipant target) {
				target.getAssociatedEntity().getAssociatedPerson().getNames().get(0).addText("TEST");

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RelatedPersonRelationshipandNameParticipantOperations.validateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent(
					(RelatedPersonRelationshipandNameParticipant) objectToTest, diagnostician, map);
			}

		};

		validateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContentTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonName() {
		OperationsTestCase<RelatedPersonRelationshipandNameParticipant> validateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonNameTestCase = new OperationsTestCase<RelatedPersonRelationshipandNameParticipant>(
			"validateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonName",
			operationsForOCL.getOCLValue(
				"VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RelatedPersonRelationshipandNameParticipant target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
				target.getAssociatedEntity().setAssociatedPerson(CDAFactory.eINSTANCE.createPerson());
			}

			@Override
			protected void updateToPass(RelatedPersonRelationshipandNameParticipant target) {
				target.getAssociatedEntity().getAssociatedPerson().getNames().add(
					DatatypesFactory.eINSTANCE.createPN());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RelatedPersonRelationshipandNameParticipantOperations.validateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonName(
					(RelatedPersonRelationshipandNameParticipant) objectToTest, diagnostician, map);
			}

		};

		validateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateRelatedPersonRelationshipandNameParticipantAssociatedEntityCode() {
		OperationsTestCase<RelatedPersonRelationshipandNameParticipant> validateRelatedPersonRelationshipandNameParticipantAssociatedEntityCodeTestCase = new OperationsTestCase<RelatedPersonRelationshipandNameParticipant>(
			"validateRelatedPersonRelationshipandNameParticipantAssociatedEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RelatedPersonRelationshipandNameParticipant target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(RelatedPersonRelationshipandNameParticipant target) {
				target.getAssociatedEntity().setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RelatedPersonRelationshipandNameParticipantOperations.validateRelatedPersonRelationshipandNameParticipantAssociatedEntityCode(
					(RelatedPersonRelationshipandNameParticipant) objectToTest, diagnostician, map);
			}

		};

		validateRelatedPersonRelationshipandNameParticipantAssociatedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateRelatedPersonRelationshipandNameParticipantAssociatedEntityAddr() {
		OperationsTestCase<RelatedPersonRelationshipandNameParticipant> validateRelatedPersonRelationshipandNameParticipantAssociatedEntityAddrTestCase = new OperationsTestCase<RelatedPersonRelationshipandNameParticipant>(
			"validateRelatedPersonRelationshipandNameParticipantAssociatedEntityAddr",
			operationsForOCL.getOCLValue(
				"VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RelatedPersonRelationshipandNameParticipant target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(RelatedPersonRelationshipandNameParticipant target) {
				target.getAssociatedEntity().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RelatedPersonRelationshipandNameParticipantOperations.validateRelatedPersonRelationshipandNameParticipantAssociatedEntityAddr(
					(RelatedPersonRelationshipandNameParticipant) objectToTest, diagnostician, map);
			}

		};

		validateRelatedPersonRelationshipandNameParticipantAssociatedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateRelatedPersonRelationshipandNameParticipantAssociatedEntityTelecom() {
		OperationsTestCase<RelatedPersonRelationshipandNameParticipant> validateRelatedPersonRelationshipandNameParticipantAssociatedEntityTelecomTestCase = new OperationsTestCase<RelatedPersonRelationshipandNameParticipant>(
			"validateRelatedPersonRelationshipandNameParticipantAssociatedEntityTelecom",
			operationsForOCL.getOCLValue(
				"VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RelatedPersonRelationshipandNameParticipant target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(RelatedPersonRelationshipandNameParticipant target) {
				target.getAssociatedEntity().getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RelatedPersonRelationshipandNameParticipantOperations.validateRelatedPersonRelationshipandNameParticipantAssociatedEntityTelecom(
					(RelatedPersonRelationshipandNameParticipant) objectToTest, diagnostician, map);
			}

		};

		validateRelatedPersonRelationshipandNameParticipantAssociatedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateRelatedPersonRelationshipandNameParticipantAssociatedEntityClassCode() {
		OperationsTestCase<RelatedPersonRelationshipandNameParticipant> validateRelatedPersonRelationshipandNameParticipantAssociatedEntityClassCodeTestCase = new OperationsTestCase<RelatedPersonRelationshipandNameParticipant>(
			"validateRelatedPersonRelationshipandNameParticipantAssociatedEntityClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RelatedPersonRelationshipandNameParticipant target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(RelatedPersonRelationshipandNameParticipant target) {
				// RoleClassAssociative RoleClassAssociative.ACCESS;
				target.getAssociatedEntity().setClassCode(RoleClassAssociative.ACCESS);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RelatedPersonRelationshipandNameParticipantOperations.validateRelatedPersonRelationshipandNameParticipantAssociatedEntityClassCode(
					(RelatedPersonRelationshipandNameParticipant) objectToTest, diagnostician, map);
			}

		};

		validateRelatedPersonRelationshipandNameParticipantAssociatedEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateRelatedPersonRelationshipandNameParticipantAssociatedEntityAssociatedPerson() {
		OperationsTestCase<RelatedPersonRelationshipandNameParticipant> validateRelatedPersonRelationshipandNameParticipantAssociatedEntityAssociatedPersonTestCase = new OperationsTestCase<RelatedPersonRelationshipandNameParticipant>(
			"validateRelatedPersonRelationshipandNameParticipantAssociatedEntityAssociatedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RelatedPersonRelationshipandNameParticipant target) {
				target.init();
				target.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(RelatedPersonRelationshipandNameParticipant target) {
				target.getAssociatedEntity().setAssociatedPerson(CDAFactory.eINSTANCE.createPerson());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RelatedPersonRelationshipandNameParticipantOperations.validateRelatedPersonRelationshipandNameParticipantAssociatedEntityAssociatedPerson(
					(RelatedPersonRelationshipandNameParticipant) objectToTest, diagnostician, map);
			}

		};

		validateRelatedPersonRelationshipandNameParticipantAssociatedEntityAssociatedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends RelatedPersonRelationshipandNameParticipantOperations {
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
	private static class ObjectFactory implements TestObjectFactory<RelatedPersonRelationshipandNameParticipant> {
		public RelatedPersonRelationshipandNameParticipant create() {
			return ConsolFactory.eINSTANCE.createRelatedPersonRelationshipandNameParticipant();
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
	private static class ConstructorTestClass extends RelatedPersonRelationshipandNameParticipantOperations {
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

} // RelatedPersonRelationshipandNameParticipantOperations
