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
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Care Activity Encounter</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter#validatePlanOfCareActivityEncounterMoodCodeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Mood Code Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter#validatePlanOfCareActivityEncounterTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter#validatePlanOfCareActivityEncounterMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter#validatePlanOfCareActivityEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanOfCareActivityEncounterOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanOfCareActivityEncounterOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareActivityEncounterMoodCodeValue(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Mood Code Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityEncounterMoodCodeValue(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode = vocab::x_DocumentEncounterMood::INT or self.moodCode = vocab::x_DocumentEncounterMood::ARQ"
			+ "  or self.moodCode = vocab::x_DocumentEncounterMood::PRMS or self.moodCode = vocab::x_DocumentEncounterMood::PRP"
			+ "  or self.moodCode = vocab::x_DocumentEncounterMood::RQO";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareActivityEncounterMoodCodeValue(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Mood Code Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityEncounterMoodCodeValue(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode = vocab::x_DocumentEncounterMood::INT or self.moodCode = vocab::x_DocumentEncounterMood::ARQ
	 *   or self.moodCode = vocab::x_DocumentEncounterMood::PRMS or self.moodCode = vocab::x_DocumentEncounterMood::PRP
	 *   or self.moodCode = vocab::x_DocumentEncounterMood::RQO
	 * @param planOfCareActivityEncounter The receiving '<em><b>Plan Of Care Activity Encounter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePlanOfCareActivityEncounterMoodCodeValue(
			PlanOfCareActivityEncounter planOfCareActivityEncounter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_ACTIVITY_ENCOUNTER);
			try {
				VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfCareActivityEncounter)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE_VALUE,
					ConsolPlugin.INSTANCE.getString("PlanOfCareActivityEncounterMoodCodeValue"),
					new Object[] { planOfCareActivityEncounter }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareActivityEncounterTemplateId(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityEncounterTemplateId(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.25')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareActivityEncounterTemplateId(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityEncounterTemplateId(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.25')
	 * @param planOfCareActivityEncounter The receiving '<em><b>Plan Of Care Activity Encounter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePlanOfCareActivityEncounterTemplateId(
			PlanOfCareActivityEncounter planOfCareActivityEncounter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_ACTIVITY_ENCOUNTER);
			try {
				VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfCareActivityEncounter)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("PlanOfCareActivityEncounterTemplateId"),
					new Object[] { planOfCareActivityEncounter }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareActivityEncounterMoodCode(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityEncounterMoodCode(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareActivityEncounterMoodCode(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityEncounterMoodCode(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('moodCode')
	 * @param planOfCareActivityEncounter The receiving '<em><b>Plan Of Care Activity Encounter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePlanOfCareActivityEncounterMoodCode(
			PlanOfCareActivityEncounter planOfCareActivityEncounter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_ACTIVITY_ENCOUNTER);
			try {
				VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfCareActivityEncounter)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("PlanOfCareActivityEncounterMoodCode"),
					new Object[] { planOfCareActivityEncounter }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareActivityEncounterId(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityEncounterId(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareActivityEncounterId(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityEncounterId(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param planOfCareActivityEncounter The receiving '<em><b>Plan Of Care Activity Encounter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePlanOfCareActivityEncounterId(
			PlanOfCareActivityEncounter planOfCareActivityEncounter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_ACTIVITY_ENCOUNTER);
			try {
				VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			planOfCareActivityEncounter)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PLAN_OF_CARE_ACTIVITY_ENCOUNTER_ID,
					ConsolPlugin.INSTANCE.getString("PlanOfCareActivityEncounterId"),
					new Object[] { planOfCareActivityEncounter }));
			}
			return false;
		}
		return true;
	}

} // PlanOfCareActivityEncounterOperations
