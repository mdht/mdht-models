/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

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

import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reason For Referral Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection#validateReasonForReferralSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection#validateReasonForReferralSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection#validateReasonForReferralSectionCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection#validateReasonForReferralSectionResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection#validateReasonForReferralSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection#getConditions() <em>Get Conditions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection#getResults() <em>Get Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection#getProblemEntries() <em>Get Problem Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReasonForReferralSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReasonForReferralSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonForReferralSectionTemplateId(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForReferralSectionTemplateId(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonForReferralSectionTemplateId(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForReferralSectionTemplateId(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.1')
	 * @param reasonForReferralSection The receiving '<em><b>Reason For Referral Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReasonForReferralSectionTemplateId(ReasonForReferralSection reasonForReferralSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REASON_FOR_REFERRAL_SECTION);
			try {
				VALIDATE_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reasonForReferralSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.REASON_FOR_REFERRAL_SECTION__REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("ReasonForReferralSectionTemplateId"),
						 new Object [] { reasonForReferralSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonForReferralSectionCode(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForReferralSectionCode(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_FOR_REFERRAL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '42349-1' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonForReferralSectionCode(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForReferralSectionCode(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REASON_FOR_REFERRAL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '42349-1' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param reasonForReferralSection The receiving '<em><b>Reason For Referral Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReasonForReferralSectionCode(ReasonForReferralSection reasonForReferralSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REASON_FOR_REFERRAL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REASON_FOR_REFERRAL_SECTION);
			try {
				VALIDATE_REASON_FOR_REFERRAL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REASON_FOR_REFERRAL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REASON_FOR_REFERRAL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reasonForReferralSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.REASON_FOR_REFERRAL_SECTION__REASON_FOR_REFERRAL_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("ReasonForReferralSectionCode"),
						 new Object [] { reasonForReferralSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonForReferralSectionCondition(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForReferralSectionCondition(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_FOR_REFERRAL_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::ProblemConcernAct))";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonForReferralSectionCondition(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Condition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForReferralSectionCondition(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REASON_FOR_REFERRAL_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::ProblemConcernAct))
	 * @param reasonForReferralSection The receiving '<em><b>Reason For Referral Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReasonForReferralSectionCondition(ReasonForReferralSection reasonForReferralSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REASON_FOR_REFERRAL_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REASON_FOR_REFERRAL_SECTION);
			try {
				VALIDATE_REASON_FOR_REFERRAL_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REASON_FOR_REFERRAL_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REASON_FOR_REFERRAL_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reasonForReferralSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.REASON_FOR_REFERRAL_SECTION__REASON_FOR_REFERRAL_SECTION_CONDITION,
						 ConsolPlugin.INSTANCE.getString("ReasonForReferralSectionCondition"),
						 new Object [] { reasonForReferralSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonForReferralSectionResult(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForReferralSectionResult(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_FOR_REFERRAL_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::ResultObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonForReferralSectionResult(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Result</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForReferralSectionResult(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REASON_FOR_REFERRAL_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::ResultObservation))
	 * @param reasonForReferralSection The receiving '<em><b>Reason For Referral Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReasonForReferralSectionResult(ReasonForReferralSection reasonForReferralSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REASON_FOR_REFERRAL_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REASON_FOR_REFERRAL_SECTION);
			try {
				VALIDATE_REASON_FOR_REFERRAL_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REASON_FOR_REFERRAL_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REASON_FOR_REFERRAL_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reasonForReferralSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.REASON_FOR_REFERRAL_SECTION__REASON_FOR_REFERRAL_SECTION_RESULT,
						 ConsolPlugin.INSTANCE.getString("ReasonForReferralSectionResult"),
						 new Object [] { reasonForReferralSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonForReferralSectionProblemEntry(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Problem Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForReferralSectionProblemEntry(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_FOR_REFERRAL_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::AllergyObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonForReferralSectionProblemEntry(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Referral Section Problem Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForReferralSectionProblemEntry(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REASON_FOR_REFERRAL_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::AllergyObservation))
	 * @param reasonForReferralSection The receiving '<em><b>Reason For Referral Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReasonForReferralSectionProblemEntry(
			ReasonForReferralSection reasonForReferralSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REASON_FOR_REFERRAL_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.REASON_FOR_REFERRAL_SECTION);
			try {
				VALIDATE_REASON_FOR_REFERRAL_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REASON_FOR_REFERRAL_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REASON_FOR_REFERRAL_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(reasonForReferralSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.REASON_FOR_REFERRAL_SECTION__REASON_FOR_REFERRAL_SECTION_PROBLEM_ENTRY,
						 ConsolPlugin.INSTANCE.getString("ReasonForReferralSectionProblemEntry"),
						 new Object [] { reasonForReferralSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConditions(ReasonForReferralSection) <em>Get Conditions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions(ReasonForReferralSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONDITIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ProblemConcernAct)).oclAsType(consol::ProblemConcernAct)";

	/**
	 * The cached OCL query for the '{@link #getConditions(ReasonForReferralSection) <em>Get Conditions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions(ReasonForReferralSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONDITIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ProblemConcernAct)).oclAsType(consol::ProblemConcernAct)
	 * @param reasonForReferralSection The receiving '<em><b>Reason For Referral Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ProblemConcernAct> getConditions(ReasonForReferralSection reasonForReferralSection) {
		if (GET_CONDITIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.REASON_FOR_REFERRAL_SECTION, ConsolPackage.Literals.REASON_FOR_REFERRAL_SECTION.getEAllOperations().get(60));
			try {
				GET_CONDITIONS__EOCL_QRY = helper.createQuery(GET_CONDITIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONDITIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProblemConcernAct> result = (Collection<ProblemConcernAct>) query.evaluate(reasonForReferralSection);
		return new BasicEList.UnmodifiableEList<ProblemConcernAct>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getResults(ReasonForReferralSection) <em>Get Results</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults(ReasonForReferralSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ResultObservation)).oclAsType(consol::ResultObservation)";

	/**
	 * The cached OCL query for the '{@link #getResults(ReasonForReferralSection) <em>Get Results</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults(ReasonForReferralSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ResultObservation)).oclAsType(consol::ResultObservation)
	 * @param reasonForReferralSection The receiving '<em><b>Reason For Referral Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ResultObservation> getResults(ReasonForReferralSection reasonForReferralSection) {
		if (GET_RESULTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.REASON_FOR_REFERRAL_SECTION, ConsolPackage.Literals.REASON_FOR_REFERRAL_SECTION.getEAllOperations().get(61));
			try {
				GET_RESULTS__EOCL_QRY = helper.createQuery(GET_RESULTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ResultObservation> result = (Collection<ResultObservation>) query.evaluate(reasonForReferralSection);
		return new BasicEList.UnmodifiableEList<ResultObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemEntries(ReasonForReferralSection) <em>Get Problem Entries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemEntries(ReasonForReferralSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_ENTRIES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyObservation)).oclAsType(consol::AllergyObservation)";

	/**
	 * The cached OCL query for the '{@link #getProblemEntries(ReasonForReferralSection) <em>Get Problem Entries</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemEntries(ReasonForReferralSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_ENTRIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyObservation)).oclAsType(consol::AllergyObservation)
	 * @param reasonForReferralSection The receiving '<em><b>Reason For Referral Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<AllergyObservation> getProblemEntries(ReasonForReferralSection reasonForReferralSection) {
		if (GET_PROBLEM_ENTRIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.REASON_FOR_REFERRAL_SECTION, ConsolPackage.Literals.REASON_FOR_REFERRAL_SECTION.getEAllOperations().get(62));
			try {
				GET_PROBLEM_ENTRIES__EOCL_QRY = helper.createQuery(GET_PROBLEM_ENTRIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_ENTRIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AllergyObservation> result = (Collection<AllergyObservation>) query.evaluate(reasonForReferralSection);
		return new BasicEList.UnmodifiableEList<AllergyObservation>(result.size(), result.toArray());
	}

} // ReasonForReferralSectionOperations
