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
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.FunctionalStatusObservation2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Functional Status Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusObservation2#validateFunctionalStatusObservation2TextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Observation2 Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusObservation2#validateFunctionalStatusObservation2TextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Observation2 Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusObservation2#validateFunctionalStatusObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusObservation2#validateFunctionalStatusResultObservationNonMedicinalSupplyActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Non Medicinal Supply Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusObservation2#validateFunctionalStatusObservation2ReferenceRangeObservationRangeNoCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Observation2 Reference Range Observation Range No Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusObservation2#getConsolNonMedicinalSupplyActivity2() <em>Get Consol Non Medicinal Supply Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusObservation2#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusObservation2#validateResultObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusObservation2#validateResultObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusObservation2#validateFunctionalStatusResultObservationReferenceRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Reference Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FunctionalStatusObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateFunctionalStatusObservation2TextReference() {
		OperationsTestCase<FunctionalStatusObservation2> validateFunctionalStatusObservation2TextReferenceTestCase = new OperationsTestCase<FunctionalStatusObservation2>(
			"validateFunctionalStatusObservation2TextReference",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_OBSERVATION2_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusObservation2Operations.validateFunctionalStatusObservation2TextReference(
					(FunctionalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusObservation2TextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateFunctionalStatusObservation2TextReferenceValue() {
		OperationsTestCase<FunctionalStatusObservation2> validateFunctionalStatusObservation2TextReferenceValueTestCase = new OperationsTestCase<FunctionalStatusObservation2>(
			"validateFunctionalStatusObservation2TextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_OBSERVATION2_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusObservation2Operations.validateFunctionalStatusObservation2TextReferenceValue(
					(FunctionalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusObservation2TextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFunctionalStatusObservation2AuthorParticipation() {
		OperationsTestCase<FunctionalStatusObservation2> validateFunctionalStatusObservation2AuthorParticipationTestCase = new OperationsTestCase<FunctionalStatusObservation2>(
			"validateFunctionalStatusObservation2AuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusObservation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(FunctionalStatusObservation2 target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusObservation2Operations.validateFunctionalStatusObservation2AuthorParticipation(
					(FunctionalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusObservation2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationNonMedicinalSupplyActivity2() {
		OperationsTestCase<FunctionalStatusObservation2> validateFunctionalStatusResultObservationNonMedicinalSupplyActivity2TestCase = new OperationsTestCase<FunctionalStatusObservation2>(
			"validateFunctionalStatusResultObservationNonMedicinalSupplyActivity2",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setSupply(ConsolFactory.eINSTANCE.createNonMedicinalSupplyActivity2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusObservation2Operations.validateFunctionalStatusResultObservationNonMedicinalSupplyActivity2(
					(FunctionalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationNonMedicinalSupplyActivity2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateFunctionalStatusObservation2ReferenceRangeObservationRangeNoCode() {
		OperationsTestCase<FunctionalStatusObservation2> validateFunctionalStatusObservation2ReferenceRangeObservationRangeNoCodeTestCase = new OperationsTestCase<FunctionalStatusObservation2>(
			"validateFunctionalStatusObservation2ReferenceRangeObservationRangeNoCode",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_OBSERVATION2_REFERENCE_RANGE_OBSERVATION_RANGE_NO_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusObservation2Operations.validateFunctionalStatusObservation2ReferenceRangeObservationRangeNoCode(
					(FunctionalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusObservation2ReferenceRangeObservationRangeNoCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolNonMedicinalSupplyActivity2() {

		FunctionalStatusObservation2 target = objectFactory.create();
		target.getConsolNonMedicinalSupplyActivity2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationTemplateId() {
		OperationsTestCase<FunctionalStatusObservation2> validateResultObservationTemplateIdTestCase = new OperationsTestCase<FunctionalStatusObservation2>(
			"validateResultObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusObservation2Operations.validateResultObservationTemplateId(
					(FunctionalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationCodeP() {
		OperationsTestCase<FunctionalStatusObservation2> validateResultObservationCodePTestCase = new OperationsTestCase<FunctionalStatusObservation2>(
			"validateResultObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusObservation2Operations.validateResultObservationCodeP(
					(FunctionalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultObservationCode() {
		OperationsTestCase<FunctionalStatusObservation2> validateResultObservationCodeTestCase = new OperationsTestCase<FunctionalStatusObservation2>(
			"validateResultObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusObservation2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(FunctionalStatusObservation2 target) {
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				cd.setCode("54522-8");
				cd.setCodeSystem(LOINC_ID);
				target.setCode(cd);
			}

			@Override
			protected void setDependency(FunctionalStatusObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ResultObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusObservation2Operations.validateResultObservationCode(
					(FunctionalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationReferenceRange() {
		OperationsTestCase<FunctionalStatusObservation2> validateFunctionalStatusResultObservationReferenceRangeTestCase = new OperationsTestCase<FunctionalStatusObservation2>(
			"validateFunctionalStatusResultObservationReferenceRange",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusObservation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(FunctionalStatusObservation2 target) {
				target.getReferenceRanges().add(CDAFactory.eINSTANCE.createReferenceRange());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusObservation2Operations.validateFunctionalStatusResultObservationReferenceRange(
					(FunctionalStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationReferenceRangeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FunctionalStatusObservation2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<FunctionalStatusObservation2> {
		@Override
		public FunctionalStatusObservation2 create() {
			return ConsolFactory.eINSTANCE.createFunctionalStatusObservation2();
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
	private static class ConstructorTestClass extends FunctionalStatusObservation2Operations {
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

} // FunctionalStatusObservation2Operations
