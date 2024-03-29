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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.InterventionsSection2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Interventions Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSection2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSection2InterventionAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Intervention Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSection2HandoffCommunication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Handoff Communication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSection2PlannedInterventionAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section2 Planned Intervention Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#getInterventionActs() <em>Get Intervention Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#getHandoffCommunications() <em>Get Handoff Communications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#getPlannedInterventionActs() <em>Get Planned Intervention Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2#validateInterventionsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Interventions Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InterventionsSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInterventionsSection2TemplateId() {
		OperationsTestCase<InterventionsSection2> validateInterventionsSection2TemplateIdTestCase = new OperationsTestCase<InterventionsSection2>(
			"validateInterventionsSection2TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTIONS_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionsSection2 target) {

			}

			@Override
			protected void updateToPass(InterventionsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionsSection2Operations.validateInterventionsSection2TemplateId(
					(InterventionsSection2) objectToTest, diagnostician, map);
			}

		};

		validateInterventionsSection2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionsSection2InterventionAct() {
		OperationsTestCase<InterventionsSection2> validateInterventionsSection2InterventionActTestCase = new OperationsTestCase<InterventionsSection2>(
			"validateInterventionsSection2InterventionAct", operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTIONS_SECTION2_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionsSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(InterventionsSection2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createInterventionAct().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionsSection2Operations.validateInterventionsSection2InterventionAct(
					(InterventionsSection2) objectToTest, diagnostician, map);
			}

		};

		validateInterventionsSection2InterventionActTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionsSection2HandoffCommunication() {
		OperationsTestCase<InterventionsSection2> validateInterventionsSection2HandoffCommunicationTestCase = new OperationsTestCase<InterventionsSection2>(
			"validateInterventionsSection2HandoffCommunication",
			operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTIONS_SECTION2_HANDOFF_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionsSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(InterventionsSection2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createHandoffCommunicationParticipants().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionsSection2Operations.validateInterventionsSection2HandoffCommunication(
					(InterventionsSection2) objectToTest, diagnostician, map);
			}

		};

		validateInterventionsSection2HandoffCommunicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionsSection2PlannedInterventionAct() {
		OperationsTestCase<InterventionsSection2> validateInterventionsSection2PlannedInterventionActTestCase = new OperationsTestCase<InterventionsSection2>(
			"validateInterventionsSection2PlannedInterventionAct",
			operationsForOCL.getOCLValue(
				"VALIDATE_INTERVENTIONS_SECTION2_PLANNED_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionsSection2 target) {

			}

			@Override
			protected void updateToPass(InterventionsSection2 target) {
				target.init();
				target.addAct(ConsolFactory.eINSTANCE.createPlannedInterventionAct().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionsSection2Operations.validateInterventionsSection2PlannedInterventionAct(
					(InterventionsSection2) objectToTest, diagnostician, map);
			}

		};

		validateInterventionsSection2PlannedInterventionActTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInterventionActs() {

		InterventionsSection2 target = objectFactory.create();
		target.getInterventionActs();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHandoffCommunications() {

		InterventionsSection2 target = objectFactory.create();
		target.getHandoffCommunications();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedInterventionActs() {

		InterventionsSection2 target = objectFactory.create();
		target.getPlannedInterventionActs();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionsSectionCodeP() {
		OperationsTestCase<InterventionsSection2> validateInterventionsSectionCodePTestCase = new OperationsTestCase<InterventionsSection2>(
			"validateInterventionsSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionsSection2 target) {

			}

			@Override
			protected void updateToPass(InterventionsSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionsSection2Operations.validateInterventionsSectionCodeP(
					(InterventionsSection2) objectToTest, diagnostician, map);
			}

		};

		validateInterventionsSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionsSectionCode() {
		OperationsTestCase<InterventionsSection2> validateInterventionsSectionCodeTestCase = new OperationsTestCase<InterventionsSection2>(
			"validateInterventionsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionsSection2 target) {

			}

			@Override
			protected void updateToPass(InterventionsSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(InterventionsSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.InterventionsSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionsSection2Operations.validateInterventionsSectionCode(
					(InterventionsSection2) objectToTest, diagnostician, map);
			}

		};

		validateInterventionsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends InterventionsSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<InterventionsSection2> {
		@Override
		public InterventionsSection2 create() {
			return ConsolFactory.eINSTANCE.createInterventionsSection2();
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
	private static class ConstructorTestClass extends InterventionsSection2Operations {
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

} // InterventionsSection2Operations
