/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Priority Preference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PriorityPreference#validatePriorityPreferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PriorityPreference#validatePriorityPreferenceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PriorityPreference#validatePriorityPreferenceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PriorityPreference#validatePriorityPreferenceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PriorityPreference#validatePriorityPreferenceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PriorityPreference#validatePriorityPreferenceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PriorityPreference#validatePriorityPreferenceEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PriorityPreference#validatePriorityPreferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PriorityPreference#validatePriorityPreferenceValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PriorityPreference#validatePriorityPreferenceAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Author Participation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PriorityPreferenceOperations extends ClinicalStatementOperations {
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
	protected PriorityPreferenceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePriorityPreferenceTemplateId(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorityPreferenceTemplateId(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIORITY_PREFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.143')";

	/**
	 * The cached OCL invariant for the '{@link #validatePriorityPreferenceTemplateId(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorityPreferenceTemplateId(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PRIORITY_PREFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param priorityPreference The receiving '<em><b>Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePriorityPreferenceTemplateId(PriorityPreference priorityPreference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRIORITY_PREFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRIORITY_PREFERENCE);
			try {
				VALIDATE_PRIORITY_PREFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PRIORITY_PREFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRIORITY_PREFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(priorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRIORITY_PREFERENCE__PRIORITY_PREFERENCE_TEMPLATE_ID,
						org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin.INSTANCE.getString(
							"PriorityPreferencePriorityPreferenceTemplateId"),
						new Object[] { priorityPreference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePriorityPreferenceClassCode(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorityPreferenceClassCode(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIORITY_PREFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validatePriorityPreferenceClassCode(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorityPreferenceClassCode(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PRIORITY_PREFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param priorityPreference The receiving '<em><b>Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePriorityPreferenceClassCode(PriorityPreference priorityPreference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRIORITY_PREFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRIORITY_PREFERENCE);
			try {
				VALIDATE_PRIORITY_PREFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PRIORITY_PREFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRIORITY_PREFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(priorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRIORITY_PREFERENCE__PRIORITY_PREFERENCE_CLASS_CODE,
						org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin.INSTANCE.getString(
							"PriorityPreferencePriorityPreferenceClassCode"),
						new Object[] { priorityPreference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePriorityPreferenceMoodCode(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorityPreferenceMoodCode(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIORITY_PREFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validatePriorityPreferenceMoodCode(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorityPreferenceMoodCode(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PRIORITY_PREFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param priorityPreference The receiving '<em><b>Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePriorityPreferenceMoodCode(PriorityPreference priorityPreference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRIORITY_PREFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRIORITY_PREFERENCE);
			try {
				VALIDATE_PRIORITY_PREFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PRIORITY_PREFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRIORITY_PREFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(priorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRIORITY_PREFERENCE__PRIORITY_PREFERENCE_MOOD_CODE,
						org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin.INSTANCE.getString(
							"PriorityPreferencePriorityPreferenceMoodCode"),
						new Object[] { priorityPreference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePriorityPreferenceId(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorityPreferenceId(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIORITY_PREFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validatePriorityPreferenceId(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorityPreferenceId(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PRIORITY_PREFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param priorityPreference The receiving '<em><b>Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePriorityPreferenceId(PriorityPreference priorityPreference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRIORITY_PREFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRIORITY_PREFERENCE);
			try {
				VALIDATE_PRIORITY_PREFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PRIORITY_PREFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIORITY_PREFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			priorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRIORITY_PREFERENCE__PRIORITY_PREFERENCE_ID,
						org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin.INSTANCE.getString(
							"PriorityPreferencePriorityPreferenceId"),
						new Object[] { priorityPreference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePriorityPreferenceCodeP(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorityPreferenceCodeP(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIORITY_PREFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePriorityPreferenceCodeP(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorityPreferenceCodeP(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PRIORITY_PREFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param priorityPreference The receiving '<em><b>Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePriorityPreferenceCodeP(PriorityPreference priorityPreference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRIORITY_PREFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRIORITY_PREFERENCE);
			try {
				VALIDATE_PRIORITY_PREFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PRIORITY_PREFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRIORITY_PREFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(priorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRIORITY_PREFERENCE__PRIORITY_PREFERENCE_CODE_P,
						org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin.INSTANCE.getString(
							"PriorityPreferencePriorityPreferenceCodeP"),
						new Object[] { priorityPreference }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.PriorityPreferenceCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.PriorityPreferenceCodeP", passToken);
				}
				passToken.add(priorityPreference);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePriorityPreferenceCode(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorityPreferenceCode(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIORITY_PREFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '225773000' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validatePriorityPreferenceCode(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorityPreferenceCode(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PRIORITY_PREFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param priorityPreference The receiving '<em><b>Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePriorityPreferenceCode(PriorityPreference priorityPreference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.PriorityPreferenceCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(priorityPreference)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PRIORITY_PREFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRIORITY_PREFERENCE);
			try {
				VALIDATE_PRIORITY_PREFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PRIORITY_PREFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIORITY_PREFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			priorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRIORITY_PREFERENCE__PRIORITY_PREFERENCE_CODE,
						org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin.INSTANCE.getString(
							"PriorityPreferencePriorityPreferenceCode"),
						new Object[] { priorityPreference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePriorityPreferenceEffectiveTime(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorityPreferenceEffectiveTime(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIORITY_PREFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePriorityPreferenceEffectiveTime(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorityPreferenceEffectiveTime(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PRIORITY_PREFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param priorityPreference The receiving '<em><b>Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePriorityPreferenceEffectiveTime(PriorityPreference priorityPreference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRIORITY_PREFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRIORITY_PREFERENCE);
			try {
				VALIDATE_PRIORITY_PREFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PRIORITY_PREFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRIORITY_PREFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				priorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRIORITY_PREFERENCE__PRIORITY_PREFERENCE_EFFECTIVE_TIME,
						org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin.INSTANCE.getString(
							"PriorityPreferencePriorityPreferenceEffectiveTime"),
						new Object[] { priorityPreference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePriorityPreferenceValue(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorityPreferenceValue(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIORITY_PREFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '394849002' or value.code = '394848005' or value.code = '441808003')))";

	/**
	 * The cached OCL invariant for the '{@link #validatePriorityPreferenceValue(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorityPreferenceValue(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PRIORITY_PREFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param priorityPreference The receiving '<em><b>Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePriorityPreferenceValue(PriorityPreference priorityPreference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRIORITY_PREFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRIORITY_PREFERENCE);
			try {
				VALIDATE_PRIORITY_PREFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PRIORITY_PREFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIORITY_PREFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			priorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRIORITY_PREFERENCE__PRIORITY_PREFERENCE_VALUE,
						org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin.INSTANCE.getString(
							"PriorityPreferencePriorityPreferenceValue"),
						new Object[] { priorityPreference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePriorityPreferenceValueP(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorityPreferenceValueP(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIORITY_PREFERENCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePriorityPreferenceValueP(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorityPreferenceValueP(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PRIORITY_PREFERENCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param priorityPreference The receiving '<em><b>Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePriorityPreferenceValueP(PriorityPreference priorityPreference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRIORITY_PREFERENCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRIORITY_PREFERENCE);
			try {
				VALIDATE_PRIORITY_PREFERENCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PRIORITY_PREFERENCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRIORITY_PREFERENCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(priorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRIORITY_PREFERENCE__PRIORITY_PREFERENCE_VALUE_P,
						org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin.INSTANCE.getString(
							"PriorityPreferencePriorityPreferenceValueP"),
						new Object[] { priorityPreference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePriorityPreferenceAuthorParticipation(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorityPreferenceAuthorParticipation(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIORITY_PREFERENCE_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePriorityPreferenceAuthorParticipation(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Priority Preference Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorityPreferenceAuthorParticipation(PriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PRIORITY_PREFERENCE_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param priorityPreference The receiving '<em><b>Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePriorityPreferenceAuthorParticipation(PriorityPreference priorityPreference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PRIORITY_PREFERENCE_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRIORITY_PREFERENCE);
			try {
				VALIDATE_PRIORITY_PREFERENCE_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PRIORITY_PREFERENCE_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRIORITY_PREFERENCE_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				priorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PRIORITY_PREFERENCE__PRIORITY_PREFERENCE_AUTHOR_PARTICIPATION,
						org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin.INSTANCE.getString(
							"PriorityPreferencePriorityPreferenceAuthorParticipation"),
						new Object[] { priorityPreference }));
			}

			return false;
		}
		return true;
	}

} // PriorityPreferenceOperations
