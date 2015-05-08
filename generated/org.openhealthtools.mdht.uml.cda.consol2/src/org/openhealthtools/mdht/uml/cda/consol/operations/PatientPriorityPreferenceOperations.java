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

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Priority Preference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference#validatePatientPriorityPreferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference#validatePatientPriorityPreferenceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference#validatePatientPriorityPreferenceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference#validatePatientPriorityPreferenceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference#validatePatientPriorityPreferenceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference#validatePatientPriorityPreferenceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference#validatePatientPriorityPreferencePriorityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Priority Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference#validatePatientPriorityPreferencePriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference#validatePatientPriorityPreferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference#validatePatientPriorityPreferenceValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference#validatePatientPriorityPreferenceCDCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference CD Code System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientPriorityPreferenceOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientPriorityPreferenceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientPriorityPreferenceTemplateId(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientPriorityPreferenceTemplateId(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_PRIORITY_PREFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.142')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientPriorityPreferenceTemplateId(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientPriorityPreferenceTemplateId(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_PRIORITY_PREFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientPriorityPreference The receiving '<em><b>Patient Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientPriorityPreferenceTemplateId(
			PatientPriorityPreference patientPriorityPreference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PATIENT_PRIORITY_PREFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_PRIORITY_PREFERENCE);
			try {
				VALIDATE_PATIENT_PRIORITY_PREFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_PRIORITY_PREFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_PRIORITY_PREFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientPriorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_PRIORITY_PREFERENCE__PATIENT_PRIORITY_PREFERENCE_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("PatientPriorityPreferencePatientPriorityPreferenceTemplateId"),
					new Object[] { patientPriorityPreference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientPriorityPreferenceClassCode(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientPriorityPreferenceClassCode(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_PRIORITY_PREFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientPriorityPreferenceClassCode(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientPriorityPreferenceClassCode(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_PRIORITY_PREFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientPriorityPreference The receiving '<em><b>Patient Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientPriorityPreferenceClassCode(
			PatientPriorityPreference patientPriorityPreference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PATIENT_PRIORITY_PREFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_PRIORITY_PREFERENCE);
			try {
				VALIDATE_PATIENT_PRIORITY_PREFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_PRIORITY_PREFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_PRIORITY_PREFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientPriorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_PRIORITY_PREFERENCE__PATIENT_PRIORITY_PREFERENCE_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("PatientPriorityPreferencePatientPriorityPreferenceClassCode"),
					new Object[] { patientPriorityPreference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientPriorityPreferenceMoodCode(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientPriorityPreferenceMoodCode(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_PRIORITY_PREFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientPriorityPreferenceMoodCode(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientPriorityPreferenceMoodCode(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_PRIORITY_PREFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientPriorityPreference The receiving '<em><b>Patient Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientPriorityPreferenceMoodCode(
			PatientPriorityPreference patientPriorityPreference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PATIENT_PRIORITY_PREFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_PRIORITY_PREFERENCE);
			try {
				VALIDATE_PATIENT_PRIORITY_PREFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_PRIORITY_PREFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_PRIORITY_PREFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientPriorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_PRIORITY_PREFERENCE__PATIENT_PRIORITY_PREFERENCE_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("PatientPriorityPreferencePatientPriorityPreferenceMoodCode"),
					new Object[] { patientPriorityPreference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientPriorityPreferenceId(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientPriorityPreferenceId(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_PRIORITY_PREFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientPriorityPreferenceId(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientPriorityPreferenceId(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_PRIORITY_PREFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientPriorityPreference The receiving '<em><b>Patient Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientPriorityPreferenceId(PatientPriorityPreference patientPriorityPreference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_PRIORITY_PREFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_PRIORITY_PREFERENCE);
			try {
				VALIDATE_PATIENT_PRIORITY_PREFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_PRIORITY_PREFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_PRIORITY_PREFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientPriorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_PRIORITY_PREFERENCE__PATIENT_PRIORITY_PREFERENCE_ID,
					ConsolPlugin.INSTANCE.getString("PatientPriorityPreferencePatientPriorityPreferenceId"),
					new Object[] { patientPriorityPreference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientPriorityPreferenceCodeP(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientPriorityPreferenceCodeP(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_PRIORITY_PREFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientPriorityPreferenceCodeP(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientPriorityPreferenceCodeP(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_PRIORITY_PREFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientPriorityPreference The receiving '<em><b>Patient Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientPriorityPreferenceCodeP(PatientPriorityPreference patientPriorityPreference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_PRIORITY_PREFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_PRIORITY_PREFERENCE);
			try {
				VALIDATE_PATIENT_PRIORITY_PREFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_PRIORITY_PREFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_PRIORITY_PREFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientPriorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_PRIORITY_PREFERENCE__PATIENT_PRIORITY_PREFERENCE_CODE_P,
					ConsolPlugin.INSTANCE.getString("PatientPriorityPreferencePatientPriorityPreferenceCodeP"),
					new Object[] { patientPriorityPreference }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreferenceCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreferenceCodeP", passToken);
				}
				passToken.add(patientPriorityPreference);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientPriorityPreferenceCode(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientPriorityPreferenceCode(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_PRIORITY_PREFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " + "value.code = 'PAT')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientPriorityPreferenceCode(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientPriorityPreferenceCode(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_PRIORITY_PREFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientPriorityPreference The receiving '<em><b>Patient Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientPriorityPreferenceCode(PatientPriorityPreference patientPriorityPreference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreferenceCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(patientPriorityPreference)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PATIENT_PRIORITY_PREFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_PRIORITY_PREFERENCE);
			try {
				VALIDATE_PATIENT_PRIORITY_PREFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_PRIORITY_PREFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_PRIORITY_PREFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientPriorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_PRIORITY_PREFERENCE__PATIENT_PRIORITY_PREFERENCE_CODE,
					ConsolPlugin.INSTANCE.getString("PatientPriorityPreferencePatientPriorityPreferenceCode"),
					new Object[] { patientPriorityPreference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientPriorityPreferencePriorityCodeP(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Priority Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientPriorityPreferencePriorityCodeP(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_PRIORITY_PREFERENCE_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.priorityCode.oclIsUndefined() or self.priorityCode.isNullFlavorUndefined()) implies (not self.priorityCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientPriorityPreferencePriorityCodeP(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Priority Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientPriorityPreferencePriorityCodeP(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_PRIORITY_PREFERENCE_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientPriorityPreference The receiving '<em><b>Patient Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientPriorityPreferencePriorityCodeP(
			PatientPriorityPreference patientPriorityPreference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PATIENT_PRIORITY_PREFERENCE_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_PRIORITY_PREFERENCE);
			try {
				VALIDATE_PATIENT_PRIORITY_PREFERENCE_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_PRIORITY_PREFERENCE_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_PRIORITY_PREFERENCE_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientPriorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_PRIORITY_PREFERENCE__PATIENT_PRIORITY_PREFERENCE_PRIORITY_CODE_P,
					ConsolPlugin.INSTANCE.getString("PatientPriorityPreferencePatientPriorityPreferencePriorityCodeP"),
					new Object[] { patientPriorityPreference }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreferencePriorityCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreferencePriorityCodeP", passToken);
				}
				passToken.add(patientPriorityPreference);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientPriorityPreferencePriorityCode(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Priority Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientPriorityPreferencePriorityCode(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_PRIORITY_PREFERENCE_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.priorityCode.oclIsUndefined() or self.priorityCode.isNullFlavorUndefined()) implies (not self.priorityCode.oclIsUndefined() and self.priorityCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.priorityCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '255216001' or value.code = '81170007' or value.code = '70905002' or value.code = '29970001' or value.code = '32088001' or value.code = '53046009' or value.code = '86777004' or value.code = '51601003' or value.code = '58584009' or value.code = '28226006' or value.code = '40397004' or value.code = '46213005'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientPriorityPreferencePriorityCode(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Priority Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientPriorityPreferencePriorityCode(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_PRIORITY_PREFERENCE_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientPriorityPreference The receiving '<em><b>Patient Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientPriorityPreferencePriorityCode(
			PatientPriorityPreference patientPriorityPreference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreferencePriorityCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(patientPriorityPreference)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PATIENT_PRIORITY_PREFERENCE_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_PRIORITY_PREFERENCE);
			try {
				VALIDATE_PATIENT_PRIORITY_PREFERENCE_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_PRIORITY_PREFERENCE_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_PRIORITY_PREFERENCE_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientPriorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_PRIORITY_PREFERENCE__PATIENT_PRIORITY_PREFERENCE_PRIORITY_CODE,
					ConsolPlugin.INSTANCE.getString("PatientPriorityPreferencePatientPriorityPreferencePriorityCode"),
					new Object[] { patientPriorityPreference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientPriorityPreferenceValue(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientPriorityPreferenceValue(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_PRIORITY_PREFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '394849002' or value.code = '394848005' or value.code = '441808003')))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientPriorityPreferenceValue(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientPriorityPreferenceValue(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_PRIORITY_PREFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientPriorityPreference The receiving '<em><b>Patient Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientPriorityPreferenceValue(PatientPriorityPreference patientPriorityPreference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_PRIORITY_PREFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_PRIORITY_PREFERENCE);
			try {
				VALIDATE_PATIENT_PRIORITY_PREFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_PRIORITY_PREFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_PRIORITY_PREFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientPriorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_PRIORITY_PREFERENCE__PATIENT_PRIORITY_PREFERENCE_VALUE,
					ConsolPlugin.INSTANCE.getString("PatientPriorityPreferencePatientPriorityPreferenceValue"),
					new Object[] { patientPriorityPreference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientPriorityPreferenceValueP(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientPriorityPreferenceValueP(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_PRIORITY_PREFERENCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientPriorityPreferenceValueP(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientPriorityPreferenceValueP(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PATIENT_PRIORITY_PREFERENCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientPriorityPreference The receiving '<em><b>Patient Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePatientPriorityPreferenceValueP(PatientPriorityPreference patientPriorityPreference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PATIENT_PRIORITY_PREFERENCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_PRIORITY_PREFERENCE);
			try {
				VALIDATE_PATIENT_PRIORITY_PREFERENCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_PRIORITY_PREFERENCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_PRIORITY_PREFERENCE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			patientPriorityPreference)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_PRIORITY_PREFERENCE__PATIENT_PRIORITY_PREFERENCE_VALUE_P,
					ConsolPlugin.INSTANCE.getString("PatientPriorityPreferencePatientPriorityPreferenceValueP"),
					new Object[] { patientPriorityPreference }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientPriorityPreferenceCDCodeSystem(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference CD Code System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientPriorityPreferenceCDCodeSystem(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_PRIORITY_PREFERENCE_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not codeSystem.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientPriorityPreferenceCDCodeSystem(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Priority Preference CD Code System</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientPriorityPreferenceCDCodeSystem(PatientPriorityPreference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PATIENT_PRIORITY_PREFERENCE_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientPriorityPreference The receiving '<em><b>Patient Priority Preference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePatientPriorityPreferenceCDCodeSystem(
			PatientPriorityPreference patientPriorityPreference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PATIENT_PRIORITY_PREFERENCE_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_PRIORITY_PREFERENCE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PATIENT_PRIORITY_PREFERENCE_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PATIENT_PRIORITY_PREFERENCE_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PATIENT_PRIORITY_PREFERENCE_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(patientPriorityPreference);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PATIENT_PRIORITY_PREFERENCE__PATIENT_PRIORITY_PREFERENCE_CD_CODE_SYSTEM,
						ConsolPlugin.INSTANCE.getString("PatientPriorityPreferencePatientPriorityPreferenceCDCodeSystem"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // PatientPriorityPreferenceOperations
