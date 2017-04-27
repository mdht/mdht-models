
/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.datatypes.ST;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.ReportingBirthInformationfromaclinicalsettingtovitalrecordsOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reporting Birth Informationfromaclinicalsettingtovitalrecords</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#validateReportingBirthInformationfromaclinicalsettingtovitalrecordsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Realm Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#validateReportingBirthInformationfromaclinicalsettingtovitalrecordsId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#validateReportingBirthInformationfromaclinicalsettingtovitalrecordsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Confidentiality Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#validateReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#validateReportingBirthInformationfromaclinicalsettingtovitalrecordsPrenatalTestingAndSurveillance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Prenatal Testing And Surveillance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#validateReportingBirthInformationfromaclinicalsettingtovitalrecordsPregnancyHistory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Pregnancy History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#validateReportingBirthInformationfromaclinicalsettingtovitalrecordsNewbornDeliverySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Newborn Delivery Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLaborAndDeliverySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords Labor And Delivery Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#validateReportingBirthInformationfromaclinicalsettingtovitalrecordsHistoryOfInfectionLiveBirthSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Birth Informationfromaclinicalsettingtovitalrecords History Of Infection Live Birth Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#getPrenatalTestingAndSurveillance() <em>Get Prenatal Testing And Surveillance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#getPregnancyHistory() <em>Get Pregnancy History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#getNewbornDeliverySection() <em>Get Newborn Delivery Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#getLaborAndDeliverySection() <em>Get Labor And Delivery Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords#getHistoryOfInfectionLiveBirthSection() <em>Get History Of Infection Live Birth Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ReportingBirthInformationfromaclinicalsettingtovitalrecordsTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReportingBirthInformationfromaclinicalsettingtovitalrecordsTemplateId() {
		OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords> validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTemplateIdTestCase = new OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingBirthInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTemplateId(
					(ReportingBirthInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReportingBirthInformationfromaclinicalsettingtovitalrecordsMoodCode() {
		OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords> validateReportingBirthInformationfromaclinicalsettingtovitalrecordsMoodCodeTestCase = new OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingBirthInformationfromaclinicalsettingtovitalrecordsMoodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingBirthInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsMoodCode(
					(ReportingBirthInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingBirthInformationfromaclinicalsettingtovitalrecordsMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCode() {
		OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords> validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCodeTestCase = new OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingBirthInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCode(
					(ReportingBirthInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCodeP() {
		OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords> validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCodePTestCase = new OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingBirthInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCodeP(
					(ReportingBirthInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReportingBirthInformationfromaclinicalsettingtovitalrecordsTypeId() {
		OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords> validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTypeIdTestCase = new OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTypeId",
			operationsForOCL.getOCLValue(
				"VALIDATE_REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingBirthInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTypeId(
					(ReportingBirthInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTypeIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReportingBirthInformationfromaclinicalsettingtovitalrecordsId() {
		OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords> validateReportingBirthInformationfromaclinicalsettingtovitalrecordsIdTestCase = new OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingBirthInformationfromaclinicalsettingtovitalrecordsId",
			operationsForOCL.getOCLValue(
				"VALIDATE_REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingBirthInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsId(
					(ReportingBirthInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingBirthInformationfromaclinicalsettingtovitalrecordsIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReportingBirthInformationfromaclinicalsettingtovitalrecordsCodeP() {
		OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords> validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCodePTestCase = new OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingBirthInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCodeP(
					(ReportingBirthInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReportingBirthInformationfromaclinicalsettingtovitalrecordsCode() {
		OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords> validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCodeTestCase = new OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingBirthInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCode(
					(ReportingBirthInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReportingBirthInformationfromaclinicalsettingtovitalrecordsTitle() {
		OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords> validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTitleTestCase = new OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTitle",
			operationsForOCL.getOCLValue(
				"VALIDATE_REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingBirthInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTitle(
					(ReportingBirthInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReportingBirthInformationfromaclinicalsettingtovitalrecordsEffectiveTime() {
		OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords> validateReportingBirthInformationfromaclinicalsettingtovitalrecordsEffectiveTimeTestCase = new OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingBirthInformationfromaclinicalsettingtovitalrecordsEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingBirthInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsEffectiveTime(
					(ReportingBirthInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingBirthInformationfromaclinicalsettingtovitalrecordsEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP() {
		OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords> validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCodePTestCase = new OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingBirthInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(
					(ReportingBirthInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCode() {
		OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords> validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeTestCase = new OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingBirthInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCode(
					(ReportingBirthInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReportingBirthInformationfromaclinicalsettingtovitalrecordsLanguageCode() {
		OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords> validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLanguageCodeTestCase = new OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLanguageCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingBirthInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLanguageCode(
					(ReportingBirthInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLanguageCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthor() {
		OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords> validateReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthorTestCase = new OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthor",
			operationsForOCL.getOCLValue(
				"VALIDATE_REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingBirthInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthor(
					(ReportingBirthInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodian() {
		OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords> validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodianTestCase = new OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodian",
			operationsForOCL.getOCLValue(
				"VALIDATE_REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingBirthInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodian(
					(ReportingBirthInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodianTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTarget() {
		OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords> validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetTestCase = new OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTarget",
			operationsForOCL.getOCLValue(
				"VALIDATE_REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingBirthInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTarget(
					(ReportingBirthInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReportingBirthInformationfromaclinicalsettingtovitalrecordsPrenatalTestingAndSurveillance() {
		OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords> validateReportingBirthInformationfromaclinicalsettingtovitalrecordsPrenatalTestingAndSurveillanceTestCase = new OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingBirthInformationfromaclinicalsettingtovitalrecordsPrenatalTestingAndSurveillance",
			operationsForOCL.getOCLValue(
				"VALIDATE_REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_PRENATAL_TESTING_AND_SURVEILLANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingBirthInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsPrenatalTestingAndSurveillance(
					(ReportingBirthInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingBirthInformationfromaclinicalsettingtovitalrecordsPrenatalTestingAndSurveillanceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReportingBirthInformationfromaclinicalsettingtovitalrecordsPregnancyHistory() {
		OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords> validateReportingBirthInformationfromaclinicalsettingtovitalrecordsPregnancyHistoryTestCase = new OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingBirthInformationfromaclinicalsettingtovitalrecordsPregnancyHistory",
			operationsForOCL.getOCLValue(
				"VALIDATE_REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_PREGNANCY_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingBirthInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsPregnancyHistory(
					(ReportingBirthInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingBirthInformationfromaclinicalsettingtovitalrecordsPregnancyHistoryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReportingBirthInformationfromaclinicalsettingtovitalrecordsNewbornDeliverySection() {
		OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords> validateReportingBirthInformationfromaclinicalsettingtovitalrecordsNewbornDeliverySectionTestCase = new OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingBirthInformationfromaclinicalsettingtovitalrecordsNewbornDeliverySection",
			operationsForOCL.getOCLValue(
				"VALIDATE_REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_NEWBORN_DELIVERY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

				/* NewbornDeliverySection */
				NewbornDeliverySection section =

						VsbrFactory.eINSTANCE.createNewbornDeliverySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingBirthInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsNewbornDeliverySection(
					(ReportingBirthInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingBirthInformationfromaclinicalsettingtovitalrecordsNewbornDeliverySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReportingBirthInformationfromaclinicalsettingtovitalrecordsLaborAndDeliverySection() {
		OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords> validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLaborAndDeliverySectionTestCase = new OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLaborAndDeliverySection",
			operationsForOCL.getOCLValue(
				"VALIDATE_REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LABOR_AND_DELIVERY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

				/* LaborAndDeliverySection */
				LaborAndDeliverySection section =

						VsbrFactory.eINSTANCE.createLaborAndDeliverySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingBirthInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLaborAndDeliverySection(
					(ReportingBirthInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLaborAndDeliverySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateReportingBirthInformationfromaclinicalsettingtovitalrecordsHistoryOfInfectionLiveBirthSection() {
		OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords> validateReportingBirthInformationfromaclinicalsettingtovitalrecordsHistoryOfInfectionLiveBirthSectionTestCase = new OperationsTestCase<ReportingBirthInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingBirthInformationfromaclinicalsettingtovitalrecordsHistoryOfInfectionLiveBirthSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_HISTORY_OF_INFECTION_LIVE_BIRTH_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingBirthInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

				/* HistoryOfInfectionLiveBirthSection */
				HistoryOfInfectionLiveBirthSection section =

						VsbrFactory.eINSTANCE.createHistoryOfInfectionLiveBirthSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingBirthInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingBirthInformationfromaclinicalsettingtovitalrecordsHistoryOfInfectionLiveBirthSection(
					(ReportingBirthInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingBirthInformationfromaclinicalsettingtovitalrecordsHistoryOfInfectionLiveBirthSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetPrenatalTestingAndSurveillance() {

		ReportingBirthInformationfromaclinicalsettingtovitalrecords target = objectFactory.create();
		target.getPrenatalTestingAndSurveillance();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetPregnancyHistory() {

		ReportingBirthInformationfromaclinicalsettingtovitalrecords target = objectFactory.create();
		target.getPregnancyHistory();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetNewbornDeliverySection() {

		ReportingBirthInformationfromaclinicalsettingtovitalrecords target = objectFactory.create();
		target.getNewbornDeliverySection();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetLaborAndDeliverySection() {

		ReportingBirthInformationfromaclinicalsettingtovitalrecords target = objectFactory.create();
		target.getLaborAndDeliverySection();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetHistoryOfInfectionLiveBirthSection() {

		ReportingBirthInformationfromaclinicalsettingtovitalrecords target = objectFactory.create();
		target.getHistoryOfInfectionLiveBirthSection();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL
			extends ReportingBirthInformationfromaclinicalsettingtovitalrecordsOperations {
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
	private static class ObjectFactory
			implements TestObjectFactory<ReportingBirthInformationfromaclinicalsettingtovitalrecords> {
		public ReportingBirthInformationfromaclinicalsettingtovitalrecords create() {
			return VsbrFactory.eINSTANCE.createReportingBirthInformationfromaclinicalsettingtovitalrecords();
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
	private static class ConstructorTestClass
			extends ReportingBirthInformationfromaclinicalsettingtovitalrecordsOperations {
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

} // ReportingBirthInformationfromaclinicalsettingtovitalrecordsOperations
