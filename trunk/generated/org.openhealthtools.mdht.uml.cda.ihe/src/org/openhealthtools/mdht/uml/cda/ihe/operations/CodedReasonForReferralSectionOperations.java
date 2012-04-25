/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.operations;

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
import org.openhealthtools.mdht.uml.cda.ihe.CodedReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.SimpleObservation;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coded Reason For Referral Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedReasonForReferralSection#validateCodedReasonForReferralSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Reason For Referral Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedReasonForReferralSection#validateCodedReasonForReferralSectionSimpleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Reason For Referral Section Simple Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedReasonForReferralSection#validateCodedReasonForReferralSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Reason For Referral Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedReasonForReferralSection#getSimpleObservations() <em>Get Simple Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedReasonForReferralSection#getProblemEntries() <em>Get Problem Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodedReasonForReferralSectionOperations extends ReasonForReferralSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodedReasonForReferralSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodedReasonForReferralSectionTemplateId(CodedReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Reason For Referral Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedReasonForReferralSectionTemplateId(CodedReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateCodedReasonForReferralSectionTemplateId(CodedReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Reason For Referral Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedReasonForReferralSectionTemplateId(CodedReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.2')
	 * @param codedReasonForReferralSection The receiving '<em><b>Coded Reason For Referral Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCodedReasonForReferralSectionTemplateId(
			CodedReasonForReferralSection codedReasonForReferralSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.CODED_REASON_FOR_REFERRAL_SECTION);
			try {
				VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			codedReasonForReferralSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.CODED_REASON_FOR_REFERRAL_SECTION__CODED_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID,
					IHEPlugin.INSTANCE.getString("CodedReasonForReferralSectionTemplateId"),
					new Object[] { codedReasonForReferralSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodedReasonForReferralSectionSimpleObservation(CodedReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Reason For Referral Section Simple Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedReasonForReferralSectionSimpleObservation(CodedReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_SIMPLE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(ihe::SimpleObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateCodedReasonForReferralSectionSimpleObservation(CodedReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Reason For Referral Section Simple Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedReasonForReferralSectionSimpleObservation(CodedReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_SIMPLE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(ihe::SimpleObservation))
	 * @param codedReasonForReferralSection The receiving '<em><b>Coded Reason For Referral Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCodedReasonForReferralSectionSimpleObservation(
			CodedReasonForReferralSection codedReasonForReferralSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_SIMPLE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.CODED_REASON_FOR_REFERRAL_SECTION);
			try {
				VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_SIMPLE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_SIMPLE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_SIMPLE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			codedReasonForReferralSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.CODED_REASON_FOR_REFERRAL_SECTION__CODED_REASON_FOR_REFERRAL_SECTION_SIMPLE_OBSERVATION,
					IHEPlugin.INSTANCE.getString("CodedReasonForReferralSectionSimpleObservation"),
					new Object[] { codedReasonForReferralSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodedReasonForReferralSectionProblemEntry(CodedReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Reason For Referral Section Problem Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedReasonForReferralSectionProblemEntry(CodedReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(ihe::ProblemEntry))";

	/**
	 * The cached OCL invariant for the '{@link #validateCodedReasonForReferralSectionProblemEntry(CodedReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Reason For Referral Section Problem Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedReasonForReferralSectionProblemEntry(CodedReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(ihe::ProblemEntry))
	 * @param codedReasonForReferralSection The receiving '<em><b>Coded Reason For Referral Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCodedReasonForReferralSectionProblemEntry(
			CodedReasonForReferralSection codedReasonForReferralSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.CODED_REASON_FOR_REFERRAL_SECTION);
			try {
				VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			codedReasonForReferralSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.CODED_REASON_FOR_REFERRAL_SECTION__CODED_REASON_FOR_REFERRAL_SECTION_PROBLEM_ENTRY,
					IHEPlugin.INSTANCE.getString("CodedReasonForReferralSectionProblemEntry"),
					new Object[] { codedReasonForReferralSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getSimpleObservations(CodedReasonForReferralSection) <em>Get Simple Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleObservations(CodedReasonForReferralSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SIMPLE_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::SimpleObservation)).oclAsType(ihe::SimpleObservation)";

	/**
	 * The cached OCL query for the '{@link #getSimpleObservations(CodedReasonForReferralSection) <em>Get Simple Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleObservations(CodedReasonForReferralSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SIMPLE_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::SimpleObservation)).oclAsType(ihe::SimpleObservation)
	 * @param codedReasonForReferralSection The receiving '<em><b>Coded Reason For Referral Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<SimpleObservation> getSimpleObservations(
			CodedReasonForReferralSection codedReasonForReferralSection) {
		if (GET_SIMPLE_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.CODED_REASON_FOR_REFERRAL_SECTION,
				IHEPackage.Literals.CODED_REASON_FOR_REFERRAL_SECTION.getEAllOperations().get(60));
			try {
				GET_SIMPLE_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_SIMPLE_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SIMPLE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SimpleObservation> result = (Collection<SimpleObservation>) query.evaluate(codedReasonForReferralSection);
		return new BasicEList.UnmodifiableEList<SimpleObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemEntries(CodedReasonForReferralSection) <em>Get Problem Entries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemEntries(CodedReasonForReferralSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_ENTRIES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::ProblemEntry)).oclAsType(ihe::ProblemEntry)";

	/**
	 * The cached OCL query for the '{@link #getProblemEntries(CodedReasonForReferralSection) <em>Get Problem Entries</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemEntries(CodedReasonForReferralSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_ENTRIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::ProblemEntry)).oclAsType(ihe::ProblemEntry)
	 * @param codedReasonForReferralSection The receiving '<em><b>Coded Reason For Referral Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ProblemEntry> getProblemEntries(CodedReasonForReferralSection codedReasonForReferralSection) {
		if (GET_PROBLEM_ENTRIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.CODED_REASON_FOR_REFERRAL_SECTION,
				IHEPackage.Literals.CODED_REASON_FOR_REFERRAL_SECTION.getEAllOperations().get(61));
			try {
				GET_PROBLEM_ENTRIES__EOCL_QRY = helper.createQuery(GET_PROBLEM_ENTRIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_ENTRIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProblemEntry> result = (Collection<ProblemEntry>) query.evaluate(codedReasonForReferralSection);
		return new BasicEList.UnmodifiableEList<ProblemEntry>(result.size(), result.toArray());
	}

} // CodedReasonForReferralSectionOperations
