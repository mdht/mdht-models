
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.vocab.ParticipationType;
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
