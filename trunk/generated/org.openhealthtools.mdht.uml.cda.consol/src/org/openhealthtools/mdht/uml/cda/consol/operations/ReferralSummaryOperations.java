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

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ReferralSummary;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Referral Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralSummary#validateReferralSummaryMedicalSummaryProblemConcernEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Summary Medical Summary Problem Concern Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralSummary#validateReferralSummaryMedicalSummaryAllergyConcernEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Summary Medical Summary Allergy Concern Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralSummary#validateReferralSummaryMedicalSummaryMedications(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Summary Medical Summary Medications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralSummary#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralSummary#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferralSummaryOperations extends GeneralHeaderConstraintsOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferralSummaryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralSummaryMedicalSummaryProblemConcernEntry(ReferralSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Summary Medical Summary Problem Concern Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralSummaryMedicalSummaryProblemConcernEntry(ReferralSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_SUMMARY_MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->exists(sect : cda::Section | sect.getActs()->exists(act : cda::Act | act.oclIsKindOf(consol::ProblemConcernEntry)))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralSummaryMedicalSummaryProblemConcernEntry(ReferralSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Summary Medical Summary Problem Concern Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralSummaryMedicalSummaryProblemConcernEntry(ReferralSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REFERRAL_SUMMARY_MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->exists(sect : cda::Section | sect.getActs()->exists(act : cda::Act | act.oclIsKindOf(consol::ProblemConcernEntry)))
	 * @param referralSummary The receiving '<em><b>Referral Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReferralSummaryMedicalSummaryProblemConcernEntry(ReferralSummary referralSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REFERRAL_SUMMARY_MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_SUMMARY);
			try {
				VALIDATE_REFERRAL_SUMMARY_MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REFERRAL_SUMMARY_MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REFERRAL_SUMMARY_MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(referralSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.REFERRAL_SUMMARY__REFERRAL_SUMMARY_MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY,
						 ConsolPlugin.INSTANCE.getString("ReferralSummaryMedicalSummaryProblemConcernEntry"),
						 new Object [] { referralSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralSummaryMedicalSummaryAllergyConcernEntry(ReferralSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Summary Medical Summary Allergy Concern Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralSummaryMedicalSummaryAllergyConcernEntry(ReferralSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_SUMMARY_MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->exists(sect : cda::Section | sect.getActs()->exists(act : cda::Act | act.oclIsKindOf(consol::AllergyIntoleranceConcern)))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralSummaryMedicalSummaryAllergyConcernEntry(ReferralSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Summary Medical Summary Allergy Concern Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralSummaryMedicalSummaryAllergyConcernEntry(ReferralSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REFERRAL_SUMMARY_MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->exists(sect : cda::Section | sect.getActs()->exists(act : cda::Act | act.oclIsKindOf(consol::AllergyIntoleranceConcern)))
	 * @param referralSummary The receiving '<em><b>Referral Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReferralSummaryMedicalSummaryAllergyConcernEntry(ReferralSummary referralSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REFERRAL_SUMMARY_MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_SUMMARY);
			try {
				VALIDATE_REFERRAL_SUMMARY_MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REFERRAL_SUMMARY_MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REFERRAL_SUMMARY_MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(referralSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.REFERRAL_SUMMARY__REFERRAL_SUMMARY_MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY,
						 ConsolPlugin.INSTANCE.getString("ReferralSummaryMedicalSummaryAllergyConcernEntry"),
						 new Object [] { referralSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReferralSummaryMedicalSummaryMedications(ReferralSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Summary Medical Summary Medications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralSummaryMedicalSummaryMedications(ReferralSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REFERRAL_SUMMARY_MEDICAL_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->exists(sect : cda::Section | sect.getSubstanceAdministrations()->exists(sub : cda::SubstanceAdministration | sub.oclIsKindOf(consol::Medication)))";

	/**
	 * The cached OCL invariant for the '{@link #validateReferralSummaryMedicalSummaryMedications(ReferralSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Summary Medical Summary Medications</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReferralSummaryMedicalSummaryMedications(ReferralSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REFERRAL_SUMMARY_MEDICAL_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->exists(sect : cda::Section | sect.getSubstanceAdministrations()->exists(sub : cda::SubstanceAdministration | sub.oclIsKindOf(consol::Medication)))
	 * @param referralSummary The receiving '<em><b>Referral Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReferralSummaryMedicalSummaryMedications(ReferralSummary referralSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REFERRAL_SUMMARY_MEDICAL_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_SUMMARY);
			try {
				VALIDATE_REFERRAL_SUMMARY_MEDICAL_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REFERRAL_SUMMARY_MEDICAL_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REFERRAL_SUMMARY_MEDICAL_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(referralSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.REFERRAL_SUMMARY__REFERRAL_SUMMARY_MEDICAL_SUMMARY_MEDICATIONS,
						 ConsolPlugin.INSTANCE.getString("ReferralSummaryMedicalSummaryMedications"),
						 new Object [] { referralSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(ReferralSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(ReferralSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.48.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(ReferralSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(ReferralSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.48.1')
	 * @param referralSummary The receiving '<em><b>Referral Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGeneralHeaderConstraintsTemplateId(ReferralSummary referralSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_SUMMARY);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(referralSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.REFERRAL_SUMMARY__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "GeneralHeaderConstraintsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(referralSummary, context) }),
						 new Object [] { referralSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCode(ReferralSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(ReferralSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCode(ReferralSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(ReferralSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
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
	 * value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param referralSummary The receiving '<em><b>Referral Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateGeneralHeaderConstraintsCode(ReferralSummary referralSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REFERRAL_SUMMARY);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(referralSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.REFERRAL_SUMMARY__GENERAL_HEADER_CONSTRAINTS_CODE,
						 ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsCode"),
						 new Object [] { referralSummary }));
			}
			return false;
		}
		return true;
	}

} // ReferralSummaryOperations
