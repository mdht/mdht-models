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
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Provider Priority Preference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference#validateProviderPriorityPreferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference#validateProviderPriorityPreferenceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference#validateProviderPriorityPreferenceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference#validateProviderPriorityPreferenceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference#validateProviderPriorityPreferenceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference#validateProviderPriorityPreferenceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference#validateProviderPriorityPreferencePriorityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Priority Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference#validateProviderPriorityPreferencePriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference#validateProviderPriorityPreferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference#validateProviderPriorityPreferenceValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference#validateProviderPriorityPreferenceAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Author Participation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProviderPriorityPreferenceOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProviderPriorityPreferenceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProviderPriorityPreferenceTemplateId(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderPriorityPreferenceTemplateId(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVIDER_PRIORITY_PREFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.143')";

	/**
	 * The cached OCL invariant for the '{@link #validateProviderPriorityPreferenceTemplateId(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderPriorityPreferenceTemplateId(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROVIDER_PRIORITY_PREFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param providerPriorityPreference The receiving '<em><b>Provider Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProviderPriorityPreferenceTemplateId(
			ProviderPriorityPreference providerPriorityPreference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROVIDER_PRIORITY_PREFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVIDER_PRIORITY_PREFERENCE);
			try {
				VALIDATE_PROVIDER_PRIORITY_PREFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROVIDER_PRIORITY_PREFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROVIDER_PRIORITY_PREFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			providerPriorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROVIDER_PRIORITY_PREFERENCE__PROVIDER_PRIORITY_PREFERENCE_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ProviderPriorityPreferenceTemplateId"),
					new Object[] { providerPriorityPreference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProviderPriorityPreferenceClassCode(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderPriorityPreferenceClassCode(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVIDER_PRIORITY_PREFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateProviderPriorityPreferenceClassCode(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderPriorityPreferenceClassCode(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROVIDER_PRIORITY_PREFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param providerPriorityPreference The receiving '<em><b>Provider Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProviderPriorityPreferenceClassCode(
			ProviderPriorityPreference providerPriorityPreference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROVIDER_PRIORITY_PREFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVIDER_PRIORITY_PREFERENCE);
			try {
				VALIDATE_PROVIDER_PRIORITY_PREFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROVIDER_PRIORITY_PREFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROVIDER_PRIORITY_PREFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			providerPriorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROVIDER_PRIORITY_PREFERENCE__PROVIDER_PRIORITY_PREFERENCE_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("ProviderPriorityPreferenceClassCode"),
					new Object[] { providerPriorityPreference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProviderPriorityPreferenceMoodCode(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderPriorityPreferenceMoodCode(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVIDER_PRIORITY_PREFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateProviderPriorityPreferenceMoodCode(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderPriorityPreferenceMoodCode(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROVIDER_PRIORITY_PREFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param providerPriorityPreference The receiving '<em><b>Provider Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProviderPriorityPreferenceMoodCode(
			ProviderPriorityPreference providerPriorityPreference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROVIDER_PRIORITY_PREFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVIDER_PRIORITY_PREFERENCE);
			try {
				VALIDATE_PROVIDER_PRIORITY_PREFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROVIDER_PRIORITY_PREFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROVIDER_PRIORITY_PREFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			providerPriorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROVIDER_PRIORITY_PREFERENCE__PROVIDER_PRIORITY_PREFERENCE_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("ProviderPriorityPreferenceMoodCode"),
					new Object[] { providerPriorityPreference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProviderPriorityPreferenceId(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderPriorityPreferenceId(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVIDER_PRIORITY_PREFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateProviderPriorityPreferenceId(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderPriorityPreferenceId(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROVIDER_PRIORITY_PREFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param providerPriorityPreference The receiving '<em><b>Provider Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProviderPriorityPreferenceId(ProviderPriorityPreference providerPriorityPreference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROVIDER_PRIORITY_PREFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVIDER_PRIORITY_PREFERENCE);
			try {
				VALIDATE_PROVIDER_PRIORITY_PREFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROVIDER_PRIORITY_PREFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROVIDER_PRIORITY_PREFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			providerPriorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROVIDER_PRIORITY_PREFERENCE__PROVIDER_PRIORITY_PREFERENCE_ID,
					ConsolPlugin.INSTANCE.getString("ProviderPriorityPreferenceId"),
					new Object[] { providerPriorityPreference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProviderPriorityPreferenceCodeP(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderPriorityPreferenceCodeP(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVIDER_PRIORITY_PREFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProviderPriorityPreferenceCodeP(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderPriorityPreferenceCodeP(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROVIDER_PRIORITY_PREFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param providerPriorityPreference The receiving '<em><b>Provider Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProviderPriorityPreferenceCodeP(
			ProviderPriorityPreference providerPriorityPreference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROVIDER_PRIORITY_PREFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVIDER_PRIORITY_PREFERENCE);
			try {
				VALIDATE_PROVIDER_PRIORITY_PREFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROVIDER_PRIORITY_PREFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROVIDER_PRIORITY_PREFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			providerPriorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROVIDER_PRIORITY_PREFERENCE__PROVIDER_PRIORITY_PREFERENCE_CODE_P,
					ConsolPlugin.INSTANCE.getString("ProviderPriorityPreferenceCodeP"),
					new Object[] { providerPriorityPreference }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreferenceCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreferenceCodeP", passToken);
				}
				passToken.add(providerPriorityPreference);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProviderPriorityPreferenceCode(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderPriorityPreferenceCode(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVIDER_PRIORITY_PREFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '103323008' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateProviderPriorityPreferenceCode(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderPriorityPreferenceCode(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROVIDER_PRIORITY_PREFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param providerPriorityPreference The receiving '<em><b>Provider Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProviderPriorityPreferenceCode(ProviderPriorityPreference providerPriorityPreference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreferenceCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(providerPriorityPreference)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PROVIDER_PRIORITY_PREFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVIDER_PRIORITY_PREFERENCE);
			try {
				VALIDATE_PROVIDER_PRIORITY_PREFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROVIDER_PRIORITY_PREFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROVIDER_PRIORITY_PREFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			providerPriorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROVIDER_PRIORITY_PREFERENCE__PROVIDER_PRIORITY_PREFERENCE_CODE,
					ConsolPlugin.INSTANCE.getString("ProviderPriorityPreferenceCode"),
					new Object[] { providerPriorityPreference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProviderPriorityPreferencePriorityCodeP(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Priority Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderPriorityPreferencePriorityCodeP(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVIDER_PRIORITY_PREFERENCE_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.priorityCode.oclIsUndefined() or self.priorityCode.isNullFlavorUndefined()) implies (not self.priorityCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProviderPriorityPreferencePriorityCodeP(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Priority Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderPriorityPreferencePriorityCodeP(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROVIDER_PRIORITY_PREFERENCE_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param providerPriorityPreference The receiving '<em><b>Provider Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProviderPriorityPreferencePriorityCodeP(
			ProviderPriorityPreference providerPriorityPreference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROVIDER_PRIORITY_PREFERENCE_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVIDER_PRIORITY_PREFERENCE);
			try {
				VALIDATE_PROVIDER_PRIORITY_PREFERENCE_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROVIDER_PRIORITY_PREFERENCE_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROVIDER_PRIORITY_PREFERENCE_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			providerPriorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROVIDER_PRIORITY_PREFERENCE__PROVIDER_PRIORITY_PREFERENCE_PRIORITY_CODE_P,
					ConsolPlugin.INSTANCE.getString("ProviderPriorityPreferencePriorityCodeP"),
					new Object[] { providerPriorityPreference }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreferencePriorityCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreferencePriorityCodeP", passToken);
				}
				passToken.add(providerPriorityPreference);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProviderPriorityPreferencePriorityCode(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Priority Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderPriorityPreferencePriorityCode(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVIDER_PRIORITY_PREFERENCE_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.priorityCode.oclIsUndefined() or self.priorityCode.isNullFlavorUndefined()) implies (not self.priorityCode.oclIsUndefined() and self.priorityCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.priorityCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '255216001' or value.code = '81170007' or value.code = '70905002' or value.code = '29970001' or value.code = '32088001' or value.code = '53046009' or value.code = '86777004' or value.code = '51601003' or value.code = '58584009' or value.code = '28226006' or value.code = '40397004' or value.code = '46213005'))";

	/**
	 * The cached OCL invariant for the '{@link #validateProviderPriorityPreferencePriorityCode(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Priority Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderPriorityPreferencePriorityCode(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROVIDER_PRIORITY_PREFERENCE_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param providerPriorityPreference The receiving '<em><b>Provider Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProviderPriorityPreferencePriorityCode(
			ProviderPriorityPreference providerPriorityPreference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreferencePriorityCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(providerPriorityPreference)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PROVIDER_PRIORITY_PREFERENCE_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVIDER_PRIORITY_PREFERENCE);
			try {
				VALIDATE_PROVIDER_PRIORITY_PREFERENCE_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROVIDER_PRIORITY_PREFERENCE_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROVIDER_PRIORITY_PREFERENCE_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			providerPriorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROVIDER_PRIORITY_PREFERENCE__PROVIDER_PRIORITY_PREFERENCE_PRIORITY_CODE,
					ConsolPlugin.INSTANCE.getString("ProviderPriorityPreferencePriorityCode"),
					new Object[] { providerPriorityPreference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProviderPriorityPreferenceValue(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderPriorityPreferenceValue(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVIDER_PRIORITY_PREFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '394849002' or value.code = '394848005' or value.code = '441808003')))";

	/**
	 * The cached OCL invariant for the '{@link #validateProviderPriorityPreferenceValue(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderPriorityPreferenceValue(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROVIDER_PRIORITY_PREFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param providerPriorityPreference The receiving '<em><b>Provider Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProviderPriorityPreferenceValue(
			ProviderPriorityPreference providerPriorityPreference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROVIDER_PRIORITY_PREFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVIDER_PRIORITY_PREFERENCE);
			try {
				VALIDATE_PROVIDER_PRIORITY_PREFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROVIDER_PRIORITY_PREFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROVIDER_PRIORITY_PREFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			providerPriorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROVIDER_PRIORITY_PREFERENCE__PROVIDER_PRIORITY_PREFERENCE_VALUE,
					ConsolPlugin.INSTANCE.getString("ProviderPriorityPreferenceValue"),
					new Object[] { providerPriorityPreference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProviderPriorityPreferenceValueP(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderPriorityPreferenceValueP(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVIDER_PRIORITY_PREFERENCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProviderPriorityPreferenceValueP(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderPriorityPreferenceValueP(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROVIDER_PRIORITY_PREFERENCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param providerPriorityPreference The receiving '<em><b>Provider Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProviderPriorityPreferenceValueP(
			ProviderPriorityPreference providerPriorityPreference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROVIDER_PRIORITY_PREFERENCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVIDER_PRIORITY_PREFERENCE);
			try {
				VALIDATE_PROVIDER_PRIORITY_PREFERENCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROVIDER_PRIORITY_PREFERENCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROVIDER_PRIORITY_PREFERENCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			providerPriorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROVIDER_PRIORITY_PREFERENCE__PROVIDER_PRIORITY_PREFERENCE_VALUE_P,
					ConsolPlugin.INSTANCE.getString("ProviderPriorityPreferenceValueP"),
					new Object[] { providerPriorityPreference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProviderPriorityPreferenceAuthorParticipation(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderPriorityPreferenceAuthorParticipation(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVIDER_PRIORITY_PREFERENCE_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateProviderPriorityPreferenceAuthorParticipation(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Priority Preference Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderPriorityPreferenceAuthorParticipation(ProviderPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PROVIDER_PRIORITY_PREFERENCE_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param providerPriorityPreference The receiving '<em><b>Provider Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProviderPriorityPreferenceAuthorParticipation(
			ProviderPriorityPreference providerPriorityPreference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROVIDER_PRIORITY_PREFERENCE_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROVIDER_PRIORITY_PREFERENCE);
			try {
				VALIDATE_PROVIDER_PRIORITY_PREFERENCE_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROVIDER_PRIORITY_PREFERENCE_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROVIDER_PRIORITY_PREFERENCE_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			providerPriorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROVIDER_PRIORITY_PREFERENCE__PROVIDER_PRIORITY_PREFERENCE_AUTHOR_PARTICIPATION,
					ConsolPlugin.INSTANCE.getString("ProviderPriorityPreferenceAuthorParticipation"),
					new Object[] { providerPriorityPreference }));
			}

			return false;
		}
		return true;
	}

} // ProviderPriorityPreferenceOperations
