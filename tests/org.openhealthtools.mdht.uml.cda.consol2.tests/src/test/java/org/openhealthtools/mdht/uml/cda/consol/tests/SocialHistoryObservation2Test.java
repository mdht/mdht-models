/*******************************************************************************
 * Copyright (c) 2014. 2018 Dan Brown and others.
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
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.SocialHistoryObservation2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2#validateSocialHistoryObservation2ReferenceAttribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation2 Reference Attribute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2#validateSocialHistoryObservation2IfNotLoincRequireTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation2 If Not Loinc Require Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2#validateSocialHistoryObservation2IfNotLoincRequireTranslationFromLoinc(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation2 If Not Loinc Require Translation From Loinc</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2#validateSocialHistoryObservation2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2#validateSocialHistoryObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2#validateSocialHistoryObservation2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2#validateSocialHistoryObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2#validateSocialHistoryObservation2CDTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation2 CD Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2#validateSocialHistoryObservation2CDTranslationP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation2 CD Translation P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2#validateSocialHistoryObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2#validateSocialHistoryObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2#validateSocialHistoryObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2#validateSocialHistoryObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SocialHistoryObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistoryObservation2ReferenceAttribute() {
		OperationsTestCase<SocialHistoryObservation2> validateSocialHistoryObservation2ReferenceAttributeTestCase = new OperationsTestCase<SocialHistoryObservation2>(
			"validateSocialHistoryObservation2ReferenceAttribute",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_OBSERVATION2_REFERENCE_ATTRIBUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
				target.getCode().setOriginalText(DatatypesFactory.eINSTANCE.createED());
			}

			@Override
			protected void updateToPass(SocialHistoryObservation2 target) {
				target.getCode().getOriginalText().setReference(DatatypesFactory.eINSTANCE.createTEL());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservation2Operations.validateSocialHistoryObservation2ReferenceAttribute(
					(SocialHistoryObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservation2ReferenceAttributeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistoryObservation2IfNotLoincRequireTranslation() {
		OperationsTestCase<SocialHistoryObservation2> validateSocialHistoryObservation2IfNotLoincRequireTranslationTestCase = new OperationsTestCase<SocialHistoryObservation2>(
			"validateSocialHistoryObservation2IfNotLoincRequireTranslation",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_OBSERVATION2_IF_NOT_LOINC_REQUIRE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void updateToFail(SocialHistoryObservation2 target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				cd.setCodeSystem(SNOMEDCT_ID);
				target.setCode(cd);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(SocialHistoryObservation2 target) {
						target.init();
						CD cd = DatatypesFactory.eINSTANCE.createCD();
						cd.setCodeSystem(SNOMEDCT_ID);
						target.setCode(cd);
						target.getCode().getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(SocialHistoryObservation2 target) {
						target.init();
						CD cd = DatatypesFactory.eINSTANCE.createCD();
						cd.setCodeSystem(SNOMEDCT_ID);
						target.setCode(cd);
						target.getCode().getTranslations().add(
							DatatypesFactory.eINSTANCE.createCD("someCode", LOINC_ID));
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservation2Operations.validateSocialHistoryObservation2IfNotLoincRequireTranslation(
					(SocialHistoryObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservation2IfNotLoincRequireTranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistoryObservation2IfNotLoincRequireTranslationFromLoinc() {
		OperationsTestCase<SocialHistoryObservation2> validateSocialHistoryObservation2IfNotLoincRequireTranslationFromLoincTestCase = new OperationsTestCase<SocialHistoryObservation2>(
			"validateSocialHistoryObservation2IfNotLoincRequireTranslationFromLoinc",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_OBSERVATION2_IF_NOT_LOINC_REQUIRE_TRANSLATION_FROM_LOINC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(SocialHistoryObservation2 target) {
						target.init();
						CD cd = DatatypesFactory.eINSTANCE.createCD();
						cd.setCodeSystem(SNOMEDCT_ID);
						target.setCode(cd);
						target.getCode().getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(SocialHistoryObservation2 target) {
						target.init();
						CD cd = DatatypesFactory.eINSTANCE.createCD();
						cd.setCodeSystem(SNOMEDCT_ID);
						target.setCode(cd);
						target.getCode().getTranslations().add(
							DatatypesFactory.eINSTANCE.createCD("someCode", SNOMEDCT_ID));
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(SocialHistoryObservation2 target) {
						target.init();
						CD cd = DatatypesFactory.eINSTANCE.createCD();
						cd.setCodeSystem(SNOMEDCT_ID);
						target.setCode(cd);
						target.getCode().getTranslations().add(
							DatatypesFactory.eINSTANCE.createCD("someCode", LOINC_ID));
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(SocialHistoryObservation2 target) {
						target.init();
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(SocialHistoryObservation2 target) {
						target.init();
						CD cd = DatatypesFactory.eINSTANCE.createCD();
						cd.setCode("someCode");
						target.setCode(cd);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(SocialHistoryObservation2 target) {
						target.init();
						CD cd = DatatypesFactory.eINSTANCE.createCD("someCode", "someCodeSystemOID");
						target.setCode(cd);
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservation2Operations.validateSocialHistoryObservation2IfNotLoincRequireTranslationFromLoinc(
					(SocialHistoryObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservation2IfNotLoincRequireTranslationFromLoincTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistoryObservation2TemplateId() {
		OperationsTestCase<SocialHistoryObservation2> validateSocialHistoryObservation2TemplateIdTestCase = new OperationsTestCase<SocialHistoryObservation2>(
			"validateSocialHistoryObservation2TemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return SocialHistoryObservation2Operations.validateSocialHistoryObservation2TemplateId(
					(SocialHistoryObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservation2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservationStatusCodeP() {
		OperationsTestCase<SocialHistoryObservation2> validateSocialHistoryObservationStatusCodePTestCase = new OperationsTestCase<SocialHistoryObservation2>(
			"validateSocialHistoryObservationStatusCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return SocialHistoryObservation2Operations.validateSocialHistoryObservationStatusCodeP(
					(SocialHistoryObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservation2EffectiveTime() {
		OperationsTestCase<SocialHistoryObservation2> validateSocialHistoryObservation2EffectiveTimeTestCase = new OperationsTestCase<SocialHistoryObservation2>(
			"validateSocialHistoryObservation2EffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_OBSERVATION2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
			operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistoryObservation2CDTranslation() {
		OperationsTestCase<SocialHistoryObservation2> validateSocialHistoryObservation2CDTranslationTestCase = new OperationsTestCase<SocialHistoryObservation2>(
			"validateSocialHistoryObservation2CDTranslation", operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_OBSERVATION2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation2 target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
				target.getCode().getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(SocialHistoryObservation2 target) {
				target.getCode().getTranslations().set(
					0, DatatypesFactory.eINSTANCE.createCD("mustExistOnly", LOINC_ID));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservation2Operations.validateSocialHistoryObservation2CDTranslation(
					(SocialHistoryObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservation2CDTranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistoryObservation2CDTranslationP() {
		OperationsTestCase<SocialHistoryObservation2> validateSocialHistoryObservation2CDTranslationPTestCase = new OperationsTestCase<SocialHistoryObservation2>(
			"validateSocialHistoryObservation2CDTranslationP",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_OBSERVATION2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation2 target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
			}

			@Override
			protected void updateToPass(SocialHistoryObservation2 target) {
				target.getCode().getTranslations().add(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservation2Operations.validateSocialHistoryObservation2CDTranslationP(
					(SocialHistoryObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservation2CDTranslationPTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservationValue() {
		OperationsTestCase<SocialHistoryObservation2> validateSocialHistoryObservationValueTestCase = new OperationsTestCase<SocialHistoryObservation2>(
			"validateSocialHistoryObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return SocialHistoryObservation2Operations.validateSocialHistoryObservationValue(
					(SocialHistoryObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSocialHistoryObservationCode() {
		OperationsTestCase<SocialHistoryObservation2> validateSocialHistoryObservationCodeTestCase = new OperationsTestCase<SocialHistoryObservation2>(
			"validateSocialHistoryObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return SocialHistoryObservation2Operations.validateSocialHistoryObservationCode(
					(SocialHistoryObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservationCodeP() {
		OperationsTestCase<SocialHistoryObservation2> validateSocialHistoryObservationCodePTestCase = new OperationsTestCase<SocialHistoryObservation2>(
			"validateSocialHistoryObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return SocialHistoryObservation2Operations.validateSocialHistoryObservationCodeP(
					(SocialHistoryObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservationStatusCode() {
		OperationsTestCase<SocialHistoryObservation2> validateSocialHistoryObservationStatusCodeTestCase = new OperationsTestCase<SocialHistoryObservation2>(
			"validateSocialHistoryObservationStatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation2 target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservation2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(SocialHistoryObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservationStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservation2Operations.validateSocialHistoryObservationStatusCode(
					(SocialHistoryObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationStatusCodeTestCase.doValidationTest();
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
		@Override
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

} // SocialHistoryObservation2Operations
