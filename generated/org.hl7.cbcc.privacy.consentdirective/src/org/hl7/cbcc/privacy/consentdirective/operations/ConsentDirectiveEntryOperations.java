/**
 */
package org.hl7.cbcc.privacy.consentdirective.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.EntryOperations;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPlugin;
import org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveEntry;

import org.hl7.cbcc.privacy.consentdirective.util.CONSENTDIRECTIVEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Consent Directive Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveEntry#validateConsentDirectiveEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Entry Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveEntry#validateConsentDirectiveEntryAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Entry Act</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveEntry#validateConsentDirectiveEntryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Entry Observation</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveEntry#validateConsentDirectiveEntryObservationMedia(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Entry Observation Media</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConsentDirectiveEntryOperations extends EntryOperations {
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
	protected ConsentDirectiveEntryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsentDirectiveEntryTemplateId(ConsentDirectiveEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Entry Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveEntryTemplateId(ConsentDirectiveEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSENT_DIRECTIVE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.445.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateConsentDirectiveEntryTemplateId(ConsentDirectiveEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Entry Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveEntryTemplateId(ConsentDirectiveEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSENT_DIRECTIVE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consentDirectiveEntry The receiving '<em><b>Consent Directive Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsentDirectiveEntryTemplateId(ConsentDirectiveEntry consentDirectiveEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSENT_DIRECTIVE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CONSENT_DIRECTIVE_ENTRY);
			try {
				VALIDATE_CONSENT_DIRECTIVE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONSENT_DIRECTIVE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSENT_DIRECTIVE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consentDirectiveEntry)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CONSENT_DIRECTIVE_ENTRY__CONSENT_DIRECTIVE_ENTRY_TEMPLATE_ID,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"ConsentDirectiveEntryConsentDirectiveEntryTemplateId"),
						new Object[] { consentDirectiveEntry }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsentDirectiveEntryAct(ConsentDirectiveEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Entry Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveEntryAct(ConsentDirectiveEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSENT_DIRECTIVE_ENTRY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consentdirective::ConsentDirectiveStructuredDefinition))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsentDirectiveEntryAct(ConsentDirectiveEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Entry Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveEntryAct(ConsentDirectiveEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSENT_DIRECTIVE_ENTRY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consentDirectiveEntry The receiving '<em><b>Consent Directive Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsentDirectiveEntryAct(ConsentDirectiveEntry consentDirectiveEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSENT_DIRECTIVE_ENTRY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CONSENT_DIRECTIVE_ENTRY);
			try {
				VALIDATE_CONSENT_DIRECTIVE_ENTRY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CONSENT_DIRECTIVE_ENTRY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSENT_DIRECTIVE_ENTRY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(consentDirectiveEntry)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CONSENT_DIRECTIVE_ENTRY__CONSENT_DIRECTIVE_ENTRY_ACT,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString("ConsentDirectiveEntryConsentDirectiveEntryAct"),
						new Object[] { consentDirectiveEntry }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsentDirectiveEntryObservation(ConsentDirectiveEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Entry Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveEntryObservation(ConsentDirectiveEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSENT_DIRECTIVE_ENTRY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consentdirective::ComputablePolicyConsent))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsentDirectiveEntryObservation(ConsentDirectiveEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Entry Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveEntryObservation(ConsentDirectiveEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSENT_DIRECTIVE_ENTRY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consentDirectiveEntry The receiving '<em><b>Consent Directive Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsentDirectiveEntryObservation(ConsentDirectiveEntry consentDirectiveEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSENT_DIRECTIVE_ENTRY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CONSENT_DIRECTIVE_ENTRY);
			try {
				VALIDATE_CONSENT_DIRECTIVE_ENTRY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONSENT_DIRECTIVE_ENTRY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSENT_DIRECTIVE_ENTRY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consentDirectiveEntry)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CONSENT_DIRECTIVE_ENTRY__CONSENT_DIRECTIVE_ENTRY_OBSERVATION,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"ConsentDirectiveEntryConsentDirectiveEntryObservation"),
						new Object[] { consentDirectiveEntry }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsentDirectiveEntryObservationMedia(ConsentDirectiveEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Entry Observation Media</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveEntryObservationMedia(ConsentDirectiveEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSENT_DIRECTIVE_ENTRY_OBSERVATION_MEDIA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.observationMedia->one(observationMedia : cda::ObservationMedia | not observationMedia.oclIsUndefined() and observationMedia.oclIsKindOf(consentdirective::ScannedPrivacyConsent))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsentDirectiveEntryObservationMedia(ConsentDirectiveEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consent Directive Entry Observation Media</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsentDirectiveEntryObservationMedia(ConsentDirectiveEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_CONSENT_DIRECTIVE_ENTRY_OBSERVATION_MEDIA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param consentDirectiveEntry The receiving '<em><b>Consent Directive Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsentDirectiveEntryObservationMedia(ConsentDirectiveEntry consentDirectiveEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CONSENT_DIRECTIVE_ENTRY_OBSERVATION_MEDIA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.CONSENT_DIRECTIVE_ENTRY);
			try {
				VALIDATE_CONSENT_DIRECTIVE_ENTRY_OBSERVATION_MEDIA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONSENT_DIRECTIVE_ENTRY_OBSERVATION_MEDIA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONSENT_DIRECTIVE_ENTRY_OBSERVATION_MEDIA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				consentDirectiveEntry)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.CONSENT_DIRECTIVE_ENTRY__CONSENT_DIRECTIVE_ENTRY_OBSERVATION_MEDIA,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"ConsentDirectiveEntryConsentDirectiveEntryObservationMedia"),
						new Object[] { consentDirectiveEntry }));
			}

			return false;
		}
		return true;
	}

} // ConsentDirectiveEntryOperations
