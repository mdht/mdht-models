/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection;

import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary;

import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Transition Of Care Ambulatory Summary</b></em>' model
 * objects. <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary#validateTransitionOfCareAmbulatorySummaryResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Ambulatory Summary Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary#validateTransitionOfCareAmbulatorySummaryReasonForReferralSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Ambulatory Summary Reason For Referral Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary#getReasonForReferralSection() <em>Get Reason For Referral Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionOfCareAmbulatorySummaryOperations extends
		SummaryOfCareRecordOperations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionOfCareAmbulatorySummaryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransitionOfCareAmbulatorySummaryResponsibleParty(TransitionOfCareAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Ambulatory Summary Responsible Party</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransitionOfCareAmbulatorySummaryResponsibleParty(TransitionOfCareAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(responsibleParty->one(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(rim::Participation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransitionOfCareAmbulatorySummaryResponsibleParty(TransitionOfCareAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Ambulatory Summary Responsible Party</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransitionOfCareAmbulatorySummaryResponsibleParty(TransitionOfCareAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Query<?, ?, ?> VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(responsibleParty->one(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(rim::Participation)))
	 * @param transitionOfCareAmbulatorySummary The receiving '<em><b>Transition Of Care Ambulatory Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static  boolean validateTransitionOfCareAmbulatorySummaryResponsibleParty(TransitionOfCareAmbulatorySummary transitionOfCareAmbulatorySummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.TRANSITION_OF_CARE_AMBULATORY_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		
		Object oclResult = VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transitionOfCareAmbulatorySummary);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.TRANSITION_OF_CARE_AMBULATORY_SUMMARY__TRANSITION_OF_CARE_AMBULATORY_SUMMARY_RESPONSIBLE_PARTY,
						 Mu2consolPlugin.INSTANCE.getString("TransitionOfCareAmbulatorySummaryResponsibleParty"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransitionOfCareAmbulatorySummaryReasonForReferralSection(TransitionOfCareAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Ambulatory Summary Reason For Referral Section</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateTransitionOfCareAmbulatorySummaryReasonForReferralSection(TransitionOfCareAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_REASON_FOR_REFERRAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForReferralSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransitionOfCareAmbulatorySummaryReasonForReferralSection(TransitionOfCareAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Ambulatory Summary Reason For Referral Section</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateTransitionOfCareAmbulatorySummaryReasonForReferralSection(TransitionOfCareAmbulatorySummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_REASON_FOR_REFERRAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ReasonForReferralSection))
	 * 
	 * @param transitionOfCareAmbulatorySummary
	 *            The receiving '
	 *            <em><b>Transition Of Care Ambulatory Summary</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateTransitionOfCareAmbulatorySummaryReasonForReferralSection(
			TransitionOfCareAmbulatorySummary transitionOfCareAmbulatorySummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_REASON_FOR_REFERRAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.TRANSITION_OF_CARE_AMBULATORY_SUMMARY);
			try {
				VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_REASON_FOR_REFERRAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_REASON_FOR_REFERRAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_REASON_FOR_REFERRAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(transitionOfCareAmbulatorySummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.TRANSITION_OF_CARE_AMBULATORY_SUMMARY__TRANSITION_OF_CARE_AMBULATORY_SUMMARY_REASON_FOR_REFERRAL_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("TransitionOfCareAmbulatorySummaryReasonForReferralSection"),
						 new Object [] { transitionOfCareAmbulatorySummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getReasonForReferralSection(TransitionOfCareAmbulatorySummary) <em>Get Reason For Referral Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForReferralSection(TransitionOfCareAmbulatorySummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REASON_FOR_REFERRAL_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForReferralSection))->asSequence()->any(true).oclAsType(consol::ReasonForReferralSection)";

	/**
	 * The cached OCL query for the '{@link #getReasonForReferralSection(TransitionOfCareAmbulatorySummary) <em>Get Reason For Referral Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForReferralSection(TransitionOfCareAmbulatorySummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REASON_FOR_REFERRAL_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForReferralSection))->asSequence()->any(true).oclAsType(consol::ReasonForReferralSection)
	 * @param transitionOfCareAmbulatorySummary The receiving '<em><b>Transition Of Care Ambulatory Summary</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  ReasonForReferralSection getReasonForReferralSection(TransitionOfCareAmbulatorySummary transitionOfCareAmbulatorySummary) {
		if (GET_REASON_FOR_REFERRAL_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.TRANSITION_OF_CARE_AMBULATORY_SUMMARY, Mu2consolPackage.Literals.TRANSITION_OF_CARE_AMBULATORY_SUMMARY.getEAllOperations().get(249));
			try {
				GET_REASON_FOR_REFERRAL_SECTION__EOCL_QRY = helper.createQuery(GET_REASON_FOR_REFERRAL_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REASON_FOR_REFERRAL_SECTION__EOCL_QRY);
		return (ReasonForReferralSection) query.evaluate(transitionOfCareAmbulatorySummary);
	}

} // TransitionOfCareAmbulatorySummaryOperations