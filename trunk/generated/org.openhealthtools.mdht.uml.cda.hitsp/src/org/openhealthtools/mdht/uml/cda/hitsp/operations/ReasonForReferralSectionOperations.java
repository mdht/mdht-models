/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

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
import org.openhealthtools.mdht.uml.cda.hitsp.Condition;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Result;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;
import org.openhealthtools.mdht.uml.cda.ihe.operations.CodedReasonForReferralSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reason For Referral Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection#validateHITSPReasonForReferralSectionCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Reason For Referral Section Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection#validateHITSPReasonForReferralSectionResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Reason For Referral Section Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection#getConditions() <em>Get Conditions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection#getResults() <em>Get Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection#validateCodedReasonForReferralSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Reason For Referral Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReasonForReferralSectionOperations extends CodedReasonForReferralSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReasonForReferralSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPReasonForReferralSectionCondition(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Reason For Referral Section Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPReasonForReferralSectionCondition(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_REASON_FOR_REFERRAL_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(hitsp::Condition))";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPReasonForReferralSectionCondition(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Reason For Referral Section Condition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPReasonForReferralSectionCondition(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_REASON_FOR_REFERRAL_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(hitsp::Condition))
	 * @param reasonForReferralSection The receiving '<em><b>Reason For Referral Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHITSPReasonForReferralSectionCondition(
			ReasonForReferralSection reasonForReferralSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HITSP_REASON_FOR_REFERRAL_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.REASON_FOR_REFERRAL_SECTION);
			try {
				VALIDATE_HITSP_REASON_FOR_REFERRAL_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_REASON_FOR_REFERRAL_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_REASON_FOR_REFERRAL_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reasonForReferralSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.REASON_FOR_REFERRAL_SECTION__HITSP_REASON_FOR_REFERRAL_SECTION_CONDITION,
					HITSPPlugin.INSTANCE.getString("HITSPReasonForReferralSectionCondition"),
					new Object[] { reasonForReferralSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPReasonForReferralSectionResult(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Reason For Referral Section Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPReasonForReferralSectionResult(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_REASON_FOR_REFERRAL_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hitsp::Result))";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPReasonForReferralSectionResult(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Reason For Referral Section Result</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPReasonForReferralSectionResult(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_REASON_FOR_REFERRAL_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hitsp::Result))
	 * @param reasonForReferralSection The receiving '<em><b>Reason For Referral Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHITSPReasonForReferralSectionResult(
			ReasonForReferralSection reasonForReferralSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HITSP_REASON_FOR_REFERRAL_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.REASON_FOR_REFERRAL_SECTION);
			try {
				VALIDATE_HITSP_REASON_FOR_REFERRAL_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_REASON_FOR_REFERRAL_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_REASON_FOR_REFERRAL_SECTION_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reasonForReferralSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.REASON_FOR_REFERRAL_SECTION__HITSP_REASON_FOR_REFERRAL_SECTION_RESULT,
					HITSPPlugin.INSTANCE.getString("HITSPReasonForReferralSectionResult"),
					new Object[] { reasonForReferralSection }));
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
	protected static final String GET_CONDITIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(hitsp::Condition)).oclAsType(hitsp::Condition)";

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
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(hitsp::Condition)).oclAsType(hitsp::Condition)
	 * @param reasonForReferralSection The receiving '<em><b>Reason For Referral Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Condition> getConditions(ReasonForReferralSection reasonForReferralSection) {
		if (GET_CONDITIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				HITSPPackage.Literals.REASON_FOR_REFERRAL_SECTION,
				HITSPPackage.Literals.REASON_FOR_REFERRAL_SECTION.getEAllOperations().get(66));
			try {
				GET_CONDITIONS__EOCL_QRY = helper.createQuery(GET_CONDITIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONDITIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Condition> result = (Collection<Condition>) query.evaluate(reasonForReferralSection);
		return new BasicEList.UnmodifiableEList<Condition>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getResults(ReasonForReferralSection) <em>Get Results</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults(ReasonForReferralSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hitsp::Result)).oclAsType(hitsp::Result)";

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
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hitsp::Result)).oclAsType(hitsp::Result)
	 * @param reasonForReferralSection The receiving '<em><b>Reason For Referral Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Result> getResults(ReasonForReferralSection reasonForReferralSection) {
		if (GET_RESULTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				HITSPPackage.Literals.REASON_FOR_REFERRAL_SECTION,
				HITSPPackage.Literals.REASON_FOR_REFERRAL_SECTION.getEAllOperations().get(67));
			try {
				GET_RESULTS__EOCL_QRY = helper.createQuery(GET_RESULTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Result> result = (Collection<Result>) query.evaluate(reasonForReferralSection);
		return new BasicEList.UnmodifiableEList<Result>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodedReasonForReferralSectionTemplateId(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Reason For Referral Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedReasonForReferralSectionTemplateId(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.106')";

	/**
	 * The cached OCL invariant for the '{@link #validateCodedReasonForReferralSectionTemplateId(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Reason For Referral Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedReasonForReferralSectionTemplateId(ReasonForReferralSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.106')
	 * @param reasonForReferralSection The receiving '<em><b>Reason For Referral Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCodedReasonForReferralSectionTemplateId(
			ReasonForReferralSection reasonForReferralSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.REASON_FOR_REFERRAL_SECTION);
			try {
				VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CODED_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			reasonForReferralSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.REASON_FOR_REFERRAL_SECTION__CODED_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"CodedReasonForReferralSectionTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									reasonForReferralSection, context) }), new Object[] { reasonForReferralSection }));
			}

			return false;
		}
		return true;
	}

} // ReasonForReferralSectionOperations
