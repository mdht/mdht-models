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
import org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.operations.EncounterDiagnosis2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounter Diagnosis2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis2#validateEncounterDiagnosisProblemObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Problem Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis2#getConsolProblemObservation2s() <em>Get Consol Problem Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis2#validateEncounterDiagnosisTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis2#validateEncounterDiagnosisCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis2#validateEncounterDiagnosisCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncounterDiagnosis2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterDiagnosisProblemObservation2() {
		OperationsTestCase<EncounterDiagnosis2> validateEncounterDiagnosisProblemObservation2TestCase = new OperationsTestCase<EncounterDiagnosis2>(
			"validateEncounterDiagnosisProblemObservation2",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_DIAGNOSIS_PROBLEM_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(EncounterDiagnosis2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(ConsolFactory.eINSTANCE.createProblemObservation2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterDiagnosis2Operations.validateEncounterDiagnosisProblemObservation2(
					(EncounterDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterDiagnosisProblemObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolProblemObservation2s() {

		EncounterDiagnosis2 target = objectFactory.create();
		target.getConsolProblemObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterDiagnosisTemplateId() {
		OperationsTestCase<EncounterDiagnosis2> validateEncounterDiagnosisTemplateIdTestCase = new OperationsTestCase<EncounterDiagnosis2>(
			"validateEncounterDiagnosisTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(EncounterDiagnosis2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterDiagnosis2Operations.validateEncounterDiagnosisTemplateId(
					(EncounterDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterDiagnosisTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterDiagnosisCodeP() {
		OperationsTestCase<EncounterDiagnosis2> validateEncounterDiagnosisCodePTestCase = new OperationsTestCase<EncounterDiagnosis2>(
			"validateEncounterDiagnosisCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(EncounterDiagnosis2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterDiagnosis2Operations.validateEncounterDiagnosisCodeP(
					(EncounterDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterDiagnosisCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterDiagnosisCode() {
		OperationsTestCase<EncounterDiagnosis2> validateEncounterDiagnosisCodeTestCase = new OperationsTestCase<EncounterDiagnosis2>(
			"validateEncounterDiagnosisCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterDiagnosis2 target) {

			}

			@Override
			protected void updateToPass(EncounterDiagnosis2 target) {
				target.init();

			}

			@Override
			protected void setDependency(EncounterDiagnosis2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosisCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterDiagnosis2Operations.validateEncounterDiagnosisCode(
					(EncounterDiagnosis2) objectToTest, diagnostician, map);
			}

		};

		validateEncounterDiagnosisCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EncounterDiagnosis2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<EncounterDiagnosis2> {
		public EncounterDiagnosis2 create() {
			return ConsolFactory.eINSTANCE.createEncounterDiagnosis2();
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
	private static class ConstructorTestClass extends EncounterDiagnosis2Operations {
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

} // EncounterDiagnosis2Operations
