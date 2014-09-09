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
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.Authorization;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Consent;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.Performer1;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNote2;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection;
import org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection;
import org.openhealthtools.mdht.uml.cda.consol.SurgicalDrainsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.OperativeNote2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClass;
import org.openhealthtools.mdht.uml.hl7.vocab.ActMood;
import org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipType;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ServiceEventPerformer;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Operative Note2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2Authorization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2AnesthesiaSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Anesthesia Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ComplicationsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Complications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2PreoperativeDiagnosisSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Preoperative Diagnosis Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ProcedureEstimatedBloodLossSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Estimated Blood Loss Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ProcedureFindingsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Findings Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ProcedureSpecimensTakenSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Specimens Taken Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ProcedureDescriptionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Description Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2PostoperativeDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Postoperative Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ProcedureImplantsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Implants Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2OperativeNoteFluidSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Operative Note Fluid Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2OperativeNoteSurgicalProcedureSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Operative Note Surgical Procedure Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2PlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2PlannedProcedureSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Planned Procedure Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ProcedureDispositionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2ProcedureIndicationsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Procedure Indications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2SurgicalDrainsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Surgical Drains Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Effective Time Has High When No Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Effective Time No High If Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPreciseToTheDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Precise To The Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPreciseToTheMinute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Precise To The Minute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPreciseToTheSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Precise To The Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event If More Precise Than Day Include Time Zone Offset</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventProcedureCodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Procedure Codes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEventPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2DocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2AuthorizationConsentClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2AuthorizationConsentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2AuthorizationConsentStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2AuthorizationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateOperativeNote2AuthorizationConsent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note2 Authorization Consent</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getAnesthesiaSection2() <em>Get Anesthesia Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getComplicationsSection2() <em>Get Complications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getPreoperativeDiagnosisSection2() <em>Get Preoperative Diagnosis Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getProcedureEstimatedBloodLossSection() <em>Get Procedure Estimated Blood Loss Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getProcedureFindingsSection2() <em>Get Procedure Findings Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getProcedureSpecimensTakenSection() <em>Get Procedure Specimens Taken Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getProcedureDescriptionSection() <em>Get Procedure Description Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getPostoperativeDiagnosisSection() <em>Get Postoperative Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getProcedureImplantsSection() <em>Get Procedure Implants Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getOperativeNoteFluidSection() <em>Get Operative Note Fluid Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getOperativeNoteSurgicalProcedureSection() <em>Get Operative Note Surgical Procedure Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getPlanOfTreatmentSection2() <em>Get Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getPlannedProcedureSection2() <em>Get Planned Procedure Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getProcedureDispositionSection() <em>Get Procedure Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getProcedureIndicationsSection2() <em>Get Procedure Indications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#getSurgicalDrainsSection() <em>Get Surgical Drains Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class OperativeNote2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2CodeP() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2CodePTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2CodeP(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2Code() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2CodeTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2Code",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				CE code = target.getCode();
				code.setCode("11504-8");
				code.setCodeSystem("2.16.840.1.113883.6.1");
			}

			@Override
			protected void setDependency(OperativeNote2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.OperativeNote2CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2Code(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOf() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOf",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOf(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2Authorization() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2AuthorizationTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2Authorization",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();
				Authorization auth = CDAFactory.eINSTANCE.createAuthorization();
				target.getAuthorizations().add(auth);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2Authorization(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2AuthorizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2AnesthesiaSection2() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2AnesthesiaSection2TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2AnesthesiaSection2",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_ANESTHESIA_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAnesthesiaSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2AnesthesiaSection2(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2AnesthesiaSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2ComplicationsSection2() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ComplicationsSection2TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ComplicationsSection2",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_COMPLICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createComplicationsSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ComplicationsSection2(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ComplicationsSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2PreoperativeDiagnosisSection2() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2PreoperativeDiagnosisSection2TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2PreoperativeDiagnosisSection2",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_PREOPERATIVE_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createPreoperativeDiagnosisSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2PreoperativeDiagnosisSection2(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2PreoperativeDiagnosisSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2ProcedureEstimatedBloodLossSection() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ProcedureEstimatedBloodLossSectionTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ProcedureEstimatedBloodLossSection",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

				/* ProcedureEstimatedBloodLossSection */
				ProcedureEstimatedBloodLossSection section =

				ConsolFactory.eINSTANCE.createProcedureEstimatedBloodLossSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ProcedureEstimatedBloodLossSection(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ProcedureEstimatedBloodLossSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2ProcedureFindingsSection2() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ProcedureFindingsSection2TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ProcedureFindingsSection2",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_PROCEDURE_FINDINGS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createProcedureFindingsSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ProcedureFindingsSection2(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ProcedureFindingsSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2ProcedureSpecimensTakenSection() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ProcedureSpecimensTakenSectionTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ProcedureSpecimensTakenSection",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_PROCEDURE_SPECIMENS_TAKEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

				/* ProcedureSpecimensTakenSection */
				ProcedureSpecimensTakenSection section =

				ConsolFactory.eINSTANCE.createProcedureSpecimensTakenSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ProcedureSpecimensTakenSection(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ProcedureSpecimensTakenSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2ProcedureDescriptionSection() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ProcedureDescriptionSectionTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ProcedureDescriptionSection",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_PROCEDURE_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

				/* ProcedureDescriptionSection */
				ProcedureDescriptionSection section =

				ConsolFactory.eINSTANCE.createProcedureDescriptionSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ProcedureDescriptionSection(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ProcedureDescriptionSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2PostoperativeDiagnosisSection() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2PostoperativeDiagnosisSectionTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2PostoperativeDiagnosisSection",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_POSTOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

				/* PostoperativeDiagnosisSection */
				PostoperativeDiagnosisSection section =

				ConsolFactory.eINSTANCE.createPostoperativeDiagnosisSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2PostoperativeDiagnosisSection(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2PostoperativeDiagnosisSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2ProcedureImplantsSection() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ProcedureImplantsSectionTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ProcedureImplantsSection",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_PROCEDURE_IMPLANTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

				/* ProcedureImplantsSection */
				ProcedureImplantsSection section =

				ConsolFactory.eINSTANCE.createProcedureImplantsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ProcedureImplantsSection(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ProcedureImplantsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2OperativeNoteFluidSection() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2OperativeNoteFluidSectionTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2OperativeNoteFluidSection",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_OPERATIVE_NOTE_FLUID_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

				/* OperativeNoteFluidSection */
				OperativeNoteFluidSection section =

				ConsolFactory.eINSTANCE.createOperativeNoteFluidSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2OperativeNoteFluidSection(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2OperativeNoteFluidSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2OperativeNoteSurgicalProcedureSection() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2OperativeNoteSurgicalProcedureSectionTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2OperativeNoteSurgicalProcedureSection",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

				/* OperativeNoteSurgicalProcedureSection */
				OperativeNoteSurgicalProcedureSection section =

				ConsolFactory.eINSTANCE.createOperativeNoteSurgicalProcedureSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2OperativeNoteSurgicalProcedureSection(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2OperativeNoteSurgicalProcedureSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2PlanOfTreatmentSection2() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2PlanOfTreatmentSection2TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2PlanOfTreatmentSection2",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2PlanOfTreatmentSection2(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2PlanOfTreatmentSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2PlannedProcedureSection2() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2PlannedProcedureSection2TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2PlannedProcedureSection2",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_PLANNED_PROCEDURE_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createPlannedProcedureSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2PlannedProcedureSection2(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2PlannedProcedureSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2ProcedureDispositionSection() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ProcedureDispositionSectionTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ProcedureDispositionSection",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_PROCEDURE_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

				/* ProcedureDispositionSection */
				ProcedureDispositionSection section =

				ConsolFactory.eINSTANCE.createProcedureDispositionSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ProcedureDispositionSection(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ProcedureDispositionSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2ProcedureIndicationsSection2() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2ProcedureIndicationsSection2TestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2ProcedureIndicationsSection2",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_PROCEDURE_INDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createProcedureIndicationsSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2ProcedureIndicationsSection2(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2ProcedureIndicationsSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNote2SurgicalDrainsSection() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2SurgicalDrainsSectionTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2SurgicalDrainsSection",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_SURGICAL_DRAINS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

				/* SurgicalDrainsSection */
				SurgicalDrainsSection section =

				ConsolFactory.eINSTANCE.createSurgicalDrainsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2SurgicalDrainsSection(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2SurgicalDrainsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventIVLTSLow() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventIVLTSLowTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventIVLTSLow",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				target.getDocumentationOfs().add(dof);
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				IVL_TS et = DatatypesFactory.eINSTANCE.createIVL_TS();
				se.setEffectiveTime(et);
			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				IVL_TS et = DatatypesFactory.eINSTANCE.createIVL_TS();
				et.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
				for (DocumentationOf dof : target.getDocumentationOfs()) {
					dof.getServiceEvent().setEffectiveTime(et);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventIVLTSLow(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventIVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				perf.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setCode(DatatypesFactory.eINSTANCE.createCE("CP", "2.16.840.1.113883.12.443"));
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCode(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodePTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				perf.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setCode(DatatypesFactory.eINSTANCE.createCE("test", "2.16.840.1.113883.6.101"));
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventPerformerTypeCode() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventPerformerTypeCodeTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventPerformerTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();

				perf.setTypeCode(x_ServiceEventPerformer.SPRF);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerTypeCode(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventPerformerTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				perf.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntity(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidthTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				ts.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
				ts.setWidth(DatatypesFactory.eINSTANCE.createPQ());
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				ts.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidthTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidthTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				ts.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
				ts.setWidth(DatatypesFactory.eINSTANCE.createPQ());
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();

				ts.setWidth(DatatypesFactory.eINSTANCE.createPQ());
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);

				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidthTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventPreciseToTheDay() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventPreciseToTheDayTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventPreciseToTheDay",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("200912", "2013");
				se.setEffectiveTime(ivlts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
					PRECISE_TO_DAY);
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
					PRECISE_TO_MINUTE);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPreciseToTheDay(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventPreciseToTheDayTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventPreciseToTheMinute() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventPreciseToTheMinuteTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventPreciseToTheMinute",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				IVXB_TS low = DatatypesFactory.eINSTANCE.createIVXB_TS();
				low.setValue("2009121217");
				ts.setLow(low);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
					PRECISE_TO_MINUTE);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPreciseToTheMinute(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventPreciseToTheMinuteTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventPreciseToTheSecond() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventPreciseToTheSecondTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventPreciseToTheSecond",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				IVXB_TS high = DatatypesFactory.eINSTANCE.createIVXB_TS();
				high.setValue(PRECISE_TO_MINUTE);
				ts.setHigh(high);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
					PRECISE_TO_SECOND);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPreciseToTheSecond(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventPreciseToTheSecondTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffsetTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS(PRECISE_TO_MINUTE, PRECISE_TO_SECOND);
				se.setEffectiveTime(ivlts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
					PRECISE_TO_MS_WITH_TIMEZONE);
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
					PRECISE_TO_MINUTE_WITH_TIMEZONE);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffsetTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventProcedureCodes() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventProcedureCodesTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventProcedureCodes",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.setCode(DatatypesFactory.eINSTANCE.createCE("code", "NOT2.16.840.1.113883.6.104"));
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(OperativeNote2 target) {
						target.getDocumentationOfs().clear();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						se.setCode(DatatypesFactory.eINSTANCE.createCE("code", "2.16.840.1.113883.6.104"));
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);

					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(OperativeNote2 target) {
						target.getDocumentationOfs().clear();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						se.setCode(DatatypesFactory.eINSTANCE.createCE("code", "2.16.840.1.113883.6.12"));
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);

					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(OperativeNote2 target) {
						target.getDocumentationOfs().clear();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						se.setCode(DatatypesFactory.eINSTANCE.createCE("code", "2.16.840.1.113883.6.96"));
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);

					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventProcedureCodes(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventProcedureCodesTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventEffectiveTime() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventEffectiveTimeTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);

				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventEffectiveTime(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventCode() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventCodeTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventCode",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				se.setCode(ce);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventCode(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEventPerformer() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventPerformerTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEventPerformer",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEventPerformer(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2DocumentationOfServiceEvent() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2DocumentationOfServiceEventTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2DocumentationOfServiceEvent",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2DocumentationOfServiceEvent(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2DocumentationOfServiceEventTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2AuthorizationConsentClassCode() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2AuthorizationConsentClassCodeTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2AuthorizationConsentClassCode",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {
				target.init();
				Authorization auth = CDAFactory.eINSTANCE.createAuthorization();
				target.getAuthorizations().add(auth);
				Consent con = CDAFactory.eINSTANCE.createConsent();
				auth.setConsent(con);
			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				for (Authorization a : target.getAuthorizations()) {
					a.getConsent().setClassCode(ActClass.CONS);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2AuthorizationConsentClassCode(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2AuthorizationConsentClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2AuthorizationConsentMoodCode() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2AuthorizationConsentMoodCodeTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2AuthorizationConsentMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {
				target.init();
				Authorization auth = CDAFactory.eINSTANCE.createAuthorization();
				target.getAuthorizations().add(auth);
				Consent con = CDAFactory.eINSTANCE.createConsent();
				auth.setConsent(con);
			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				for (Authorization a : target.getAuthorizations()) {
					a.getConsent().setMoodCode(ActMood.EVN);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2AuthorizationConsentMoodCode(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2AuthorizationConsentMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2AuthorizationConsentStatusCode() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2AuthorizationConsentStatusCodeTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2AuthorizationConsentStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {
				target.init();
				Authorization auth = CDAFactory.eINSTANCE.createAuthorization();
				target.getAuthorizations().add(auth);
				Consent con = CDAFactory.eINSTANCE.createConsent();
				auth.setConsent(con);
			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				for (Authorization a : target.getAuthorizations()) {
					a.getConsent().setStatusCode(DatatypesFactory.eINSTANCE.createCS());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2AuthorizationConsentStatusCode(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2AuthorizationConsentStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2AuthorizationTypeCode() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2AuthorizationTypeCodeTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2AuthorizationTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {
				target.init();
				Authorization auth = CDAFactory.eINSTANCE.createAuthorization();
				target.getAuthorizations().add(auth);
			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				for (Authorization a : target.getAuthorizations()) {
					a.setTypeCode(ActRelationshipType.AUTH);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2AuthorizationTypeCode(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2AuthorizationTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNote2AuthorizationConsent() {
		OperationsTestCase<OperativeNote2> validateOperativeNote2AuthorizationConsentTestCase = new OperationsTestCase<OperativeNote2>(
			"validateOperativeNote2AuthorizationConsent",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE2_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {
				target.init();
				Authorization auth = CDAFactory.eINSTANCE.createAuthorization();
				target.getAuthorizations().add(auth);
			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				Consent con = CDAFactory.eINSTANCE.createConsent();
				for (Authorization a : target.getAuthorizations()) {
					a.setConsent(con);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateOperativeNote2AuthorizationConsent(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNote2AuthorizationConsentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAnesthesiaSection2() {

		OperativeNote2 target = objectFactory.create();
		target.getAnesthesiaSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetComplicationsSection2() {

		OperativeNote2 target = objectFactory.create();
		target.getComplicationsSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPreoperativeDiagnosisSection2() {

		OperativeNote2 target = objectFactory.create();
		target.getPreoperativeDiagnosisSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureEstimatedBloodLossSection() {

		OperativeNote2 target = objectFactory.create();
		target.getProcedureEstimatedBloodLossSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureFindingsSection2() {

		OperativeNote2 target = objectFactory.create();
		target.getProcedureFindingsSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureSpecimensTakenSection() {

		OperativeNote2 target = objectFactory.create();
		target.getProcedureSpecimensTakenSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureDescriptionSection() {

		OperativeNote2 target = objectFactory.create();
		target.getProcedureDescriptionSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPostoperativeDiagnosisSection() {

		OperativeNote2 target = objectFactory.create();
		target.getPostoperativeDiagnosisSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureImplantsSection() {

		OperativeNote2 target = objectFactory.create();
		target.getProcedureImplantsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetOperativeNoteFluidSection() {

		OperativeNote2 target = objectFactory.create();
		target.getOperativeNoteFluidSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetOperativeNoteSurgicalProcedureSection() {

		OperativeNote2 target = objectFactory.create();
		target.getOperativeNoteSurgicalProcedureSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfTreatmentSection2() {

		OperativeNote2 target = objectFactory.create();
		target.getPlanOfTreatmentSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedProcedureSection2() {

		OperativeNote2 target = objectFactory.create();
		target.getPlannedProcedureSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureDispositionSection() {

		OperativeNote2 target = objectFactory.create();
		target.getProcedureDispositionSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureIndicationsSection2() {

		OperativeNote2 target = objectFactory.create();
		target.getProcedureIndicationsSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSurgicalDrainsSection() {

		OperativeNote2 target = objectFactory.create();
		target.getSurgicalDrainsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<OperativeNote2> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<OperativeNote2>(
			"validateGeneralHeaderConstraintsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote2 target) {

			}

			@Override
			protected void updateToPass(OperativeNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNote2Operations.validateGeneralHeaderConstraintsTemplateId(
					(OperativeNote2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends OperativeNote2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<OperativeNote2> {
		public OperativeNote2 create() {
			return ConsolFactory.eINSTANCE.createOperativeNote2();
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
	private static class ConstructorTestClass extends OperativeNote2Operations {
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

} // OperativeNote2Operations
