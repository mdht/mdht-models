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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.SocialHistoryObservation2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2#validateSocialHistoryObservation2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation2 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2#validateSocialHistoryObservation2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2#validateSocialHistoryObservation2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2#validateSocialHistoryObservation2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2#validateSocialHistoryObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2#validateSocialHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SocialHistoryObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservation2Value() {
		OperationsTestCase<SocialHistoryObservation2> validateSocialHistoryObservation2ValueTestCase = new OperationsTestCase<SocialHistoryObservation2>(
			"validateSocialHistoryObservation2Value",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation2 target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservation2Operations.validateSocialHistoryObservation2Value(
					(SocialHistoryObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservation2ValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistoryObservation2Code() {
		OperationsTestCase<SocialHistoryObservation2> validateSocialHistoryObservation2CodeTestCase = new OperationsTestCase<SocialHistoryObservation2>(
			"validateSocialHistoryObservation2Code",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(SocialHistoryObservation2 target) {
				target.getCode().setCode("229819007");
				target.getCode().setCodeSystem(SNOMEDCT_ID);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservation2Operations.validateSocialHistoryObservation2Code(
					(SocialHistoryObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservation2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservation2CodeP() {
		OperationsTestCase<SocialHistoryObservation2> validateSocialHistoryObservation2CodePTestCase = new OperationsTestCase<SocialHistoryObservation2>(
			"validateSocialHistoryObservation2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation2 target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservation2Operations.validateSocialHistoryObservation2CodeP(
					(SocialHistoryObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservation2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservation2EffectiveTime() {
		OperationsTestCase<SocialHistoryObservation2> validateSocialHistoryObservation2EffectiveTimeTestCase = new OperationsTestCase<SocialHistoryObservation2>(
			"validateSocialHistoryObservation2EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation2 target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservation2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservation2Operations.validateSocialHistoryObservation2EffectiveTime(
					(SocialHistoryObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservation2EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistoryObservation2AuthorParticipation() {
		OperationsTestCase<SocialHistoryObservation2> validateSocialHistoryObservation2AuthorParticipationTestCase = new OperationsTestCase<SocialHistoryObservation2>(
			"validateSocialHistoryObservation2AuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(SocialHistoryObservation2 target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservation2Operations.validateSocialHistoryObservation2AuthorParticipation(
					(SocialHistoryObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservation2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservationTemplateId() {
		OperationsTestCase<SocialHistoryObservation2> validateSocialHistoryObservationTemplateIdTestCase = new OperationsTestCase<SocialHistoryObservation2>(
			"validateSocialHistoryObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation2 target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservation2Operations.validateSocialHistoryObservationTemplateId(
					(SocialHistoryObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SocialHistoryObservation2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<SocialHistoryObservation2> {
		public SocialHistoryObservation2 create() {
			return ConsolFactory.eINSTANCE.createSocialHistoryObservation2();
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
	private static class ConstructorTestClass extends SocialHistoryObservation2Operations {
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

} // SocialHistoryObservation2Operations
