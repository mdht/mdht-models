/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication;
import org.openhealthtools.mdht.uml.cda.consol.operations.HandoffCommunicationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Handoff Communication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationParticipantParticipantRoleCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participant Participant Role Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationParticipantParticipantRoleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participant Participant Role Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication#validateHandoffCommunicationParticipantParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participant Participant Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HandoffCommunicationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHandoffCommunicationTemplateId() {
		OperationsTestCase<HandoffCommunication> validateHandoffCommunicationTemplateIdTestCase = new OperationsTestCase<HandoffCommunication>(
			"validateHandoffCommunicationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HANDOFF_COMMUNICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunication target) {

			}

			@Override
			protected void updateToPass(HandoffCommunication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationOperations.validateHandoffCommunicationTemplateId(
					(HandoffCommunication) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHandoffCommunicationClassCode() {
		OperationsTestCase<HandoffCommunication> validateHandoffCommunicationClassCodeTestCase = new OperationsTestCase<HandoffCommunication>(
			"validateHandoffCommunicationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_HANDOFF_COMMUNICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunication target) {

			}

			@Override
			protected void updateToPass(HandoffCommunication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationOperations.validateHandoffCommunicationClassCode(
					(HandoffCommunication) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHandoffCommunicationMoodCode() {
		OperationsTestCase<HandoffCommunication> validateHandoffCommunicationMoodCodeTestCase = new OperationsTestCase<HandoffCommunication>(
			"validateHandoffCommunicationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_HANDOFF_COMMUNICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunication target) {

			}

			@Override
			protected void updateToPass(HandoffCommunication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationOperations.validateHandoffCommunicationMoodCode(
					(HandoffCommunication) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHandoffCommunicationCodeP() {
		OperationsTestCase<HandoffCommunication> validateHandoffCommunicationCodePTestCase = new OperationsTestCase<HandoffCommunication>(
			"validateHandoffCommunicationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HANDOFF_COMMUNICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunication target) {

			}

			@Override
			protected void updateToPass(HandoffCommunication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationOperations.validateHandoffCommunicationCodeP(
					(HandoffCommunication) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHandoffCommunicationCode() {
		OperationsTestCase<HandoffCommunication> validateHandoffCommunicationCodeTestCase = new OperationsTestCase<HandoffCommunication>(
			"validateHandoffCommunicationCode",
			operationsForOCL.getOCLValue("VALIDATE_HANDOFF_COMMUNICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunication target) {

			}

			@Override
			protected void updateToPass(HandoffCommunication target) {
				target.init();

			}

			@Override
			protected void setDependency(HandoffCommunication target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationOperations.validateHandoffCommunicationCode(
					(HandoffCommunication) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHandoffCommunicationStatusCode() {
		OperationsTestCase<HandoffCommunication> validateHandoffCommunicationStatusCodeTestCase = new OperationsTestCase<HandoffCommunication>(
			"validateHandoffCommunicationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_HANDOFF_COMMUNICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunication target) {

			}

			@Override
			protected void updateToPass(HandoffCommunication target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationOperations.validateHandoffCommunicationStatusCode(
					(HandoffCommunication) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHandoffCommunicationStatusCodeP() {
		OperationsTestCase<HandoffCommunication> validateHandoffCommunicationStatusCodePTestCase = new OperationsTestCase<HandoffCommunication>(
			"validateHandoffCommunicationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HANDOFF_COMMUNICATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunication target) {

			}

			@Override
			protected void updateToPass(HandoffCommunication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationOperations.validateHandoffCommunicationStatusCodeP(
					(HandoffCommunication) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHandoffCommunicationEffectiveTime() {
		OperationsTestCase<HandoffCommunication> validateHandoffCommunicationEffectiveTimeTestCase = new OperationsTestCase<HandoffCommunication>(
			"validateHandoffCommunicationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_HANDOFF_COMMUNICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunication target) {

			}

			@Override
			protected void updateToPass(HandoffCommunication target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationOperations.validateHandoffCommunicationEffectiveTime(
					(HandoffCommunication) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHandoffCommunicationParticipant() {
		OperationsTestCase<HandoffCommunication> validateHandoffCommunicationParticipantTestCase = new OperationsTestCase<HandoffCommunication>(
			"validateHandoffCommunicationParticipant",
			operationsForOCL.getOCLValue("VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunication target) {

			}

			@Override
			protected void updateToPass(HandoffCommunication target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationOperations.validateHandoffCommunicationParticipant(
					(HandoffCommunication) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHandoffCommunicationParticipantParticipantRoleCodeP() {
		OperationsTestCase<HandoffCommunication> validateHandoffCommunicationParticipantParticipantRoleCodePTestCase = new OperationsTestCase<HandoffCommunication>(
			"validateHandoffCommunicationParticipantParticipantRoleCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunication target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(pr);
			}

			@Override
			protected void updateToPass(HandoffCommunication target) {
				target.getParticipants().get(0).getParticipantRole().setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationOperations.validateHandoffCommunicationParticipantParticipantRoleCodeP(
					(HandoffCommunication) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationParticipantParticipantRoleCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHandoffCommunicationParticipantParticipantRoleCode() {
		OperationsTestCase<HandoffCommunication> validateHandoffCommunicationParticipantParticipantRoleCodeTestCase = new OperationsTestCase<HandoffCommunication>(
			"validateHandoffCommunicationParticipantParticipantRoleCode",
			operationsForOCL.getOCLValue("VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunication target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(pr);
			}

			@Override
			protected void updateToPass(HandoffCommunication target) {
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ce.setCode("163W00000X");
				ce.setCodeSystem("2.16.840.1.113883.6.101");
				target.getParticipants().get(0).getParticipantRole().setCode(ce);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationOperations.validateHandoffCommunicationParticipantParticipantRoleCode(
					(HandoffCommunication) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationParticipantParticipantRoleCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHandoffCommunicationParticipantTypeCode() {
		OperationsTestCase<HandoffCommunication> validateHandoffCommunicationParticipantTypeCodeTestCase = new OperationsTestCase<HandoffCommunication>(
			"validateHandoffCommunicationParticipantTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunication target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(HandoffCommunication target) {
				target.getParticipants().get(0).setTypeCode(ParticipationType.IRCP);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationOperations.validateHandoffCommunicationParticipantTypeCode(
					(HandoffCommunication) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationParticipantTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHandoffCommunicationParticipantParticipantRole() {
		OperationsTestCase<HandoffCommunication> validateHandoffCommunicationParticipantParticipantRoleTestCase = new OperationsTestCase<HandoffCommunication>(
			"validateHandoffCommunicationParticipantParticipantRole",
			operationsForOCL.getOCLValue("VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunication target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(HandoffCommunication target) {
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				target.getParticipants().get(0).setParticipantRole(pr);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationOperations.validateHandoffCommunicationParticipantParticipantRole(
					(HandoffCommunication) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationParticipantParticipantRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HandoffCommunicationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HandoffCommunication> {
		public HandoffCommunication create() {
			return ConsolFactory.eINSTANCE.createHandoffCommunication();
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
	private static class ConstructorTestClass extends HandoffCommunicationOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // HandoffCommunicationOperations
