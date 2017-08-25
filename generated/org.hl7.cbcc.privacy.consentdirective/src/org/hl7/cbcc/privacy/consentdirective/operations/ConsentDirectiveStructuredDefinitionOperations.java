/**
 */
package org.hl7.cbcc.privacy.consentdirective.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPlugin;
import org.hl7.cbcc.privacy.consentdirective.ConsentAction;
import org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition;
import org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer;
import org.hl7.cbcc.privacy.consentdirective.SecurityLabel;

import org.hl7.cbcc.privacy.consentdirective.util.CONSENTDIRECTIVEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Consent Directive Structured Definition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Code P</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Mood Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Informant</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Participant</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionConsentAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Consent Action</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionInformationCriteriaReferencesOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Information Criteria References Organizer</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#validateConsentDirectiveStructuredDefinitionSecurityLabelCriteria(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Security Label Criteria</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#getConsentActions() <em>Get Consent Actions</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#getInformationCriteriaReferencesOrganizers() <em>Get Information Criteria References Organizers</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition#getSecurityLabelCriteria() <em>Get Security Label Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConsentDirectiveStructuredDefinitionOperations extends ClinicalStatementOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentDirectiveStructuredDefinitionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsentDirectiveStructuredDefinitionTemplateId(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveStructuredDefinitionTemplateId(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.445.5')";

	/**
	 * The cached OCL invariant for the '{@link #validateConsentDirectiveStructuredDefinitionTemplateId(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveStructuredDefinitionTemplateId(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consentDirectiveStructuredDefinition The receiving '<em><b>Consent Directive Structured Definition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsentDirectiveStructuredDefinitionTemplateId(
			ConsentDirectiveStructuredDefinition consentDirectiveStructuredDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION);
			try {
				VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consentDirectiveStructuredDefinition)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION__CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_TEMPLATE_ID,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"ConsentDirectiveStructuredDefinitionConsentDirectiveStructuredDefinitionTemplateId"),
						new Object[] { consentDirectiveStructuredDefinition }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsentDirectiveStructuredDefinitionCodeP(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveStructuredDefinitionCodeP(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateConsentDirectiveStructuredDefinitionCodeP(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveStructuredDefinitionCodeP(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consentDirectiveStructuredDefinition The receiving '<em><b>Consent Directive Structured Definition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsentDirectiveStructuredDefinitionCodeP(
			ConsentDirectiveStructuredDefinition consentDirectiveStructuredDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION);
			try {
				VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consentDirectiveStructuredDefinition)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION__CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_CODE_P,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"ConsentDirectiveStructuredDefinitionConsentDirectiveStructuredDefinitionCodeP"),
						new Object[] { consentDirectiveStructuredDefinition }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinitionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinitionCodeP", passToken);
				}
				passToken.add(consentDirectiveStructuredDefinition);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsentDirectiveStructuredDefinitionCode(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveStructuredDefinitionCode(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.5.1063' and (value.code = 'TREAT' or value.code = 'ETREAT' or value.code = 'HPAYMT' or value.code = 'HRESCH' or value.code = 'CLINTRCH' or value.code = ' CLINTRL')";

	/**
	 * The cached OCL invariant for the '{@link #validateConsentDirectiveStructuredDefinitionCode(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveStructuredDefinitionCode(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consentDirectiveStructuredDefinition The receiving '<em><b>Consent Directive Structured Definition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsentDirectiveStructuredDefinitionCode(
			ConsentDirectiveStructuredDefinition consentDirectiveStructuredDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinitionCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(consentDirectiveStructuredDefinition)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION);
			try {
				VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consentDirectiveStructuredDefinition)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION__CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_CODE,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"ConsentDirectiveStructuredDefinitionConsentDirectiveStructuredDefinitionCode"),
						new Object[] { consentDirectiveStructuredDefinition }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsentDirectiveStructuredDefinitionMoodCode(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveStructuredDefinitionMoodCode(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateConsentDirectiveStructuredDefinitionMoodCode(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveStructuredDefinitionMoodCode(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consentDirectiveStructuredDefinition The receiving '<em><b>Consent Directive Structured Definition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsentDirectiveStructuredDefinitionMoodCode(
			ConsentDirectiveStructuredDefinition consentDirectiveStructuredDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION);
			try {
				VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consentDirectiveStructuredDefinition)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION__CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_MOOD_CODE,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"ConsentDirectiveStructuredDefinitionConsentDirectiveStructuredDefinitionMoodCode"),
						new Object[] { consentDirectiveStructuredDefinition }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsentDirectiveStructuredDefinitionInformant(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Informant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveStructuredDefinitionInformant(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->exists(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsentDirectiveStructuredDefinitionInformant(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Informant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveStructuredDefinitionInformant(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consentDirectiveStructuredDefinition The receiving '<em><b>Consent Directive Structured Definition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsentDirectiveStructuredDefinitionInformant(
			ConsentDirectiveStructuredDefinition consentDirectiveStructuredDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION);
			try {
				VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consentDirectiveStructuredDefinition)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION__CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_INFORMANT,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"ConsentDirectiveStructuredDefinitionConsentDirectiveStructuredDefinitionInformant"),
						new Object[] { consentDirectiveStructuredDefinition }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsentDirectiveStructuredDefinitionParticipant(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveStructuredDefinitionParticipant(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(consentdirective::IIHIReceivingProvider))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsentDirectiveStructuredDefinitionParticipant(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveStructuredDefinitionParticipant(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consentDirectiveStructuredDefinition The receiving '<em><b>Consent Directive Structured Definition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsentDirectiveStructuredDefinitionParticipant(
			ConsentDirectiveStructuredDefinition consentDirectiveStructuredDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION);
			try {
				VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consentDirectiveStructuredDefinition)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION__CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_PARTICIPANT,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"ConsentDirectiveStructuredDefinitionConsentDirectiveStructuredDefinitionParticipant"),
						new Object[] { consentDirectiveStructuredDefinition }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsentDirectiveStructuredDefinitionConsentAction(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Consent Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveStructuredDefinitionConsentAction(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_CONSENT_ACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consentdirective::ConsentAction) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateConsentDirectiveStructuredDefinitionConsentAction(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Consent Action</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveStructuredDefinitionConsentAction(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_CONSENT_ACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consentDirectiveStructuredDefinition The receiving '<em><b>Consent Directive Structured Definition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsentDirectiveStructuredDefinitionConsentAction(
			ConsentDirectiveStructuredDefinition consentDirectiveStructuredDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_CONSENT_ACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION);
			try {
				VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_CONSENT_ACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_CONSENT_ACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_CONSENT_ACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consentDirectiveStructuredDefinition)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION__CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_CONSENT_ACTION,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"ConsentDirectiveStructuredDefinitionConsentDirectiveStructuredDefinitionConsentAction"),
						new Object[] { consentDirectiveStructuredDefinition }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsentDirectiveStructuredDefinitionInformationCriteriaReferencesOrganizer(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Information Criteria References Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveStructuredDefinitionInformationCriteriaReferencesOrganizer(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_INFORMATION_CRITERIA_REFERENCES_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.organizer.oclIsUndefined() and entryRelationship.organizer.oclIsKindOf(consentdirective::InformationCriteriaReferencesOrganizer) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateConsentDirectiveStructuredDefinitionInformationCriteriaReferencesOrganizer(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Information Criteria References Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveStructuredDefinitionInformationCriteriaReferencesOrganizer(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_INFORMATION_CRITERIA_REFERENCES_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consentDirectiveStructuredDefinition The receiving '<em><b>Consent Directive Structured Definition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsentDirectiveStructuredDefinitionInformationCriteriaReferencesOrganizer(
			ConsentDirectiveStructuredDefinition consentDirectiveStructuredDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_INFORMATION_CRITERIA_REFERENCES_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION);
			try {
				VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_INFORMATION_CRITERIA_REFERENCES_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_INFORMATION_CRITERIA_REFERENCES_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_INFORMATION_CRITERIA_REFERENCES_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consentDirectiveStructuredDefinition)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION__CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_INFORMATION_CRITERIA_REFERENCES_ORGANIZER,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"ConsentDirectiveStructuredDefinitionConsentDirectiveStructuredDefinitionInformationCriteriaReferencesOrganizer"),
						new Object[] { consentDirectiveStructuredDefinition }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsentDirectiveStructuredDefinitionSecurityLabelCriteria(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Security Label Criteria</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveStructuredDefinitionSecurityLabelCriteria(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_SECURITY_LABEL_CRITERIA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.organizer.oclIsUndefined() and entryRelationship.organizer.oclIsKindOf(consentdirective::SecurityLabel) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateConsentDirectiveStructuredDefinitionSecurityLabelCriteria(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Structured Definition Security Label Criteria</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveStructuredDefinitionSecurityLabelCriteria(ConsentDirectiveStructuredDefinition, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_SECURITY_LABEL_CRITERIA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consentDirectiveStructuredDefinition The receiving '<em><b>Consent Directive Structured Definition</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsentDirectiveStructuredDefinitionSecurityLabelCriteria(
			ConsentDirectiveStructuredDefinition consentDirectiveStructuredDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_SECURITY_LABEL_CRITERIA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION);
			try {
				VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_SECURITY_LABEL_CRITERIA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_SECURITY_LABEL_CRITERIA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_SECURITY_LABEL_CRITERIA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consentDirectiveStructuredDefinition)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION__CONSENT_DIRECTIVE_STRUCTURED_DEFINITION_SECURITY_LABEL_CRITERIA,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"ConsentDirectiveStructuredDefinitionConsentDirectiveStructuredDefinitionSecurityLabelCriteria"),
						new Object[] { consentDirectiveStructuredDefinition }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsentActions(ConsentDirectiveStructuredDefinition) <em>Get Consent Actions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsentActions(ConsentDirectiveStructuredDefinition)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSENT_ACTIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consentdirective::ConsentAction)).oclAsType(consentdirective::ConsentAction)";

	/**
	 * The cached OCL query for the '{@link #getConsentActions(ConsentDirectiveStructuredDefinition) <em>Get Consent Actions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsentActions(ConsentDirectiveStructuredDefinition)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSENT_ACTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<ConsentAction> getConsentActions(
			ConsentDirectiveStructuredDefinition consentDirectiveStructuredDefinition) {

		if (GET_CONSENT_ACTIONS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CONSENTDIRECTIVEPackage.Literals.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION,
				CONSENTDIRECTIVEPackage.Literals.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION.getEAllOperations().get(60));
			try {
				GET_CONSENT_ACTIONS__EOCL_QRY = helper.createQuery(GET_CONSENT_ACTIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSENT_ACTIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ConsentAction> result = (Collection<ConsentAction>) query.evaluate(
			consentDirectiveStructuredDefinition);
		return new BasicEList.UnmodifiableEList<ConsentAction>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getInformationCriteriaReferencesOrganizers(ConsentDirectiveStructuredDefinition) <em>Get Information Criteria References Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationCriteriaReferencesOrganizers(ConsentDirectiveStructuredDefinition)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INFORMATION_CRITERIA_REFERENCES_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consentdirective::InformationCriteriaReferencesOrganizer)).oclAsType(consentdirective::InformationCriteriaReferencesOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getInformationCriteriaReferencesOrganizers(ConsentDirectiveStructuredDefinition) <em>Get Information Criteria References Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationCriteriaReferencesOrganizers(ConsentDirectiveStructuredDefinition)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INFORMATION_CRITERIA_REFERENCES_ORGANIZERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<InformationCriteriaReferencesOrganizer> getInformationCriteriaReferencesOrganizers(
			ConsentDirectiveStructuredDefinition consentDirectiveStructuredDefinition) {

		if (GET_INFORMATION_CRITERIA_REFERENCES_ORGANIZERS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CONSENTDIRECTIVEPackage.Literals.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION,
				CONSENTDIRECTIVEPackage.Literals.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION.getEAllOperations().get(61));
			try {
				GET_INFORMATION_CRITERIA_REFERENCES_ORGANIZERS__EOCL_QRY = helper.createQuery(
					GET_INFORMATION_CRITERIA_REFERENCES_ORGANIZERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_INFORMATION_CRITERIA_REFERENCES_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<InformationCriteriaReferencesOrganizer> result = (Collection<InformationCriteriaReferencesOrganizer>) query.evaluate(
			consentDirectiveStructuredDefinition);
		return new BasicEList.UnmodifiableEList<InformationCriteriaReferencesOrganizer>(
			result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSecurityLabelCriteria(ConsentDirectiveStructuredDefinition) <em>Get Security Label Criteria</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLabelCriteria(ConsentDirectiveStructuredDefinition)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SECURITY_LABEL_CRITERIA__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consentdirective::SecurityLabel)).oclAsType(consentdirective::SecurityLabel)";

	/**
	 * The cached OCL query for the '{@link #getSecurityLabelCriteria(ConsentDirectiveStructuredDefinition) <em>Get Security Label Criteria</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLabelCriteria(ConsentDirectiveStructuredDefinition)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SECURITY_LABEL_CRITERIA__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<SecurityLabel> getSecurityLabelCriteria(
			ConsentDirectiveStructuredDefinition consentDirectiveStructuredDefinition) {

		if (GET_SECURITY_LABEL_CRITERIA__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CONSENTDIRECTIVEPackage.Literals.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION,
				CONSENTDIRECTIVEPackage.Literals.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION.getEAllOperations().get(62));
			try {
				GET_SECURITY_LABEL_CRITERIA__EOCL_QRY = helper.createQuery(GET_SECURITY_LABEL_CRITERIA__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_SECURITY_LABEL_CRITERIA__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SecurityLabel> result = (Collection<SecurityLabel>) query.evaluate(
			consentDirectiveStructuredDefinition);
		return new BasicEList.UnmodifiableEList<SecurityLabel>(result.size(), result.toArray());
	}

} // ConsentDirectiveStructuredDefinitionOperations
