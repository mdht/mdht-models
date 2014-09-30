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
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2;
import org.openhealthtools.mdht.uml.cda.consol.operations.EncounterActivity2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounter Activity2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivity2SdtcDDCFromNUBCOrDD(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activity2 Sdtc DDC From NUBC Or DD</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesIndication2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Indication2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesEncounterDiagnosis2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Diagnosis2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#getConsolIndication2s() <em>Get Consol Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#getConsolEncounterDiagnosis2s() <em>Get Consol Encounter Diagnosis2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2#validateEncounterActivitiesSDTCDischargeDispositionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities SDTC Discharge Disposition Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncounterActivity2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterActivity2SdtcDDCFromNUBCOrDD() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivity2SdtcDDCFromNUBCOrDDTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivity2SdtcDDCFromNUBCOrDD",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITY2_SDTC_DDC_FROM_NUBC_OR_DD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			private static final String NUBC_CODESYSTEM_VALUE = "2.16.840.1.113883.6.301.5";

			private static final String DDC_CODESYSTEM_VALUE = "2.16.840.1.113883.12.112";

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(EncounterActivity2 target) {
						// Fails due to incorrect codeSystem
						target.init();
						CE sdtcCode = DatatypesFactory.eINSTANCE.createCE();
						sdtcCode.setCode("AnyStringRequired"); // Required to be defined, but not to any specific String
						sdtcCode.setCodeSystem(CDAValidationTest.BAD_CODESYSTEM_ID); // apply incorrect codeSystem
						target.getSDTCDischargeDispositionCodes().add(sdtcCode);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(EncounterActivity2 target) {
						// even though it has the correct codeSystem -
						// fails due to not having a code defined at all
						target.init();
						CE sdtcCode = DatatypesFactory.eINSTANCE.createCE();
						sdtcCode.setCodeSystem(NUBC_CODESYSTEM_VALUE); // apply incorrect codeSystem
						target.getSDTCDischargeDispositionCodes().add(sdtcCode);
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(EncounterActivity2 target) {
						target.init();

						CE sdtcCode = DatatypesFactory.eINSTANCE.createCE();
						sdtcCode.setCode("notChecked"); // Required to be defined, but not to any specific String
						sdtcCode.setCodeSystem(NUBC_CODESYSTEM_VALUE); // the actual constraint checked which must be accurate
						sdtcCode.setCodeSystemName("NUBC UB-04 FL17-Patient Status"); // not required (not checked as a constraint)
						target.getSDTCDischargeDispositionCodes().add(sdtcCode);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(EncounterActivity2 target) {
						target.init();
						CE sdtcCode = DatatypesFactory.eINSTANCE.createCE();
						sdtcCode.setCode("notChecked"); // Required to be defined, but not to any specific String
						sdtcCode.setCodeSystem(DDC_CODESYSTEM_VALUE); // the actual constraint checked which must be accurate
						sdtcCode.setCodeSystemName("HL7 Discharge Disposition"); // not required (not checked as a constraint)
						target.getSDTCDischargeDispositionCodes().add(sdtcCode);
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivity2SdtcDDCFromNUBCOrDD(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivity2SdtcDDCFromNUBCOrDDTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterActivitiesIndication2() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesIndication2TestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesIndication2",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {

			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setObservation(ConsolFactory.eINSTANCE.createIndication2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesIndication2(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesIndication2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterActivitiesEncounterDiagnosis2() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesEncounterDiagnosis2TestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesEncounterDiagnosis2",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {

			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createEncounterDiagnosis2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesEncounterDiagnosis2(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesEncounterDiagnosis2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolIndication2s() {

		EncounterActivity2 target = objectFactory.create();
		target.getConsolIndication2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolEncounterDiagnosis2s() {

		EncounterActivity2 target = objectFactory.create();
		target.getConsolEncounterDiagnosis2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesTemplateId() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesTemplateIdTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {

			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesTemplateId(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterActivitiesSDTCDischargeDispositionCode() {
		OperationsTestCase<EncounterActivity2> validateEncounterActivitiesSDTCDischargeDispositionCodeTestCase = new OperationsTestCase<EncounterActivity2>(
			"validateEncounterActivitiesSDTCDischargeDispositionCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_SDTC_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity2 target) {
				// Fails due to not existing
				target.init();
			}

			@Override
			protected void updateToPass(EncounterActivity2 target) {
				// only needs to exist for this test
				CE sdtcCode = DatatypesFactory.eINSTANCE.createCE();
				target.getSDTCDischargeDispositionCodes().add(sdtcCode);
			}

			@Override
			protected void setDependency(EncounterActivity2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put(
					"org.openhealthtools.mdht.uml.cda.consol.EncounterActivitiesSDTCDischargeDispositionCodeP",
					passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivity2Operations.validateEncounterActivitiesSDTCDischargeDispositionCode(
					(EncounterActivity2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesSDTCDischargeDispositionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EncounterActivity2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<EncounterActivity2> {
		@Override
		public EncounterActivity2 create() {
			return ConsolFactory.eINSTANCE.createEncounterActivity2();
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
	private static class ConstructorTestClass extends EncounterActivity2Operations {
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

} // EncounterActivity2Operations
