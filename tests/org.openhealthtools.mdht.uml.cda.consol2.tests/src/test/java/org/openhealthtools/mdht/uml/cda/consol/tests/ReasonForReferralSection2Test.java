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
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ReasonForReferralSection2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reason For Referral Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection2#validateReasonForReferralSection2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection2#validateReasonForReferralSection2PatientReferralAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section2 Patient Referral Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection2#getPatientReferralActs() <em>Get Patient Referral Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection2#validateReasonForReferralSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection2#validateReasonForReferralSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ReasonForReferralSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReasonForReferralSection2TemplateId() {
		OperationsTestCase<ReasonForReferralSection2> validateReasonForReferralSection2TemplateIdTestCase = new OperationsTestCase<ReasonForReferralSection2>(
			"validateReasonForReferralSection2TemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_REASON_FOR_REFERRAL_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForReferralSection2 target) {

			}

			@Override
			protected void updateToPass(ReasonForReferralSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForReferralSection2Operations.validateReasonForReferralSection2TemplateId(
					(ReasonForReferralSection2) objectToTest, diagnostician, map);
			}

		};

		validateReasonForReferralSection2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReasonForReferralSection2PatientReferralAct() {
		OperationsTestCase<ReasonForReferralSection2> validateReasonForReferralSection2PatientReferralActTestCase = new OperationsTestCase<ReasonForReferralSection2>(
			"validateReasonForReferralSection2PatientReferralAct",
			operationsForOCL.getOCLValue(
				"VALIDATE_REASON_FOR_REFERRAL_SECTION2_PATIENT_REFERRAL_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForReferralSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ReasonForReferralSection2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createPatientReferralAct().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForReferralSection2Operations.validateReasonForReferralSection2PatientReferralAct(
					(ReasonForReferralSection2) objectToTest, diagnostician, map);
			}

		};

		validateReasonForReferralSection2PatientReferralActTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientReferralActs() {

		ReasonForReferralSection2 target = objectFactory.create();
		target.getPatientReferralActs();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonForReferralSectionCodeP() {
		OperationsTestCase<ReasonForReferralSection2> validateReasonForReferralSectionCodePTestCase = new OperationsTestCase<ReasonForReferralSection2>(
			"validateReasonForReferralSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_REASON_FOR_REFERRAL_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForReferralSection2 target) {

			}

			@Override
			protected void updateToPass(ReasonForReferralSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForReferralSection2Operations.validateReasonForReferralSectionCodeP(
					(ReasonForReferralSection2) objectToTest, diagnostician, map);
			}

		};

		validateReasonForReferralSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonForReferralSectionCode() {
		OperationsTestCase<ReasonForReferralSection2> validateReasonForReferralSectionCodeTestCase = new OperationsTestCase<ReasonForReferralSection2>(
			"validateReasonForReferralSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_REASON_FOR_REFERRAL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForReferralSection2 target) {

			}

			@Override
			protected void updateToPass(ReasonForReferralSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(ReasonForReferralSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForReferralSection2Operations.validateReasonForReferralSectionCode(
					(ReasonForReferralSection2) objectToTest, diagnostician, map);
			}

		};

		validateReasonForReferralSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ReasonForReferralSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ReasonForReferralSection2> {
		@Override
		public ReasonForReferralSection2 create() {
			return ConsolFactory.eINSTANCE.createReasonForReferralSection2();
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
	private static class ConstructorTestClass extends ReasonForReferralSection2Operations {
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

} // ReasonForReferralSection2Operations
