/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspatientcarereport.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.CDAPlugin;
import org.openhealthtools.mdht.uml.cda.Section;

import org.openhealthtools.mdht.uml.cda.cdt.operations.GeneralHeaderConstraintsOperations;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ContinuityOfCareDocumentOperations;

import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmergencyRunReport;
import org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmspatientcarereportPackage;

import org.openhealthtools.mdht.uml.cda.emspatientcarereport.util.EmspatientcarereportValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Emergency Run Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmergencyRunReport#validateEmergencyRunReportId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Run Report Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmergencyRunReport#validateEmergencyRunReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Run Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmergencyRunReport#validateEmergencyRunReportTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Run Report Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmergencyRunReport#validateEmergencyRunReportSetId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Run Report Set Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmergencyRunReport#validateEmergencyRunReportVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Run Report Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmergencyRunReport#validateEmergencyRunReportVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Run Report Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmergencyRunReport#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmergencyRunReport#getBillingSection() <em>Get Billing Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmergencyRunReport#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmergencyRunReport#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmergencyRunReportOperations extends GeneralHeaderConstraintsOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmergencyRunReportOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1')
	 * @param emergencyRunReport The receiving '<em><b>Emergency Run Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsTemplateId(EmergencyRunReport emergencyRunReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspatientcarereportPackage.Literals.EMERGENCY_RUN_REPORT);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emergencyRunReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspatientcarereportValidator.DIAGNOSTIC_SOURCE,
						 EmspatientcarereportValidator.EMERGENCY_RUN_REPORT__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "GeneralHeaderConstraintsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(emergencyRunReport, context) }),
						 new Object [] { emergencyRunReport }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = 'EMSPCR' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param emergencyRunReport The receiving '<em><b>Emergency Run Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsCode(EmergencyRunReport emergencyRunReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspatientcarereportPackage.Literals.EMERGENCY_RUN_REPORT);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emergencyRunReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspatientcarereportValidator.DIAGNOSTIC_SOURCE,
						 EmspatientcarereportValidator.EMERGENCY_RUN_REPORT__GENERAL_HEADER_CONSTRAINTS_CODE,
						 CDAPlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "GeneralHeaderConstraintsCode", VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP, org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(emergencyRunReport, context) }),
						 new Object [] { emergencyRunReport }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEmergencyRunReportId(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Run Report Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEmergencyRunReportId(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMERGENCY_RUN_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEmergencyRunReportId(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Run Report Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEmergencyRunReportId(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EMERGENCY_RUN_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())
	 * @param emergencyRunReport The receiving '<em><b>Emergency Run Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEmergencyRunReportId(EmergencyRunReport emergencyRunReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EMERGENCY_RUN_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspatientcarereportPackage.Literals.EMERGENCY_RUN_REPORT);
			try {
				VALIDATE_EMERGENCY_RUN_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMERGENCY_RUN_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMERGENCY_RUN_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emergencyRunReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspatientcarereportValidator.DIAGNOSTIC_SOURCE,
						 EmspatientcarereportValidator.EMERGENCY_RUN_REPORT__EMERGENCY_RUN_REPORT_ID,
						 CDAPlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EmergencyRunReportId", VALIDATE_EMERGENCY_RUN_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP, org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(emergencyRunReport, context) }),
						 new Object [] { emergencyRunReport }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEmergencyRunReportTitle(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Run Report Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEmergencyRunReportTitle(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMERGENCY_RUN_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEmergencyRunReportTitle(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Run Report Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEmergencyRunReportTitle(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EMERGENCY_RUN_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param emergencyRunReport The receiving '<em><b>Emergency Run Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEmergencyRunReportTitle(EmergencyRunReport emergencyRunReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EMERGENCY_RUN_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspatientcarereportPackage.Literals.EMERGENCY_RUN_REPORT);
			try {
				VALIDATE_EMERGENCY_RUN_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMERGENCY_RUN_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMERGENCY_RUN_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emergencyRunReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspatientcarereportValidator.DIAGNOSTIC_SOURCE,
						 EmspatientcarereportValidator.EMERGENCY_RUN_REPORT__EMERGENCY_RUN_REPORT_TITLE,
						 CDAPlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EmergencyRunReportTitle", VALIDATE_EMERGENCY_RUN_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP, org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(emergencyRunReport, context) }),
						 new Object [] { emergencyRunReport }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEmergencyRunReportTypeId(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Run Report Type Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEmergencyRunReportTypeId(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMERGENCY_RUN_REPORT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEmergencyRunReportTypeId(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Run Report Type Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEmergencyRunReportTypeId(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EMERGENCY_RUN_REPORT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())
	 * @param emergencyRunReport The receiving '<em><b>Emergency Run Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEmergencyRunReportTypeId(EmergencyRunReport emergencyRunReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EMERGENCY_RUN_REPORT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspatientcarereportPackage.Literals.EMERGENCY_RUN_REPORT);
			try {
				VALIDATE_EMERGENCY_RUN_REPORT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMERGENCY_RUN_REPORT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMERGENCY_RUN_REPORT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emergencyRunReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspatientcarereportValidator.DIAGNOSTIC_SOURCE,
						 EmspatientcarereportValidator.EMERGENCY_RUN_REPORT__EMERGENCY_RUN_REPORT_TYPE_ID,
						 CDAPlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EmergencyRunReportTypeId", VALIDATE_EMERGENCY_RUN_REPORT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP, org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(emergencyRunReport, context) }),
						 new Object [] { emergencyRunReport }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEmergencyRunReportSetId(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Run Report Set Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEmergencyRunReportSetId(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMERGENCY_RUN_REPORT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.setId.oclIsUndefined() or self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEmergencyRunReportSetId(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Run Report Set Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEmergencyRunReportSetId(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EMERGENCY_RUN_REPORT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.setId.oclIsUndefined() or self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())
	 * @param emergencyRunReport The receiving '<em><b>Emergency Run Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEmergencyRunReportSetId(EmergencyRunReport emergencyRunReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EMERGENCY_RUN_REPORT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspatientcarereportPackage.Literals.EMERGENCY_RUN_REPORT);
			try {
				VALIDATE_EMERGENCY_RUN_REPORT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMERGENCY_RUN_REPORT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMERGENCY_RUN_REPORT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emergencyRunReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EmspatientcarereportValidator.DIAGNOSTIC_SOURCE,
						 EmspatientcarereportValidator.EMERGENCY_RUN_REPORT__EMERGENCY_RUN_REPORT_SET_ID,
						 CDAPlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EmergencyRunReportSetId", VALIDATE_EMERGENCY_RUN_REPORT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP, org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(emergencyRunReport, context) }),
						 new Object [] { emergencyRunReport }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEmergencyRunReportVersionNumber(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Run Report Version Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEmergencyRunReportVersionNumber(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMERGENCY_RUN_REPORT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.versionNumber.oclIsUndefined() or self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEmergencyRunReportVersionNumber(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Run Report Version Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEmergencyRunReportVersionNumber(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EMERGENCY_RUN_REPORT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.versionNumber.oclIsUndefined() or self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())
	 * @param emergencyRunReport The receiving '<em><b>Emergency Run Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEmergencyRunReportVersionNumber(EmergencyRunReport emergencyRunReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EMERGENCY_RUN_REPORT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspatientcarereportPackage.Literals.EMERGENCY_RUN_REPORT);
			try {
				VALIDATE_EMERGENCY_RUN_REPORT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMERGENCY_RUN_REPORT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMERGENCY_RUN_REPORT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emergencyRunReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EmspatientcarereportValidator.DIAGNOSTIC_SOURCE,
						 EmspatientcarereportValidator.EMERGENCY_RUN_REPORT__EMERGENCY_RUN_REPORT_VERSION_NUMBER,
						 CDAPlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EmergencyRunReportVersionNumber", VALIDATE_EMERGENCY_RUN_REPORT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP, org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(emergencyRunReport, context) }),
						 new Object [] { emergencyRunReport }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEmergencyRunReportVitalSignsSection(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Run Report Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEmergencyRunReportVitalSignsSection(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMERGENCY_RUN_REPORT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::VitalSignsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateEmergencyRunReportVitalSignsSection(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Emergency Run Report Vital Signs Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEmergencyRunReportVitalSignsSection(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_EMERGENCY_RUN_REPORT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::VitalSignsSection))
	 * @param emergencyRunReport The receiving '<em><b>Emergency Run Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEmergencyRunReportVitalSignsSection(EmergencyRunReport emergencyRunReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_EMERGENCY_RUN_REPORT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspatientcarereportPackage.Literals.EMERGENCY_RUN_REPORT);
			try {
				VALIDATE_EMERGENCY_RUN_REPORT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMERGENCY_RUN_REPORT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMERGENCY_RUN_REPORT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(emergencyRunReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EmspatientcarereportValidator.DIAGNOSTIC_SOURCE,
						 EmspatientcarereportValidator.EMERGENCY_RUN_REPORT__EMERGENCY_RUN_REPORT_VITAL_SIGNS_SECTION,
						 CDAPlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EmergencyRunReportVitalSignsSection", VALIDATE_EMERGENCY_RUN_REPORT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP, org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(emergencyRunReport, context) }),
						 new Object [] { emergencyRunReport }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSection(EmergencyRunReport) <em>Get Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(EmergencyRunReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::VitalSignsSection))->asSequence()->first().oclAsType(ccd::VitalSignsSection)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSection(EmergencyRunReport) <em>Get Vital Signs Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(EmergencyRunReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::VitalSignsSection))->asSequence()->first().oclAsType(ccd::VitalSignsSection)
	 * @param emergencyRunReport The receiving '<em><b>Emergency Run Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  Object getVitalSignsSection(EmergencyRunReport emergencyRunReport) {
		if (GET_VITAL_SIGNS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspatientcarereportPackage.Literals.EMERGENCY_RUN_REPORT, EmspatientcarereportPackage.Literals.EMERGENCY_RUN_REPORT.getEAllOperations().get(72));
			try {
				GET_VITAL_SIGNS_SECTION__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_QRY);
		return (Object) query.evaluate(emergencyRunReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #getBillingSection(EmergencyRunReport) <em>Get Billing Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingSection(EmergencyRunReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BILLING_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cda::Section))->asSequence()->first().oclAsType(cda::Section)";

	/**
	 * The cached OCL query for the '{@link #getBillingSection(EmergencyRunReport) <em>Get Billing Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingSection(EmergencyRunReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BILLING_SECTION__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCode(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = 'EMSPCR' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCode(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(EmergencyRunReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cda::Section))->asSequence()->first().oclAsType(cda::Section)
	 * @param emergencyRunReport The receiving '<em><b>Emergency Run Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  Section getBillingSection(EmergencyRunReport emergencyRunReport) {
		if (GET_BILLING_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspatientcarereportPackage.Literals.EMERGENCY_RUN_REPORT, EmspatientcarereportPackage.Literals.EMERGENCY_RUN_REPORT.getEAllOperations().get(73));
			try {
				GET_BILLING_SECTION__EOCL_QRY = helper.createQuery(GET_BILLING_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_BILLING_SECTION__EOCL_QRY);
		return (Section) query.evaluate(emergencyRunReport);
	}

} // EmergencyRunReportOperations