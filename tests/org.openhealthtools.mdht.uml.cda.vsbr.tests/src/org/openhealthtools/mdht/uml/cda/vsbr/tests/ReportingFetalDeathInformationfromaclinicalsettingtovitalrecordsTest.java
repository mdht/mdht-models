/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection;
import org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Realm Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Confidentiality Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLaborandDeliverySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Laborand Delivery Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetalDeliverySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Fetal Delivery Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAntenatalTestingandSurveillance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Antenatal Testingand Surveillance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsPregnancyHistory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Pregnancy History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsHistoryofInfection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Historyof Infection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#getLaborandDeliverySection() <em>Get Laborand Delivery Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#getFetalDeliverySection() <em>Get Fetal Delivery Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#getAntenatalTestingandSurveillance() <em>Get Antenatal Testingand Surveillance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#getPregnancyHistory() <em>Get Pregnancy History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords#getHistoryofInfections() <em>Get Historyof Infections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTemplateId() {
		OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords> validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTemplateIdTestCase = new OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTemplateId(
					(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCode() {
		OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords> validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodeTestCase = new OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCode(
					(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodeP() {
		OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords> validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodePTestCase = new OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodeP",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodeP(
					(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTypeId() {
		OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords> validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTypeIdTestCase = new OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTypeId",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTypeId(
					(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTypeIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsClassCode() {
		OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords> validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsClassCodeTestCase = new OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsClassCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsClassCode(
					(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsMoodCode() {
		OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords> validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsMoodCodeTestCase = new OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsMoodCode(
					(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsId() {
		OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords> validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsIdTestCase = new OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsId",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsId(
					(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodeP() {
		OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords> validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodePTestCase = new OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodeP",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodeP(
					(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCode() {
		OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords> validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodeTestCase = new OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCode(
					(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTitle() {
		OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords> validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTitleTestCase = new OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTitle",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTitle(
					(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEffectiveTime() {
		OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords> validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEffectiveTimeTestCase = new OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEffectiveTime(
					(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP() {
		OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords> validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodePTestCase = new OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(
					(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCode() {
		OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords> validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeTestCase = new OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCode(
					(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLanguageCode() {
		OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords> validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLanguageCodeTestCase = new OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLanguageCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLanguageCode(
					(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLanguageCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor() {
		OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords> validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthorTestCase = new OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor(
					(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian() {
		OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords> validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodianTestCase = new OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian(
					(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodianTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget() {
		OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords> validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetTestCase = new OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget(
					(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLaborandDeliverySection() {
		OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords> validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLaborandDeliverySectionTestCase = new OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLaborandDeliverySection",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LABORAND_DELIVERY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

				/* LaborandDeliverySection */
				LaborandDeliverySection section =

				VsbrFactory.eINSTANCE.createLaborandDeliverySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLaborandDeliverySection(
					(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLaborandDeliverySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetalDeliverySection() {
		OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords> validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetalDeliverySectionTestCase = new OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetalDeliverySection",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_FETAL_DELIVERY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

				/* FetalDeliverySection */
				FetalDeliverySection section =

				VsbrFactory.eINSTANCE.createFetalDeliverySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetalDeliverySection(
					(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetalDeliverySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAntenatalTestingandSurveillance() {
		OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords> validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAntenatalTestingandSurveillanceTestCase = new OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAntenatalTestingandSurveillance",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ANTENATAL_TESTINGAND_SURVEILLANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAntenatalTestingandSurveillance(
					(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAntenatalTestingandSurveillanceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsPregnancyHistory() {
		OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords> validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsPregnancyHistoryTestCase = new OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsPregnancyHistory",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_PREGNANCY_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsPregnancyHistory(
					(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsPregnancyHistoryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsHistoryofInfection() {
		OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords> validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsHistoryofInfectionTestCase = new OperationsTestCase<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords>(
			"validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsHistoryofInfection",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_HISTORYOF_INFECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations.validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsHistoryofInfection(
					(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsHistoryofInfectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetLaborandDeliverySection() {

		ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target = objectFactory.create();
		target.getLaborandDeliverySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFetalDeliverySection() {

		ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target = objectFactory.create();
		target.getFetalDeliverySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAntenatalTestingandSurveillance() {

		ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target = objectFactory.create();
		target.getAntenatalTestingandSurveillance();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPregnancyHistory() {

		ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target = objectFactory.create();
		target.getPregnancyHistory();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryofInfections() {

		ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords target = objectFactory.create();
		target.getHistoryofInfections();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations {
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
	private static class ObjectFactory implements
			TestObjectFactory<ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords> {
		public ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords create() {
			return VsbrFactory.eINSTANCE.createReportingFetalDeathInformationfromaclinicalsettingtovitalrecords();
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
	private static class ConstructorTestClass extends
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations
