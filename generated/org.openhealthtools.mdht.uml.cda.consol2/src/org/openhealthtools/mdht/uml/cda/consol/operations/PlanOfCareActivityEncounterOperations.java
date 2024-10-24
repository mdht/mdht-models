/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Care Activity Encounter</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter#validatePlanOfCareActivityEncounterTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter#validatePlanOfCareActivityEncounterClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter#validatePlanOfCareActivityEncounterMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter#validatePlanOfCareActivityEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanOfCareActivityEncounterOperations extends ClinicalStatementOperations {
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
	protected PlanOfCareActivityEncounterOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareActivityEncounterTemplateId(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityEncounterTemplateId(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.40')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareActivityEncounterTemplateId(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityEncounterTemplateId(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfCareActivityEncounter The receiving '<em><b>Plan Of Care Activity Encounter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareActivityEncounterTemplateId(
			PlanOfCareActivityEncounter planOfCareActivityEncounter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlanOfCareActivityEncounterPlanOfCareActivityEncounterTemplateId", "ERROR");

		if (VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_ACTIVITY_ENCOUNTER);
			try {
				VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				planOfCareActivityEncounter)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"PlanOfCareActivityEncounterPlanOfCareActivityEncounterTemplateId"),
						new Object[] { planOfCareActivityEncounter }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareActivityEncounterClassCode(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityEncounterClassCode(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::ENC";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareActivityEncounterClassCode(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityEncounterClassCode(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfCareActivityEncounter The receiving '<em><b>Plan Of Care Activity Encounter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareActivityEncounterClassCode(
			PlanOfCareActivityEncounter planOfCareActivityEncounter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlanOfCareActivityEncounterPlanOfCareActivityEncounterClassCode", "ERROR");

		if (VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_ACTIVITY_ENCOUNTER);
			try {
				VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				planOfCareActivityEncounter)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PLAN_OF_CARE_ACTIVITY_ENCOUNTER_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"PlanOfCareActivityEncounterPlanOfCareActivityEncounterClassCode"),
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
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_DocumentEncounterMood) and " +
			"let value : vocab::x_DocumentEncounterMood = self.moodCode.oclAsType(vocab::x_DocumentEncounterMood) in " +
			"value = vocab::x_DocumentEncounterMood::INT or value = vocab::x_DocumentEncounterMood::ARQ or value = vocab::x_DocumentEncounterMood::PRMS or value = vocab::x_DocumentEncounterMood::PRP or value = vocab::x_DocumentEncounterMood::RQO";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareActivityEncounterMoodCode(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityEncounterMoodCode(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfCareActivityEncounter The receiving '<em><b>Plan Of Care Activity Encounter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareActivityEncounterMoodCode(
			PlanOfCareActivityEncounter planOfCareActivityEncounter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlanOfCareActivityEncounterPlanOfCareActivityEncounterMoodCode", "ERROR");

		if (VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_ACTIVITY_ENCOUNTER);
			try {
				VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				planOfCareActivityEncounter)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString(
							"PlanOfCareActivityEncounterPlanOfCareActivityEncounterMoodCode"),
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
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareActivityEncounterId(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivityEncounterId(PlanOfCareActivityEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param planOfCareActivityEncounter The receiving '<em><b>Plan Of Care Activity Encounter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareActivityEncounterId(PlanOfCareActivityEncounter planOfCareActivityEncounter,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PlanOfCareActivityEncounterPlanOfCareActivityEncounterId", "ERROR");

		if (VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLAN_OF_CARE_ACTIVITY_ENCOUNTER);
			try {
				VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				planOfCareActivityEncounter)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PLAN_OF_CARE_ACTIVITY_ENCOUNTER_ID,
						ConsolPlugin.INSTANCE.getString("PlanOfCareActivityEncounterPlanOfCareActivityEncounterId"),
						new Object[] { planOfCareActivityEncounter }));
			}

			return false;
		}
		return true;
	}

} // PlanOfCareActivityEncounterOperations
