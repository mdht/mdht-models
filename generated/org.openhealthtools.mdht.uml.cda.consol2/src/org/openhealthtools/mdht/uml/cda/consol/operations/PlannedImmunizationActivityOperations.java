/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *     								 - modified VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_IVLPQ_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP
 *     								 - due to inline datatype OCL generation issue
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.SubstanceAdministrationOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.consol.PriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Immunization Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityMoodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Mood Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityRouteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Route Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityApproachSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Approach Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityPriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityIndication2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Indication2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityInstruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityPrecondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityConsumable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Consumable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityIVLPQUnit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity IVLPQ Unit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityConsumableImmunizationMedicationInformation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Consumable Immunization Medication Information2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityPreconditionTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Precondition Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#validatePlannedImmunizationActivityPreconditionPreconditionForSubstanceAdministration2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Precondition Precondition For Substance Administration2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#getPriorityPreferences() <em>Get Priority Preferences</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#getIndication2s() <em>Get Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity#getInstruction2s() <em>Get Instruction2s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlannedImmunizationActivityOperations extends SubstanceAdministrationOperations {
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
	protected PlannedImmunizationActivityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedImmunizationActivityTemplateId(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityTemplateId(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.120')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedImmunizationActivityTemplateId(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityTemplateId(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedImmunizationActivity The receiving '<em><b>Planned Immunization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedImmunizationActivityTemplateId(
			PlannedImmunizationActivity plannedImmunizationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY);
			try {
				VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedImmunizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_IMMUNIZATION_ACTIVITY__PLANNED_IMMUNIZATION_ACTIVITY_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"PlannedImmunizationActivityPlannedImmunizationActivityTemplateId"),
						new Object[] { plannedImmunizationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedImmunizationActivityClassCode(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityClassCode(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::SBADM";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedImmunizationActivityClassCode(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityClassCode(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedImmunizationActivity The receiving '<em><b>Planned Immunization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedImmunizationActivityClassCode(
			PlannedImmunizationActivity plannedImmunizationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY);
			try {
				VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedImmunizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_IMMUNIZATION_ACTIVITY__PLANNED_IMMUNIZATION_ACTIVITY_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"PlannedImmunizationActivityPlannedImmunizationActivityClassCode"),
						new Object[] { plannedImmunizationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedImmunizationActivityMoodCodeP(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Mood Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityMoodCodeP(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedImmunizationActivityMoodCodeP(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Mood Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityMoodCodeP(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedImmunizationActivity The receiving '<em><b>Planned Immunization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedImmunizationActivityMoodCodeP(
			PlannedImmunizationActivity plannedImmunizationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY);
			try {
				VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedImmunizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_IMMUNIZATION_ACTIVITY__PLANNED_IMMUNIZATION_ACTIVITY_MOOD_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"PlannedImmunizationActivityPlannedImmunizationActivityMoodCodeP"),
						new Object[] { plannedImmunizationActivity }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivityMoodCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivityMoodCodeP", passToken);
				}
				passToken.add(plannedImmunizationActivity);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedImmunizationActivityMoodCode(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityMoodCode(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_DocumentSubstanceMood) and " +
			"let value : vocab::x_DocumentSubstanceMood = self.moodCode.oclAsType(vocab::x_DocumentSubstanceMood) in " +
			"value = vocab::x_DocumentSubstanceMood::INT or value = vocab::x_DocumentSubstanceMood::PRMS or value = vocab::x_DocumentSubstanceMood::PRP or value = vocab::x_DocumentSubstanceMood::RQO";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedImmunizationActivityMoodCode(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityMoodCode(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedImmunizationActivity The receiving '<em><b>Planned Immunization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedImmunizationActivityMoodCode(
			PlannedImmunizationActivity plannedImmunizationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivityMoodCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(plannedImmunizationActivity)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY);
			try {
				VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedImmunizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_IMMUNIZATION_ACTIVITY__PLANNED_IMMUNIZATION_ACTIVITY_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString(
							"PlannedImmunizationActivityPlannedImmunizationActivityMoodCode"),
						new Object[] { plannedImmunizationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedImmunizationActivityId(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityId(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedImmunizationActivityId(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityId(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedImmunizationActivity The receiving '<em><b>Planned Immunization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedImmunizationActivityId(PlannedImmunizationActivity plannedImmunizationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY);
			try {
				VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedImmunizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_IMMUNIZATION_ACTIVITY__PLANNED_IMMUNIZATION_ACTIVITY_ID,
						ConsolPlugin.INSTANCE.getString("PlannedImmunizationActivityPlannedImmunizationActivityId"),
						new Object[] { plannedImmunizationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedImmunizationActivityStatusCode(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityStatusCode(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'active')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedImmunizationActivityStatusCode(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityStatusCode(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedImmunizationActivity The receiving '<em><b>Planned Immunization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedImmunizationActivityStatusCode(
			PlannedImmunizationActivity plannedImmunizationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY);
			try {
				VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedImmunizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_IMMUNIZATION_ACTIVITY__PLANNED_IMMUNIZATION_ACTIVITY_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"PlannedImmunizationActivityPlannedImmunizationActivityStatusCode"),
						new Object[] { plannedImmunizationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedImmunizationActivityStatusCodeP(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityStatusCodeP(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedImmunizationActivityStatusCodeP(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityStatusCodeP(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedImmunizationActivity The receiving '<em><b>Planned Immunization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedImmunizationActivityStatusCodeP(
			PlannedImmunizationActivity plannedImmunizationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY);
			try {
				VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedImmunizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_IMMUNIZATION_ACTIVITY__PLANNED_IMMUNIZATION_ACTIVITY_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"PlannedImmunizationActivityPlannedImmunizationActivityStatusCodeP"),
						new Object[] { plannedImmunizationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedImmunizationActivityEffectiveTime(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityEffectiveTime(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (self.effectiveTime->size() =  1)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedImmunizationActivityEffectiveTime(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityEffectiveTime(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedImmunizationActivity The receiving '<em><b>Planned Immunization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedImmunizationActivityEffectiveTime(
			PlannedImmunizationActivity plannedImmunizationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY);
			try {
				VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedImmunizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_IMMUNIZATION_ACTIVITY__PLANNED_IMMUNIZATION_ACTIVITY_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString(
							"PlannedImmunizationActivityPlannedImmunizationActivityEffectiveTime"),
						new Object[] { plannedImmunizationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedImmunizationActivityRepeatNumber(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Repeat Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityRepeatNumber(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedImmunizationActivityRepeatNumber(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Repeat Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityRepeatNumber(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedImmunizationActivity The receiving '<em><b>Planned Immunization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedImmunizationActivityRepeatNumber(
			PlannedImmunizationActivity plannedImmunizationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY);
			try {
				VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedImmunizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_IMMUNIZATION_ACTIVITY__PLANNED_IMMUNIZATION_ACTIVITY_REPEAT_NUMBER,
						ConsolPlugin.INSTANCE.getString(
							"PlannedImmunizationActivityPlannedImmunizationActivityRepeatNumber"),
						new Object[] { plannedImmunizationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedImmunizationActivityRouteCodeP(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Route Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityRouteCodeP(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedImmunizationActivityRouteCodeP(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Route Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityRouteCodeP(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedImmunizationActivity The receiving '<em><b>Planned Immunization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedImmunizationActivityRouteCodeP(
			PlannedImmunizationActivity plannedImmunizationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY);
			try {
				VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedImmunizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_IMMUNIZATION_ACTIVITY__PLANNED_IMMUNIZATION_ACTIVITY_ROUTE_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"PlannedImmunizationActivityPlannedImmunizationActivityRouteCodeP"),
						new Object[] { plannedImmunizationActivity }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivityRouteCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivityRouteCodeP", passToken);
				}
				passToken.add(plannedImmunizationActivity);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedImmunizationActivityRouteCode(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Route Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityRouteCode(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedImmunizationActivityRouteCode(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Route Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityRouteCode(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedImmunizationActivity The receiving '<em><b>Planned Immunization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedImmunizationActivityRouteCode(
			PlannedImmunizationActivity plannedImmunizationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivityRouteCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(plannedImmunizationActivity)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY);
			try {
				VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedImmunizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_IMMUNIZATION_ACTIVITY__PLANNED_IMMUNIZATION_ACTIVITY_ROUTE_CODE,
						ConsolPlugin.INSTANCE.getString(
							"PlannedImmunizationActivityPlannedImmunizationActivityRouteCode"),
						new Object[] { plannedImmunizationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedImmunizationActivity The receiving '<em><b>Planned Immunization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedImmunizationActivityApproachSiteCode(
			PlannedImmunizationActivity plannedImmunizationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivityApproachSiteCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(plannedImmunizationActivity)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY);
			try {
				VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedImmunizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_IMMUNIZATION_ACTIVITY__PLANNED_IMMUNIZATION_ACTIVITY_APPROACH_SITE_CODE,
						ConsolPlugin.INSTANCE.getString(
							"PlannedImmunizationActivityPlannedImmunizationActivityApproachSiteCode"),
						new Object[] { plannedImmunizationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedImmunizationActivityApproachSiteCodeP(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Approach Site Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityApproachSiteCodeP(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.approachSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedImmunizationActivityApproachSiteCodeP(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Approach Site Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityApproachSiteCodeP(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedImmunizationActivityApproachSiteCode(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Approach Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityApproachSiteCode(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedImmunizationActivityApproachSiteCode(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Approach Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityApproachSiteCode(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedImmunizationActivity The receiving '<em><b>Planned Immunization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedImmunizationActivityApproachSiteCodeP(
			PlannedImmunizationActivity plannedImmunizationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY);
			try {
				VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedImmunizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_IMMUNIZATION_ACTIVITY__PLANNED_IMMUNIZATION_ACTIVITY_APPROACH_SITE_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"PlannedImmunizationActivityPlannedImmunizationActivityApproachSiteCodeP"),
						new Object[] { plannedImmunizationActivity }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivityApproachSiteCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivityApproachSiteCodeP",
						passToken);
				}
				passToken.add(plannedImmunizationActivity);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedImmunizationActivityDoseQuantity(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityDoseQuantity(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedImmunizationActivityDoseQuantity(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityDoseQuantity(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedImmunizationActivity The receiving '<em><b>Planned Immunization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedImmunizationActivityDoseQuantity(
			PlannedImmunizationActivity plannedImmunizationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY);
			try {
				VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedImmunizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_IMMUNIZATION_ACTIVITY__PLANNED_IMMUNIZATION_ACTIVITY_DOSE_QUANTITY,
						ConsolPlugin.INSTANCE.getString(
							"PlannedImmunizationActivityPlannedImmunizationActivityDoseQuantity"),
						new Object[] { plannedImmunizationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedImmunizationActivityPerformer(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityPerformer(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->exists(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedImmunizationActivityPerformer(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityPerformer(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedImmunizationActivity The receiving '<em><b>Planned Immunization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedImmunizationActivityPerformer(
			PlannedImmunizationActivity plannedImmunizationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY);
			try {
				VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedImmunizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_IMMUNIZATION_ACTIVITY__PLANNED_IMMUNIZATION_ACTIVITY_PERFORMER,
						ConsolPlugin.INSTANCE.getString(
							"PlannedImmunizationActivityPlannedImmunizationActivityPerformer"),
						new Object[] { plannedImmunizationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedImmunizationActivityAuthorParticipation(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityAuthorParticipation(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedImmunizationActivityAuthorParticipation(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityAuthorParticipation(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedImmunizationActivity The receiving '<em><b>Planned Immunization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedImmunizationActivityAuthorParticipation(
			PlannedImmunizationActivity plannedImmunizationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY);
			try {
				VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedImmunizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_IMMUNIZATION_ACTIVITY__PLANNED_IMMUNIZATION_ACTIVITY_AUTHOR_PARTICIPATION,
						ConsolPlugin.INSTANCE.getString(
							"PlannedImmunizationActivityPlannedImmunizationActivityAuthorParticipation"),
						new Object[] { plannedImmunizationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedImmunizationActivityPriorityPreference(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Priority Preference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityPriorityPreference(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::PriorityPreference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedImmunizationActivityPriorityPreference(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Priority Preference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityPriorityPreference(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedImmunizationActivity The receiving '<em><b>Planned Immunization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedImmunizationActivityPriorityPreference(
			PlannedImmunizationActivity plannedImmunizationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY);
			try {
				VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedImmunizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_IMMUNIZATION_ACTIVITY__PLANNED_IMMUNIZATION_ACTIVITY_PRIORITY_PREFERENCE,
						ConsolPlugin.INSTANCE.getString(
							"PlannedImmunizationActivityPlannedImmunizationActivityPriorityPreference"),
						new Object[] { plannedImmunizationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedImmunizationActivityIndication2(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Indication2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityIndication2(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedImmunizationActivityIndication2(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Indication2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityIndication2(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedImmunizationActivity The receiving '<em><b>Planned Immunization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedImmunizationActivityIndication2(
			PlannedImmunizationActivity plannedImmunizationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY);
			try {
				VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedImmunizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_IMMUNIZATION_ACTIVITY__PLANNED_IMMUNIZATION_ACTIVITY_INDICATION2,
						ConsolPlugin.INSTANCE.getString(
							"PlannedImmunizationActivityPlannedImmunizationActivityIndication2"),
						new Object[] { plannedImmunizationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedImmunizationActivityInstruction2(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Instruction2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityInstruction2(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instruction2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedImmunizationActivityInstruction2(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Instruction2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityInstruction2(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedImmunizationActivity The receiving '<em><b>Planned Immunization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedImmunizationActivityInstruction2(
			PlannedImmunizationActivity plannedImmunizationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY);
			try {
				VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedImmunizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_IMMUNIZATION_ACTIVITY__PLANNED_IMMUNIZATION_ACTIVITY_INSTRUCTION2,
						ConsolPlugin.INSTANCE.getString(
							"PlannedImmunizationActivityPlannedImmunizationActivityInstruction2"),
						new Object[] { plannedImmunizationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedImmunizationActivityPrecondition(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Precondition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityPrecondition(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->exists(precondition : cda::Precondition | not precondition.oclIsUndefined() and precondition.oclIsKindOf(cda::Precondition))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedImmunizationActivityPrecondition(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Precondition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityPrecondition(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedImmunizationActivity The receiving '<em><b>Planned Immunization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedImmunizationActivityPrecondition(
			PlannedImmunizationActivity plannedImmunizationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY);
			try {
				VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedImmunizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_IMMUNIZATION_ACTIVITY__PLANNED_IMMUNIZATION_ACTIVITY_PRECONDITION,
						ConsolPlugin.INSTANCE.getString(
							"PlannedImmunizationActivityPlannedImmunizationActivityPrecondition"),
						new Object[] { plannedImmunizationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedImmunizationActivityConsumable(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Consumable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityConsumable(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->one(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(cda::Consumable))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedImmunizationActivityConsumable(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Consumable</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityConsumable(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedImmunizationActivity The receiving '<em><b>Planned Immunization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedImmunizationActivityConsumable(
			PlannedImmunizationActivity plannedImmunizationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY);
			try {
				VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				plannedImmunizationActivity)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_IMMUNIZATION_ACTIVITY__PLANNED_IMMUNIZATION_ACTIVITY_CONSUMABLE,
						ConsolPlugin.INSTANCE.getString(
							"PlannedImmunizationActivityPlannedImmunizationActivityConsumable"),
						new Object[] { plannedImmunizationActivity }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedImmunizationActivityIVLPQUnit(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity IVLPQ Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityIVLPQUnit(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_IVLPQ_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.doseQuantity->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (isDefined('unit') )))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedImmunizationActivityIVLPQUnit(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity IVLPQ Unit</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityIVLPQUnit(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_IVLPQ_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedImmunizationActivity The receiving '<em><b>Planned Immunization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedImmunizationActivityIVLPQUnit(
			PlannedImmunizationActivity plannedImmunizationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_IVLPQ_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_IVLPQ_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_IVLPQ_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_IVLPQ_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			plannedImmunizationActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PLANNED_IMMUNIZATION_ACTIVITY__PLANNED_IMMUNIZATION_ACTIVITY_IVLPQ_UNIT,
							ConsolPlugin.INSTANCE.getString(
								"PlannedImmunizationActivityPlannedImmunizationActivityIVLPQUnit"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedImmunizationActivityConsumableImmunizationMedicationInformation2(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Consumable Immunization Medication Information2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityConsumableImmunizationMedicationInformation2(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_CONSUMABLE_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->excluding(null)->reject(manufacturedProduct->one(manufacturedProduct : cda::ManufacturedProduct | not manufacturedProduct.oclIsUndefined() and manufacturedProduct.oclIsKindOf(consol::ImmunizationMedicationInformation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedImmunizationActivityConsumableImmunizationMedicationInformation2(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Consumable Immunization Medication Information2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityConsumableImmunizationMedicationInformation2(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_CONSUMABLE_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedImmunizationActivity The receiving '<em><b>Planned Immunization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedImmunizationActivityConsumableImmunizationMedicationInformation2(
			PlannedImmunizationActivity plannedImmunizationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_CONSUMABLE_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_CONSUMABLE_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_CONSUMABLE_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_CONSUMABLE_IMMUNIZATION_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			plannedImmunizationActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PLANNED_IMMUNIZATION_ACTIVITY__PLANNED_IMMUNIZATION_ACTIVITY_CONSUMABLE_IMMUNIZATION_MEDICATION_INFORMATION2,
							ConsolPlugin.INSTANCE.getString(
								"PlannedImmunizationActivityPlannedImmunizationActivityConsumableImmunizationMedicationInformation2"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedImmunizationActivityPreconditionTypeCode(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Precondition Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityPreconditionTypeCode(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ActRelationshipType::PRCN)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedImmunizationActivityPreconditionTypeCode(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Precondition Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityPreconditionTypeCode(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedImmunizationActivity The receiving '<em><b>Planned Immunization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedImmunizationActivityPreconditionTypeCode(
			PlannedImmunizationActivity plannedImmunizationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			plannedImmunizationActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PLANNED_IMMUNIZATION_ACTIVITY__PLANNED_IMMUNIZATION_ACTIVITY_PRECONDITION_TYPE_CODE,
							ConsolPlugin.INSTANCE.getString(
								"PlannedImmunizationActivityPlannedImmunizationActivityPreconditionTypeCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedImmunizationActivityPreconditionPreconditionForSubstanceAdministration2(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Precondition Precondition For Substance Administration2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityPreconditionPreconditionForSubstanceAdministration2(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->excluding(null)->reject(criterion->one(criterion : cda::Criterion | not criterion.oclIsUndefined() and criterion.oclIsKindOf(consol::PreconditionForSubstanceAdministration2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedImmunizationActivityPreconditionPreconditionForSubstanceAdministration2(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Immunization Activity Precondition Precondition For Substance Administration2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedImmunizationActivityPreconditionPreconditionForSubstanceAdministration2(PlannedImmunizationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedImmunizationActivity The receiving '<em><b>Planned Immunization Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedImmunizationActivityPreconditionPreconditionForSubstanceAdministration2(
			PlannedImmunizationActivity plannedImmunizationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PLANNED_IMMUNIZATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			plannedImmunizationActivity);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PLANNED_IMMUNIZATION_ACTIVITY__PLANNED_IMMUNIZATION_ACTIVITY_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2,
							ConsolPlugin.INSTANCE.getString(
								"PlannedImmunizationActivityPlannedImmunizationActivityPreconditionPreconditionForSubstanceAdministration2"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPriorityPreferences(PlannedImmunizationActivity) <em>Get Priority Preferences</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityPreferences(PlannedImmunizationActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRIORITY_PREFERENCES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PriorityPreference)).oclAsType(consol::PriorityPreference)";

	/**
	 * The cached OCL query for the '{@link #getPriorityPreferences(PlannedImmunizationActivity) <em>Get Priority Preferences</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityPreferences(PlannedImmunizationActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRIORITY_PREFERENCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PriorityPreference> getPriorityPreferences(
			PlannedImmunizationActivity plannedImmunizationActivity) {

		if (GET_PRIORITY_PREFERENCES__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY,
				ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY.getEAllOperations().get(77));
			try {
				GET_PRIORITY_PREFERENCES__EOCL_QRY = helper.createQuery(GET_PRIORITY_PREFERENCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PRIORITY_PREFERENCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PriorityPreference> result = (Collection<PriorityPreference>) query.evaluate(
			plannedImmunizationActivity);
		return new BasicEList.UnmodifiableEList<PriorityPreference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getIndication2s(PlannedImmunizationActivity) <em>Get Indication2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication2s(PlannedImmunizationActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INDICATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication2)).oclAsType(consol::Indication2)";

	/**
	 * The cached OCL query for the '{@link #getIndication2s(PlannedImmunizationActivity) <em>Get Indication2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication2s(PlannedImmunizationActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INDICATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Indication2> getIndication2s(PlannedImmunizationActivity plannedImmunizationActivity) {

		if (GET_INDICATION2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY,
				ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY.getEAllOperations().get(78));
			try {
				GET_INDICATION2S__EOCL_QRY = helper.createQuery(GET_INDICATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_INDICATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Indication2> result = (Collection<Indication2>) query.evaluate(plannedImmunizationActivity);
		return new BasicEList.UnmodifiableEList<Indication2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getInstruction2s(PlannedImmunizationActivity) <em>Get Instruction2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction2s(PlannedImmunizationActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INSTRUCTION2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2)).oclAsType(consol::Instruction2)";

	/**
	 * The cached OCL query for the '{@link #getInstruction2s(PlannedImmunizationActivity) <em>Get Instruction2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction2s(PlannedImmunizationActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INSTRUCTION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Instruction2> getInstruction2s(PlannedImmunizationActivity plannedImmunizationActivity) {

		if (GET_INSTRUCTION2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY,
				ConsolPackage.Literals.PLANNED_IMMUNIZATION_ACTIVITY.getEAllOperations().get(79));
			try {
				GET_INSTRUCTION2S__EOCL_QRY = helper.createQuery(GET_INSTRUCTION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_INSTRUCTION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Instruction2> result = (Collection<Instruction2>) query.evaluate(plannedImmunizationActivity);
		return new BasicEList.UnmodifiableEList<Instruction2>(result.size(), result.toArray());
	}

} // PlannedImmunizationActivityOperations
