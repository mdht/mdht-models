/*******************************************************************************
 * Copyright (c) 2014, 2015 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *									 - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.AssignedAuthor;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.Organization;
import org.eclipse.mdht.uml.cda.Person;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AuthorParticipationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Author Participation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationAssignedAuthorAssignedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Assigned Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationAssignedAuthorRepresentedOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Represented Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationAssignedAuthorRepresentedOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Represented Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationAssignedAuthorRepresentedOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Represented Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationAssignedAuthorRepresentedOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Represented Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationAssignedAuthorCodeTerminology(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Code Terminology</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationAssignedAuthorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationAssignedAuthorAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation#validateAuthorParticipationAssignedAuthorRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Author Participation Assigned Author Represented Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AuthorParticipationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAuthorParticipationTemplateId() {
		OperationsTestCase<AuthorParticipation> validateAuthorParticipationTemplateIdTestCase = new OperationsTestCase<AuthorParticipation>(
			"validateAuthorParticipationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_AUTHOR_PARTICIPATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthorParticipation target) {

			}

			@Override
			protected void updateToPass(AuthorParticipation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorParticipationOperations.validateAuthorParticipationTemplateId(
					(AuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateAuthorParticipationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAuthorParticipationTime() {
		OperationsTestCase<AuthorParticipation> validateAuthorParticipationTimeTestCase = new OperationsTestCase<AuthorParticipation>(
			"validateAuthorParticipationTime",
			operationsForOCL.getOCLValue("VALIDATE_AUTHOR_PARTICIPATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthorParticipation target) {
				target.init();
			}

			@Override
			protected void updateToPass(AuthorParticipation target) {
				target.setTime(DatatypesFactory.eINSTANCE.createTS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorParticipationOperations.validateAuthorParticipationTime(
					(AuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateAuthorParticipationTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAuthorParticipationAssignedAuthor() {
		OperationsTestCase<AuthorParticipation> validateAuthorParticipationAssignedAuthorTestCase = new OperationsTestCase<AuthorParticipation>(
			"validateAuthorParticipationAssignedAuthor", operationsForOCL.getOCLValue(
				"VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthorParticipation target) {
				target.init();
			}

			@Override
			protected void updateToPass(AuthorParticipation target) {
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				target.setAssignedAuthor(aa);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorParticipationOperations.validateAuthorParticipationAssignedAuthor(
					(AuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateAuthorParticipationAssignedAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAuthorParticipationAssignedAuthorAssignedPersonName() {
		OperationsTestCase<AuthorParticipation> validateAuthorParticipationAssignedAuthorAssignedPersonNameTestCase = new OperationsTestCase<AuthorParticipation>(
			"validateAuthorParticipationAssignedAuthorAssignedPersonName",
			operationsForOCL.getOCLValue(
				"VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthorParticipation target) {
				target.init();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				target.setAssignedAuthor(aa);
				Person ap = CDAFactory.eINSTANCE.createPerson();
				aa.setAssignedPerson(ap);
			}

			@Override
			protected void updateToPass(AuthorParticipation target) {
				target.getAssignedAuthor().getAssignedPerson().getNames().add(DatatypesFactory.eINSTANCE.createPN());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorParticipationOperations.validateAuthorParticipationAssignedAuthorAssignedPersonName(
					(AuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateAuthorParticipationAssignedAuthorAssignedPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAuthorParticipationAssignedAuthorRepresentedOrganizationId() {
		OperationsTestCase<AuthorParticipation> validateAuthorParticipationAssignedAuthorRepresentedOrganizationIdTestCase = new OperationsTestCase<AuthorParticipation>(
			"validateAuthorParticipationAssignedAuthorRepresentedOrganizationId",
			operationsForOCL.getOCLValue(
				"VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthorParticipation target) {
				target.init();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				target.setAssignedAuthor(aa);
				Organization repOrg = CDAFactory.eINSTANCE.createOrganization();
				aa.setRepresentedOrganization(repOrg);
			}

			@Override
			protected void updateToPass(AuthorParticipation target) {
				target.getAssignedAuthor().getRepresentedOrganization().getIds().add(
					DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorParticipationOperations.validateAuthorParticipationAssignedAuthorRepresentedOrganizationId(
					(AuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateAuthorParticipationAssignedAuthorRepresentedOrganizationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAuthorParticipationAssignedAuthorRepresentedOrganizationName() {
		OperationsTestCase<AuthorParticipation> validateAuthorParticipationAssignedAuthorRepresentedOrganizationNameTestCase = new OperationsTestCase<AuthorParticipation>(
			"validateAuthorParticipationAssignedAuthorRepresentedOrganizationName",
			operationsForOCL.getOCLValue(
				"VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthorParticipation target) {
				target.init();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				target.setAssignedAuthor(aa);
				Organization repOrg = CDAFactory.eINSTANCE.createOrganization();
				aa.setRepresentedOrganization(repOrg);
			}

			@Override
			protected void updateToPass(AuthorParticipation target) {
				target.getAssignedAuthor().getRepresentedOrganization().getNames().add(
					DatatypesFactory.eINSTANCE.createON());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorParticipationOperations.validateAuthorParticipationAssignedAuthorRepresentedOrganizationName(
					(AuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateAuthorParticipationAssignedAuthorRepresentedOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAuthorParticipationAssignedAuthorRepresentedOrganizationTelecom() {
		OperationsTestCase<AuthorParticipation> validateAuthorParticipationAssignedAuthorRepresentedOrganizationTelecomTestCase = new OperationsTestCase<AuthorParticipation>(
			"validateAuthorParticipationAssignedAuthorRepresentedOrganizationTelecom",
			operationsForOCL.getOCLValue(
				"VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthorParticipation target) {
				target.init();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				target.setAssignedAuthor(aa);
				Organization repOrg = CDAFactory.eINSTANCE.createOrganization();
				aa.setRepresentedOrganization(repOrg);
			}

			@Override
			protected void updateToPass(AuthorParticipation target) {
				target.getAssignedAuthor().getRepresentedOrganization().getTelecoms().add(
					DatatypesFactory.eINSTANCE.createTEL());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorParticipationOperations.validateAuthorParticipationAssignedAuthorRepresentedOrganizationTelecom(
					(AuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateAuthorParticipationAssignedAuthorRepresentedOrganizationTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAuthorParticipationAssignedAuthorRepresentedOrganizationAddr() {
		OperationsTestCase<AuthorParticipation> validateAuthorParticipationAssignedAuthorRepresentedOrganizationAddrTestCase = new OperationsTestCase<AuthorParticipation>(
			"validateAuthorParticipationAssignedAuthorRepresentedOrganizationAddr",
			operationsForOCL.getOCLValue(
				"VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthorParticipation target) {
				target.init();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				target.setAssignedAuthor(aa);
				Organization repOrg = CDAFactory.eINSTANCE.createOrganization();
				aa.setRepresentedOrganization(repOrg);
			}

			@Override
			protected void updateToPass(AuthorParticipation target) {
				target.getAssignedAuthor().getRepresentedOrganization().getAddrs().add(
					DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorParticipationOperations.validateAuthorParticipationAssignedAuthorRepresentedOrganizationAddr(
					(AuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateAuthorParticipationAssignedAuthorRepresentedOrganizationAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAuthorParticipationAssignedAuthorCodeTerminology() {
		OperationsTestCase<AuthorParticipation> validateAuthorParticipationAssignedAuthorCodeTerminologyTestCase = new OperationsTestCase<AuthorParticipation>(
			"validateAuthorParticipationAssignedAuthorCodeTerminology",
			operationsForOCL.getOCLValue(
				"VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_CODE_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthorParticipation target) {
				target.init();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				target.setAssignedAuthor(aa);
				aa.setCode(DatatypesFactory.eINSTANCE.createCE("notCurrentlyChecked", BAD_CODESYSTEM_ID));
			}

			@Override
			protected void updateToPass(AuthorParticipation target) {
				target.getAssignedAuthor().setCode(
					DatatypesFactory.eINSTANCE.createCE("notCurrentlyChecked", "2.16.840.1.113883.6.101"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorParticipationOperations.validateAuthorParticipationAssignedAuthorCodeTerminology(
					(AuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateAuthorParticipationAssignedAuthorCodeTerminologyTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAuthorParticipationAssignedAuthorId() {
		OperationsTestCase<AuthorParticipation> validateAuthorParticipationAssignedAuthorIdTestCase = new OperationsTestCase<AuthorParticipation>(
			"validateAuthorParticipationAssignedAuthorId", operationsForOCL.getOCLValue(
				"VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthorParticipation target) {
				target.init();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				target.setAssignedAuthor(aa);
			}

			@Override
			protected void updateToPass(AuthorParticipation target) {
				target.getAssignedAuthor().getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorParticipationOperations.validateAuthorParticipationAssignedAuthorId(
					(AuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateAuthorParticipationAssignedAuthorIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAuthorParticipationAssignedAuthorCode() {
		OperationsTestCase<AuthorParticipation> validateAuthorParticipationAssignedAuthorCodeTestCase = new OperationsTestCase<AuthorParticipation>(
			"validateAuthorParticipationAssignedAuthorCode", operationsForOCL.getOCLValue(
				"VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthorParticipation target) {
				target.init();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				target.setAssignedAuthor(aa);
			}

			@Override
			protected void updateToPass(AuthorParticipation target) {
				target.getAssignedAuthor().setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorParticipationOperations.validateAuthorParticipationAssignedAuthorCode(
					(AuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateAuthorParticipationAssignedAuthorCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAuthorParticipationAssignedAuthorAssignedPerson() {
		OperationsTestCase<AuthorParticipation> validateAuthorParticipationAssignedAuthorAssignedPersonTestCase = new OperationsTestCase<AuthorParticipation>(
			"validateAuthorParticipationAssignedAuthorAssignedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthorParticipation target) {
				target.init();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				target.setAssignedAuthor(aa);
			}

			@Override
			protected void updateToPass(AuthorParticipation target) {
				Person ap = CDAFactory.eINSTANCE.createPerson();
				target.getAssignedAuthor().setAssignedPerson(ap);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorParticipationOperations.validateAuthorParticipationAssignedAuthorAssignedPerson(
					(AuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateAuthorParticipationAssignedAuthorAssignedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAuthorParticipationAssignedAuthorRepresentedOrganization() {
		OperationsTestCase<AuthorParticipation> validateAuthorParticipationAssignedAuthorRepresentedOrganizationTestCase = new OperationsTestCase<AuthorParticipation>(
			"validateAuthorParticipationAssignedAuthorRepresentedOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_AUTHOR_PARTICIPATION_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthorParticipation target) {
				target.init();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				target.setAssignedAuthor(aa);
			}

			@Override
			protected void updateToPass(AuthorParticipation target) {
				Organization repOrg = CDAFactory.eINSTANCE.createOrganization();
				target.getAssignedAuthor().setRepresentedOrganization(repOrg);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthorParticipationOperations.validateAuthorParticipationAssignedAuthorRepresentedOrganization(
					(AuthorParticipation) objectToTest, diagnostician, map);
			}

		};

		validateAuthorParticipationAssignedAuthorRepresentedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AuthorParticipationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AuthorParticipation> {
		@Override
		public AuthorParticipation create() {
			return ConsolFactory.eINSTANCE.createAuthorParticipation();
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
	private static class ConstructorTestClass extends AuthorParticipationOperations {
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

} // AuthorParticipationOperations
