
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.PN;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProvenanceAuthorParticipationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Provenance Author Participation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNFamily(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Assigned Person PN Family</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNGiven(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Assigned Person PN Given</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Assigned Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Represented Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Represented Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Represented Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationProvenanceAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationProvenanceAssignedAuthorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation#validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedAuthoringDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provenance Author Participation Provenance Assigned Author Assigned Authoring Device</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProvenanceAuthorParticipationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProvenanceAuthorParticipationTemplateId() {
		OperationsTestCase<ProvenanceAuthorParticipation> validateProvenanceAuthorParticipationTemplateIdTestCase = new OperationsTestCase<ProvenanceAuthorParticipation>(
			"validateProvenanceAuthorParticipationTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAuthorParticipation target) {

			}

			@Override
			protected void updateToPass(ProvenanceAuthorParticipation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationTemplateId(
					(ProvenanceAuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAuthorParticipationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateProvenanceAuthorParticipationTime() {
		OperationsTestCase<ProvenanceAuthorParticipation> validateProvenanceAuthorParticipationTimeTestCase = new OperationsTestCase<ProvenanceAuthorParticipation>(
			"validateProvenanceAuthorParticipationTime", operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAuthorParticipation target) {

			}

			@Override
			protected void updateToPass(ProvenanceAuthorParticipation target) {
				target.init();
				target.setTime(DatatypesFactory.eINSTANCE.createTS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationTime(
					(ProvenanceAuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAuthorParticipationTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateProvenanceAuthorParticipationAssignedAuthor() {
		OperationsTestCase<ProvenanceAuthorParticipation> validateProvenanceAuthorParticipationAssignedAuthorTestCase = new OperationsTestCase<ProvenanceAuthorParticipation>(
			"validateProvenanceAuthorParticipationAssignedAuthor",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAuthorParticipation target) {

			}

			@Override
			protected void updateToPass(ProvenanceAuthorParticipation target) {
				target.init();
				target.setAssignedAuthor(CDAFactory.eINSTANCE.createAssignedAuthor());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationAssignedAuthor(
					(ProvenanceAuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAuthorParticipationAssignedAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNFamily() {
		OperationsTestCase<ProvenanceAuthorParticipation> validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNFamilyTestCase = new OperationsTestCase<ProvenanceAuthorParticipation>(
			"validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNFamily",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON_PN_FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAuthorParticipation target) {
				target.init();
				target.setAssignedAuthor(CDAFactory.eINSTANCE.createAssignedAuthor());
				target.getAssignedAuthor().setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
				target.getAssignedAuthor().getAssignedPerson().getNames().add(DatatypesFactory.eINSTANCE.createPN());
			}

			@Override
			protected void updateToPass(ProvenanceAuthorParticipation target) {
				// target.init();
				for (PN pn : target.getAssignedAuthor().getAssignedPerson().getNames()) {
					pn.addFamily("given");
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNFamily(
					(ProvenanceAuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNFamilyTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNGiven() {
		OperationsTestCase<ProvenanceAuthorParticipation> validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNGivenTestCase = new OperationsTestCase<ProvenanceAuthorParticipation>(
			"validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNGiven",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON_PN_GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAuthorParticipation target) {
				target.init();
				target.setAssignedAuthor(CDAFactory.eINSTANCE.createAssignedAuthor());
				target.getAssignedAuthor().setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
				target.getAssignedAuthor().getAssignedPerson().getNames().add(DatatypesFactory.eINSTANCE.createPN());
			}

			@Override
			protected void updateToPass(ProvenanceAuthorParticipation target) {
				// target.init();
				for (PN pn : target.getAssignedAuthor().getAssignedPerson().getNames()) {
					pn.addGiven("given");
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNGiven(
					(ProvenanceAuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNGivenTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonName() {
		OperationsTestCase<ProvenanceAuthorParticipation> validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonNameTestCase = new OperationsTestCase<ProvenanceAuthorParticipation>(
			"validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonName",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAuthorParticipation target) {
				target.init();
				target.setAssignedAuthor(CDAFactory.eINSTANCE.createAssignedAuthor());
				target.getAssignedAuthor().setAssignedPerson(CDAFactory.eINSTANCE.createPerson());

			}

			@Override
			protected void updateToPass(ProvenanceAuthorParticipation target) {

				target.getAssignedAuthor().getAssignedPerson().getNames().add(DatatypesFactory.eINSTANCE.createPN());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonName(
					(ProvenanceAuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationId() {
		OperationsTestCase<ProvenanceAuthorParticipation> validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationIdTestCase = new OperationsTestCase<ProvenanceAuthorParticipation>(
			"validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAuthorParticipation target) {
				target.init();
				target.setAssignedAuthor(CDAFactory.eINSTANCE.createAssignedAuthor());
				target.getAssignedAuthor().setRepresentedOrganization(CDAFactory.eINSTANCE.createOrganization());

			}

			@Override
			protected void updateToPass(ProvenanceAuthorParticipation target) {
				// target.init();

				target.getAssignedAuthor().getRepresentedOrganization().getIds().add(
					DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationId(
					(ProvenanceAuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationName() {
		OperationsTestCase<ProvenanceAuthorParticipation> validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationNameTestCase = new OperationsTestCase<ProvenanceAuthorParticipation>(
			"validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationName",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAuthorParticipation target) {
				target.init();
				target.setAssignedAuthor(CDAFactory.eINSTANCE.createAssignedAuthor());
				target.getAssignedAuthor().setRepresentedOrganization(CDAFactory.eINSTANCE.createOrganization());

			}

			@Override
			protected void updateToPass(ProvenanceAuthorParticipation target) {
				target.init();
				target.getAssignedAuthor().getRepresentedOrganization().getNames().add(
					DatatypesFactory.eINSTANCE.createON());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationName(
					(ProvenanceAuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationTelecom() {
		OperationsTestCase<ProvenanceAuthorParticipation> validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationTelecomTestCase = new OperationsTestCase<ProvenanceAuthorParticipation>(
			"validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationTelecom",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAuthorParticipation target) {
				target.init();
				target.setAssignedAuthor(CDAFactory.eINSTANCE.createAssignedAuthor());
				target.getAssignedAuthor().setRepresentedOrganization(CDAFactory.eINSTANCE.createOrganization());

			}

			@Override
			protected void updateToPass(ProvenanceAuthorParticipation target) {
				target.init();
				target.getAssignedAuthor().getRepresentedOrganization().getTelecoms().add(
					DatatypesFactory.eINSTANCE.createTEL());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationTelecom(
					(ProvenanceAuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateProvenanceAuthorParticipationProvenanceAssignedAuthorId() {
		OperationsTestCase<ProvenanceAuthorParticipation> validateProvenanceAuthorParticipationProvenanceAssignedAuthorIdTestCase = new OperationsTestCase<ProvenanceAuthorParticipation>(
			"validateProvenanceAuthorParticipationProvenanceAssignedAuthorId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAuthorParticipation target) {
				target.init();
				target.setAssignedAuthor(CDAFactory.eINSTANCE.createAssignedAuthor());
				target.getAssignedAuthor().setAssignedPerson(CDAFactory.eINSTANCE.createPerson());

			}

			@Override
			protected void updateToPass(ProvenanceAuthorParticipation target) {
				target.getAssignedAuthor().getIds().add(DatatypesFactory.eINSTANCE.createII("asdfas"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationProvenanceAssignedAuthorId(
					(ProvenanceAuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAuthorParticipationProvenanceAssignedAuthorIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateProvenanceAuthorParticipationProvenanceAssignedAuthorCode() {
		OperationsTestCase<ProvenanceAuthorParticipation> validateProvenanceAuthorParticipationProvenanceAssignedAuthorCodeTestCase = new OperationsTestCase<ProvenanceAuthorParticipation>(
			"validateProvenanceAuthorParticipationProvenanceAssignedAuthorCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAuthorParticipation target) {
				target.init();
				target.setAssignedAuthor(CDAFactory.eINSTANCE.createAssignedAuthor());
				target.getAssignedAuthor().setRepresentedOrganization(CDAFactory.eINSTANCE.createOrganization());

			}

			@Override
			protected void updateToPass(ProvenanceAuthorParticipation target) {
				// target.init();
				target.getAssignedAuthor().setCode(
					DatatypesFactory.eINSTANCE.createCE("DAUINLAW", "2.16.840.1.113883.5.111"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationProvenanceAssignedAuthorCode(
					(ProvenanceAuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAuthorParticipationProvenanceAssignedAuthorCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPerson() {
		OperationsTestCase<ProvenanceAuthorParticipation> validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonTestCase = new OperationsTestCase<ProvenanceAuthorParticipation>(
			"validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAuthorParticipation target) {
				target.init();
				target.setAssignedAuthor(CDAFactory.eINSTANCE.createAssignedAuthor());

			}

			@Override
			protected void updateToPass(ProvenanceAuthorParticipation target) {
				target.getAssignedAuthor().setAssignedPerson(CDAFactory.eINSTANCE.createPerson());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPerson(
					(ProvenanceAuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganization() {
		OperationsTestCase<ProvenanceAuthorParticipation> validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationTestCase = new OperationsTestCase<ProvenanceAuthorParticipation>(
			"validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAuthorParticipation target) {
				target.init();
				target.setAssignedAuthor(CDAFactory.eINSTANCE.createAssignedAuthor());

			}

			@Override
			protected void updateToPass(ProvenanceAuthorParticipation target) {
				target.init();
				target.getAssignedAuthor().setRepresentedOrganization(CDAFactory.eINSTANCE.createOrganization());

				target.getAssignedAuthor().getRepresentedOrganization().getAddrs().add(
					DatatypesFactory.eINSTANCE.createAD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganization(
					(ProvenanceAuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedAuthoringDevice() {
		OperationsTestCase<ProvenanceAuthorParticipation> validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedAuthoringDeviceTestCase = new OperationsTestCase<ProvenanceAuthorParticipation>(
			"validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedAuthoringDevice",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROVENANCE_AUTHOR_PARTICIPATION_PROVENANCE_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProvenanceAuthorParticipation target) {
				target.init();
				target.setAssignedAuthor(CDAFactory.eINSTANCE.createAssignedAuthor());

			}

			@Override
			protected void updateToPass(ProvenanceAuthorParticipation target) {
				target.getAssignedAuthor().setAssignedAuthoringDevice(CDAFactory.eINSTANCE.createAuthoringDevice());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedAuthoringDevice(
					(ProvenanceAuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedAuthoringDeviceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProvenanceAuthorParticipationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProvenanceAuthorParticipation> {
		public ProvenanceAuthorParticipation create() {
			return ConsolFactory.eINSTANCE.createProvenanceAuthorParticipation();
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
	private static class ConstructorTestClass extends ProvenanceAuthorParticipationOperations {
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

} // ProvenanceAuthorParticipationOperations
