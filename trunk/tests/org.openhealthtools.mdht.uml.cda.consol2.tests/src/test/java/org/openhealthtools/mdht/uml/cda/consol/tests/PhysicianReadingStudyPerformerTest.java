/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Dan Brown (Audacious Inquiry) - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer;
import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicianReadingStudyPerformerOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ServiceEventPerformer;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physician Reading Study Performer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerPreciseToTheDayIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Precise To The Day IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerPreciseToTheMinuteIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Precise To The Minute IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerPreciseToTheSecondIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Precise To The Second IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer If More Precise Than Day Include Time Zone Offset IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerAssignedEntityHasDICOM(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity Has DICOM</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity Has Assigned Person Or Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity Has National Provider Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PhysicianReadingStudyPerformerTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePhysicianReadingStudyPerformerPreciseToTheDayIVLTS() {
		OperationsTestCase<PhysicianReadingStudyPerformer> validatePhysicianReadingStudyPerformerPreciseToTheDayIVLTSTestCase = new OperationsTestCase<PhysicianReadingStudyPerformer>(
			"validatePhysicianReadingStudyPerformerPreciseToTheDayIVLTS",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianReadingStudyPerformer target) {
				target.init();
				IVL_TS time = DatatypesFactory.eINSTANCE.createIVL_TS();
				time.setValue("1234");
				target.setTime(time);
			}

			@Override
			protected void updateToPass(PhysicianReadingStudyPerformer target) {
				target.getTime().setValue(PRECISE_TO_DAY);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerPreciseToTheDayIVLTS(
					(PhysicianReadingStudyPerformer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianReadingStudyPerformerPreciseToTheDayIVLTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePhysicianReadingStudyPerformerPreciseToTheMinuteIVLTS() {
		OperationsTestCase<PhysicianReadingStudyPerformer> validatePhysicianReadingStudyPerformerPreciseToTheMinuteIVLTSTestCase = new OperationsTestCase<PhysicianReadingStudyPerformer>(
			"validatePhysicianReadingStudyPerformerPreciseToTheMinuteIVLTS",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianReadingStudyPerformer target) {
				target.init();
				IVL_TS time = DatatypesFactory.eINSTANCE.createIVL_TS();
				time.setValue("1234");
				target.setTime(time);
			}

			@Override
			protected void updateToPass(PhysicianReadingStudyPerformer target) {
				target.getTime().setValue(PRECISE_TO_MINUTE);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerPreciseToTheMinuteIVLTS(
					(PhysicianReadingStudyPerformer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianReadingStudyPerformerPreciseToTheMinuteIVLTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePhysicianReadingStudyPerformerPreciseToTheSecondIVLTS() {
		OperationsTestCase<PhysicianReadingStudyPerformer> validatePhysicianReadingStudyPerformerPreciseToTheSecondIVLTSTestCase = new OperationsTestCase<PhysicianReadingStudyPerformer>(
			"validatePhysicianReadingStudyPerformerPreciseToTheSecondIVLTS",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianReadingStudyPerformer target) {
				target.init();
				IVL_TS time = DatatypesFactory.eINSTANCE.createIVL_TS();
				time.setValue("1234");
				target.setTime(time);
			}

			@Override
			protected void updateToPass(PhysicianReadingStudyPerformer target) {
				target.getTime().setValue(PRECISE_TO_SECOND);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerPreciseToTheSecondIVLTS(
					(PhysicianReadingStudyPerformer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianReadingStudyPerformerPreciseToTheSecondIVLTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePhysicianReadingStudyPerformerIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS() {
		OperationsTestCase<PhysicianReadingStudyPerformer> validatePhysicianReadingStudyPerformerIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTSTestCase = new OperationsTestCase<PhysicianReadingStudyPerformer>(
			"validatePhysicianReadingStudyPerformerIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianReadingStudyPerformer target) {
				target.init();
				IVL_TS time = DatatypesFactory.eINSTANCE.createIVL_TS();
				time.setValue(PRECISE_TO_MINUTE);
				target.setTime(time);
			}

			@Override
			protected void updateToPass(PhysicianReadingStudyPerformer target) {
				target.getTime().setValue(PRECISE_TO_MINUTE_WITH_TIMEZONE);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(
					(PhysicianReadingStudyPerformer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianReadingStudyPerformerIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicianReadingStudyPerformerTemplateId() {
		OperationsTestCase<PhysicianReadingStudyPerformer> validatePhysicianReadingStudyPerformerTemplateIdTestCase = new OperationsTestCase<PhysicianReadingStudyPerformer>(
			"validatePhysicianReadingStudyPerformerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianReadingStudyPerformer target) {

			}

			@Override
			protected void updateToPass(PhysicianReadingStudyPerformer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerTemplateId(
					(PhysicianReadingStudyPerformer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianReadingStudyPerformerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePhysicianReadingStudyPerformerTime() {
		OperationsTestCase<PhysicianReadingStudyPerformer> validatePhysicianReadingStudyPerformerTimeTestCase = new OperationsTestCase<PhysicianReadingStudyPerformer>(
			"validatePhysicianReadingStudyPerformerTime",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianReadingStudyPerformer target) {
				target.init();
			}

			@Override
			protected void updateToPass(PhysicianReadingStudyPerformer target) {
				target.setTime(DatatypesFactory.eINSTANCE.createIVL_TS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerTime(
					(PhysicianReadingStudyPerformer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianReadingStudyPerformerTimeTestCase.doValidationTest();
	}

	/**
	* 
	* @generated NOT
	*/
	@Test
	public void testValidatePhysicianReadingStudyPerformerTypeCode() {
		OperationsTestCase<PhysicianReadingStudyPerformer> validatePhysicianReadingStudyPerformerTypeCodeTestCase = new OperationsTestCase<PhysicianReadingStudyPerformer>(
			"validatePhysicianReadingStudyPerformerTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianReadingStudyPerformer target) {
				target.init();
				// incorrect value
				target.setTypeCode(x_ServiceEventPerformer.SPRF);
			}

			@Override
			protected void updateToPass(PhysicianReadingStudyPerformer target) {
				// correct value
				target.setTypeCode(x_ServiceEventPerformer.PRF);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerTypeCode(
					(PhysicianReadingStudyPerformer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianReadingStudyPerformerTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePhysicianReadingStudyPerformerAssignedEntity() {
		OperationsTestCase<PhysicianReadingStudyPerformer> validatePhysicianReadingStudyPerformerAssignedEntityTestCase = new OperationsTestCase<PhysicianReadingStudyPerformer>(
			"validatePhysicianReadingStudyPerformerAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianReadingStudyPerformer target) {
				target.init();
			}

			@Override
			protected void updateToPass(PhysicianReadingStudyPerformer target) {

				target.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerAssignedEntity(
					(PhysicianReadingStudyPerformer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianReadingStudyPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId() {
		OperationsTestCase<PhysicianReadingStudyPerformer> validatePhysicianReadingStudyPerformerAssignedEntityHasNationalProviderIdTestCase = new OperationsTestCase<PhysicianReadingStudyPerformer>(
			"validatePhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianReadingStudyPerformer target) {
				target.init();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getIds().add(DatatypesFactory.eINSTANCE.createII());
				target.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(PhysicianReadingStudyPerformer target) {
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				II id = DatatypesFactory.eINSTANCE.createII();
				id.setRoot("2.16.840.1.113883.4.6");
				ae.getIds().add(id);
				target.setAssignedEntity(ae);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId(
					(PhysicianReadingStudyPerformer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianReadingStudyPerformerAssignedEntityHasNationalProviderIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePhysicianReadingStudyPerformerAssignedEntityHasDICOM() {
		OperationsTestCase<PhysicianReadingStudyPerformer> validatePhysicianReadingStudyPerformerAssignedEntityHasDICOMTestCase = new OperationsTestCase<PhysicianReadingStudyPerformer>(
			"validatePhysicianReadingStudyPerformerAssignedEntityHasDICOM",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_HAS_DICOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianReadingStudyPerformer target) {
				target.init();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setCode(DatatypesFactory.eINSTANCE.createCE());
				target.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(PhysicianReadingStudyPerformer target) {
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setCode(DatatypesFactory.eINSTANCE.createCE("test", "1.2.840.10008.2.16.4"));
				target.setAssignedEntity(ae);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerAssignedEntityHasDICOM(
					(PhysicianReadingStudyPerformer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianReadingStudyPerformerAssignedEntityHasDICOMTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization() {
		OperationsTestCase<PhysicianReadingStudyPerformer> validatePhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganizationTestCase = new OperationsTestCase<PhysicianReadingStudyPerformer>(
			"validatePhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianReadingStudyPerformer target) {
				target.init();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				target.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(PhysicianReadingStudyPerformer target) {
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
				target.setAssignedEntity(ae);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization(
					(PhysicianReadingStudyPerformer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePhysicianReadingStudyPerformerAssignedEntityCode() {
		OperationsTestCase<PhysicianReadingStudyPerformer> validatePhysicianReadingStudyPerformerAssignedEntityCodeTestCase = new OperationsTestCase<PhysicianReadingStudyPerformer>(
			"validatePhysicianReadingStudyPerformerAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianReadingStudyPerformer target) {
				target.init();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				target.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(PhysicianReadingStudyPerformer target) {
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setCode(DatatypesFactory.eINSTANCE.createCE("test", "1.2.840.10008.2.16.4"));
				target.setAssignedEntity(ae);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerAssignedEntityCode(
					(PhysicianReadingStudyPerformer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianReadingStudyPerformerAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePhysicianReadingStudyPerformerAssignedEntityId() {
		OperationsTestCase<PhysicianReadingStudyPerformer> validatePhysicianReadingStudyPerformerAssignedEntityIdTestCase = new OperationsTestCase<PhysicianReadingStudyPerformer>(
			"validatePhysicianReadingStudyPerformerAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianReadingStudyPerformer target) {
				target.init();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				target.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(PhysicianReadingStudyPerformer target) {
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				II id = DatatypesFactory.eINSTANCE.createII();
				id.setRoot("2.16.840.1.113883.4.6");
				ae.getIds().add(id);
				target.setAssignedEntity(ae);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerAssignedEntityId(
					(PhysicianReadingStudyPerformer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianReadingStudyPerformerAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PhysicianReadingStudyPerformerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PhysicianReadingStudyPerformer> {
		@Override
		public PhysicianReadingStudyPerformer create() {
			return ConsolFactory.eINSTANCE.createPhysicianReadingStudyPerformer();
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
	private static class ConstructorTestClass extends PhysicianReadingStudyPerformerOperations {
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

} // PhysicianReadingStudyPerformerOperations
