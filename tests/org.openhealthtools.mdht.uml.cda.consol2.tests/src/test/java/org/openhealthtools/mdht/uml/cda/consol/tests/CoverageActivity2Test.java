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

import java.math.BigInteger;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2;
import org.openhealthtools.mdht.uml.cda.consol.operations.CoverageActivity2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.INT;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coverage Activity2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2#validateCoverageActivityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2#validateCoverageActivity2EntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity2 Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2#validateCoverageActivity2EntryRelationshipINTValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity2 Entry Relationship INT Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2#validateCoverageActivity2EntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity2 Entry Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2#validateCoverageActivity2EntryRelationshipSequenceNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity2 Entry Relationship Sequence Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2#validateCoverageActivity2EntryRelationshipPolicyActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity2 Entry Relationship Policy Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2#getConsolPolicyActivity2s() <em>Get Consol Policy Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2#validateCoverageActivityCoverageActivityRelationshipSequenceNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Coverage Activity Relationship Sequence Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2#validateCoverageActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2#validateCoverageActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2#validateCoverageActivityPolicyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Activity Policy Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CoverageActivity2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCoverageActivityCodeP() {
		OperationsTestCase<CoverageActivity2> validateCoverageActivityCodePTestCase = new OperationsTestCase<CoverageActivity2>(
			"validateCoverageActivityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_COVERAGE_ACTIVITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CoverageActivity2 target) {

			}

			@Override
			protected void updateToPass(CoverageActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoverageActivity2Operations.validateCoverageActivityCodeP(
					(CoverageActivity2) objectToTest, diagnostician, map);
			}

		};

		validateCoverageActivityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCoverageActivity2EntryRelationship() {
		OperationsTestCase<CoverageActivity2> validateCoverageActivity2EntryRelationshipTestCase = new OperationsTestCase<CoverageActivity2>(
			"validateCoverageActivity2EntryRelationship",
			operationsForOCL.getOCLValue("VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CoverageActivity2 target) {

			}

			@Override
			protected void updateToPass(CoverageActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoverageActivity2Operations.validateCoverageActivity2EntryRelationship(
					(CoverageActivity2) objectToTest, diagnostician, map);
			}

		};

		validateCoverageActivity2EntryRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCoverageActivity2EntryRelationshipINTValue() {
		OperationsTestCase<CoverageActivity2> validateCoverageActivity2EntryRelationshipINTValueTestCase = new OperationsTestCase<CoverageActivity2>(
			"validateCoverageActivity2EntryRelationshipINTValue",
			operationsForOCL.getOCLValue("VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_INT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CoverageActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setSequenceNumber(DatatypesFactory.eINSTANCE.createINT());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(CoverageActivity2 target) {
				target.getEntryRelationships().clear();
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				INT value = DatatypesFactory.eINSTANCE.createINT();
				value.setValue(BigInteger.ONE);
				er.setSequenceNumber(value);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoverageActivity2Operations.validateCoverageActivity2EntryRelationshipINTValue(
					(CoverageActivity2) objectToTest, diagnostician, map);
			}

		};

		validateCoverageActivity2EntryRelationshipINTValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCoverageActivity2EntryRelationshipTypeCode() {
		OperationsTestCase<CoverageActivity2> validateCoverageActivity2EntryRelationshipTypeCodeTestCase = new OperationsTestCase<CoverageActivity2>(
			"validateCoverageActivity2EntryRelationshipTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CoverageActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(CoverageActivity2 target) {
				target.getEntryRelationships().clear();
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoverageActivity2Operations.validateCoverageActivity2EntryRelationshipTypeCode(
					(CoverageActivity2) objectToTest, diagnostician, map);
			}

		};

		validateCoverageActivity2EntryRelationshipTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCoverageActivity2EntryRelationshipSequenceNumber() {
		OperationsTestCase<CoverageActivity2> validateCoverageActivity2EntryRelationshipSequenceNumberTestCase = new OperationsTestCase<CoverageActivity2>(
			"validateCoverageActivity2EntryRelationshipSequenceNumber",
			operationsForOCL.getOCLValue("VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CoverageActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(CoverageActivity2 target) {
				target.getEntryRelationships().clear();
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setSequenceNumber(DatatypesFactory.eINSTANCE.createINT());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoverageActivity2Operations.validateCoverageActivity2EntryRelationshipSequenceNumber(
					(CoverageActivity2) objectToTest, diagnostician, map);
			}

		};

		validateCoverageActivity2EntryRelationshipSequenceNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCoverageActivity2EntryRelationshipPolicyActivity2() {
		OperationsTestCase<CoverageActivity2> validateCoverageActivity2EntryRelationshipPolicyActivity2TestCase = new OperationsTestCase<CoverageActivity2>(
			"validateCoverageActivity2EntryRelationshipPolicyActivity2",
			operationsForOCL.getOCLValue("VALIDATE_COVERAGE_ACTIVITY2_ENTRY_RELATIONSHIP_POLICY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CoverageActivity2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(CoverageActivity2 target) {
				target.getEntryRelationships().clear();
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createPolicyActivity2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoverageActivity2Operations.validateCoverageActivity2EntryRelationshipPolicyActivity2(
					(CoverageActivity2) objectToTest, diagnostician, map);
			}

		};

		validateCoverageActivity2EntryRelationshipPolicyActivity2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolPolicyActivity2s() {

		CoverageActivity2 target = objectFactory.create();
		target.getConsolPolicyActivity2s();

	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateCoverageActivityCoverageActivityRelationshipSequenceNumber() {
		OperationsTestCase<CoverageActivity2> validateCoverageActivityCoverageActivityRelationshipSequenceNumberTestCase = new OperationsTestCase<CoverageActivity2>(
			"validateCoverageActivityCoverageActivityRelationshipSequenceNumber",
			operationsForOCL.getOCLValue("VALIDATE_COVERAGE_ACTIVITY_COVERAGE_ACTIVITY_RELATIONSHIP_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CoverageActivity2 target) {

			}

			@Override
			protected void updateToPass(CoverageActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoverageActivity2Operations.validateCoverageActivityCoverageActivityRelationshipSequenceNumber(
					(CoverageActivity2) objectToTest, diagnostician, map);
			}

		};

		validateCoverageActivityCoverageActivityRelationshipSequenceNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCoverageActivityTemplateId() {
		OperationsTestCase<CoverageActivity2> validateCoverageActivityTemplateIdTestCase = new OperationsTestCase<CoverageActivity2>(
			"validateCoverageActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_COVERAGE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CoverageActivity2 target) {

			}

			@Override
			protected void updateToPass(CoverageActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoverageActivity2Operations.validateCoverageActivityTemplateId(
					(CoverageActivity2) objectToTest, diagnostician, map);
			}

		};

		validateCoverageActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCoverageActivityCode() {
		OperationsTestCase<CoverageActivity2> validateCoverageActivityCodeTestCase = new OperationsTestCase<CoverageActivity2>(
			"validateCoverageActivityCode",
			operationsForOCL.getOCLValue("VALIDATE_COVERAGE_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CoverageActivity2 target) {

			}

			@Override
			protected void updateToPass(CoverageActivity2 target) {
				target.init();

			}

			@Override
			protected void setDependency(CoverageActivity2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.CoverageActivityCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoverageActivity2Operations.validateCoverageActivityCode(
					(CoverageActivity2) objectToTest, diagnostician, map);
			}

		};

		validateCoverageActivityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This association is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateCoverageActivityPolicyActivity() {
		OperationsTestCase<CoverageActivity2> validateCoverageActivityPolicyActivityTestCase = new OperationsTestCase<CoverageActivity2>(
			"validateCoverageActivityPolicyActivity",
			operationsForOCL.getOCLValue("VALIDATE_COVERAGE_ACTIVITY_POLICY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CoverageActivity2 target) {

			}

			@Override
			protected void updateToPass(CoverageActivity2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CoverageActivity2Operations.validateCoverageActivityPolicyActivity(
					(CoverageActivity2) objectToTest, diagnostician, map);
			}

		};

		validateCoverageActivityPolicyActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CoverageActivity2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<CoverageActivity2> {
		@Override
		public CoverageActivity2 create() {
			return ConsolFactory.eINSTANCE.createCoverageActivity2();
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
	private static class ConstructorTestClass extends CoverageActivity2Operations {
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

} // CoverageActivity2Operations
