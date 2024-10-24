/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.StrucDocText;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ST;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureEstimatedBloodLossSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Estimated Blood Loss Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection#validateProcedureEstimatedBloodLossSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Estimated Blood Loss Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection#validateProcedureEstimatedBloodLossSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Estimated Blood Loss Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection#validateProcedureEstimatedBloodLossSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Estimated Blood Loss Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection#validateProcedureEstimatedBloodLossSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Estimated Blood Loss Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection#validateProcedureEstimatedBloodLossSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Estimated Blood Loss Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureEstimatedBloodLossSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEstimatedBloodLossSectionTemplateId() {
		OperationsTestCase<ProcedureEstimatedBloodLossSection> validateProcedureEstimatedBloodLossSectionTemplateIdTestCase = new OperationsTestCase<ProcedureEstimatedBloodLossSection>(
			"validateProcedureEstimatedBloodLossSectionTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEstimatedBloodLossSection target) {

			}

			@Override
			protected void updateToPass(ProcedureEstimatedBloodLossSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEstimatedBloodLossSectionOperations.validateProcedureEstimatedBloodLossSectionTemplateId(
					(ProcedureEstimatedBloodLossSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEstimatedBloodLossSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEstimatedBloodLossSectionCode() {
		OperationsTestCase<ProcedureEstimatedBloodLossSection> validateProcedureEstimatedBloodLossSectionCodeTestCase = new OperationsTestCase<ProcedureEstimatedBloodLossSection>(
			"validateProcedureEstimatedBloodLossSectionCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEstimatedBloodLossSection target) {

			}

			@Override
			protected void updateToPass(ProcedureEstimatedBloodLossSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEstimatedBloodLossSectionOperations.validateProcedureEstimatedBloodLossSectionCode(
					(ProcedureEstimatedBloodLossSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEstimatedBloodLossSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEstimatedBloodLossSectionCodeP() {
		OperationsTestCase<ProcedureEstimatedBloodLossSection> validateProcedureEstimatedBloodLossSectionCodePTestCase = new OperationsTestCase<ProcedureEstimatedBloodLossSection>(
			"validateProcedureEstimatedBloodLossSectionCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEstimatedBloodLossSection target) {

			}

			@Override
			protected void updateToPass(ProcedureEstimatedBloodLossSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEstimatedBloodLossSectionOperations.validateProcedureEstimatedBloodLossSectionCodeP(
					(ProcedureEstimatedBloodLossSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEstimatedBloodLossSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEstimatedBloodLossSectionText() {
		OperationsTestCase<ProcedureEstimatedBloodLossSection> validateProcedureEstimatedBloodLossSectionTextTestCase = new OperationsTestCase<ProcedureEstimatedBloodLossSection>(
			"validateProcedureEstimatedBloodLossSectionText",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEstimatedBloodLossSection target) {

			}

			@Override
			protected void updateToPass(ProcedureEstimatedBloodLossSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEstimatedBloodLossSectionOperations.validateProcedureEstimatedBloodLossSectionText(
					(ProcedureEstimatedBloodLossSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEstimatedBloodLossSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEstimatedBloodLossSectionTitle() {
		OperationsTestCase<ProcedureEstimatedBloodLossSection> validateProcedureEstimatedBloodLossSectionTitleTestCase = new OperationsTestCase<ProcedureEstimatedBloodLossSection>(
			"validateProcedureEstimatedBloodLossSectionTitle",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEstimatedBloodLossSection target) {

			}

			@Override
			protected void updateToPass(ProcedureEstimatedBloodLossSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEstimatedBloodLossSectionOperations.validateProcedureEstimatedBloodLossSectionTitle(
					(ProcedureEstimatedBloodLossSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEstimatedBloodLossSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureEstimatedBloodLossSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureEstimatedBloodLossSection> {
		@Override
		public ProcedureEstimatedBloodLossSection create() {
			return ConsolFactory.eINSTANCE.createProcedureEstimatedBloodLossSection();
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
	private static class ConstructorTestClass extends ProcedureEstimatedBloodLossSectionOperations {
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

} // ProcedureEstimatedBloodLossSectionOperations
