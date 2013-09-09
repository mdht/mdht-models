/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.AntenatalTestingandSurveillanceSection;
import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection;
import org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionSection;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection;
import org.openhealthtools.mdht.uml.cda.vsbr.PriorPregnancyHistorySection;
import org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

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
public class ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations extends
		ClinicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTemplateId(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTemplateId(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTemplateId(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTemplateId(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingFetalDeathInformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTemplateId(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
			try {
				VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reportingFetalDeathInformationfromaclinicalsettingtovitalrecords)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, context) }),
					new Object[] { reportingFetalDeathInformationfromaclinicalsettingtovitalrecords }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Realm Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = element.oclAsType(datatypes::CS) in " + "value.code = 'US'))";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Realm Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingFetalDeathInformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCode(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
			try {
				VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reportingFetalDeathInformationfromaclinicalsettingtovitalrecords)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, context) }),
					new Object[] { reportingFetalDeathInformationfromaclinicalsettingtovitalrecords }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodeP(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Realm Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodeP(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodeP(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Realm Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodeP(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingFetalDeathInformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodeP(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
			try {
				VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reportingFetalDeathInformationfromaclinicalsettingtovitalrecords)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE_P,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodeP",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, context) }),
					new Object[] { reportingFetalDeathInformationfromaclinicalsettingtovitalrecords }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTypeId(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Type Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTypeId(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTypeId(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Type Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTypeId(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingFetalDeathInformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTypeId(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
			try {
				VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reportingFetalDeathInformationfromaclinicalsettingtovitalrecords)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TYPE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTypeId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, context) }),
					new Object[] { reportingFetalDeathInformationfromaclinicalsettingtovitalrecords }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsClassCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsClassCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode') and self.classCode=vocab::ActClinicalDocument::DOCCLIN";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsClassCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsClassCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingFetalDeathInformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsClassCode(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
			try {
				VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reportingFetalDeathInformationfromaclinicalsettingtovitalrecords)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CLASS_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsClassCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, context) }),
					new Object[] { reportingFetalDeathInformationfromaclinicalsettingtovitalrecords }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsMoodCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsMoodCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode') and self.moodCode=vocab::ActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsMoodCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsMoodCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingFetalDeathInformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsMoodCode(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
			try {
				VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reportingFetalDeathInformationfromaclinicalsettingtovitalrecords)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_MOOD_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsMoodCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, context) }),
					new Object[] { reportingFetalDeathInformationfromaclinicalsettingtovitalrecords }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsId(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsId(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsId(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsId(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingFetalDeathInformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsId(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
			try {
				VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reportingFetalDeathInformationfromaclinicalsettingtovitalrecords)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, context) }),
					new Object[] { reportingFetalDeathInformationfromaclinicalsettingtovitalrecords }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodeP(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodeP(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodeP(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodeP(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingFetalDeathInformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodeP(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
			try {
				VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reportingFetalDeathInformationfromaclinicalsettingtovitalrecords)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE_P,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodeP",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, context) }),
					new Object[] { reportingFetalDeathInformationfromaclinicalsettingtovitalrecords }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingFetalDeathInformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCode(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
			try {
				VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reportingFetalDeathInformationfromaclinicalsettingtovitalrecords)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, context) }),
					new Object[] { reportingFetalDeathInformationfromaclinicalsettingtovitalrecords }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTitle(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTitle(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTitle(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTitle(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingFetalDeathInformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTitle(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
			try {
				VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reportingFetalDeathInformationfromaclinicalsettingtovitalrecords)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TITLE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTitle",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, context) }),
					new Object[] { reportingFetalDeathInformationfromaclinicalsettingtovitalrecords }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEffectiveTime(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEffectiveTime(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEffectiveTime(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEffectiveTime(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingFetalDeathInformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEffectiveTime(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
			try {
				VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reportingFetalDeathInformationfromaclinicalsettingtovitalrecords)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_EFFECTIVE_TIME,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEffectiveTime",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, context) }),
					new Object[] { reportingFetalDeathInformationfromaclinicalsettingtovitalrecords }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Confidentiality Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Confidentiality Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingFetalDeathInformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
			try {
				VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reportingFetalDeathInformationfromaclinicalsettingtovitalrecords)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE_P,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, context) }),
					new Object[] { reportingFetalDeathInformationfromaclinicalsettingtovitalrecords }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Confidentiality Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.25')";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Confidentiality Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingFetalDeathInformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCode(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
			try {
				VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reportingFetalDeathInformationfromaclinicalsettingtovitalrecords)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, context) }),
					new Object[] { reportingFetalDeathInformationfromaclinicalsettingtovitalrecords }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLanguageCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLanguageCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLanguageCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLanguageCode(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingFetalDeathInformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLanguageCode(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
			try {
				VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reportingFetalDeathInformationfromaclinicalsettingtovitalrecords)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LANGUAGE_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLanguageCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, context) }),
					new Object[] { reportingFetalDeathInformationfromaclinicalsettingtovitalrecords }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingFetalDeathInformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
			try {
				VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reportingFetalDeathInformationfromaclinicalsettingtovitalrecords)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, context) }),
					new Object[] { reportingFetalDeathInformationfromaclinicalsettingtovitalrecords }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Custodian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingFetalDeathInformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
			try {
				VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reportingFetalDeathInformationfromaclinicalsettingtovitalrecords)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, context) }),
					new Object[] { reportingFetalDeathInformationfromaclinicalsettingtovitalrecords }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Record Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Record Target</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingFetalDeathInformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
			try {
				VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reportingFetalDeathInformationfromaclinicalsettingtovitalrecords)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, context) }),
					new Object[] { reportingFetalDeathInformationfromaclinicalsettingtovitalrecords }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLaborandDeliverySection(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Laborand Delivery Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLaborandDeliverySection(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LABORAND_DELIVERY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::LaborandDeliverySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLaborandDeliverySection(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Laborand Delivery Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLaborandDeliverySection(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LABORAND_DELIVERY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingFetalDeathInformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLaborandDeliverySection(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LABORAND_DELIVERY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
			try {
				VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LABORAND_DELIVERY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LABORAND_DELIVERY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LABORAND_DELIVERY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reportingFetalDeathInformationfromaclinicalsettingtovitalrecords)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LABORAND_DELIVERY_SECTION,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLaborandDeliverySection",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, context) }),
					new Object[] { reportingFetalDeathInformationfromaclinicalsettingtovitalrecords }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetalDeliverySection(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Fetal Delivery Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetalDeliverySection(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_FETAL_DELIVERY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::FetalDeliverySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetalDeliverySection(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Fetal Delivery Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetalDeliverySection(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_FETAL_DELIVERY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingFetalDeathInformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetalDeliverySection(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_FETAL_DELIVERY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
			try {
				VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_FETAL_DELIVERY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_FETAL_DELIVERY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_FETAL_DELIVERY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reportingFetalDeathInformationfromaclinicalsettingtovitalrecords)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_FETAL_DELIVERY_SECTION,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetalDeliverySection",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, context) }),
					new Object[] { reportingFetalDeathInformationfromaclinicalsettingtovitalrecords }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAntenatalTestingandSurveillance(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Antenatal Testingand Surveillance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAntenatalTestingandSurveillance(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ANTENATAL_TESTINGAND_SURVEILLANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::AntenatalTestingandSurveillanceSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAntenatalTestingandSurveillance(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Antenatal Testingand Surveillance</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAntenatalTestingandSurveillance(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ANTENATAL_TESTINGAND_SURVEILLANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingFetalDeathInformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAntenatalTestingandSurveillance(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ANTENATAL_TESTINGAND_SURVEILLANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
			try {
				VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ANTENATAL_TESTINGAND_SURVEILLANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ANTENATAL_TESTINGAND_SURVEILLANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ANTENATAL_TESTINGAND_SURVEILLANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reportingFetalDeathInformationfromaclinicalsettingtovitalrecords)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ANTENATAL_TESTINGAND_SURVEILLANCE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAntenatalTestingandSurveillance",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, context) }),
					new Object[] { reportingFetalDeathInformationfromaclinicalsettingtovitalrecords }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsPregnancyHistory(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Pregnancy History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsPregnancyHistory(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_PREGNANCY_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::PriorPregnancyHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsPregnancyHistory(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Pregnancy History</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsPregnancyHistory(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_PREGNANCY_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingFetalDeathInformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsPregnancyHistory(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_PREGNANCY_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
			try {
				VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_PREGNANCY_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_PREGNANCY_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_PREGNANCY_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reportingFetalDeathInformationfromaclinicalsettingtovitalrecords)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_PREGNANCY_HISTORY,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsPregnancyHistory",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, context) }),
					new Object[] { reportingFetalDeathInformationfromaclinicalsettingtovitalrecords }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsHistoryofInfection(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Historyof Infection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsHistoryofInfection(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_HISTORYOF_INFECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::HistoryofInfectionSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsHistoryofInfection(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords Historyof Infection</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsHistoryofInfection(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_HISTORYOF_INFECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reportingFetalDeathInformationfromaclinicalsettingtovitalrecords The receiving '<em><b>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsHistoryofInfection(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_HISTORYOF_INFECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);
			try {
				VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_HISTORYOF_INFECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_HISTORYOF_INFECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_HISTORYOF_INFECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reportingFetalDeathInformationfromaclinicalsettingtovitalrecords)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS__REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_HISTORYOF_INFECTION,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsHistoryofInfection",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									reportingFetalDeathInformationfromaclinicalsettingtovitalrecords, context) }),
					new Object[] { reportingFetalDeathInformationfromaclinicalsettingtovitalrecords }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getLaborandDeliverySection(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) <em>Get Laborand Delivery Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaborandDeliverySection(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_LABORAND_DELIVERY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::LaborandDeliverySection))->asSequence()->any(true).oclAsType(vsbr::LaborandDeliverySection)";

	/**
	 * The cached OCL query for the '{@link #getLaborandDeliverySection(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) <em>Get Laborand Delivery Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaborandDeliverySection(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_LABORAND_DELIVERY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static LaborandDeliverySection getLaborandDeliverySection(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords) {
		if (GET_LABORAND_DELIVERY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS,
				VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS.getEAllOperations().get(
					51));
			try {
				GET_LABORAND_DELIVERY_SECTION__EOCL_QRY = helper.createQuery(GET_LABORAND_DELIVERY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_LABORAND_DELIVERY_SECTION__EOCL_QRY);
		return (LaborandDeliverySection) query.evaluate(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFetalDeliverySection(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) <em>Get Fetal Delivery Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetalDeliverySection(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FETAL_DELIVERY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::FetalDeliverySection))->asSequence()->any(true).oclAsType(vsbr::FetalDeliverySection)";

	/**
	 * The cached OCL query for the '{@link #getFetalDeliverySection(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) <em>Get Fetal Delivery Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetalDeliverySection(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FETAL_DELIVERY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static FetalDeliverySection getFetalDeliverySection(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords) {
		if (GET_FETAL_DELIVERY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS,
				VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS.getEAllOperations().get(
					52));
			try {
				GET_FETAL_DELIVERY_SECTION__EOCL_QRY = helper.createQuery(GET_FETAL_DELIVERY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FETAL_DELIVERY_SECTION__EOCL_QRY);
		return (FetalDeliverySection) query.evaluate(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAntenatalTestingandSurveillance(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) <em>Get Antenatal Testingand Surveillance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntenatalTestingandSurveillance(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ANTENATAL_TESTINGAND_SURVEILLANCE__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::AntenatalTestingandSurveillanceSection))->asSequence()->any(true).oclAsType(vsbr::AntenatalTestingandSurveillanceSection)";

	/**
	 * The cached OCL query for the '{@link #getAntenatalTestingandSurveillance(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) <em>Get Antenatal Testingand Surveillance</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntenatalTestingandSurveillance(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ANTENATAL_TESTINGAND_SURVEILLANCE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AntenatalTestingandSurveillanceSection getAntenatalTestingandSurveillance(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords) {
		if (GET_ANTENATAL_TESTINGAND_SURVEILLANCE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS,
				VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS.getEAllOperations().get(
					53));
			try {
				GET_ANTENATAL_TESTINGAND_SURVEILLANCE__EOCL_QRY = helper.createQuery(GET_ANTENATAL_TESTINGAND_SURVEILLANCE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ANTENATAL_TESTINGAND_SURVEILLANCE__EOCL_QRY);
		return (AntenatalTestingandSurveillanceSection) query.evaluate(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPregnancyHistory(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) <em>Get Pregnancy History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPregnancyHistory(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PREGNANCY_HISTORY__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::PriorPregnancyHistorySection))->asSequence()->any(true).oclAsType(vsbr::PriorPregnancyHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getPregnancyHistory(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) <em>Get Pregnancy History</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPregnancyHistory(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PREGNANCY_HISTORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PriorPregnancyHistorySection getPregnancyHistory(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords) {
		if (GET_PREGNANCY_HISTORY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS,
				VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS.getEAllOperations().get(
					54));
			try {
				GET_PREGNANCY_HISTORY__EOCL_QRY = helper.createQuery(GET_PREGNANCY_HISTORY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PREGNANCY_HISTORY__EOCL_QRY);
		return (PriorPregnancyHistorySection) query.evaluate(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHistoryofInfections(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) <em>Get Historyof Infections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryofInfections(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HISTORYOF_INFECTIONS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::HistoryofInfectionSection)).oclAsType(vsbr::HistoryofInfectionSection)";

	/**
	 * The cached OCL query for the '{@link #getHistoryofInfections(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords) <em>Get Historyof Infections</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryofInfections(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HISTORYOF_INFECTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<HistoryofInfectionSection> getHistoryofInfections(
			ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords reportingFetalDeathInformationfromaclinicalsettingtovitalrecords) {
		if (GET_HISTORYOF_INFECTIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS,
				VsbrPackage.Literals.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS.getEAllOperations().get(
					55));
			try {
				GET_HISTORYOF_INFECTIONS__EOCL_QRY = helper.createQuery(GET_HISTORYOF_INFECTIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORYOF_INFECTIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<HistoryofInfectionSection> result = (Collection<HistoryofInfectionSection>) query.evaluate(reportingFetalDeathInformationfromaclinicalsettingtovitalrecords);
		return new BasicEList.UnmodifiableEList<HistoryofInfectionSection>(result.size(), result.toArray());
	}

} // ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsOperations
