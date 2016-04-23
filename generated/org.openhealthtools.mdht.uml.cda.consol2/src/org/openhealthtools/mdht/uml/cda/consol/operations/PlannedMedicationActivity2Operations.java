/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *     								 - modified VALIDATE_PLANNED_MEDICATION_ACTIVITY2_IVLP_QDOSE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP
 *     								   and VALIDATE_PLANNED_MEDICATION_ACTIVITY2_IVLP_QRATE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP
 *     								   due to inline datatype OCL generation issue
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
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.PriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Medication Activity2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2RepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2RouteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Route Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2RouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2ApproachSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Approach Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2ApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2DoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2RateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2MaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2AdministrationUnitCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Administration Unit Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2AdministrationUnitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Administration Unit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2Performer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2PriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2Indication2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Indication2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2Instruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2Consumable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Consumable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2Precondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2IVLPQdoseQuantityUnit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 IVLP Qdose Quantity Unit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2IVLPQrateQuantityUnit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 IVLP Qrate Quantity Unit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2ConsumableMedicationInformation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Consumable Medication Information2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2PreconditionTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Precondition Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlannedMedicationActivity2PreconditionPreconditionForSubstanceAdministration2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Precondition Precondition For Substance Administration2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#getPriorityPreferences() <em>Get Priority Preferences</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#getIndication2s() <em>Get Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#getInstruction2s() <em>Get Instruction2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlanOfCareActivitySubstanceAdministrationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Substance Administration Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2#validatePlanOfCareActivitySubstanceAdministrationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Substance Administration Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlannedMedicationActivity2Operations extends PlanOfCareActivitySubstanceAdministrationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedMedicationActivity2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedMedicationActivity2StatusCode(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2StatusCode(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_MEDICATION_ACTIVITY2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'active')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedMedicationActivity2StatusCode(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2StatusCode(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_MEDICATION_ACTIVITY2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedMedicationActivity2StatusCode(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_MEDICATION_ACTIVITY2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				VALIDATE_PLANNED_MEDICATION_ACTIVITY2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_MEDICATION_ACTIVITY2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_MEDICATION_ACTIVITY2_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedMedicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLANNED_MEDICATION_ACTIVITY2_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"PlannedMedicationActivity2PlannedMedicationActivity2StatusCode"),
						new Object[] { plannedMedicationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedMedicationActivity2StatusCodeP(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2StatusCodeP(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_MEDICATION_ACTIVITY2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedMedicationActivity2StatusCodeP(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2StatusCodeP(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_MEDICATION_ACTIVITY2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedMedicationActivity2StatusCodeP(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_MEDICATION_ACTIVITY2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				VALIDATE_PLANNED_MEDICATION_ACTIVITY2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_MEDICATION_ACTIVITY2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_MEDICATION_ACTIVITY2_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedMedicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLANNED_MEDICATION_ACTIVITY2_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"PlannedMedicationActivity2PlannedMedicationActivity2StatusCodeP"),
						new Object[] { plannedMedicationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedMedicationActivity2EffectiveTime(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2EffectiveTime(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_MEDICATION_ACTIVITY2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (self.effectiveTime->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedMedicationActivity2EffectiveTime(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2EffectiveTime(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_MEDICATION_ACTIVITY2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedMedicationActivity2EffectiveTime(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_MEDICATION_ACTIVITY2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				VALIDATE_PLANNED_MEDICATION_ACTIVITY2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_MEDICATION_ACTIVITY2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_MEDICATION_ACTIVITY2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedMedicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLANNED_MEDICATION_ACTIVITY2_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString(
							"PlannedMedicationActivity2PlannedMedicationActivity2EffectiveTime"),
						new Object[] { plannedMedicationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedMedicationActivity2RepeatNumber(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Repeat Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2RepeatNumber(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_MEDICATION_ACTIVITY2_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedMedicationActivity2RepeatNumber(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Repeat Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2RepeatNumber(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_MEDICATION_ACTIVITY2_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedMedicationActivity2RepeatNumber(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_MEDICATION_ACTIVITY2_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				VALIDATE_PLANNED_MEDICATION_ACTIVITY2_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_MEDICATION_ACTIVITY2_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_MEDICATION_ACTIVITY2_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedMedicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLANNED_MEDICATION_ACTIVITY2_REPEAT_NUMBER,
						ConsolPlugin.INSTANCE.getString(
							"PlannedMedicationActivity2PlannedMedicationActivity2RepeatNumber"),
						new Object[] { plannedMedicationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedMedicationActivity2RouteCodeP(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Route Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2RouteCodeP(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedMedicationActivity2RouteCodeP(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Route Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2RouteCodeP(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedMedicationActivity2RouteCodeP(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedMedicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLANNED_MEDICATION_ACTIVITY2_ROUTE_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"PlannedMedicationActivity2PlannedMedicationActivity2RouteCodeP"),
						new Object[] { plannedMedicationActivity2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2RouteCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2RouteCodeP", passToken);
				}
				passToken.add(plannedMedicationActivity2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedMedicationActivity2RouteCode(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Route Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2RouteCode(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and (value.code = 'C38192' or value.code = 'C38193' or value.code = 'C38194' or value.code = 'C38675' or value.code = 'C38197' or value.code = 'C38633' or value.code = 'C38205' or value.code = 'C38206' or value.code = 'C38208' or value.code = 'C38209' or value.code = 'C38210' or value.code = 'C38211' or value.code = 'C38212' or value.code = 'C38200' or value.code = 'C38215' or value.code = 'C38219' or value.code = 'C38220' or value.code = 'C38221' or value.code = 'C38222' or value.code = 'C38223' or value.code = 'C38224' or value.code = 'C38225' or value.code = 'C38226' or value.code = 'C38227' or value.code = 'C38228' or value.code = 'C38229' or value.code = 'C38230' or value.code = 'C38231' or value.code = 'C38232' or value.code = 'C38233' or value.code = 'C38234' or value.code = 'C38217' or value.code = 'C38218' or value.code = 'C38235' or value.code = 'C38238' or value.code = 'C38239' or value.code = 'C38240' or value.code = 'C38241' or value.code = 'C38242' or value.code = 'C38243' or value.code = 'C38245' or value.code = 'C38246' or value.code = 'C38247' or value.code = 'C38249' or value.code = 'C38250' or value.code = 'C38251' or value.code = 'C38252' or value.code = 'C38253' or value.code = 'C38254' or value.code = 'C28161' or value.code = 'C38255' or value.code = 'C38256' or value.code = 'C38257' or value.code = 'C38258' or value.code = 'C38259' or value.code = 'C38260' or value.code = 'C38261' or value.code = 'C38262' or value.code = 'C38263' or value.code = 'C38264' or value.code = 'C38265' or value.code = 'C38266' or value.code = 'C38267' or value.code = 'C38207' or value.code = 'C38268' or value.code = 'C38269' or value.code = 'C38270' or value.code = 'C38272' or value.code = 'C38273' or value.code = 'C38276' or value.code = 'C38277' or value.code = 'C38278' or value.code = 'C38280' or value.code = 'C38203' or value.code = 'C38281' or value.code = 'C38282' or value.code = 'C38284' or value.code = 'C38285' or value.code = 'C48623' or value.code = 'C38286' or value.code = 'C38287' or value.code = 'C38288' or value.code = 'C38289' or value.code = 'C38291' or value.code = 'C38676' or value.code = 'C38292' or value.code = 'C38677' or value.code = 'C38293' or value.code = 'C38294' or value.code = 'C38295' or value.code = 'C38216' or value.code = 'C38296' or value.code = 'C38198' or value.code = 'C38297' or value.code = 'C38298' or value.code = 'C38299' or value.code = 'C38300' or value.code = 'C38301' or value.code = 'C38304' or value.code = 'C38305' or value.code = 'C38283' or value.code = 'C38307' or value.code = 'C38308' or value.code = 'C38309' or value.code = 'C38312' or value.code = 'C38271'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedMedicationActivity2RouteCode(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Route Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2RouteCode(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedMedicationActivity2RouteCode(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2RouteCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(plannedMedicationActivity2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedMedicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLANNED_MEDICATION_ACTIVITY2_ROUTE_CODE,
						ConsolPlugin.INSTANCE.getString(
							"PlannedMedicationActivity2PlannedMedicationActivity2RouteCode"),
						new Object[] { plannedMedicationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedMedicationActivity2ApproachSiteCodeP(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Approach Site Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2ApproachSiteCodeP(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_MEDICATION_ACTIVITY2_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.approachSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedMedicationActivity2ApproachSiteCodeP(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Approach Site Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2ApproachSiteCodeP(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_MEDICATION_ACTIVITY2_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedMedicationActivity2ApproachSiteCodeP(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_MEDICATION_ACTIVITY2_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				VALIDATE_PLANNED_MEDICATION_ACTIVITY2_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_MEDICATION_ACTIVITY2_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_MEDICATION_ACTIVITY2_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedMedicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLANNED_MEDICATION_ACTIVITY2_APPROACH_SITE_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"PlannedMedicationActivity2PlannedMedicationActivity2ApproachSiteCodeP"),
						new Object[] { plannedMedicationActivity2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2ApproachSiteCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2ApproachSiteCodeP",
						passToken);
				}
				passToken.add(plannedMedicationActivity2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedMedicationActivity2ApproachSiteCode(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Approach Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2ApproachSiteCode(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_MEDICATION_ACTIVITY2_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedMedicationActivity2ApproachSiteCode(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Approach Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2ApproachSiteCode(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_MEDICATION_ACTIVITY2_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedMedicationActivity2ApproachSiteCode(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2ApproachSiteCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(plannedMedicationActivity2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PLANNED_MEDICATION_ACTIVITY2_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				VALIDATE_PLANNED_MEDICATION_ACTIVITY2_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_MEDICATION_ACTIVITY2_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_MEDICATION_ACTIVITY2_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedMedicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLANNED_MEDICATION_ACTIVITY2_APPROACH_SITE_CODE,
						ConsolPlugin.INSTANCE.getString(
							"PlannedMedicationActivity2PlannedMedicationActivity2ApproachSiteCode"),
						new Object[] { plannedMedicationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedMedicationActivity2DoseQuantity(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2DoseQuantity(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_MEDICATION_ACTIVITY2_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedMedicationActivity2DoseQuantity(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2DoseQuantity(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_MEDICATION_ACTIVITY2_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedMedicationActivity2DoseQuantity(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_MEDICATION_ACTIVITY2_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				VALIDATE_PLANNED_MEDICATION_ACTIVITY2_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_MEDICATION_ACTIVITY2_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_MEDICATION_ACTIVITY2_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedMedicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLANNED_MEDICATION_ACTIVITY2_DOSE_QUANTITY,
						ConsolPlugin.INSTANCE.getString(
							"PlannedMedicationActivity2PlannedMedicationActivity2DoseQuantity"),
						new Object[] { plannedMedicationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedMedicationActivity2RateQuantity(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Rate Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2RateQuantity(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_MEDICATION_ACTIVITY2_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.rateQuantity.oclIsUndefined() or self.rateQuantity.isNullFlavorUndefined()) implies (not self.rateQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedMedicationActivity2RateQuantity(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Rate Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2RateQuantity(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_MEDICATION_ACTIVITY2_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedMedicationActivity2RateQuantity(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_MEDICATION_ACTIVITY2_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				VALIDATE_PLANNED_MEDICATION_ACTIVITY2_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_MEDICATION_ACTIVITY2_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_MEDICATION_ACTIVITY2_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedMedicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLANNED_MEDICATION_ACTIVITY2_RATE_QUANTITY,
						ConsolPlugin.INSTANCE.getString(
							"PlannedMedicationActivity2PlannedMedicationActivity2RateQuantity"),
						new Object[] { plannedMedicationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedMedicationActivity2MaxDoseQuantity(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Max Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2MaxDoseQuantity(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_MEDICATION_ACTIVITY2_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedMedicationActivity2MaxDoseQuantity(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Max Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2MaxDoseQuantity(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_MEDICATION_ACTIVITY2_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedMedicationActivity2MaxDoseQuantity(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_MEDICATION_ACTIVITY2_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				VALIDATE_PLANNED_MEDICATION_ACTIVITY2_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_MEDICATION_ACTIVITY2_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_MEDICATION_ACTIVITY2_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedMedicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLANNED_MEDICATION_ACTIVITY2_MAX_DOSE_QUANTITY,
						ConsolPlugin.INSTANCE.getString(
							"PlannedMedicationActivity2PlannedMedicationActivity2MaxDoseQuantity"),
						new Object[] { plannedMedicationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedMedicationActivity2AdministrationUnitCodeP(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Administration Unit Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2AdministrationUnitCodeP(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.administrationUnitCode.oclIsUndefined() or self.administrationUnitCode.isNullFlavorUndefined()) implies (not self.administrationUnitCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedMedicationActivity2AdministrationUnitCodeP(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Administration Unit Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2AdministrationUnitCodeP(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedMedicationActivity2AdministrationUnitCodeP(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedMedicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLANNED_MEDICATION_ACTIVITY2_ADMINISTRATION_UNIT_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"PlannedMedicationActivity2PlannedMedicationActivity2AdministrationUnitCodeP"),
						new Object[] { plannedMedicationActivity2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2AdministrationUnitCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2AdministrationUnitCodeP",
						passToken);
				}
				passToken.add(plannedMedicationActivity2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedMedicationActivity2AdministrationUnitCode(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Administration Unit Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2AdministrationUnitCode(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.administrationUnitCode.oclIsUndefined() or self.administrationUnitCode.isNullFlavorUndefined()) implies (not self.administrationUnitCode.oclIsUndefined() and self.administrationUnitCode.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.administrationUnitCode.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.5.85' and (value.code = 'APPFUL' or value.code = 'DROP' or value.code = 'NDROP' or value.code = 'OPDROP' or value.code = 'ORDROP' or value.code = 'OTDROP' or value.code = 'PUFF' or value.code = 'SCOOP' or value.code = 'SPRY'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedMedicationActivity2AdministrationUnitCode(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Administration Unit Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2AdministrationUnitCode(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedMedicationActivity2AdministrationUnitCode(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get(
					"org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2AdministrationUnitCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(plannedMedicationActivity2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_MEDICATION_ACTIVITY2_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedMedicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLANNED_MEDICATION_ACTIVITY2_ADMINISTRATION_UNIT_CODE,
						ConsolPlugin.INSTANCE.getString(
							"PlannedMedicationActivity2PlannedMedicationActivity2AdministrationUnitCode"),
						new Object[] { plannedMedicationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedMedicationActivity2Performer(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2Performer(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->exists(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedMedicationActivity2Performer(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2Performer(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedMedicationActivity2Performer(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedMedicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLANNED_MEDICATION_ACTIVITY2_PERFORMER,
						ConsolPlugin.INSTANCE.getString(
							"PlannedMedicationActivity2PlannedMedicationActivity2Performer"),
						new Object[] { plannedMedicationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedMedicationActivity2AuthorParticipation(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2AuthorParticipation(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_MEDICATION_ACTIVITY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedMedicationActivity2AuthorParticipation(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2AuthorParticipation(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_MEDICATION_ACTIVITY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedMedicationActivity2AuthorParticipation(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_MEDICATION_ACTIVITY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				VALIDATE_PLANNED_MEDICATION_ACTIVITY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_MEDICATION_ACTIVITY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_MEDICATION_ACTIVITY2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedMedicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLANNED_MEDICATION_ACTIVITY2_AUTHOR_PARTICIPATION,
						ConsolPlugin.INSTANCE.getString(
							"PlannedMedicationActivity2PlannedMedicationActivity2AuthorParticipation"),
						new Object[] { plannedMedicationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedMedicationActivity2PriorityPreference(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Priority Preference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2PriorityPreference(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::PriorityPreference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedMedicationActivity2PriorityPreference(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Priority Preference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2PriorityPreference(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedMedicationActivity2PriorityPreference(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedMedicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLANNED_MEDICATION_ACTIVITY2_PRIORITY_PREFERENCE,
						ConsolPlugin.INSTANCE.getString(
							"PlannedMedicationActivity2PlannedMedicationActivity2PriorityPreference"),
						new Object[] { plannedMedicationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedMedicationActivity2Indication2(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Indication2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2Indication2(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_MEDICATION_ACTIVITY2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedMedicationActivity2Indication2(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Indication2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2Indication2(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_MEDICATION_ACTIVITY2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedMedicationActivity2Indication2(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_MEDICATION_ACTIVITY2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				VALIDATE_PLANNED_MEDICATION_ACTIVITY2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_MEDICATION_ACTIVITY2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_MEDICATION_ACTIVITY2_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedMedicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLANNED_MEDICATION_ACTIVITY2_INDICATION2,
						ConsolPlugin.INSTANCE.getString(
							"PlannedMedicationActivity2PlannedMedicationActivity2Indication2"),
						new Object[] { plannedMedicationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedMedicationActivity2Instruction2(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Instruction2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2Instruction2(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_MEDICATION_ACTIVITY2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instruction2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedMedicationActivity2Instruction2(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Instruction2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2Instruction2(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_MEDICATION_ACTIVITY2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedMedicationActivity2Instruction2(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_MEDICATION_ACTIVITY2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				VALIDATE_PLANNED_MEDICATION_ACTIVITY2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_MEDICATION_ACTIVITY2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_MEDICATION_ACTIVITY2_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedMedicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLANNED_MEDICATION_ACTIVITY2_INSTRUCTION2,
						ConsolPlugin.INSTANCE.getString(
							"PlannedMedicationActivity2PlannedMedicationActivity2Instruction2"),
						new Object[] { plannedMedicationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedMedicationActivity2Consumable(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Consumable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2Consumable(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_MEDICATION_ACTIVITY2_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->one(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(cda::Consumable))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedMedicationActivity2Consumable(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Consumable</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2Consumable(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_MEDICATION_ACTIVITY2_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedMedicationActivity2Consumable(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_MEDICATION_ACTIVITY2_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				VALIDATE_PLANNED_MEDICATION_ACTIVITY2_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_MEDICATION_ACTIVITY2_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_MEDICATION_ACTIVITY2_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedMedicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLANNED_MEDICATION_ACTIVITY2_CONSUMABLE,
						ConsolPlugin.INSTANCE.getString(
							"PlannedMedicationActivity2PlannedMedicationActivity2Consumable"),
						new Object[] { plannedMedicationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedMedicationActivity2Precondition(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Precondition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2Precondition(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->exists(precondition : cda::Precondition | not precondition.oclIsUndefined() and precondition.oclIsKindOf(cda::Precondition))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedMedicationActivity2Precondition(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Precondition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2Precondition(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedMedicationActivity2Precondition(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedMedicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLANNED_MEDICATION_ACTIVITY2_PRECONDITION,
						ConsolPlugin.INSTANCE.getString(
							"PlannedMedicationActivity2PlannedMedicationActivity2Precondition"),
						new Object[] { plannedMedicationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedMedicationActivity2IVLPQdoseQuantityUnit(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 IVLP Qdose Quantity Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2IVLPQdoseQuantityUnit(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_MEDICATION_ACTIVITY2_IVLP_QDOSE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.doseQuantity->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (isDefined('unit')) ))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedMedicationActivity2IVLPQdoseQuantityUnit(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 IVLP Qdose Quantity Unit</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2IVLPQdoseQuantityUnit(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PLANNED_MEDICATION_ACTIVITY2_IVLP_QDOSE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedMedicationActivity2IVLPQdoseQuantityUnit(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_MEDICATION_ACTIVITY2_IVLP_QDOSE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PLANNED_MEDICATION_ACTIVITY2_IVLP_QDOSE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_MEDICATION_ACTIVITY2_IVLP_QDOSE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_MEDICATION_ACTIVITY2_IVLP_QDOSE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			plannedMedicationActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLANNED_MEDICATION_ACTIVITY2_IVLP_QDOSE_QUANTITY_UNIT,
							ConsolPlugin.INSTANCE.getString(
								"PlannedMedicationActivity2PlannedMedicationActivity2IVLPQdoseQuantityUnit"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedMedicationActivity2IVLPQrateQuantityUnit(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 IVLP Qrate Quantity Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2IVLPQrateQuantityUnit(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_MEDICATION_ACTIVITY2_IVLP_QRATE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.rateQuantity->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (isDefined('unit')) ))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedMedicationActivity2IVLPQrateQuantityUnit(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 IVLP Qrate Quantity Unit</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2IVLPQrateQuantityUnit(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PLANNED_MEDICATION_ACTIVITY2_IVLP_QRATE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedMedicationActivity2IVLPQrateQuantityUnit(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_MEDICATION_ACTIVITY2_IVLP_QRATE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PLANNED_MEDICATION_ACTIVITY2_IVLP_QRATE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_MEDICATION_ACTIVITY2_IVLP_QRATE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_MEDICATION_ACTIVITY2_IVLP_QRATE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			plannedMedicationActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLANNED_MEDICATION_ACTIVITY2_IVLP_QRATE_QUANTITY_UNIT,
							ConsolPlugin.INSTANCE.getString(
								"PlannedMedicationActivity2PlannedMedicationActivity2IVLPQrateQuantityUnit"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedMedicationActivity2ConsumableMedicationInformation2(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Consumable Medication Information2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2ConsumableMedicationInformation2(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_MEDICATION_ACTIVITY2_CONSUMABLE_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable->excluding(null)->reject(manufacturedProduct->one(manufacturedProduct : cda::ManufacturedProduct | not manufacturedProduct.oclIsUndefined() and manufacturedProduct.oclIsKindOf(consol::MedicationInformation2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedMedicationActivity2ConsumableMedicationInformation2(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Consumable Medication Information2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2ConsumableMedicationInformation2(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PLANNED_MEDICATION_ACTIVITY2_CONSUMABLE_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedMedicationActivity2ConsumableMedicationInformation2(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_MEDICATION_ACTIVITY2_CONSUMABLE_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PLANNED_MEDICATION_ACTIVITY2_CONSUMABLE_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_MEDICATION_ACTIVITY2_CONSUMABLE_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_MEDICATION_ACTIVITY2_CONSUMABLE_MEDICATION_INFORMATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			plannedMedicationActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLANNED_MEDICATION_ACTIVITY2_CONSUMABLE_MEDICATION_INFORMATION2,
							ConsolPlugin.INSTANCE.getString(
								"PlannedMedicationActivity2PlannedMedicationActivity2ConsumableMedicationInformation2"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedMedicationActivity2PreconditionTypeCode(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Precondition Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2PreconditionTypeCode(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ActRelationshipType::PRCN)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedMedicationActivity2PreconditionTypeCode(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Precondition Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2PreconditionTypeCode(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedMedicationActivity2PreconditionTypeCode(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			plannedMedicationActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLANNED_MEDICATION_ACTIVITY2_PRECONDITION_TYPE_CODE,
							ConsolPlugin.INSTANCE.getString(
								"PlannedMedicationActivity2PlannedMedicationActivity2PreconditionTypeCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedMedicationActivity2PreconditionPreconditionForSubstanceAdministration2(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Precondition Precondition For Substance Administration2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2PreconditionPreconditionForSubstanceAdministration2(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->excluding(null)->reject(criterion->one(criterion : cda::Criterion | not criterion.oclIsUndefined() and criterion.oclIsKindOf(consol::PreconditionForSubstanceAdministration2)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedMedicationActivity2PreconditionPreconditionForSubstanceAdministration2(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Medication Activity2 Precondition Precondition For Substance Administration2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedMedicationActivity2PreconditionPreconditionForSubstanceAdministration2(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedMedicationActivity2PreconditionPreconditionForSubstanceAdministration2(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_PLANNED_MEDICATION_ACTIVITY2_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			plannedMedicationActivity2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLANNED_MEDICATION_ACTIVITY2_PRECONDITION_PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2,
							ConsolPlugin.INSTANCE.getString(
								"PlannedMedicationActivity2PlannedMedicationActivity2PreconditionPreconditionForSubstanceAdministration2"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPriorityPreferences(PlannedMedicationActivity2) <em>Get Priority Preferences</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityPreferences(PlannedMedicationActivity2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRIORITY_PREFERENCES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PriorityPreference)).oclAsType(consol::PriorityPreference)";

	/**
	 * The cached OCL query for the '{@link #getPriorityPreferences(PlannedMedicationActivity2) <em>Get Priority Preferences</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityPreferences(PlannedMedicationActivity2)
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
			PlannedMedicationActivity2 plannedMedicationActivity2) {
		if (GET_PRIORITY_PREFERENCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2,
				ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2.getEAllOperations().get(81));
			try {
				GET_PRIORITY_PREFERENCES__EOCL_QRY = helper.createQuery(GET_PRIORITY_PREFERENCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PRIORITY_PREFERENCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PriorityPreference> result = (Collection<PriorityPreference>) query.evaluate(
			plannedMedicationActivity2);
		return new BasicEList.UnmodifiableEList<PriorityPreference>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getIndication2s(PlannedMedicationActivity2) <em>Get Indication2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication2s(PlannedMedicationActivity2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INDICATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication2)).oclAsType(consol::Indication2)";

	/**
	 * The cached OCL query for the '{@link #getIndication2s(PlannedMedicationActivity2) <em>Get Indication2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication2s(PlannedMedicationActivity2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INDICATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Indication2> getIndication2s(PlannedMedicationActivity2 plannedMedicationActivity2) {
		if (GET_INDICATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2,
				ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2.getEAllOperations().get(82));
			try {
				GET_INDICATION2S__EOCL_QRY = helper.createQuery(GET_INDICATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INDICATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Indication2> result = (Collection<Indication2>) query.evaluate(plannedMedicationActivity2);
		return new BasicEList.UnmodifiableEList<Indication2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getInstruction2s(PlannedMedicationActivity2) <em>Get Instruction2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction2s(PlannedMedicationActivity2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INSTRUCTION2S__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instruction2)).oclAsType(consol::Instruction2)";

	/**
	 * The cached OCL query for the '{@link #getInstruction2s(PlannedMedicationActivity2) <em>Get Instruction2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction2s(PlannedMedicationActivity2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INSTRUCTION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Instruction2> getInstruction2s(PlannedMedicationActivity2 plannedMedicationActivity2) {
		if (GET_INSTRUCTION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2,
				ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2.getEAllOperations().get(83));
			try {
				GET_INSTRUCTION2S__EOCL_QRY = helper.createQuery(GET_INSTRUCTION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INSTRUCTION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Instruction2> result = (Collection<Instruction2>) query.evaluate(plannedMedicationActivity2);
		return new BasicEList.UnmodifiableEList<Instruction2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareActivitySubstanceAdministrationTemplateId(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Substance Administration Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivitySubstanceAdministrationTemplateId(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.42' and id.extension = '2014-06-09')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareActivitySubstanceAdministrationTemplateId(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Substance Administration Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivitySubstanceAdministrationTemplateId(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareActivitySubstanceAdministrationTemplateId(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedMedicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"PlannedMedicationActivity2PlanOfCareActivitySubstanceAdministrationTemplateId"),
						new Object[] { plannedMedicationActivity2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlanOfCareActivitySubstanceAdministrationMoodCode(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Substance Administration Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivitySubstanceAdministrationMoodCode(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_DocumentSubstanceMood) and " +
			"let value : vocab::x_DocumentSubstanceMood = self.moodCode.oclAsType(vocab::x_DocumentSubstanceMood) in " +
			"value = vocab::x_DocumentSubstanceMood::INT or value = vocab::x_DocumentSubstanceMood::PRMS or value = vocab::x_DocumentSubstanceMood::PRP or value = vocab::x_DocumentSubstanceMood::RQO";

	/**
	 * The cached OCL invariant for the '{@link #validatePlanOfCareActivitySubstanceAdministrationMoodCode(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Substance Administration Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlanOfCareActivitySubstanceAdministrationMoodCode(PlannedMedicationActivity2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedMedicationActivity2 The receiving '<em><b>Planned Medication Activity2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlanOfCareActivitySubstanceAdministrationMoodCode(
			PlannedMedicationActivity2 plannedMedicationActivity2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_MEDICATION_ACTIVITY2);
			try {
				VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				plannedMedicationActivity2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PLANNED_MEDICATION_ACTIVITY2__PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString(
							"PlannedMedicationActivity2PlanOfCareActivitySubstanceAdministrationMoodCode"),
						new Object[] { plannedMedicationActivity2 }));
			}

			return false;
		}
		return true;
	}

} // PlannedMedicationActivity2Operations
