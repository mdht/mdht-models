/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport;
import org.openhealthtools.mdht.uml.cda.consol.FindingsSection;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Diagnostic Imaging Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportParticipant1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Participant1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportInFulfillmentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report In Fulfillment Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportRelatedDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Related Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateDiagnosticImagingReportFindingsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Findings Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#getFindingsSection() <em>Get Findings Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagnosticImagingReportOperations extends GeneralHeaderConstraintsOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticImagingReportOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReportTemplateId(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReportTemplateId(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.5')";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReportTemplateId(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReportTemplateId(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.5')
	 * @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDiagnosticImagingReportTemplateId(DiagnosticImagingReport diagnosticImagingReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportTemplateId"),
						 new Object [] { diagnosticImagingReport }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReportId(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReportId(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReportId(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReportId(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())
	 * @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDiagnosticImagingReportId(DiagnosticImagingReport diagnosticImagingReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_ID,
						 ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportId"),
						 new Object [] { diagnosticImagingReport }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReportInformant(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Informant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReportInformant(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->exists(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReportInformant(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Informant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReportInformant(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informant->exists(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(rim::Participation))
	 * @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDiagnosticImagingReportInformant(DiagnosticImagingReport diagnosticImagingReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_INFORMANT,
						 ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportInformant"),
						 new Object [] { diagnosticImagingReport }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReportInformationRecipient(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Information Recipient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReportInformationRecipient(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->exists(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReportInformationRecipient(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Information Recipient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReportInformationRecipient(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informationRecipient->exists(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(rim::Participation))
	 * @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDiagnosticImagingReportInformationRecipient(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_INFORMATION_RECIPIENT,
						 ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportInformationRecipient"),
						 new Object [] { diagnosticImagingReport }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReportParticipant1(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Participant1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReportParticipant1(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReportParticipant1(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Participant1</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReportParticipant1(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))
	 * @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDiagnosticImagingReportParticipant1(DiagnosticImagingReport diagnosticImagingReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT1,
						 ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportParticipant1"),
						 new Object [] { diagnosticImagingReport }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReportInFulfillmentOf(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report In Fulfillment Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReportInFulfillmentOf(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.inFulfillmentOf->one(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReportInFulfillmentOf(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report In Fulfillment Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReportInFulfillmentOf(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.inFulfillmentOf->one(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))
	 * @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDiagnosticImagingReportInFulfillmentOf(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_IN_FULFILLMENT_OF,
						 ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportInFulfillmentOf"),
						 new Object [] { diagnosticImagingReport }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReportDocumentationOf(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReportDocumentationOf(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReportDocumentationOf(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Documentation Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReportDocumentationOf(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))
	 * @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDiagnosticImagingReportDocumentationOf(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF,
						 ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportDocumentationOf"),
						 new Object [] { diagnosticImagingReport }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReportRelatedDocument(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Related Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReportRelatedDocument(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relatedDocument->one(relatedDocument : cda::RelatedDocument | not relatedDocument.oclIsUndefined() and relatedDocument.oclIsKindOf(cda::RelatedDocument))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReportRelatedDocument(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Related Document</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReportRelatedDocument(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.relatedDocument->one(relatedDocument : cda::RelatedDocument | not relatedDocument.oclIsUndefined() and relatedDocument.oclIsKindOf(cda::RelatedDocument))
	 * @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDiagnosticImagingReportRelatedDocument(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_RELATED_DOCUMENT,
						 ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportRelatedDocument"),
						 new Object [] { diagnosticImagingReport }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReportComponentOf(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReportComponentOf(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReportComponentOf(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Component Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReportComponentOf(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))
	 * @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDiagnosticImagingReportComponentOf(DiagnosticImagingReport diagnosticImagingReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF,
						 ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportComponentOf"),
						 new Object [] { diagnosticImagingReport }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticImagingReportFindingsSection(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Findings Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReportFindingsSection(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_IMAGING_REPORT_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FindingsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticImagingReportFindingsSection(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Imaging Report Findings Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticImagingReportFindingsSection(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DIAGNOSTIC_IMAGING_REPORT_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FindingsSection))
	 * @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDiagnosticImagingReportFindingsSection(
			DiagnosticImagingReport diagnosticImagingReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DIAGNOSTIC_IMAGING_REPORT_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_DIAGNOSTIC_IMAGING_REPORT_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_IMAGING_REPORT_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__DIAGNOSTIC_IMAGING_REPORT_FINDINGS_SECTION,
						 ConsolPlugin.INSTANCE.getString("DiagnosticImagingReportFindingsSection"),
						 new Object [] { diagnosticImagingReport }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getFindingsSection(DiagnosticImagingReport) <em>Get Findings Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingsSection(DiagnosticImagingReport)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FINDINGS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FindingsSection))->asSequence()->first().oclAsType(consol::FindingsSection)";

	/**
	 * The cached OCL query for the '{@link #getFindingsSection(DiagnosticImagingReport) <em>Get Findings Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingsSection(DiagnosticImagingReport)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FINDINGS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FindingsSection))->asSequence()->first().oclAsType(consol::FindingsSection)
	 * @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static FindingsSection getFindingsSection(DiagnosticImagingReport diagnosticImagingReport) {
		if (GET_FINDINGS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT, ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT.getEAllOperations().get(155));
			try {
				GET_FINDINGS_SECTION__EOCL_QRY = helper.createQuery(GET_FINDINGS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FINDINGS_SECTION__EOCL_QRY);
		return (FindingsSection) query.evaluate(diagnosticImagingReport);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCode(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCode(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(DiagnosticImagingReport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined()))
	 * @param diagnosticImagingReport The receiving '<em><b>Diagnostic Imaging Report</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGeneralHeaderConstraintsCode(DiagnosticImagingReport diagnosticImagingReport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(diagnosticImagingReport)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DIAGNOSTIC_IMAGING_REPORT__GENERAL_HEADER_CONSTRAINTS_CODE,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsCode"),
						 new Object [] { diagnosticImagingReport }));
			}
			return false;
		}
		return true;
	}

} // DiagnosticImagingReportOperations
